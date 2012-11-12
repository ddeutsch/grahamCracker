/**
 * OOSE Project - Group 4 
 * SearchServiceImpl.java
 */
package edu.jhu.twacker.service;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.jhu.twacker.repositories.SearchRepository;
import edu.jhu.twacker.vo.Search;

/**
 * @author Disa Mhembere
 *
 */
@Service
public class SearchServiceImpl implements SearchService
{
	@Autowired
	private SearchRepository searchRepository;

	@Transactional
	public void submitSearch(String s)
	{
		Search searchObj = new Search();
		searchObj.setValue(s); // set the search term value
		Date today = new Date(System.currentTimeMillis()); // Current date
		searchObj.setDate(today); // set the current date 
		searchObj.setTime(new Time(today.getTime())); // set the time
		
		//searchObj.setDate(today); // set the current date
		//searchObj.setTime(new Time(today.getTime())); // set the time
		
		this.searchRepository.saveSessSearch(searchObj);
		
		// *** Sanity Checks **** //
		System.out.println("The search term: " + s);
		
		List<Search> allSearches = this.searchRepository.getAllSearches();
		System.out.println("Printing all Searches: ");
		for (Search searchTerm : allSearches){
			System.out.println("Search term: " + searchTerm.getValue() + ", ID: " + ((Integer)searchTerm.getId()).toString()
			 + ", Date: " + searchTerm.getDate().toString() + ", Time:" + searchTerm.getTime().toString()) ;
		}
		
		// *** Sanity Checks **** //
		
	}

	@Transactional
	public List<Search> displayAllSearches()
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
