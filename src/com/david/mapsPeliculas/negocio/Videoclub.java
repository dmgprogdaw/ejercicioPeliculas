package com.david.mapsPeliculas.negocio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import com.david.mapsPeliculas.beans.Director;
import com.david.mapsPeliculas.beans.Pelicula;
import com.david.mapsPeliculas.print.ImprimirPeliculasConsola;

public class Videoclub {
	
	private LinkedHashMap<String, Pelicula> peliculaTitulo;	
	private LinkedHashMap<Director, ArrayList<Pelicula>> peliculaDirector;	
	private LinkedHashMap<Integer, Pelicula> peliculaAnio;
	
	
	public Videoclub() {
		
		peliculaTitulo = new LinkedHashMap<String, Pelicula>();
		peliculaAnio = new LinkedHashMap<Integer, Pelicula>();
		peliculaDirector = new LinkedHashMap<Director, ArrayList<Pelicula>>();
	}
	
	/*
	 * Añade a la base de datos peliculas para su busqueda mas eficiente
	 */
	public void addPelicula(Pelicula pelicula) {
		
		peliculaTitulo.put(pelicula.getTitulo(), pelicula);
		peliculaAnio.put(pelicula.getAnio(), pelicula);
		
		if(peliculaDirector.containsKey(pelicula.getDirector())) {
			
			// extraer la lista de peliculas
			ArrayList<Pelicula> lista = peliculaDirector.get(pelicula.getDirector());
			
			// a�adir la nueva pelicula
			lista.add(pelicula);
		}
		else{
			
			// crear nueva lista de peliculas
			ArrayList<Pelicula> lista = new ArrayList<Pelicula>();
			lista.add(pelicula);
			
			// colocarla en el hashMap
			peliculaDirector.put(pelicula.getDirector(), lista);
		}
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
	public void getPelicula() {
		
		/*
		return peliculaDirector.get(director).iterator();
		*/
		for(Director key: peliculaDirector.keySet()) {
			
			List<Pelicula> list = peliculaDirector.get(key);
			ImprimirPeliculasConsola.imprimir(list.iterator());
		}
	}
	
	/*
	public Iterator<Pelicula> getPeliculas(){
		
		return peliculaDirector.values().iterator();
	}
	*/
}
