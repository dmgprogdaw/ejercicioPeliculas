package com.david.mapsPeliculas.negocio;

import java.util.ArrayList;
import java.util.Iterator;

import com.david.mapsPeliculas.beans.Pelicula;

public class ListaPeliculas {

	ArrayList<Pelicula> listaPeliculas;
	
	public ListaPeliculas() {
		
		listaPeliculas = new ArrayList<Pelicula>();
	}
	
	public void addPelicula(Pelicula pelicula) {
		
		listaPeliculas.add(pelicula);
	}
	
	public int getTamanio() {
		
		return listaPeliculas.size();
	}
	
	public Iterator<Pelicula> getListaPeliculas(){
		
		return listaPeliculas.iterator();
	}
}
