/**
 * OOSE Project - Group 4
 * Size.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

/**
 * This class represents the size of a piece of media in a Tweet. The format
 * is defined by the Twitter Streaming API.
 * 
 * The full documentation: {@ https://dev.twitter.com/docs/platform-objects/entities#user_entities}
 * 
 * @author Daniel Deutsch
 */
public class Size
{
	/**
	 * The height in pixels.
	 */
	private int h;
	
	/**
	 * The resizing method used to obtain a different size.
	 */
	private String resize;
	
	/**
	 * The width in pixels.
	 */
	private int w;
	
	/**
	 * The empty constructor.
	 */
	public Size()
	{
		
	}

	/**
	 * Retrieves the h of the object.
	 * @return The h.
	 */
	public int getH()
	{
		return this.h;
	}

	/**
	 * Retrieves the resize of the object.
	 * @return The resize.
	 */
	public String getResize()
	{
		return this.resize;
	}

	/**
	 * Retrieves the w of the object.
	 * @return The w.
	 */
	public int getW()
	{
		return this.w;
	}
}
