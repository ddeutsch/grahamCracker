/**
 * OOSE Project - Group 4
 * OtterQuery.java
 */
package edu.jhu.twacker.model.query.otter;

/**
 * The interface that all of the queries to the Otter API should
 * conform to. Each subclass should have its own <code>OtterResponse</code>
 * type that is in the appropriate format of the JSON object that is returned
 * by the Otter query. 
 * 
 * The subclasses should also check whether or not the parameter trying to be set
 * is allowed to be set for the given query.
 *  
 * @author Daniel Deutsch
 */
public interface OtterQuery
{	
	/**
	 * Tries to set the parameter to the given value. Each <code>OtterQuery</code>
	 * subclass should check whether or not the given parameter is allowed to be
	 * set for that type of query.
	 * @param parameter The parameter to set.
	 * @param value The value of the parameter.
	 * @return True if successful, false if that parameter should not be set.
	 */
	public boolean setParameter(String parameter, String value);
	
	/**
	 * Creates the url to query based on the given parameters.
	 * @return The url.
	 */
	public String createUrl();
	
	/**
	 * Gets the response object. This method should be executed after the
	 * http get has already been executed. The response will have the structure
	 * of the JSON response from the Otter API. 
	 * @return The response.
	 */
	public OtterResponse getResponse();
}
