/**
 * OOSE Project - Group 4
 * QueryExec.java
 */
package edu.jhu.twacker.model.query;

/**
 * This is an abstract class that each of the different types of query
 * executers extend. This will be need to be changed later on when
 * we have a better idea of what the query executers should return for 
 * their <code>execute</code> method.
 * 
 * @author Daniel Deutsch
 */
public abstract class QueryExec implements Runnable
{
//	/**
//	 * Executes the query with the given String to search for.
//	 * @param search The search string.
//	 */
//	public void execute(String search);
	
	public abstract String toString();
}
