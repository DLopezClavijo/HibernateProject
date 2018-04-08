package dao;

import bean.Artista;

public interface ArtistaDAO {

	public void save (Artista a);
	
	public void delete (Artista a);
	
	public void get (Artista a);
	
	public void update (Artista a);
}
