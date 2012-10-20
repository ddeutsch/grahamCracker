/**
 * OOSE Project - Group 4
 * UserMention.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class represents a mention of another Twitter user in a Tweet. The format
 * is the JSON format described by the Twitter Streaming API.
 * 
 * @author Daniel Deutsch
 */
public class UserMention
{
	/**
	 * The id of the mentioned user.
	 */
	private long id;
	
	/**
	 * The id of the mentioned user as a String.
	 */
	private String id_str;
	
	/**
	 * The starting and ending indices of the user reference is.
	 */
	private List<Integer> indices;
	
	/**
	 * The name of the referenced user.
	 */
	private String name;
	
	/**
	 * The screen name of the referenced user.
	 */
	private String screen_name;
	
	/**
	 * The empty constructor.
	 */
	public UserMention()
	{
		
	}
	
	/**
	 * Retrieves the id of the object.
	 * @return The id.
	 */
	public long getId()
	{
		return this.id;
	}

	/**
	 * Retrieves the id_str of the object.
	 * @return The id_str.
	 */
	public String getId_str()
	{
		return this.id_str;
	}

	/**
	 * Retrieves the indices of the object.
	 * @return The indices.
	 */
	public List<Integer> getIndices()
	{
		return this.indices;
	}

	/**
	 * Retrieves the name of the object.
	 * @return The name.
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Retrieves the screen_name of the object.
	 * @return The screen_name.
	 */
	public String getScreen_name()
	{
		return this.screen_name;
	}
}
