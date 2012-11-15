/**
 * OOSE Project - Group 4 
 * SearchRepositoryTest.java
 */

package edu.jhu.twacker.repositories.search.tests;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.Time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.jhu.twacker.repositories.SearchRepository;
import edu.jhu.twacker.repositories.SearchRepositoryImpl;
import edu.jhu.twacker.vo.Search;


/**
 * Used to Test Database logging of search terms, IDs, Date & Time   
 * @author Disa Mhembere
 *
 */
public class SearchRositoryTest
{

	private SessionFactory sessionFactory;
	private Session session = null;

	/**
	 * Initialize the database and prepare the Search table
	 */
	@Before
	public void before()
	{
		// setup the session factory
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(Search.class);

		configuration.setProperty("hibernate.dialect",
				"org.hibernate.dialect.H2Dialect");
		configuration.setProperty("hibernate.connection.driver_class",
				"org.h2.Driver");
		configuration.setProperty("hibernate.connection.url", "jdbc:h2:mem");
		configuration.setProperty("hibernate.hbm2ddl.auto", "update");

		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
	}

	/**
	 * The test module that runs the test to be 
	 * evaluated
	 */
	@Test
	public void test()
	{
		
		Search search = new Search();
		
		search.setValue("Test Search");
		search.setId(3000);
		long nowsec = System.currentTimeMillis();
		search.setTime(new Time(nowsec));
		search.setDate(new Date(nowsec));
		
		session.saveOrUpdate(search); // Save search in DB
		
		SearchRepository searchRepo = new SearchRepositoryImpl();
		
		Search testResultSearch = new Search(); 
		testResultSearch = searchRepo.getLastSearch();
		
		assertNotSame("Returned search term not equal to expected", testResultSearch.getValue(), search.getValue());
		assertNotSame("Returned search ID not equal to expected", testResultSearch.getId(), search.getId());
		assertNotSame("Returned search time not equal to expected", testResultSearch.getTime(), search.getTime());
		assertNotSame("Returned search date not equal to expected", testResultSearch.getDate(), search.getDate());
	}
	
	/**
	 * Close the database connection to 
	 * finish the test
	 */
	@After
	public void after()
	{
		session.close();
		sessionFactory.close();
	}
}

