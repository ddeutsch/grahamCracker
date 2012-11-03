package edu.jhu.twacker.repositories;

/*
 *  *EDIT FREELY
 * 
 */

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jhu.twacker.vo.Query;

/**
 * Used to log queries into the database under the appropriate tables   
 * @author Disa Mhembere
 *
 */
@Repository
public class QueryRepositoryImpl implements QueryRepository
{
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * Save the queries issued in the current session
	 */
	@Override
	public void saveSessQuery(Query q)
	{
		// TODO Auto-generated method stub

	}

	/**
	 * Get the queries issued in the current session
	 * @return a list of all queries during the current session
	 */
	//@SuppressWarnings("unchecked")
	@Override
	public List<Query> getSessQueries()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
