/**
 * OOSE Project - Group 4
 * Scopes.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

/**
 * This class represents the Scopes object of a Tweet. It is a set of key-value
 * pairs indicating the intended contextual delivery of the containing Tweet. I am a
 * little unsure about what this class is supposed to do. The documentation is not clear.
 * 
 * The full documentation: {@link https://dev.twitter.com/docs/platform-objects/tweets}
 * 
 * @author Daniel Deutsch
 */
public class Scopes
{
	/**
	 * Indicates something about the followers of the object.
	 */
	private boolean followers;
	
	/**
	 * The empty constructor.
	 */
	public Scopes()
	{
		
	}
	
	/**
	 * Retrieves whether or not followers is true or false.
	 * @return True or false.
	 */
	public boolean getFollowers()
	{
		return this.followers;
	}
}
