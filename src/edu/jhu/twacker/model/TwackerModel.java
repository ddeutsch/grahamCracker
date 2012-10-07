/**
 * OOSE Project - Group 4
 * TwackerModel.java
 * 
 * @author Daniel Deutsch
 */
package edu.jhu.twacker.model;

import edu.jhu.twacker.model.query.*;

public class TwackerModel
{
	private QueryExec histogramExec;
	
	private QueryExec heatMapExec;
	
	private QueryExec sentimentExec;
	
	public TwackerModel()
	{
		this.histogramExec = new HistogramExec();
		this.heatMapExec = new HeatMapExec();
		this.sentimentExec = new SentimentExec();
	}
}
