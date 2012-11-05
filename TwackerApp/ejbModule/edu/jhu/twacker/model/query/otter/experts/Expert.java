package edu.jhu.twacker.model.query.otter.experts;

/**
 * This class represents the JSON formatted object that is part of
 * the response for the Otter API request to "experts". The data members
 * that is has are required and defined by the Otter API.
 * 
 * The full documentation: {@link http://code.google.com/p/otterapi/wiki/Resources?tm=6#/experts}
 * 
 * @author Daniel Deutsch
 */
public class Expert
{
	/**
	 * The username of the expert.
	 */
	private String name;
	
	/**
	 * The nickname of the expert.
	 */
	private String nick;
	
	/**
	 * The url of their profile picture.
	 */
	private String photo_url;
	
	/**
	 * The description of the user's account.
	 */
	private String description;
	
	/**
	 * The influence level of the expert calculated by the Otter API.
	 */
	private String influence_level;
	
	/**
	 * The number of hits.
	 */
	private int hits;
	
	/**
	 * The trackback total.
	 */
	private int trackback_total;
	
	/**
	 * The url for this expert's account.
	 */
	private String url;
	
	/**
	 * The Topsy account url.
	 */
	private String topsy_author_url;
	
	/**
	 * The empty constructor required by the GSON library.
	 */
	public Expert()
	{
		// empty
	}

	/**
	 * Generates a JSON formatted String to represent this object.
	 * @return The String.
	 */
	public String toString()
	{
		return "{ \"username\" : \"" + this.name + "\", \"photoUrl\" : \"" + this.photo_url + 
			   "\", \"influenceLevel\" : \"" + this.influence_level + "\", \"url\" : \"" +
				this.url + "\" } ";
	}
	
	/**
	 * Retrieves the username of the expert.
	 * @return The username.
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Retrieves the nickname of the expert.
	 * @return The nickname.
	 */
	public String getNick()
	{
		return this.nick;
	}

	/**
	 * Retrieves the user's profile url.
	 * @return The photo_url.
	 */
	public String getPhoto_url()
	{
		return this.photo_url;
	}

	/**
	 * Retrieves the description of the user's account.
	 * @return The description.
	 */
	public String getDescription()
	{
		return this.description;
	}

	/**
	 * Retrieves the influence level of the expert.
	 * @return The influence_level.
	 */
	public String getInfluence_level()
	{
		return this.influence_level;
	}

	/**
	 * Retrieves the number of hits.
	 * @return The hits.
	 */
	public int getHits()
	{
		return this.hits;
	}

	/**
	 * Retrieves the trackback total.
	 * @return The trackback_total.
	 */
	public int getTrackback_total()
	{
		return this.trackback_total;
	}

	/**
	 * Retrieves the url of the expert's account.
	 * @return The url.
	 */
	public String getUrl()
	{
		return this.url;
	}

	/**
	 * Retrieves the Topsy url of the expert.
	 * @return The topsy_author_url.
	 */
	public String getTopsy_author_url()
	{
		return this.topsy_author_url;
	}
	
	
}
