package edu.jhu.twacker.model.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.jhu.twacker.model.query.twitter.Streamer;
import edu.jhu.twacker.model.query.twitter.tweet.Tweet;

/**
 * This class is responsible for testing the streaming functionality
 * of the Streamer class.
 * 
 * @author Daniel Deutsch
 */
public class StreamerTest
{
	@Before
	public void setUp() throws Exception
	{
	}

	/**
	 * Runs all of the tests for this class.
	 * @throws InterruptedException
	 */
	@Test
	public void test() throws InterruptedException
	{
		testForTweets();
	}
	
	/**
	 * Tests to see if the Streamer was able to get any Tweets, and if it does,
	 * that they are not null.
	 * @throws InterruptedException
	 */
	public void testForTweets() throws InterruptedException
	{
		Streamer streamer = new Streamer("https://stream.twitter.com/1.1/statuses/filter.json?track=Obama", 10000);
		streamer.start();
		streamer.join();
		
		if (streamer.getTweets().isEmpty())
			fail("Streamer did not return any Tweets.");
		for (Tweet tweet : streamer.getTweets())
		{
			if (tweet == null)
				fail("Tweet returned as null.");
		}
			
	}

}
