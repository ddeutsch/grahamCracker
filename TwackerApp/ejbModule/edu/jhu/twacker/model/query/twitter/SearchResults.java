package edu.jhu.twacker.model.query.twitter;

import java.util.List;

import edu.jhu.twacker.model.query.twitter.tweet.Tweet;

/**
 * This class represents the results from searching the standard
 * Twitter API for a search term. The format is specified by
 * the required JSON format for the the results. 
 * 
 * @author Daniel Deutsch
 */
public class SearchResults
{
	/**
	 * The time it took to completey the query.
	 */
	private double completed_in;
	
	/**
	 * The maximum id.
	 */
	private float max_id;
	
	/**
	 * The maximum id as a String.
	 */
	private String max_id_str;
	
	/**
	 * The next page reference.
	 */
	private String next_page;
	
	/**
	 * The current page.
	 */
	private int page;
	
	/**
	 * The query search term.
	 */
	private String query;
	
	/**
	 * The refresh url.
	 */
	private String refresh_url;
	
	/**
	 * A list of the results as Tweets.
	 */
	private List<Tweet> results;

	/**
	 * The empty constructor.
	 */
	public SearchResults()
	{
		
	}
	
	/**
	 * @return the completed_in
	 */
	public double getCompleted_in()
	{
		return completed_in;
	}

	/**
	 * @return the max_id
	 */
	public float getMax_id()
	{
		return max_id;
	}

	/**
	 * @return the max_id_str
	 */
	public String getMax_id_str()
	{
		return max_id_str;
	}

	/**
	 * @return the next_page
	 */
	public String getNext_page()
	{
		return next_page;
	}

	/**
	 * @return the page
	 */
	public int getPage()
	{
		return page;
	}

	/**
	 * @return the query
	 */
	public String getQuery()
	{
		return query;
	}

	/**
	 * @return the refresh_url
	 */
	public String getRefresh_url()
	{
		return refresh_url;
	}

	/**
	 * @return the results
	 */
	public List<Tweet> getResults()
	{
		return results;
	}
	
	
}
