/**
 * OOSE Project - Group 4
 * HistogramExec.java
 */
package edu.jhu.twacker.model.query;

import com.google.gson.Gson;
import edu.jhu.twacker.model.query.otter.*;
import edu.jhu.twacker.model.query.otter.histogram.HistogramQuery;

/**
 * This class performs the queries necessary to obtain the data
 * to draw the histogram.
 * 
 * @author Daniel Deutsch
 */
public class HistogramExec extends QueryExec
{
	/**
	 * The term to search for.
	 */
	private String term;
	
	/**
	 * The number of seconds per slice.
	 */
	private String slice;
	
	/**
	 * The number of slices to sample.
	 */
	private String period;
	
	/**
	 * The response from the HttpGet in the form of a list
	 * of integers.
	 */
	private String results;
	
	/**
	 * The constructor for the class.
	 * @param search The term to search for.
	 * @param slice The seconds per slice.
	 * @param period The number of slices to sample.
	 */
	public HistogramExec(String search, String slice, String period)
	{
		this.term = search;
		this.slice = slice;
		this.period = period;
	}
	
	/**
	 * Executes the necessary query to get the histogram data.
	 * @param search The term to search for.
	 */
	public void run()
	{
		OtterQuery query = new HistogramQuery(this.term, this.slice, this.period);
		HttpGetWrapper wrapper = new HttpGetWrapper(query.createUrl());
		
		Gson gson = new Gson();
		try
		{
			OtterQuery response = gson.fromJson(wrapper.get(), HistogramQuery.class);
			this.results = response.getResponse().toString();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	/**
	 * Creates a JSON representation of this object.
	 */
	public String toString()
	{
		return "\"histogram:\": { \"data\": " + this.results + ", \"slice\": \"" + this.slice + "\"," +
				" \"period\": \"" + this.period + "\" }";
	}
	
	/**
	 * Tests the HistogramExec class.
	 */
	public static void main(String[] args)
	{
		HistogramExec histogram = new HistogramExec("Obama", "86400", "10");
		Thread thread = new Thread(histogram);
		
		thread.start();
		try
		{
			thread.join();
		}
		catch (Exception e)
		{
			// TODO nothing.
		}
		
		System.out.println(histogram);
	}
}
