/**
 * OOSE Project - Group 4
 * OtterResponse.java
 */
package edu.jhu.twacker.model.query.otter;

/**
 * The interface that all Otter Response objects should conform to. 
 * Each response needs to be in a specific format that is generated
 * by the structure of the JSON response from the Otter API query.
 * 
 * @author Daniel Deutsch
 */
public interface OtterResponse
{
	/**
	 * Generates a meaningful representation of the object in the form
	 * of a String.
	 * @return The String.
	 */
	public String toString();
}
