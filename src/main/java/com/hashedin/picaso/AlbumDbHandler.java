package com.hashedin.picaso;

import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

public class AlbumDbHandler implements ICommonDb {
	
	private String albumName;
	private String albumDesc;
	private String creationDate;
	private JdbcTemplate jdbcTemplate=null;
	private List<AlbumDbHandler> listAlbum=null;
	
	public List<AlbumDbHandler> getListAlbum() {
		return listAlbum;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void getDbData()
	{
		
		String query="select albumName,albumDesc,creationDate from AlbumDetail";
		
		AlbumDbHandler obj=new AlbumDbHandler();
		obj.setAlbumName("Nature");
		obj.setAlbumDesc("Nature Picture");
		obj.setCreationDate("29th Jan 2012");
		
		AlbumDbHandler obj1=new AlbumDbHandler();
		obj1.setAlbumName("Cricket");
		obj1.setAlbumDesc("Cricket Picture");
		obj1.setCreationDate("19th Jan 2012");
		
		
		AlbumDbHandler obj2=new AlbumDbHandler();
		obj2.setAlbumName("Football");
		obj2.setAlbumDesc("Football Picture");
		obj2.setCreationDate("9th Jan 2012");
		
		listAlbum.add(obj);
		listAlbum.add(obj1);
		listAlbum.add(obj2);
		
		
		/*this.listAlbum=jdbcTemplate.query(query,new RowMapper<AlbumDbHandler>(){

			public String mapRow(ResultSet rs,int rowNum) throws SQLException
			{
				
			}	
		});*/
		
	}
	
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getAlbumDesc() {
		return albumDesc;
	}
	public void setAlbumDesc(String albumDesc) {
		this.albumDesc = albumDesc;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	
	

}
