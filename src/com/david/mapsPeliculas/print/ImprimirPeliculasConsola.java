package com.david.mapsPeliculas.print;

import java.util.Iterator;
import com.david.mapsPeliculas.beans.Pelicula;
import com.david.mapsPeliculas.negocio.ListaPeliculas;

public class ImprimirPeliculasConsola {

	public static void imprimir(Iterator<Pelicula> iterator) {
		
		System.out.println("Peliculas disponibles");
		System.out.println("- - - - - - - - - - -");
		while(iterator.hasNext()) {
			
			Pelicula pelicula = iterator.next();
			System.out.println(pelicula);
		}
	}
	
	public static void imprimirListaPeliculas(ListaPeliculas lista) {
		
		for(int i=0; i<lista.getTamanio(); i++) {
			
			ListaPeliculas pelicula = lista;				
			System.out.println(pelicula);
		}
	}
}
