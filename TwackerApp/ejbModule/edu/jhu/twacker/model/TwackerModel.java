/**
 * OOSE Project - Group 4
 * TwackerModel.java
 */
package edu.jhu.twacker.model;

import java.util.LinkedList;
import java.util.List;

import edu.jhu.twacker.model.query.*;

/**
 * This class represents the model for the logic behind the Twacker web site. It contains
 * three different query executers that each perform their own queries to a variety
 * of APIs that interact with Twitter. They are the <code>HistogramExec</code>, the
 * <code>HeatMapExec</code>, and the <code>SentimentExec</code>.
 * 
 * @author Daniel Deutsch
 */
public class TwackerModel extends Thread
{
	/**
	 * A list of all of the query executers that this class will have.
	 * For right now, there will be 3: the HistogramExec, the
	 * SentimentExec, and the FrequencyExec.
	 */
	private List<QueryExec> executers;
	
	/**
	 * The term to search for.
	 */
	private String search;
	
	/**
	 * The result of the queries in JSON format that will be send to the
	 * Javascript part of the application which will display the data.
	 * This data member should be retrieved after the thread has been run.
	 */
	private String result;
	
	/**
	 * The constructor for the class.
	 */
	public TwackerModel(String search)
	{
		this.search = search;
		this.executers = new LinkedList<QueryExec>();
		
		this.executers.add(new HistogramExec(this.search, "86400", "10"));
		this.executers.add(new SentimentExec(this.search));
		this.executers.add(new FrequencyExec(this.search, 1000, 10000));
	}
	
	/**
	 * Executes the query to get all of the data necessary to create the
	 * graphs to display on the site.
	 */
	public void start()
	{
		for (QueryExec executer : this.executers)
			executer.start();
		
		for (QueryExec executer: this.executers)
		{
			try
			{
				executer.join();
			}
			catch (InterruptedException e)
			{
				// TODO Do something about this?
				e.printStackTrace();
			}
		}
		
		this.createJsonFormat();
	}
	
	/**
	 * Creates the JSON format for the model.
	 */
	public void createJsonFormat()
	{
		this.result = "{ \"search\" : \"" + this.search + "\", ";
		for (QueryExec executer : this.executers)
			this.result += executer + ", ";
		
		int index = this.result.lastIndexOf(',');
		this.result = this.result.substring(0, index);
		this.result += " }";
	}
	
	/**
	 * Gets the JSON representation of the result of these queries.
	 * @return The String representation.
	 */
	public String getResult()
	{
		return this.result;
	}
	
	/**
	 * Gets the JSON representation of the result of these queries.
	 * @return The String representation.
	 */
	public String toString()
	{
		return this.getResult();
	}
	
	/**
	 * Runs the HisogramExec, HeatMapExec, and SentimentExec.
	 */
	public static void main(String[] args)
	{
		TwackerModel model = new TwackerModel("Obama");
		model.start();
		try
		{
			model.join();
		}
		catch (Exception e)
		{
			// TODO nothing
		}
		System.out.println(model.getResult());
	}
}
