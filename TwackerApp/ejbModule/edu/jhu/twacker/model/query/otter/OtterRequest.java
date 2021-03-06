/**
 * OOSE Project - Group 4
 * OtterRequest.java
 */
package edu.jhu.twacker.model.query.otter;

/**
 * This class is responsible for formatting the url for the http get. It is
 * required to have the format with "response_type", "resource", "url", and
 * "parameters" as data members in order to conform to the JSON format response
 * generated by the Otter API.
 * 
 * @author Daniel Deutsch
 */
public class OtterRequest
{
	/**
	 * The response type that is always "json"
	 */
	private final String response_type = "json";
	
	/**
	 * The resource from the Topsy Otter API that is the type
	 * of request being used.
	 */
	protected String resource;
	
	/**
	 * The url that is created and will be queried.
	 */
	protected String url = "";
	
	/**
	 * The parameters of the request specific to the type of query.
	 */
	protected Parameters parameters;
	
	/**
	 * The constructor for the class.
	 * @param parameters The <code>Parameters</code> object that will hold
	 * the parameters specific to the type of query being executed. 
	 * @param resource The type of the Otter query, like "searchhistogram".
	 */
	public OtterRequest(Parameters parameters, String resource)
	{
		this.parameters = parameters;
		this.resource = resource;
	}
	
	/**
	 * Sets the given parameter to the given value if possible.
	 * @param parameter The parameter to set.
	 * @param value The value of the parameter.
	 * @return True if successful, false if the type of query trying to
	 * be executed is not possible.
	 */
	public boolean setParameter(String parameter, String value)
	{
		return this.parameters.setParameter(parameter, value);
	}
	
	/**
	 * Creates the url to be queried based on the parameters.
	 * @return The url.
	 */
	public String createUrl()
	{
		this.url = "http://otter.topsy.com/" + this.resource + "." + this.response_type + "?";
				
		for (String param : this.parameters)
			this.url = this.url + param + "&";

		return this.url.substring(0, this.url.length() - 1);
	}

}
