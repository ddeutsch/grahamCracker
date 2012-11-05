/**
 * OOSE Project - Group 4
 * FrequencyExec.java
 */
package edu.jhu.twacker.model.query;

import java.util.LinkedList;
import java.util.List;

import edu.jhu.twacker.model.query.twitter.Streamer;


/**
 * This class is responsible for getting the data to consistently update how many
 * Tweets are occurring over a given period of time. 
 * 
 * @author Daniel Deutsch
 */
public class FrequencyExec extends QueryExec
{
	/**
	 * How frequently to check the counts in milliseconds.
	 */
	private long interval;
	
	/**
	 * How long to keep the stream open in milliseconds.
	 */
	private long duration;
	
	/**
	 * The term to search for.
	 */
	private String search;
	
	/**
	 * The frequencies per second.
	 */
	private List<Integer> frequencies = new LinkedList<Integer>();
	
	/**
	 * The constructor for the class. 
	 * @param search The term to search for.
	 * @param interval How many milliseconds apart to check for the new total. 
	 * @param duration How long to check.
	 */
	public FrequencyExec(String search, long interval, long duration)
	{
		this.search = search;
		this.interval = interval;
		this.duration = duration;
	}

	/**
	 * Executes the query and gets the data.
	 */
	public void run()
	{
		Streamer streamer = new Streamer("https://stream.twitter.com/1.1/statuses/filter.json?track=" + this.search, this.duration);
		streamer.start();
		
		long start = System.currentTimeMillis();
		long beginInterval = System.currentTimeMillis();
	
		long current = System.currentTimeMillis();
		long endInterval = System.currentTimeMillis();
		
		while (current - start < this.duration)
		{
			current = System.currentTimeMillis();
			
			if (endInterval - beginInterval > this.interval)
			{
				int count = streamer.getCount();
				this.frequencies.add(count);
				
				streamer.resetCount();
				beginInterval = System.currentTimeMillis();
			}
			endInterval = System.currentTimeMillis();
		}
	}
	
	/**
	 * Generates a JSON representation of the results of the query.
	 * @return The string representation.
	 */
	public String toString()
	{
		return "\"frequency\": " + this.frequencies;
	}

	public static void main(String[] args)
	{
		FrequencyExec frequency = new FrequencyExec("Obama", 1000, 10000);
		Thread thread = new Thread(frequency);
		
		thread.start();
		try
		{
			thread.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(frequency);
	}
}
