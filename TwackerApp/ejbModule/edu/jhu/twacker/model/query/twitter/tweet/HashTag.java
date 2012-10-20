/**
 * OOSE Project - Group 4
 * HashTag.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class reprsents a hashtag of a User entity. The format is provided
 * by the Twitter Streaming API JSON format.
 * 
 * The full documentation: {@link https://dev.twitter.com/docs/platform-objects/entities#user_entities}
 * 
 * @author Daniel Deutsch
 */
public class HashTag
{
	/**
	 * The indices where the hashtag begins and ends.
	 */
	List<Integer> indices;
	
	/**
	 * The text of the hashtag minus the '#' character.
	 */
	private String text;
	
	/**
	 * The empty constructor.
	 */
	public HashTag()
	{
		
	}

	/**
	 * Retrieves the indices of the HashTag.
	 * @return The indices.
	 */
	public List<Integer> getIndices()
	{
		return this.indices;
	}

	/**
	 * Retrieves the text of the HashTag.
	 * @return The text.
	 */
	public String getText()
	{
		return this.text;
	}
}
