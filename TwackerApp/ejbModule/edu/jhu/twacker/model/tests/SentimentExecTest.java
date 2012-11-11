package edu.jhu.twacker.model.tests;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.jhu.twacker.model.query.SentimentExec;

/**
 * This class is responsible for testing the SentimentExec class.
 * 
 * @author Daniel Deutsch
 */
public class SentimentExecTest
{
	/**
	 * A list of Tweets to be analyzed.
	 */
	private List<String> tweets = new LinkedList<String>();
	
	/**
	 * Creates a list of Tweets.
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		tweets.add("RT @SaintRPh: Newspapers Increasingly Dump Obama For Romney http://t.co/TbG1TMr1 #IBDBlogs via @IBDinvestors");
		tweets.add("Obama to cut medical benefits for active, retired military, not union workers http://t.co/3gafJT1f via @examinercom");
		tweets.add("RT @LiterallyFedUp: #Obama ~ We leave no man behind. What about #Benghazi &amp; their #7hoursofhell? You mean you don't like to leave WI ...");
		tweets.add("Pro-Obama Ad Brainwashed Children Singing http://t.co/ZQiXAGED via @WestJournalism Child fromSTRONG,CHRISTIAN,PATRIOTIChome never'd singTHIS");
		tweets.add("RT @BettinaVLA: PIC:  Romney Helping Load Relief Supplies For Victims Of Hurricane Sandy...Obama? Partying somewhere. http://t.co/JjxSIf3F");
		tweets.add("@fivethirtyeight what about http://t.co/zNwgnv25 Obama Up 4 in Ohio -- 49%-45%");
		tweets.add("RT @AlinskyDefeater: 13 Year-Old Jenny Schools 26 Year-Old Obama Girl (Video) http://t.co/nTmOJ9ZJ #ocra #tcot #tlot");
		tweets.add("RT @n0s0ph: Obama stahp http://t.co/tnbmd0k9");
		tweets.add("RT @DefeatObamaNow: GM Bailout: So much for fairness: Obama threw Delphi workers under the bus because they were nonunion. http://t.co/4 ...");
		tweets.add("@rougebaisers sounds like he is... he prolly got a few votes for obama with his praise....");
		tweets.add("RT @iamrashidajones: RT@CasandraNg:  President Barack Obama Watches 'Parks And Recreation' With His Family http://t.co/4lmOR47V via @Huf ...");
		tweets.add("@katieemyladyy hiii im doing a stats project and you were randomly selected to be asked who you would vote for :p obama, romney, or other?");
		tweets.add("Obama announces a massive search and rescue operation to locate Snooki.");
		tweets.add("Glad he's so concerned.");
		tweets.add("If Obama offers free fried chicken at the polls he's gonna get them votes! Ns will walk to a polling place for free fried chicken.");
		tweets.add("RT @Slate: Chris Christie can't stop praising Obama for his hurricane #Sandy efforts: http://t.co/ZAciylbq");
		tweets.add("Obama advierte que Sandy no ha terminado http://t.co/e9a23eE2");
		tweets.add("Cerca de 90 millones de estadounidenses no votarán por trabas y desilusión http://t.co/lak3u6d8 #USA #EEUU #Obama #elecciones");
		tweets.add("Obama gets Sandy update, scraps more campaign plans | The Ticket - Yahoo! News http://t.co/Dub4p4Mw via @YahooNews");
		tweets.add("News Conference: President Barack Obama http://t.co/W6hAjEnu #LongIsland #News");
		tweets.add("Retired Military Heroes Call Out @BarackObama For Deserting Americans In #Benghazi.. http://t.co/3COV9Cyh … #Libya 9/11 #TRUTH #Liberty #USA");
		tweets.add("RT @ReutersPolitics: Republican New Jersey Governor Christie praises Obama http://t.co/fjMPQ8XO");
		tweets.add("RT @zachbraff: “@realDonaldTrump: Hurricane is good luck for Obama again- he will buy the election by handing out billions of dollars.”  ...");
		tweets.add("RT @cnnbrk: President #Obama will travel to New Jersey on Wednesday to view damage from #Sandy. http://t.co/0aJUD1SS");
		tweets.add("Trump VS Pres. Obama is Political Psychological warfare at its best. But Pres has Upper hand because Trump is exposing his wide range anger");
		tweets.add("Mundo: Clinton releva a Barack Obama en la campaña por #39;Sandy#39; http://t.co/ZZdtV7Cu");
		tweets.add("NOT SURPRISED SHE WASN'T A PROUD AMERICAN: A Look at Michelle Obama’s Radical College Past http://t.co/NkHuf7gv #haction #teaparty #tcot #tt");
		tweets.add("Nate Silver, delusional much? MT. 75% Chance Obama Wins. http://t.co/Cy3VfDqY via @POLITICO");
		tweets.add("Chris Christie Praises Obama For Hurricane Sandy Preparation http://t.co/sv0U7juW via @HuffPostPol");
	}
	
	/**
	 * Tests to see whether or not the Sentiment analysis tool correctly
	 * analyzes the Tweets.
	 */
	@Test
	public void test()
	{
		SentimentExec sentiment = new SentimentExec("Obama");
		sentiment.analyzeTweets(this.tweets);
		
		if (!sentiment.toString().equals("\"sentiment\": { \"positive\" : \"13\", \"neutral\" : \"5\", \"negative\" : \"8\", \"total\" : \"26\", \"errors\": \"3\" }"))
			fail("analyzeTweets method failed to analyze correctly.");
	}

	
}
