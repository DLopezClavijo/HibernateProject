package bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="album")
public class Album implements Serializable{
	
	@Id
	private int  idAlbum;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="idArtista")
	private Artista artista;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idAlbum")
	private List<Cancion> cancion;
	
	public Album() 
	{		
	}

	public Album(int idAlbum, String nombre, Artista artista) {
		super();
		this.idAlbum = idAlbum;
		this.nombre = nombre;
		this.artista = artista;
	}

	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
}
