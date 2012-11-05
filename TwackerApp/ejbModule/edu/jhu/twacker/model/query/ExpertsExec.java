package edu.jhu.twacker.model.query;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import edu.jhu.twacker.model.query.otter.experts.Expert;
import edu.jhu.twacker.model.query.otter.experts.ExpertsQuery;
import edu.jhu.twacker.model.query.otter.experts.ExpertsResponse;

/**
 * This class is responsible for obtaining the top experts who Tweet
 * about a specific search term the most.
 * 
 * @author Daniel Deutsch
 */
public class ExpertsExec extends QueryExec
{
	/**
	 * The term to search for.
	 */
	private String searchTerm;
	
	/**
	 * The results of the query.
	 */
	private List<Expert> experts = new ArrayList<Expert>();
	
	/**
	 * The constructor for the class.
	 * @param term The term to search for.
	 */
	public ExpertsExec(String term)
	{
		this.searchTerm = term;
	}
	
	/**
	 * Executes the query.
	 */
	public void run()
	{
		ExpertsQuery query = new ExpertsQuery(this.searchTerm);
		HttpGetWrapper wrapper = new HttpGetWrapper(query.createUrl());
				
		Gson gson = new Gson();
		
		ExpertsQuery response = gson.fromJson(wrapper.get(), ExpertsQuery.class);
		this.experts = ((ExpertsResponse) response.getResponse()).getList();
	}

	/**
	 * Generates a JSON formatted representation of this object.
	 * @return The String.
	 */
	public String toString()
	{
		List<Expert> topFive = new ArrayList<Expert>();
		int fiveOrMax = Math.min(5, this.experts.size());
		
		for (int i = 0; i < fiveOrMax; i++)
			topFive.add(this.experts.get(i));
		
		return "\"experts\" : { \"experts\" : " + topFive.toString() + " }";
	}
	
	public static void main(String[] args)
	{
		ExpertsExec experts = new ExpertsExec("Obama");
		Thread thread = new Thread(experts);
		
		thread.start();
		try
		{
			thread.join();
		}
		catch (Exception e)
		{
			// nothing
		}
		
		System.out.println(experts);
	}
}
