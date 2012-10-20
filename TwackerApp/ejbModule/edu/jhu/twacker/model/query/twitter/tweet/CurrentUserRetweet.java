/**
 * OOSE Project - Group 4
 * CurrentUserRetweet.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

/**
 * This class represents the <code>current_user_retweet</code> data member
 * of a Tweet given in the JSON format specified by the Twitter API.
 * 
 * @author Daniel Deutsch
 */
public class CurrentUserRetweet
{
	/**
	 * The id of the user.
	 */
	private int id;
	
	/**
	 * The id of the user in the form of a String.
	 */
	private String id_str;

	/**
	 * Retrieves the id of the object.
	 * @return the id
	 */
	public int getId()
	{
		return this.id;
	}

	/**
	 * Retrieves the id of the object.
	 * @return the id_str
	 */
	public String getId_str()
	{
		return this.id_str;
	}
}
