/**
 * OOSE Project - Group 4
 * Tweet.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class represents a Tweet taken from the Twitter API in the JSON format
 * created by the Twitter Streaming API.
 * 
 * For the exact documentation of what each field represents, look at the following
 * url: https://dev.twitter.com/docs/platform-objects/tweets
 * 
 * @author Daniel Deutsch
 */
public class Tweet
{
	/**
	 * This data type is unused and is in place for future Twitter development.
	 */
	private Object annotations;
	
	/**
	 * A list of all of the users who contributed to writing the Tweet.
	 */
	private List<Contributor> contributors;
	
	/**
	 * The coordinates of the Tweet.
	 */
	private Coordinates coordinates;
	
	/**
	 * The UTC time when this Tweet was created.
	 */
	private String created_at;
	
	/**
	 * This provides details of the user's own retweet.
	 */
	private Object current_user_retweet;
	
	/**
	 * Indicates whether or not this Tweet was favorited by the user.
	 */
	private boolean favorited;
	
	/**
	 * This Object is deprecated and the <code>coordinates</code> data member
	 * is taking its place.
	 */
	private Object geo;
	
	/**
	 * This value represents the id of the Tweet.
	 */
	private long id;
	
	/**
	 * The id of the Tweet in the form of a String.
	 */
	private String id_str;
	
	/**
	 * If this Tweet was tweeted in reply to another, this is the username
	 * of the person with the original Tweet.
	 */
	private String in_reply_to_screen_name;
	
	/**
	 * If this Tweet was tweeted in reply to another, this is the id of 
	 * the original Tweet.
	 */
	private long in_reply_to_status_id;
	
	/**
	 * If this Tweet was tweeted in reply to another, this is the String version
	 * of the original Tweet's id.
	 */
	private String in_reply_to_status_id_str;
	
	/**
	 * If this Tweet was tweeted in response to another, this is the id of
	 * the user who wrote the original Tweet.
	 */
	private long in_reply_to_user_id;
	
	/**
	 * If this Tweet was tweeted in response to another, this is the id of
	 * the user who wrote the original Tweet in the form of a String.
	 */
	private String in_reply_to_user_id_str;
	
	/**
	 * The place that this Tweet is associated with, but not necessarily where 
	 * the Tweet originated from.
	 */
	private Place place;
	
	/**
	 * Indicates whether or not the Tweet has a link to sensitive content.
	 */
	private boolean possibly_sensitive;
	
	/**
	 * A set of key-value pairs indicating the intended contextual delivery of the 
	 * containing Tweet.
	 */
	private Scopes scopes;
	
	/**
	 * The number of times this Tweet has been retweeted.
	 */
	private int retweet_count;
	
	/**
	 * The utility used to post the Tweet, as an html-formatted String.
	 */
	private String source;
	
	/**
	 * The actual UTF-8 text of the Tweet.
	 */
	private String text;
	
	/**
	 * Indicates whether or not the Tweet was truncated past its 140 character limit.
	 */
	private boolean truncated;
	
	/**
	 * The User who posted this Tweet.
	 */
	private User user;
	
	/**
	 * Indicates whether or not this Tweet was withheld due to a DMCA complaint.
	 */
	private boolean withheld_copyright;
	
	/**
	 * Lists the two letter country code of the countries from which this Tweet was withheld.
	 */
	private String withheld_in_countries;
	
	/**
	 * Indicates whether the user or the Tweet is what is being withheld.
	 */
	private String withheld_scope;
	
	/**
	 * An empty constructor required for the GSON library.
	 */
	public Tweet()
	{
		
	}

	/**
	 * Retrieves the annotations of the Tweet.
	 * @return The annotations.
	 */
	public Object getAnnotations()
	{
		return this.annotations;
	}

	/**
	 * Retrieves the contributors of the Tweet.
	 * @return The contributors.
	 */
	public List<Contributor> getContributors()
	{
		return this.contributors;
	}

	/**
	 * Retrieves the coordinates of the Tweet.
	 * @return The coordinates.
	 */
	public Coordinates getCoordinates()
	{
		return this.coordinates;
	}

