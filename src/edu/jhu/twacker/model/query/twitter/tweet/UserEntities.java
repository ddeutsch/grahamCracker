/**
 * OOSE Project - Group 4
 * UserEntities.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class represents a User entity that contain URLs that appear on the
 * user's profile. The format of this class is determined by the JSON format
 * provided by the Twitter Streaming API.
 * 
 * @author Daniel Deutsch
 */
public class UserEntities
{
	/**
	 * Represents the hashtags that have been parsed out of the Tweet text.
	 */
	private List<HashTag> hashtags;
	
	/**
	 * Represents the media elements uploaded with the Tweet.
	 */
	private List<Media> media;
	
	/**
	 * Represents the urls included in the text of Tweet on in a user object.
	 */
	private List<Url> urls;
	
	/**
	 * Represents the Twitter users mentioned in the text of the Tweet.
	 */
	private List<UserMention> user_mentions;

	/**
	 * The empty constructor.
	 */
	public UserEntities()
	{
		
	}
	
	/**
	 * Retrieves the hashtags of the object.
	 * @return The hashtags.
	 */
	public List<HashTag> getHashtags()
	{
		return this.hashtags;
	}

	/**
	 * Retrieves the media of the object.
	 * @return The media.
	 */
	public List<Media> getMedia()
	{
		return this.media;
	}

	/**
	 * Retrieves the urls of the object.
	 * @return The urls.
	 */
	public List<Url> getUrls()
	{
		return this.urls;
	}

	/**
	 * Retrieves the user_mentions of the object.
	 * @return The user_mentions.
	 */
	public List<UserMention> getUser_mentions()
	{
		return this.user_mentions;
	}
	
	
}
