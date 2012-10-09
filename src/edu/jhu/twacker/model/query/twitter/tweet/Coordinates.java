/**
 * OOSE Project - Group 4
 * Coordinates.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class is the representation of the coordinates of a Tweet in the JSON format
 * provided by the Twitter Streaming API.
 * 
 * See the full documentation here: {@link https://dev.twitter.com/docs/platform-objects/tweets#obj-coordinates}
 * 
 * @author Daniel Deutsch
 */
public class Coordinates
{
	/**
	 * A list of the longitude and latitude coordinates of the Tweet in the form
	 * [longitude, latitude].
	 */
	private List<Float> coordinates;
	
	/**
	 * The type of data encoded in the coordinates, equal to "Point".
	 */
	private String type;
	
	/**
	 * The empty constructor.
	 */
	public Coordinates()
	{
		
	}
	
	/**
	 * Retrieves the type of data.
	 * @return the type
	 */
	public String getType()
	{
		return this.type;
	}
	
	/**
	 * Retrieves the coordinates of the Tweet in the form [longitude, latitude].
	 * @return The coordinates.
	 */
	public List<Float> getCoordinates()
	{
		return this.coordinates;
	}
}
