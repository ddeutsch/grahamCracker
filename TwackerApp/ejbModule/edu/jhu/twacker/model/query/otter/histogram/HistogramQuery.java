/**
 * OOSE Project - Group 4
 * HistogramQuery.java
 */
package edu.jhu.twacker.model.query.otter.histogram;

import edu.jhu.twacker.model.query.otter.OtterQuery;
import edu.jhu.twacker.model.query.otter.OtterRequest;
import edu.jhu.twacker.model.query.otter.OtterResponse;

/**
 * This class represents the query to get the histogram data. It is
 * required to have a request and response data members each with a 
 * specific object structure in order to conform to the "searchhistogram"
 * JSON response format.
 * 
 * @author Daniel Deutsch
 */
public class HistogramQuery implements OtterQuery
{
	/**
	 * The request for this object.
	 */
	private OtterRequest request;
	
	/**
	 * The <code>SearchHistogramResponse</code> that contains the response information.
	 */
	private HistogramResponse response;
	
	/**
	 * The constructor for the class. 
	 * @param q The required query string.
	 */
	public HistogramQuery(String q)
	{
		this.request = new OtterRequest(new HistogramParameters(), "searchhistogram");
		this.response = new HistogramResponse();
		
		this.setParameter("q", q);
	}
	
	/**
	 * The constructor for the class.
	 * @param q The required query string.
	 * @param slice The number of seconds per slice.
	 * @param period The number of slices.
	 */
	public HistogramQuery(String q, String slice, String period)
	{
		this(q);
		this.setParameter("slice", slice);
		this.setParameter("period", period);
	}
	
	
	/**
	 * Sets a specific parameter if possible. This type of query allows the
	 * following parameters to be set:
	 * -q: the term to search for
	 * -count_method: specifics what is being counted. See the documentation
	 * for this type of query for a more detailed explanation
	 * -slice: the number of seconds per slice.
	 * -period: the number of slices.
	 * 
	 * @param parameter The parameter to set.
	 * @param value The value of the parameter.
	 * @return True if successful, false if the argument parameter cannot
	 * be set for this type of query.
	 */
	public boolean setParameter(String parameter, String value)
	{
		return this.request.setParameter(parameter, value);
	}
	
	/**
	 * Gets the url for this query. This should be called after all of the
	 * parameters for the query have been set.
	 */
	public String createUrl()
	{
		return this.request.createUrl();
	}
	
	/**
	 * Gets the response for the query. This should be called after
	 * the query has been executed and the GSON library has filled in
	 * the data members for the class.
	 */
	public OtterResponse getResponse()
	{
		return this.response;
	}

}
