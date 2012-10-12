/**
 * OOSE Project - Group 4
 * FrequencyExec.java
 */
package edu.jhu.twacker.model.query;

import edu.jhu.twacker.model.query.twitter.Streamer;


/**
 * This class is responsible for getting the data to consistently update how many
 * Tweets are occurring over a given period of time. 
 * 
 * @author Daniel Deutsch
 */
public class FrequencyExec implements QueryExec
{
	/**
	 * How frequently to check the counts in milliseconds.
	 */
	private long interval;
	
	/**
	 * How long to keep the stream open in milliseconds.
	 */
	private long duration;
	
	public FrequencyExec(long interval, long duration)
	{
		this.interval = interval;
		this.duration = duration;
	}

	/**
	 * Executes the query and gets the data.
	 */
	public void execute(String search)
	{
		Streamer streamer = new Streamer("https://stream.twitter.com/1.1/statuses/filter.json?track=" + search, this.duration);
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
				streamer.resetCount();
				
				System.out.println(count);
				
				beginInterval = System.currentTimeMillis();
			}
			endInterval = System.currentTimeMillis();
		}
	}

	public static void main(String[] args)
	{
		FrequencyExec frequency = new FrequencyExec(1000, 30000);
		frequency.execute("Obama");
	}
}
