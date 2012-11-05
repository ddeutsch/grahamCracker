package edu.jhu.twacker.model.query.otter.experts;

import java.util.ArrayList;
import java.util.List;

import edu.jhu.twacker.model.query.otter.OtterResponse;

/**
 * This class represents the response object for the "experts"
 * query from the Otter API.
 * 
 * @author Daniel Deutsch
 */
public class ExpertsResponse implements OtterResponse
{
	/**
	 * The window of when to search.
	 */
	private String window;
	
	/**
	 * The page number of the response.
	 */
	private int page;
	
	/**
	 * The total number of pages.
	 */
	private String total;
	
	/**
	 * The number of results to display per page.
	 */
	private int perpage;
	
	/**
	 * The last number of experts per page.
	 */
	private String last_offset;
	
	/**
	 * The number of hidden experts.
	 */
	private int hidden;
	
	/**
	 * Retrieves the last_offset of the object.
	 * @return The last_offset.
	 */
	public String getLast_offset()
	{
		return this.last_offset;
	}

	/**
	 * Retrieves the hidden of the object.
	 * @return The hidden.
	 */
	public int getHidden()
	{
		return this.hidden;
	}

	/**
	 * The list of all of the experts on this topic.
	 */
	private List<Expert> list = new ArrayList<Expert>();

	/**
	 * The empty constructor.
	 */
	public ExpertsResponse()
	{
		// nothing
	}
	
	/**
	 * Retrieves the window of the object.
	 * @return The window.
	 */
	public String getWindow()
	{
		return this.window;
	}

	/**
	 * Retrieves the page of the object.
	 * @return The page.
	 */
	public int getPage()
	{
		return this.page;
	}

	/**
	 * Retrieves the total of the object.
	 * @return The total.
	 */
	public String getTotal()
	{
		return this.total;
	}

	/**
	 * Retrieves the perpage of the object.
	 * @return The perpage.
	 */
	public int getPerpage()
	{
		return this.perpage;
	}

	/**
	 * Retrieves the list of experts of the object.
	 * @return The list.
	 */
	public List<Expert> getList()
	{
		return this.list;
	}
	
	/**
	 * Generates a String description of the list of experts.
	 * @return The list.
	 */
	public String toString()
	{
		return this.list.toString();
	}
}
