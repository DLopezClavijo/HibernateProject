package dao;

import bean.Cancion;

public interface CancionDAO {

	public void save(Cancion c);
	
	public void delete(Cancion c);
	
	public Cancion get (Cancion c);
	
	public void update (Cancion c);
	
	
}
