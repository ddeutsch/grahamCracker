/**
 * OOSE Project - Group 4
 * HistogramResponse.java
 */
package edu.jhu.twacker.model.query.otter.histogram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.jhu.twacker.model.query.otter.OtterResponse;

/**
 * This class represents the response from a "searchhistogram" query
 * to the Otter API. It is required to have the following data members:
 * <code>histogram</code>, <code>count_method</code>, <code>period</code>,
 * and <code>slice</code> in order to conform to how the JSON response 
 * is formatted. The GSON library will take this object and the JSON 
 * response String and assign values to the respective data members.
 * 
 * The documentation for the data members: http://code.google.com/p/otterapi/wiki/Resources?tm=6#/searchhistogram
 * 
 * @author Daniel Deutsch
 */
public class HistogramResponse implements OtterResponse
{
	/**
	 * The data of the histogram whose units are defined by the
	 * period and slice data members.
	 */
	private List<Integer> histogram;
	
	/**
	 * From the Otter API: "This has two possible values, the default is 
	 * 'target' and the other possible value is 'citation'. count_method specifies 
	 * what is being counted, 'target' means the number of unique 
	 * links and 'citation' means the number of unique tweets about links."
	 *  
	 */
	private String count_method;
	
	/**
	 * The number of slices. The default value is 30.
	 */
	private int period;
	
	/**
	 * The number of seconds for each slice. The default value is 86400,
	 * the number of seconds in a day.
	 */
	private int slice;
	
	/**
	 * The constructor for the class.
	 */
	public HistogramResponse()
	{
		this.histogram = new ArrayList<Integer>();
	}
	
	/**
	 * Retrieves the histogram data.
	 * @return The data.
	 */
	public List<Integer> getHistogram()
	{
		return this.histogram;
	}
	
	/**
	 * Retrieves the period.
	 * @return The period.
	 */
	public int getPeriod()
	{
		return this.period;
	}
	
	/**
	 * Retrieves the count method.
	 * @return The count method.
	 */
	public String getCountMethod()
	{
		return this.count_method;
	}
	
	/**
	 * Retrieves the number of seconds per slice.
	 * @return The number of seconds.
	 */
	public int getSlice()
	{
		return this.slice;
	}
	
	/**
	 * Returns a String representation for the response object. Lets the user
	 * know how many seconds per slice, how many slices, and the data.
	 */
	public String toString()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (Integer i : this.histogram)
			list.addFirst(i);
		return list.toString();
//		return "Histogram: " + this.slice + " seconds per slice, " + 
//				this.period + " slices\n" + list;
	}

}
