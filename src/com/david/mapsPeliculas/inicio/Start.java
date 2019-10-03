package com.david.mapsPeliculas.inicio;

import com.david.mapsPeliculas.beans.Director;
import com.david.mapsPeliculas.beans.Pelicula;
import com.david.mapsPeliculas.negocio.ListaPeliculas;
import com.david.mapsPeliculas.negocio.Videoclub;
import com.david.mapsPeliculas.print.ImprimirPeliculasConsola;

public class Start {

	public static void main(String[] args) {
		
		Director makoto = new Director();
		makoto.setNombre("Shinkai Makoto");
		
		Director shinichirou = new Director();
		shinichirou.setNombre("Ushijima Shinicirou");
		
		Director hayao = new Director();
		hayao.setNombre("Miyazaki Hayao");
		
		Director hiromasa = new Director();
		makoto.setNombre("Yonebayashi Hiromasa");
		
		Director katsuhiro = new Director();
		katsuhiro.setNombre("Otomo Katsuhiro");
		
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setTitulo("Kimi no Na wa.");
		pelicula1.setAnio(2016);
		pelicula1.setDirector(makoto);
		
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setTitulo("Kimi no Suizou wo Tabetai");
		pelicula2.setAnio(2018);
		pelicula2.setDirector(shinichirou);
		
		Pelicula pelicula3 = new Pelicula();
		pelicula3.setTitulo("Sen to Chihiro no Kamikakushi");
		pelicula3.setAnio(2001);
		pelicula3.setDirector(hayao);
		pelicula1.setPresupuesto(1900000000.00);
		
		Pelicula pelicula4 = new Pelicula();
		pelicula4.setTitulo("Mary to Majo no Hana");
		pelicula4.setAnio(2017);
		pelicula4.setDirector(hiromasa);
		
		Pelicula pelicula5 = new Pelicula();
		pelicula5.setTitulo("Steamboy");
		pelicula5.setAnio(2004);
		pelicula5.setDirector(katsuhiro);
		
		Pelicula pelicula6 = new Pelicula();
		pelicula6.setTitulo("Tonari no Totoro");
		pelicula6.setAnio(1988);
		pelicula6.setDirector(hayao);
		
		ListaPeliculas lista = new ListaPeliculas();
		Videoclub misPelis = new Videoclub();
		misPelis.addPelicula(pelicula3, lista);
		misPelis.addPelicula(pelicula6, lista);
		lista.addPelicula(pelicula6);
		lista.addPelicula(pelicula3);
		
		ImprimirPeliculasConsola.imprimirListaPeliculas(lista);
	}
}
