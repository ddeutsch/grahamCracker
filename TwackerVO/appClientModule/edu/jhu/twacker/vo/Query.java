/**
 * *EDIT FREELY TO MATCH OUR NEEDS
 */

package edu.jhu.twacker.vo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class to hold the representation of
 * a query object added to database submitted a user 
 * @author Disa Mhembere
 *
 */
@Entity
public class Query
{
	@Id
	@GeneratedValue
	private int id;
	@Basic
	private String value;
	
	/**
	 *  Get string containing value of a query 
	 * @return The value string
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Set the value of a query
	 * This done via <code>jsp</code> form submission 
	 * @param value
	 */
	public void setValue(String value)
	{
		this.value = value;
	}

	/**
	 * Currently the transactional auto-generated ID. Primary key
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Set autogenerated ID. Done by persistence
	 * @param id
	 */
	public void setId(int id)
	{
		this.id = id;
	}
}
