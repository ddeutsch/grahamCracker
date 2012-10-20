/**
 * OOSE Project - Group 4
 * BoundingBox.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class represents the bounding box of the area of a place that is associated
 * with a Tweet. It takes the format of the JSON object defined by the
 * Twitter Streaming API.
 * 
 * The full documentation: {@link https://dev.twitter.com/docs/platform-objects/places#obj-boundingbox}
 * 
 * @author Daniel Deutsch
 */
public class BoundingBox
{
	/**
	 * A series of [longitude and latitude points defining a box 
	 * which will contain the place entity related to this <code>BoundingBox</code>.
	 */
	private List<List<List<Float>>> coordinates;
	
	/**
	 * The type of bounding box, here "Polygon".
	 */
	private String type;
	
	/**
	 * The empty constructor.
	 */
	public BoundingBox()
	{
		
	}

	/**
	 * Retrieves the coordinates of the object.
	 * @return The coordinates.
	 */
	public List<List<List<Float>>> getCoordinates()
	{
		return this.coordinates;
	}

	/**
	 * Retrieves the type of the object.
	 * @return The type.
	 */
	public String getType()
	{
		return this.type;
	}
}
