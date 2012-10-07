/**
 * OOSE Project - Group 4
 * Parameters.java
 */
package edu.jhu.twacker.model.query.otter;

import java.util.Iterator;

/**
 * This class is the super class for the different parameters of Otter API 
 * queries. It should be either an interface or an abstract class, but because
 * of the specifics of the GSON library, it needs to be an actual class with
 * a constructor with no parameters. This class should never be instantiated.
 * 
 * @author Daniel Deutsch
 */
public class Parameters implements Iterable<String>
{
	/**
	 * An empty constructor.
	 */
	public Parameters()
	{
		
	}
	
	/**
	 * Sets the parameters if the parameter is allowed to be set.
	 * @param parameter The parameter to set.
	 * @param value The value of the parameter.
	 * @return True if it is possible to set the parameter, false otherwise.
	 */
	public boolean setParameter(String parameter, String value)
	{
		return false;
	}

	/**
	 * Creates an iterator to iterate over the parameters. It will return a 
	 * String in form of "parameter=value" so that it can easily be put into
	 * a url.
	 */
	public Iterator<String> iterator()
	{
		return null;
	}
}
