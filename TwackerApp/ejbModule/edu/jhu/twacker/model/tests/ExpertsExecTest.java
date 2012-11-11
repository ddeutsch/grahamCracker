package edu.jhu.twacker.model.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.jhu.twacker.model.query.ExpertsExec;

/**
 * This class tests the functionality of the ExpertsExec class.
 * 
 * @author Daniel Deutsch
 */
public class ExpertsExecTest
{
	/**
	 * The ExpertsExec object that will be tested.
	 */
	private ExpertsExec experts;
	
	/**
	 * Tests to see if it retrieves the correct expert results for the search
	 * term "Obama"
	 */
	@Test
	public void test()
	{
		this.experts = new ExpertsExec("Obama");
		this.experts.run();
		
		if (!this.experts.toString().equals("\"experts\" : { \"experts\" : [{ \"username\" : \"Barack Obama\", \"photoUrl\" : \"http://a0.twimg.com/profile_images/2824616796/2d3383532bbc7bcc28f7a07e69cfe25e_normal.png\", \"influenceLevel\" : \"10\", \"url\" : \"http://twitter.com/barackobama\" } , { \"username\" : \"BIG GUNS\", \"photoUrl\" : \"http://a0.twimg.com/profile_images/2817249962/bb3d2c06524b19beb8798b3fe6a7af44_normal.jpeg\", \"influenceLevel\" : \"10\", \"url\" : \"http://twitter.com/obama_games\" } , { \"username\" : \"Mark Knoller\", \"photoUrl\" : \"http://a0.twimg.com/profile_images/137394623/knoller_normal.jpg\", \"influenceLevel\" : \"10\", \"url\" : \"http://twitter.com/markknoller\" } , { \"username\" : \"Yahoo!\", \"photoUrl\" : \"http://a0.twimg.com/profile_images/2508221033/949vu4lyu86p4eituhy3_normal.jpeg\", \"influenceLevel\" : \"10\", \"url\" : \"http://twitter.com/yahoo\" } , { \"username\" : \"YouTube\", \"photoUrl\" : \"http://a0.twimg.com/profile_images/1616286352/youtube-stacked_google_200px_normal.png\", \"influenceLevel\" : \"10\", \"url\" : \"http://twitter.com/youtube\" } ] }"))
			fail("Retrieved the incorrect expert results");
		
	}

}
