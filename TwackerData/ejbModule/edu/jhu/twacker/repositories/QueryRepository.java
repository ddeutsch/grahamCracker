package edu.jhu.twacker.repositories;

import java.util.List;

import edu.jhu.twacker.vo.Query;

public interface QueryRepository
{
	public void saveSessQuery(Query q);

	public List<Query> getSessQueries();

}
