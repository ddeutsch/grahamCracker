package edu.jhu.twacker.model.query.twitter;

import java.util.List;

import com.google.gson.Gson;

import edu.jhu.twacker.model.query.HttpGetWrapper;
import edu.jhu.twacker.model.query.twitter.tweet.Tweet;

/**
 * This class is responsible for communicating with the standard
 * Twitter API to get the most recent Tweets with a given search term in them.
 * 
 * @author Daniel Deutsch
 */
public class SearchTerm
{
	/**
	 * The term to search for.
	 */
	private String query;
	
	/**
	 * The constructor for the class.
	 * @param query The term to search for.
	 */
	public SearchTerm(String query)
	{
		this.query = query;
	}
	
	/**
	 * Performs an http get method to the Twitter API to get the most recent
	 * 100 (or however many are accessible less than 100) Tweets with a specific 
	 * search term in them.
	 * @return The list of Tweets.
	 */
	public List<Tweet> getTweets()
	{
		String url = "http://search.twitter.com/search.json?q=" + this.query + "&rpp=100";
		
		HttpGetWrapper get = new HttpGetWrapper(url);
		Gson gson = new Gson();
		
		SearchResults results = gson.fromJson(get.get(), SearchResults.class);
		return results.getResults();
	}
	
	public static void main(String[] args)
	{
		SearchTerm search = new SearchTerm("Obama");
		
		List<Tweet> tweets = search.getTweets();
		for (Tweet tweet : tweets)
			System.out.println(tweet.getText());
	}
}
