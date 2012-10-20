/**
 * OOSE Project - Group 4
 * Contributor.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

/**
 * This class is required to be created based on the JSON format of a Tweet. It
 * is a collection of brief user objects indicating users who contributed
 * to the authorship of a tweet.
 * 
 * To see the full documentation, see {@link https://dev.twitter.com/docs/platform-objects/tweets}
 * 
 * @author Daniel Deutsch
 */
public class Contributor
{
	/**
	 * The id of the user who contributed to the tweet.
	 */
	private int id;
	
	/**
	 * The String representation of the id.
	 */
	private String id_str;
	
	/**
	 * The screen name of the user who contributed to the Tweet.
	 */
	private String screen_name;
	
	/**
	 * The empty constructor.
	 */
	public Contributor()
	{
		
	}
	
	/**
	 * Retrieves the id of the contributor.
	 * 
	 * @return The id.
	 */
	public int getId()
	{
		return this.id;
	}
	
	/**
	 * Retrieves the id of the contributor.
	 * 
	 * @return The id.
	 */
	public String getIdStr()
	{
		return this.id_str;
	}
	
	/**
	 * Retrieves the screen name of the contributor.
	 * @return The screen name.
	 */
	public String getScreenName()
	{
		return this.screen_name;
	}
}
