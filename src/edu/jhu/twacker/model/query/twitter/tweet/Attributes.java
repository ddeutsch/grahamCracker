/**
 * OOSE Project - Group 4
 * Attributes.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

/**
 * This class represents the Geo Place attributes of a Place of a Tweet. It follows
 * the JSON format provided by the Twitter Streaming API.
 * 
 * The full documentation {@link https://dev.twitter.com/docs/about-geo-place-attributes};
 * 
 * @author Daniel Deutsch
 */
public class Attributes
{
	/**
	 * The street address of the Place.
	 */
	private String street_address;
	
	/**
	 * The city the place is in.
	 */
	private String locality;
	
	/**
	 * The administrative region the place is in.
	 */
	private String region;
	
	/**
	 * The country code.
	 */
	private String iso3;
	
	/**
	 * The preferred local format for the place.
	 */
	private String postal_code;
	
	/**
	 * The preferred local format for the place, including long distance code.
	 */
	private String phone;
	
	/**
	 * The Twitter screen name without "@".
	 */
	private String twitter;
	
	/**
	 * The official/canonical URL for the place.
	 */
	private String url;
	
	/**
	 * An id or comma separated list of ids representing the place.
	 */
	private String id;
	
	/**
	 * The empty constructor.
	 */
	public Attributes()
	{
		
	}

	/**
	 * Retrieves the street address of the object.
	 * @return The street address.
	 */
	public String getStreet_address()
	{
		return this.street_address;
	}

	/**
	 * Retrieves the locality of the object.
	 * @return The locality.
	 */
	public String getLocality()
	{
		return this.locality;
	}

	/**
	 * Retrieves the region of the object.
	 * @return The region.
	 */
	public String getRegion()
	{
		return this.region;
	}

	/**
	 * Retrieves the country code of the object.
	 * @return The country code.
	 */
	public String getIso3()
	{
		return this.iso3;
	}

	/**
	 * Retrieves the postal code of the object.
	 * @return The postal code.
	 */
	public String getPostal_code()
	{
		return this.postal_code;
	}

	/**
	 * Retrieves the phone of the object.
	 * @return The phone.
	 */
	public String getPhone()
	{
		return this.phone;
	}

	/**
	 * Retrieves the Twitter screen name of the object.
	 * @return The screen name.
	 */
	public String getTwitter()
	{
		return this.twitter;
	}

	/**
	 * Retrieves the url of the place of the object.
	 * @return The url.
	 */
	public String getUrl()
	{
		return this.url;
	}

	/**
	 * Retrieves the id of the place of the object.
	 * @return The id.
	 */
	public String getId()
	{
		return this.id;
	}
}
