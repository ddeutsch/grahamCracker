package edu.jhu.twacker.model.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.gson.Gson;

import edu.jhu.twacker.model.query.otter.histogram.HistogramQuery;

/**
 * This class is responsible for testing the HistogramExec class
 * to ensure that the results remain consistent over any changes to the code.
 * 
 * @author Daniel Deutsch
 */
public class HistogramQueryTest
{
	/**
	 * Runs all of the tests for this class.
	 */
	@Test
	public void test()
	{
		testCreateUrl();
		testGetResponse();	
	}
	
	/**
	 * Tests to see whether or not the HistogramQuery class creates the
	 * correct url or not based on the request parameters.
	 */
	private void testCreateUrl()
	{
		HistogramQuery query = new HistogramQuery("Obama", "86400", "10");
		
		if (!query.createUrl().equals("http://otter.topsy.com/searchhistogram.json?" +
				"q=Obama&period=10&slice=86400"))
			fail("HistogramQuery createUrl produced an incorrect url");
	}

	/**
	 * Tests to see if the class can parse a response correctly.
	 */
	private void testGetResponse()
	{
		Gson gson = new Gson();
		String response = "{\"request\":{\"parameters\":{\"period\":\"10\",\"q\":\"Obama\",\"slice\":\"86400\"},\"response_type\":\"json\",\"resource\":\"searchhistogram\",\"url\":\"http://otter.topsy.com/searchhistogram.json?period=10&q=Obama&slice=86400\"},\"response\":{\"histogram\":[171258,156176,128905,154404,193167,202516,180710,596895,115596,91318],\"period\":10,\"count_method\":\"target\",\"slice\":86400}}";

		HistogramQuery query = gson.fromJson(response, HistogramQuery.class);
		
		if (!query.getResponse().toString().equals("[91318, 115596, 596895, 180710, 202516, 193167, 154404, 128905, 156176, 171258]"))
			fail("HistogramQuery's response did not parse correctly. toString is incorrect.");
	}
}
