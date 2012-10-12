/**
 * OOSE Project - Group 4
 * SentimentExec.java
 */
package edu.jhu.twacker.model.query;


import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;

import edu.jhu.twacker.model.query.alchemy.AlchemyResponse;
import edu.jhu.twacker.model.query.twitter.Streamer;
import edu.jhu.twacker.model.query.twitter.tweet.Tweet;

/**
 * This class is responsible for executing the query to obtain the data
 * to create the sentiment analysis graphs. 
 * 
 * The way it works is by creating a <code>Streamer</code> object to interact
 * with the Twitter API. It lets the Streamer gather Tweets for a given
 * amount of time. It then retrieves the Tweets and analyzes them for their
 * sentiment using the Alchemy API.
 * 
 * The result is a list of counts in the form of [positive neutral negative total].
 * 
 * The Alchemy API documentation can be found here {@link http://www.alchemyapi.com/api/sentiment/}
 * 
 * @author Daniel Deutsch
 */
public class SentimentExec implements QueryExec
{
	/**
	 * The time that the query will get Tweets from the Streamer before
	 * it analyzes them for content.
	 */
	private static final long TIME = 10000;
		
	/**
	 * Executes the query to search for the given String.
	 * @param search The search String.
	 */
	public void execute(String search)
	{
		String url = "https://stream.twitter.com/1.1/statuses/filter.json?track=" + search;
		Streamer streamer = new Streamer(url, TIME);
		streamer.start();
		
		long start = System.currentTimeMillis();
		long current = System.currentTimeMillis();
		
		while (current - start < TIME)
		{
			current = System.currentTimeMillis();
		}
		
		List<Tweet> tweets = streamer.getTweets();
		
		List<String> text = new LinkedList<String>();
		
		// For some reason, I am unable to call getSentiment from inside of
		// this for loop without getting a ConcurrentModificationException
		for (Tweet tweet : tweets)
		{
			if (tweet.getText() != null)
				text.add(tweet.getText());
		}	
		
		System.out.println(analyzeTweets(text));
	}
	
	/**
	 * Analyzes a list of Tweets for sentiment using the Alchemy API.
	 * @param tweets The list of Tweets.
	 * @return A list of integers in the form of [positives neutrals negatives total]
	 */
	private List<Integer> analyzeTweets(List<String> tweets)
	{
		int negative = 0;
		int neutral = 0;
		int positive = 0;
		
		for (String tweet : tweets)
		{
			int result = getSentiment(tweet);
			switch (result)
			{
				case -1:
					negative++;
					break;
				case 0:
					neutral++;
					break;
				case 1:
					positive++;
					break;
				case -2:
					System.out.println("-2");
				default:
					break;
			}
		}
		
		int total = negative + neutral + positive;
		
		List<Integer> counts = new ArrayList<Integer>();
		counts.add(positive);
		counts.add(neutral);
		counts.add(negative);
		counts.add(total);
		
		return counts;
	}
	
	/**
	 * Retrieves the sentiment of the text string. The sentiment analysis is done
	 * through the Alchemy API ({@link http://www.alchemyapi.com/api/sentiment/}). The
	 * result of the analysis is either -1 for negative, 0 for neutral, or 1 for positive.
	 * If something goes wrong during analysis and it can't be completed, -2 will be
	 * returned.
	 * @param text The text to analyze. 
	 * @return The code of the analysis.
	 */
	private int getSentiment(String text)
	{	
		AlchemyResponse response = alchemyAnalysis(text);
		
		if (response.getStatus().equals("ERROR"))
			return -2;
		
		if (response.getDocSentiment() == null)
			System.out.println("null");
		
		String result = response.getDocSentiment().getType();
		
		if (result.equals("positive"))
			return 1;
		else if (result.equals("neutral"))
			return 0;
		else
			return -1;
	}
	
	/**
	 * Performs the analysis with the Alchemy API. 
	 * @param tweets The String to analyze.
	 * @return The result of the analysis in the form of the xml String
	 * provided by the API.
	 */
	private AlchemyResponse alchemyAnalysis(String tweet)
	{
		try
		{
			String encoded = URLEncoder.encode(tweet, "UTF-8");

			HttpGetWrapper get = new HttpGetWrapper("http://access.alchemyapi.com/calls/text/TextGetTextSentiment?apikey=c1645e1d48ab13f41e79322143d483e8c9f0f558&text=" +
					encoded + "&outputMode=json");
			
			Gson gson = new Gson();
			return gson.fromJson(get.get(), AlchemyResponse.class);
		}
		catch (Exception e)
		{
			
		}
		return null;
	}

	/**
	 * Tests the <code>SentimentExec</code> class.
	 */
	public static void main(String[] args)
	{
		SentimentExec sentiment = new SentimentExec();
		sentiment.execute("Ryan");
	}
}
