package dao;

import bean.Album;

public interface AlbumDAO {

	public void save (Album album);
	
	public Album get(Album album);
	
	public void delete(Album album);
	
	public void update (Album album);
}
