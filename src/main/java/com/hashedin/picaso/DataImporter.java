package com.hashedin.picaso;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataImporter {
	
	static JdbcTemplate jdbcTemplate = null;
	static XmlBeanFactory factory=null;
	
	
	public static List<AlbumDbHandler> getAlbumData()
	{
		factory= new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		DataSource dataSource = factory.getBean(DataSource.class);
		DataImporter importer = new DataImporter(dataSource);
		AlbumDbHandler adh=(AlbumDbHandler) factory.getBean("AlbumDbHandler");
		adh.setJdbcTemplate(jdbcTemplate);
		adh.getDbData();
		return(adh.getListAlbum());
		
	}
	
	public DataImporter(DataSource dataSource) 
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	

}
