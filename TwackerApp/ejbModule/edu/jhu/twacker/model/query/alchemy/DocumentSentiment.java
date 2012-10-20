/**
 * OOSE Project - Group 4
 * DocumentSentiment.java
 */
package edu.jhu.twacker.model.query.alchemy;

/**
 * This class represents the result in JSON format of the sentiment 
 * analysis performed by the Alchemy API.
 * 
 * The documentation: {@link http://www.alchemyapi.com/api/sentiment/textc.html}
 * 
 * @author Daniel Deutsch
 */
public class DocumentSentiment
{
	/**
	 * The sentiment label: positive, neutral, or negative.
	 */
	private String type;
	
	/**
	 * The document sentiment score.
	 */
	private String score;
	
	/**
	 * The mixed sentiment.
	 */
	private String mixed;
	
	/**
	 * The empty constructor.
	 */
	public DocumentSentiment()
	{
		
	}

	/**
	 * Retrieves the type of the object.
	 * @return The type.
	 */
	public String getType()
	{
		return this.type;
	}

	/**
	 * Retrieves the score of the object.
	 * @return The score.
	 */
	public String getScore()
	{
		return this.score;
	}

	/**
	 * Retrieves the mixed of the object.
	 * @return The mixed.
	 */
	public String getMixed()
	{
		return this.mixed;
	}
}
