package org.crawlinghorizon.dao;

import com.sun.javafx.collections.MappingChange.Map;

/**
 * DatabaseRepository-Top level repository contract
 * @author victory
 *
 */
public interface DatabaseRepository {
	public enum SupportedDatabase
	{
		mysql,sqlserver,postgre,mongodb,others
	}
	public void init(Map<String,String>param);
	

}
