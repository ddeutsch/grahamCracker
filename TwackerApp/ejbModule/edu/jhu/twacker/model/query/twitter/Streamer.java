/**
 * OOSE Project - Group 4
 * Streamer.java
 */
package edu.jhu.twacker.model.query.twitter;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.List;

import org.apache.http.auth.AuthScope;
import com.google.gson.Gson;

import edu.jhu.twacker.model.query.HttpGetWrapper;
import edu.jhu.twacker.model.query.twitter.tweet.Tweet;

/**
 * This class handles interacting with the Twitter Streaming API. It takes a
 * url of the address to request and will create an <code>HttpGet</code> request.
 * 
 * The parameters for the Streaming API can be found here:
 * {@link https://dev.twitter.com/docs/streaming-apis/parameters}
 * 
 * @author Daniel Deutsch
 */
public class Streamer extends Thread
{
	/**
	 * The length in milliseconds to stream for.
	 */
	private long duration;
	
	/**
	 * The url to query.
	 */
	private String url;
	
	/**
	 * A list of all of the Tweets that is sent to the Streamer.
	 */
	private List<Tweet> tweets;
	
	/**
	 * Indicates whether or not the Streamer should continue to get Tweets.
	 */
	private boolean streaming;
	
	/**
	 * Creates a Streaming object.
	 * @param url The url to query.
	 * @param duration The length of time to keep the connection open in milliseconds.
	 */
	public Streamer(String url, long duration)
	{
		this.url = url;
		this.duration = duration;
	
		this.tweets = new LinkedList<Tweet>();
	}
	
	/**
	 * Queries the url and gets the results. In order to invoke this method,
	 * call the <code>start</code> method which will implicitly call the <code>run</code>
	 * method since <code>Streamer</code> extends <code>Thread</code>.
	 */
	public void run()
	{
		this.streaming = true;
		long start = System.currentTimeMillis();
		
		Gson gson = new Gson();
		
		HttpGetWrapper wrapper = new HttpGetWrapper(this.url);
		wrapper.setCredentials(AuthScope.ANY, "oosegroup4", "twacker987");
		
		BufferedReader reader = wrapper.getReader();
		
		while (this.streaming)
		{
			long current = System.currentTimeMillis();
			if (current - start > this.duration)
				break;
			
			try
			{	
				String line = reader.readLine();
				if (line == null)
					break;
				this.tweets.add(gson.fromJson(line, Tweet.class));
			}
			catch (Exception e)
			{
				
			}
		}
	}
	
	/**
	 * Stops the Twitter Stream.
	 */
	public void stopStreaming()
	{
		this.streaming = false;
	}
	
	/**
	 * Gets the number of times the <code>Streamer</code> has received a Tweet.
	 * @return The count.
	 */
	public int getCount()
	{
		return this.tweets.size();
	}
	
	/**
	 * Resets the number of times a Tweet has been received to 0. This would be used
	 * for if you wanted to see how many Tweets occur within a given time period
	 */
	public void resetCount()
	{
		this.tweets = new LinkedList<Tweet>();
	}
	
	/**
	 * Retrieves the list of Tweets that have been sent to the Streamer.
	 * @return The list of Tweets.
	 */
	public List<Tweet> getTweets()
	{
		return this.tweets;
	}
	
	/**
	 * A testing method to see if the streaming works.
	 * @param args None.
	 */
	public static void main(String[] args)
	{
		/**
		 * The parameters: https://dev.twitter.com/docs/streaming-apis/parameters
		 */
		Streamer streamer = new Streamer("https://stream.twitter.com/1.1/statuses/filter.json?track=obama", 5000);
		streamer.start();
	}
}
