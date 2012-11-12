package edu.jhu.twacker.repositories;
/**
 * OOSE Project - Group 4 
 * SearchRepositoryImpl.java
 */

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jhu.twacker.vo.Search;

/**
 * Used to log queries into the database under the appropriate tables   
 * @author Disa Mhembere
 *
 */
@Repository
public class SearchRepositoryImpl implements SearchRepository
{
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * Save the queries issued in the current session
	 */
	@Override
	public void saveSessSearch(Search s)
	{
		this.sessionFactory.getCurrentSession().saveOrUpdate(s);
	}

	/**
	 * Get the queries issued in the current session
	 * @return a list of all queries during the current session
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Search> getAllSearches()
	{
		List<Search> allSearches = this.sessionFactory.getCurrentSession().createQuery("from Search").list();
		return allSearches;
	}
	
	/**
	 * Get all the searched terms for the date in question
	 * @param userID the ID of the current user if provided
	 * @param date the date in question
	 * 
	 */
	@SuppressWarnings("unused")
	@Override
	public List<Search> daysSearches(int userID, Date date)
	{
		
		String hqlQuery = "SELECT Q.value FROM Search Q WHERE Q.date = :date AND Q.uid = :userID";
		@SuppressWarnings("unchecked")
		List<Search> todaySearches = this.sessionFactory.getCurrentSession().createQuery(hqlQuery)
		.setParameter("date", date)
		.setParameter("userID", userID)
		.list();
		return null;
	}

	@Override
	public Search getLastSearch()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
