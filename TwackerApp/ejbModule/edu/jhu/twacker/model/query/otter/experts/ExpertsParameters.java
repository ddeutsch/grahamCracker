package edu.jhu.twacker.model.query.otter.experts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.jhu.twacker.model.query.otter.Parameters;

/**
 * This class represents the request parameters for the experts
 * query to the Otter API. The only possible parameters are q, 
 * the search term.
 * 
 * @author Daniel Deutsch
 */
public class ExpertsParameters extends Parameters
{
	/**
	 * The term to search for.
	 */
	private String q;
	
	/**
	 * The empty constructor.
	 */
	public ExpertsParameters()
	{
		// nothing
	}
	
	/**
	 * Sets the parameters if the parameter is allowed to be set.
	 * @param parameter The parameter to set.
	 * @param value The value of the parameter.
	 * @return True if it is possible to set the parameter, false otherwise.
	 */
	public boolean setParameter(String parameter, String value)
	{
		if (parameter.equals("q"))
		{
			this.q = value;
			return true;
		}
		return false;
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
		list.add("q=" + this.q);
		
		return list.iterator();
	}
}
