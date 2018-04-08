package bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="artista")
public class Artista implements Serializable{
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int idArtista;
		private String nombre;
		
		@OneToMany(mappedBy="artista",cascade=CascadeType.ALL)
		private Set<Album> albumes;
		
		public Artista() 
		{
		}

		public Artista(int idArtista, String nombre) {
			super();
			this.idArtista = idArtista;
			this.nombre = nombre;
		}

		public int getIdArtista() {
			return idArtista;
		}

		public void setIdArtista(int idArtista) {
			this.idArtista = idArtista;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Set<Album> getAlbumes() {
			return albumes;
		}

		public void setAlbumes(Set<Album> albumes) {
			this.albumes = albumes;
		}
		
}
