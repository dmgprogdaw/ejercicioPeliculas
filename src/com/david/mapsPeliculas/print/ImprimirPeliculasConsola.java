package com.david.mapsPeliculas.print;

import java.util.Iterator;
import com.david.mapsPeliculas.beans.Pelicula;

public class ImprimirPeliculasConsola {

	public static void imprimir(Iterator<Pelicula> iterator) {
		
		System.out.println("Peliculas disponibles");
		System.out.println("- - - - - - - - - - -");
		while(iterator.hasNext()) {
			
			Pelicula pelicula = iterator.next();
			System.out.println(pelicula);
		}
	}
}
