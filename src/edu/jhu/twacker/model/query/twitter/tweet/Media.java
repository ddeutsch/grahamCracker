/**
 * OOSE Project - Group 4
 * Media.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

import java.util.List;

/**
 * This class provides information about media that is displayed on
 * a user's Twitter profile. The object is in JSON format.
 * 
 * The full documentation: {@link https://dev.twitter.com/docs/platform-objects/entities#user_entities}
 * 
 * @author Daniel Deutsch
 */
public class Media
{
	/**
	 * The url of the media to display.
	 */
	private String display_url;
	
	/**
	 * An expanded version of the display url.
	 */
	private String expanded_url;
	
	/**
	 * The id of the media.
	 */
	private long id;
	
	/**
	 * The id of the media as a String.
	 */
	private String id_str;
	
	/**
	 * The indices where the url's text begins and ends.
	 */
	private List<Integer> indices;
	
	/**
	 * A url pointing directly to the uploaded media file.
	 */
	private String media_url;
	
	/**
	 * A url pointing directly to the uploaded media file.
	 */
	private String media_url_https;
	
	/**
	 * Shows the available sizes for the media file.
	 */
	private Size sizes;
	
	/**
	 * If this Tweet contains media from another Tweet, this is the id
	 * of the original Tweet.
	 */
	private long source_status_id;
	
	/**
	 * The String version of the original Tweet id.
	 */
	private long source_status_id_str;
	
	/**
	 * The type of the media, like "photo."
	 */
	private String type;
	
	/**
	 * A wrapped url for the media link;
	 */
	private String url;
	
	/**
	 * The empty constructor.
	 */
	public Media()
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
	 * Retrieves the id of the object.
	 * @return The id.
	 */
	public long getId()
	{
		return this.id;
	}

	/**
	 * Retrieves the id_str of the object.
	 * @return The id_str.
	 */
	public String getId_str()
	{
		return this.id_str;
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
	 * Retrieves the media_url of the object.
	 * @return The media_url.
	 */
	public String getMedia_url()
	{
		return this.media_url;
	}

	/**
	 * Retrieves the media_url_https of the object.
	 * @return The media_url_https.
	 */
	public String getMedia_url_https()
	{
		return this.media_url_https;
	}

	/**
	 * Retrieves the sizes of the object.
	 * @return The sizes.
	 */
	public Size getSizes()
	{
		return this.sizes;
	}

	/**
	 * Retrieves the source_status_id of the object.
	 * @return The source_status_id.
	 */
	public long getSource_status_id()
	{
		return this.source_status_id;
	}

	/**
	 * Retrieves the source_status_id_str of the object.
	 * @return The source_status_id_str.
	 */
	public long getSource_status_id_str()
	{
		return this.source_status_id_str;
	}

	/**
	 * Retrieves the type of the object.
	 * @return The type.
	 */
	public String getType()
	{
		return this.type;
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
