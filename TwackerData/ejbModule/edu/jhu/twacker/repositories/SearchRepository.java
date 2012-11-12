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
	public void saveSessSearch(Search s);

	public List<Search> getAllSearches();
	
	public List<Search> daysSearches(int userID, Date d);
	
	public Search getLastSearch();

}