	/**
	 * Retrieves the created_at of the Tweet.
	 * @return The created_at.
	 */
	public String getCreated_at()
	{
		return this.created_at;
	}

	/**
	 * Retrieves the current_user_retweet of the Tweet.
	 * @return The current_user_retweet.
	 */
	public Object getCurrent_user_retweet()
	{
		return this.current_user_retweet;
	}

	/**
	 * Retrieves the favorited of the Tweet.
	 * @return The favorited.
	 */
	public boolean isFavorited()
	{
		return this.favorited;
	}

	/**
	 * Retrieves the geo of the Tweet.
	 * @return The geo.
	 */
	public Object getGeo()
	{
		return this.geo;
	}

	/**
	 * Retrieves the id of the Tweet.
	 * @return The id.
	 */
	public long getId()
	{
		return this.id;
	}

	/**
	 * Retrieves the id_str of the Tweet.
	 * @return The id_str.
	 */
	public String getId_str()
	{
		return this.id_str;
	}

	/**
	 * Retrieves the in_reply_to_screen_name of the Tweet.
	 * @return The in_reply_to_screen_name.
	 */
	public String getIn_reply_to_screen_name()
	{
		return this.in_reply_to_screen_name;
	}

	/**
	 * Retrieves the in_reply_to_status_id of the Tweet.
	 * @return The in_reply_to_status_id.
	 */
	public long getIn_reply_to_status_id()
	{
		return this.in_reply_to_status_id;
	}

	/**
	 * Retrieves the in_reply_to_status_id_str of the Tweet.
	 * @return The in_reply_to_status_id_str.
	 */
	public String getIn_reply_to_status_id_str()
	{
		return this.in_reply_to_status_id_str;
	}

	/**
	 * Retrieves the in_reply_to_user_id of the Tweet.
	 * @return The in_reply_to_user_id.
	 */
	public long getIn_reply_to_user_id()
	{
		return this.in_reply_to_user_id;
	}

	/**
	 * Retrieves the in_reply_to_user_id_str of the Tweet.
	 * @return The in_reply_to_user_id_str.
	 */
	public String getIn_reply_to_user_id_str()
	{
		return this.in_reply_to_user_id_str;
	}

	/**
	 * Retrieves the place of the Tweet.
	 * @return The place.
	 */
	public Place getPlace()
	{
		return this.place;
	}

	/**
	 * Retrieves the possibly_sensitive of the Tweet.
	 * @return The possibly_sensitive.
	 */
	public boolean isPossibly_sensitive()
	{
		return this.possibly_sensitive;
	}

	/**
	 * Retrieves the scopes of the Tweet.
	 * @return The scopes.
	 */
	public Scopes getScopes()
	{
		return this.scopes;
	}

	/**
	 * Retrieves the retweet_count of the Tweet.
	 * @return The retweet_count.
	 */
	public int getRetweet_count()
	{
		return this.retweet_count;
	}

	/**
	 * Retrieves the source of the Tweet.
	 * @return The source.
	 */
	public String getSource()
	{
		return this.source;
	}

	/**
	 * Retrieves the text of the Tweet.
	 * @return The text.
	 */
	public String getText()
	{
		return this.text;
	}

	/**
	 * Retrieves the truncated of the Tweet.
	 * @return The truncated.
	 */
	public boolean isTruncated()
	{
		return this.truncated;
	}

	/**
	 * Retrieves the user of the Tweet.
	 * @return The user.
	 */
	public User getUser()
	{
		return this.user;
	}

	/**
	 * Retrieves the withheld_copyright of the Tweet.
	 * @return The withheld_copyright.
	 */
	public boolean isWithheld_copyright()
	{
		return this.withheld_copyright;
	}

	/**
	 * Retrieves the withheld_in_countries of the Tweet.
	 * @return The withheld_in_countries.
	 */
	public String getWithheld_in_countries()
	{
		return this.withheld_in_countries;
	}

	/**
	 * Retrieves the withheld_scope of the Tweet.
	 * @return The withheld_scope.
	 */
	public String getWithheld_scope()
	{
		return this.withheld_scope;
	}
	
	
}
