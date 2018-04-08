package main;

import java.util.HashSet;
import java.util.Set;

import bean.Album;
import bean.Artista;
import dao.ArtistaDAO;
import dao.ArtistaDAOImp;

public class App 
{
    public static void main( String[] args )
    {
        ArtistaDAO artDAO = new ArtistaDAOImp();
        
        Artista a = new Artista (3300,"Marcos");
        
        Set<Album> album = new HashSet<Album>();
        album.add(new Album(2, "Segundo", a));
        
        a.setAlbumes(album);
        
        artDAO.save(a);
    }
}
