/**
 * OOSE Project - Group 4
 * AlchemyResponse.java
 */
package edu.jhu.twacker.model.query.alchemy;

/**
 * This class represents the structure of a response from the Alchemy API in
 * the JSON format.
 * 
 * The documentation: {@link http://www.alchemyapi.com/api/sentiment/textc.html}
 * 
 * @author Daniel Deutsch
 */
public class AlchemyResponse
{
	/**
	 * The request status.
	 */
	private String status;
	
	/**
	 * The request url.
	 */
	private String url;
	
	/**
	 * The language of the Tweet.
	 */
	private String language;
	
	/**
	 * The text of the Tweet.
	 */
	private String text;
	
	/**
	 * The result of the sentiment analysis.
	 */
	private DocumentSentiment docSentiment;
	
	/**
	 * The empty constructor.
	 */
	public AlchemyResponse()
	{
		
	}
	
	/**
	 * Retrieves the status of the object.
	 * @return The status.
	 */
	public String getStatus()
	{
		return this.status;
	}

	/**
	 * Retrieves the url of the object.
	 * @return The url.
	 */
	public String getUrl()
	{
		return this.url;
	}

	/**
	 * Retrieves the language of the object.
	 * @return The language.
	 */
	public String getLanguage()
	{
		return this.language;
	}

	/**
	 * Retrieves the text of the object.
	 * @return The text.
	 */
	public String getText()
	{
		return this.text;
	}

	/**
	 * Retrieves the docSentiment of the object.
	 * @return The docSentiment.
	 */
	public DocumentSentiment getDocSentiment()
	{
		return this.docSentiment;
	}
}
