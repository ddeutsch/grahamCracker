/**
 * OOSE Project - Group 4
 * TwackerModel.java
 */
package edu.jhu.twacker.model;

import edu.jhu.twacker.model.query.*;

/**
 * This class represents the model for the logic behind the Twacker web site. It contains
 * three different query executers that each perform their own queries to a variety
 * of APIs that interact with Twitter. They are the <code>HistogramExec</code>, the
 * <code>HeatMapExec</code>, and the <code>SentimentExec</code>.
 * 
 * @author Daniel Deutsch
 */
public class TwackerModel
{
	/**
	 * The query executer responsible for getting the histogram data.
	 */
	private QueryExec histogramExec;
	
	/**
	 * The query executer responsible for getting the heat map data.
	 */
	private QueryExec heatMapExec;
	
	/**
	 * The query executer responsible for getting the sentiment data.
	 */
	private QueryExec sentimentExec;
	
	/**
	 * The executer responsible for getting the live Tweets per second.
	 */
	private FrequencyExec frequencyExec;
	
	/**
	 * The constructor for the class.
	 */
	public TwackerModel()
	{
		this.histogramExec = new HistogramExec();
		this.heatMapExec = new HeatMapExec();
		this.sentimentExec = new SentimentExec();
		this.frequencyExec = new FrequencyExec(1000, 10000);
	}
	
	/**
	 * Executes the query to get all of the data necessary to create the
	 * graphs to display on the site.
	 * @param search The string to search for, like "iPad".
	 */
	public void execute(String search)
	{
		this.histogramExec.execute(search);
		this.heatMapExec.execute(search);
		this.sentimentExec.execute(search);
		this.frequencyExec.execute(search);
	}
	
	/**
	 * Runs the HisogramExec, HeatMapExec, and SentimentExec.
	 */
	public static void main(String[] args)
	{
		TwackerModel model = new TwackerModel();
		model.execute("Biden");
	}
}
