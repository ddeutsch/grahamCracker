/**
 * *EDIT FREELY TO MATCH OUR NEEDS
 */

package edu.jhu.twacker.vo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Query
{
	@Id
	@GeneratedValue
	private int id;
	@Basic
	private String value;
	@Basic
	private boolean correct;

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
