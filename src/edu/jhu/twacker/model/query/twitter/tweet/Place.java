/**
 * OOSE Project - Group 4
 * Place.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

/**
 * This class represents the place that the Tweet is associated with. This does
 * not necessarily mean that it originated from this place. This class follows
 * the JSON format specified by the Twitter Search API. 
 * 
 * The full documentation: {@linkplain https://dev.twitter.com/docs/platform-objects/places}
 * 
 * @author Daniel Deutsch
 */
public class Place
{
	/**
	 * The attributes of the location, like street address, city, country, etc.
	 */
	private Attributes attributes;
	
	/**
	 * The bounding box of this place. It defines a region.
	 */
	private BoundingBox bounding_box;
	
	/**
	 * The name of the country.
	 */
	private String country;
	
	/**
	 * The shortened version of the country.
	 */
	private String country_code;
	
	/**
	 * The human-readable name of the place.
	 */
	private String full_name;
	
	/**
	 * The id representing the place.
	 */
	private String id;
	
	/**
	 * The short human-readable representation of the place.
	 */
	private String name;
	
	/**
	 * The type of the location represented by this place.
	 */
	private String place_type;
	
	/**
	 * The url representing the location of the place.
	 */
	private String url;
	
	/**
	 * The empty constructor.
	 */
	public Place()
	{
		
	}

	/**
	 * Retrieves the attributes of the object.
	 * @return The attributes.
	 */
	public Attributes getAttributes()
	{
		return this.attributes;
	}

	/**
	 * Retrieves the bounding box of the object.
	 * @return The bounding box.
	 */
	public BoundingBox getBounding_box()
	{
		return this.bounding_box;
	}

	/**
	 * Retrieves the country of the object.
	 * @return The country.
	 */
	public String getCountry()
	{
		return this.country;
	}

	/**
	 * Retrieves the country code of the object.
	 * @return The country code.
	 */
	public String getCountry_code()
	{
		return this.country_code;
	}

	/**
	 * Retrieves the full name of the object.
	 * @return The full name.
	 */
	public String getFull_name()
	{
		return this.full_name;
	}

	/**
	 * Retrieves the id of the object.
	 * @return The id.
	 */
	public String getId()
	{
		return this.id;
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
	 * Retrieves the place type of the object.
	 * @return The place type.
	 */
	public String getPlace_type()
	{
		return this.place_type;
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
