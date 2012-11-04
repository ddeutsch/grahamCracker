/**
 * OOSE Project - Group 4 
 * SearchRepository.java
 */
 
package edu.jhu.twacker.repositories;

import java.util.Date;
import java.util.List;

import edu.jhu.twacker.vo.Search;

public interface SearchRepository
{
	public void saveSessQuery(Search s);

	public List<Search> getSessQueries();
	
	public List<Search> daysQueries(int userID, Date d);

}
