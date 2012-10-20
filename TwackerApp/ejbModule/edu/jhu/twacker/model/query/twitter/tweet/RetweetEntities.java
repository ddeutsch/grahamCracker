/**
 * OOSE Project - Group 4
 * Entities.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class represents the entities of Tweet, like the hashtags, 
 * urls, and the other users mentioned. It is in the format specified by the
 * JSON object of the Twitter Streaming API.
 * 
 * @author Daniel Deutsch
 */
public class RetweetEntities
{
	/**
	 * The list of hashtags in the Tweet.
	 */
	private List<String> hashtags;
	
	/**
	 * The list of urls in the Tweet.
	 */
	private List<String> urls;
	
	/**
	 * The list of the other users who are mentioned.
	 */
	private List<String> user_mentions;
	
	/**
	 * The empty constructor.
	 */
	public RetweetEntities()
	{
		
	}

	/**
	 * Retrieves the hashtags of the Tweet.
	 * @return The hashtags.
	 */
	public List<String> getHashtags()
	{
		return this.hashtags;
	}

	/**
	 * Retrieves the urls of the Tweet.
	 * @return The urls.
	 */
	public List<String> getUrls()
	{
		return this.urls;
	}

	/**
	 * Retrieves the user_mentions of the Tweet.
	 * @return The user_mentions.
	 */
	public List<String> getUser_mentions()
	{
		return this.user_mentions;
	}
}
