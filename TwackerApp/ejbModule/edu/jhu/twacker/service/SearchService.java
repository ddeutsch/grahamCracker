/**
 * OOSE Project - Group 4 
 * SearchService.java
 */

package edu.jhu.twacker.service;

import java.util.List;

import edu.jhu.twacker.vo.Search;

/**
 * @author Disa Mhembere
 * 
 */
public interface SearchService
{
	public void submitSearch(String s);

	public List<Search> displayAllSearches(); // May need to change type
	
	
}
