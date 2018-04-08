package bean;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="cancion")
public class Cancion implements Serializable{
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int idCancion;
 private String nombre;
 private int duracion;
 private int orden;
 

@ManyToOne
 @JoinColumn(name="idAlbum")
 private Album album;
 

public Cancion() {
	} 

public Album getAlbum() {
	return album;
}
public void setAlbum(Album album) {
	this.album = album;
}
public int getIdCancion() {
	return idCancion;
}
public void setIdCancion(int idCancion) {
	this.idCancion = idCancion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}

public int getOrden() {
	return orden;
}
public void setOrden(int orden) {
	this.orden = orden;
}

public Cancion(String nombre, int duracion, Album album, int orden) {
	super();	
	this.nombre = nombre;
	this.duracion = duracion;
	this.album = album;
	this.orden = orden;
}

}

