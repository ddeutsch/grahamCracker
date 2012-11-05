/**
 * OOSE Project - Group 4
 * HistogramParameters.java
 */
package edu.jhu.twacker.model.query.otter.histogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.jhu.twacker.model.query.otter.Parameters;

/**
 * The class of parameters for the histogram query to the Otter API.
 * It is required to have the following data members: <code>q</code>,
 * <code>count_method</code>, <code>slice</code>, and <code>period</code>.
 * 
 * The documentation for what exactly each of the parameters mean is located
 * here: http://code.google.com/p/otterapi/wiki/Resources?tm=6#/searchhistogram
 * 
 * The iterator for this class should return each of the parameters that has
 * been set in the form "parameter=value" so it can easily be put into a url. 
 * 
 * @author Daniel Deutsch
 */
public class HistogramParameters extends Parameters
{
	/**
	 * The query string to search for.
	 */
	private String q = null;
	
	/**
	 * The counting method. See the documentation of the Otter API for a 
	 * thorough explanation.
	 */
	private String count_method = null;
	
	/**
	 * The number of seconds per slice.
	 */
	private String slice = null;
	
	/**
	 * The number of slices per query.
	 */
	private String period = null;
	
	/**
	 * An empty constructor required for the GSON library.
	 */
	public HistogramParameters()
	{
		// nothing
	}
	
	/**
	 * Sets any of the parameters that are allowed to be set for this class.
	 * @param parameter The parameter to set.
	 * @param value The value of the parameter.
	 * @return True if successful, false otherwise.
	 */
	public boolean setParameter(String parameter, String value)
	{
		if (parameter.equals("q"))
			this.q = value;
		else if (parameter.equals("count_method"))
			this.count_method = value;
		else if (parameter.equals("slice"))
			this.slice = value;
		else if (parameter.equals("period"))
			this.period = value;
		else
			return false;
		
		return true;
	}

	/**
	 * Generates an iterator to iterate over all of the parameters. Each
	 * value from the iterator should be in the form "parameter=value" for
	 * all of the parameters that have been set.
	 * @return the Iterator.
	 */
	public Iterator<String> iterator()
	{
		List<String> list = new ArrayList<String>();
		
		if (this.q != null)
			list.add("q=" + this.q);
		if (this.count_method != null)
			list.add("count_method=" + this.count_method);
		if (this.period != null)
			list.add("period=" + this.period);
		if (this.slice != null)
			list.add("slice=" + this.slice);
		
		return list.iterator();
	}
}
