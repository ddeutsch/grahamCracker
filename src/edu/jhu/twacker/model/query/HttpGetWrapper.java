/**
 * OOSE Project - Group 4
 * HttpGetWrapper.java
 */
package edu.jhu.twacker.model.query;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * This class is used to wrap the <code>HttpGet</code> class from the
 * Apache Http Client library to make http requests easier to manage.
 * 
 * @author Daniel Deutsch
 */
public class HttpGetWrapper
{
	/**
	 * The url that will be queried for a response. 
	 */
	private String url;
	
	/**
	 * The constructor for the class.
	 * @param url The url that should be queried.
	 */
	public HttpGetWrapper(String url)
	{
		this.url = url;
	}
	
	/**
	 * Executes the query for the object's url.
	 * @return The result from the http get.
	 */
	public String get()
	{
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet(this.url);
		HttpResponse response;
		try
		{
			response = client.execute(get);
			HttpEntity entity = response.getEntity();
			
			return EntityUtils.toString(entity);
		}
		catch (ClientProtocolException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

}
