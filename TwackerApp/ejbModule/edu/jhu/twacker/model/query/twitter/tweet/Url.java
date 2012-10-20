/**
 * OOSE Project - Group 4
 * Url.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class represents the url of a media object uploaded with a Tweet.
 * The format is described by the JSON format used in the Twitter
 * Streaming API.
 * 
 * The full documentation: {@ https://dev.twitter.com/docs/platform-objects/entities#user_entities}
 * 
 * @author Daniel Deutsch
 */
public class Url
{
	/**
	 * The version of the url to display to clients.
	 */
	private String display_url;
	
	/**
	 * The expanded version of the display url.
	 */
	private String expanded_url;
	
	/**
	 * The indices of the url in a Tweet.
	 */
	private List<Integer> indices;
	
	/**
	 * The wrapped url.
	 */
	private String url;
	
	/**
	 * The empty constructor.
	 */
	public Url()
	{
		
	}

	/**
	 * Retrieves the display_url of the object.
	 * @return The display_url.
	 */
	public String getDisplay_url()
	{
		return this.display_url;
	}

	/**
	 * Retrieves the expanded_url of the object.
	 * @return The expanded_url.
	 */
	public String getExpanded_url()
	{
		return this.expanded_url;
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
	 * Retrieves the url of the object.
	 * @return The url.
	 */
	public String getUrl()
	{
		return this.url;
	}
}
