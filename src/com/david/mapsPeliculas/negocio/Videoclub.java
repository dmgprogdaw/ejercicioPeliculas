package com.david.mapsPeliculas.negocio;

import java.util.HashMap;
import java.util.Iterator;
import com.david.mapsPeliculas.beans.Director;
import com.david.mapsPeliculas.beans.Pelicula;

public class Videoclub {
	
	private HashMap<String, Pelicula> peliculaTitulo;	
	private HashMap<Director, ListaPeliculas> peliculaDirector;	
	private HashMap<Integer, Pelicula> peliculaAnio;
	
	
	public Videoclub() {
		
		peliculaTitulo = new HashMap<String, Pelicula>();
		peliculaDirector = new HashMap<Director, ListaPeliculas>();
		peliculaAnio = new HashMap<Integer, Pelicula>();
	}
	
	/*
	 * Añade a la base de datos peliculas para su busqueda mas eficiente
	 */
	public void addPelicula(Pelicula pelicula, ListaPeliculas lista) {
		
		peliculaTitulo.put(pelicula.getTitulo(), pelicula);
		peliculaDirector.put(pelicula.getDirector(), lista);
		peliculaAnio.put(pelicula.getAnio(), pelicula);
	}
	
	/*
	 * Busca y devuelve, si existe, una pelicula por su titulo
	 * devuelve pelicula pelicula o null
	 */
	public Pelicula getPelicula(String titulo) {
		
		return peliculaTitulo.get(titulo);
	}
	/*
	 * Busca y devuelve, si existe, una pelicula por su año
	 * devuelve pelicula pelicula o null
	 */
	public Pelicula getPelicula(int anio) {
		
		return peliculaAnio.get(anio);
	}
	/*
	 * Busca y devuelve, si existe, una pelicula por su director
	 * devuelve pelicula pelicula o null
	 */
	public ListaPeliculas getPelicula(Director director) {
		
		return peliculaDirector.get(director);
	}
	
	public Iterator<ListaPeliculas> getPeliculas(){
		
		return peliculaDirector.values().iterator();
	}
}
