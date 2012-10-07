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
public class HistogramExec implements QueryExec
{
	/**
	 * Executes the necessary query to get the histogram data.
	 * @param search The term to search for.
	 */
	public void execute(String search)
	{
		OtterQuery query = new HistogramQuery(search, "86400", "10");
		HttpGetWrapper wrapper = new HttpGetWrapper(query.createUrl());
		
		Gson gson = new Gson();
		try
		{
			OtterQuery response = gson.fromJson(wrapper.get(), HistogramQuery.class);
			System.out.println(response.getResponse());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}
