package edu.jhu.twacker.form;

/**
 * Represents the items typed into a search box and passed to connecting 
 * data retrievers
 * @author Disa Mhembere
 *
 */
public class QueryFormBean {

	private String query1;
	private String query2;
	private String query3;
	
	public QueryFormBean(){
		this.setQuery1("");
		this.setQuery2("");
		this.setQuery3("");
	}


	/**
	 * Return the string typed in as the 1st search term
	 * @return the query1
	 */
	public String getQuery1() {
		return query1;
	}


	/**
	 * Set the string typed in as the 1st search term
	 * done by the parsing the form in the JSP
	 * @param query1 the query1 to set
	 */
	public void setQuery1(String query1) {
		this.query1 = query1;
	}


	/**
	 * Return the string typed in as the 2nd search term
	 * @return the query2
	 */
	public String getQuery2() {
		return query2;
	}


	/**
	 * Set the string typed in as the 2nd search term
	 * done by the parsing the form in the JSP
	 * @param query2 the query2 to set
	 */
	public void setQuery2(String query2) {
		this.query2 = query2;
	}


	/**
	 * Return the string typed in as the 3rd search term
	 * @return the query3
	 */
	public String getQuery3() {
		return query3;
	}


	/**
	 * Set the string typed in as the 3rd search term
	 * done by the parsing the form in the JSP
	 * @param query3 the query3 to set
	 */
	public void setQuery3(String query3) {
		this.query3 = query3;
	}

	
}
