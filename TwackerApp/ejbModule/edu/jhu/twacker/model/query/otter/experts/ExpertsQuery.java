package edu.jhu.twacker.model.query.otter.experts;

import edu.jhu.twacker.model.query.otter.OtterQuery;
import edu.jhu.twacker.model.query.otter.OtterRequest;
import edu.jhu.twacker.model.query.otter.OtterResponse;

public class ExpertsQuery implements OtterQuery
{
	/**
	 * The request object for this query.
	 */
	private OtterRequest request;
	
	/**
	 * The response object for this query.
	 */
	private ExpertsResponse response;
	
	/**
	 * The constructor for the class.
	 * @param q The search term.
	 */
	public ExpertsQuery(String q)
	{
		this.request = new OtterRequest(new ExpertsParameters(), "experts");
		this.response = new ExpertsResponse();
		
		this.setParameter("q", q);
	}
	
	/**
	 * Sets the specific parameters for this request. The only possible
	 * parameter to be set for this query is q, the search term.
	 * @param parameter The name of the parameter to set.
	 * @param value The value of that parameter.
	 * @return True if the parameter was set, false otherwise.
	 */
	public boolean setParameter(String parameter, String value)
	{
		return this.request.setParameter(parameter, value);
	}

	/**
	 * Creates the url to send an http get to.
	 * @return The url.
	 */
	public String createUrl()
	{	
		return this.request.createUrl();
	}

	/**
	 * Retrieves the response object.
	 * @return The response.
	 */
	public OtterResponse getResponse()
	{
		return this.response;
	}

}
