package controlador;

import biblioteca.Biblioteca;
import entrada.Entrada;
import guardado.Guardado;

public class ControladorBiblioteca {

	Biblioteca b;
	Guardado g = new Guardado();
	
	public ControladorBiblioteca() {
	
	
		b = g.load();
		
	
		
		
	}
	
	
	public  void go() {
		int eleccion = 0;
		int eleccionOrdenacion = 0;
		while(eleccion != 8) {
			 eleccion = Entrada.Menu();
			 switch(eleccion) {
			 case 1:
				 b.registerBook();
				break;
			 case 2:
				 b.createAccount();
				 break;
			 case 3:
				 Entrada.Mensaje(b.getLibros() + "Introduce el ISBN del libro que quieras alquilar");
				 String ISBN = Entrada.pedirString();
				 Entrada.Mensaje("Introduce tu DNI");
				 String DNI = Entrada.pedirString();
				 b.lendBook(b.buscarSocio(DNI), b.buscarLibro(ISBN));
				 break;
			 case 4:
				 Entrada.Mensaje("Introduce tu DNI");
				 DNI = Entrada.pedirString();
				 b.giveBackBook(b.buscarSocio(DNI));
				 break;
			 case 5:
				 if(b.getLibros().isEmpty()) {
					 Entrada.Mensaje("No hay libros en esta biblioteca");
				 } else {
					 eleccionOrdenacion = Entrada.MenuLibro();
					 if(eleccionOrdenacion == 1) {
						b.getLibros().sort(b.getLibros().get(0).COMPARE_BY_EJEMPLARES);
						Entrada.Mensaje("Estos son los libros que tenemos ordenados por número de ejemplares: " + b.getLibros());
					 } else if(eleccionOrdenacion == 2) {
						 b.getLibros().sort(b.getLibros().get(0).COMPARE_BY_TITULO);
						 Entrada.Mensaje("Estos son los libros que tenemos ordenados por título: " + b.getLibros());
					 } else if(eleccionOrdenacion == 3) {
						 b.getLibros().sort(b.getLibros().get(0).COMPARE_BY_AUTOR);
						 Entrada.Mensaje("Estos son los libros que tenemos ordenados por autor: " + b.getLibros());
					 } else {
						 Entrada.Mensaje("Estos son los libros que tenemos ordenados por defecto: " + b.getLibros());
					 }
				 }
				 break;
			 case 6:
				 if(b.getSocios().isEmpty()) {
					 Entrada.Mensaje("No hay socios registrados");
				 } else {
					 
					 eleccionOrdenacion = Entrada.MenuSocio();
					 if(eleccionOrdenacion == 1) {
						 b.getSocios().sort(b.getSocios().get(0).COMPARE_BY_PRESTADOS);
						 Entrada.Mensaje("Estos son los socios que tenemos ordenados por número de libros prestados: " + b.getSocios());
					 } else if(eleccionOrdenacion == 2) {
						 b.getSocios().sort(b.getSocios().get(0).COMPARE_BY_NOMBRE);
						 Entrada.Mensaje("Estos son los socios ordenados por nombre: " + b.getSocios());
					 } else {
						 Entrada.Mensaje("Estos son los socios registrados ordenados por defecto: " + b.getSocios());
					 }
			 	}
				 break;
			 case 7:
				 Entrada.Mensaje(b.getLibros() + "De que libro quieres añadir ejemplares?");
				 ISBN = Entrada.pedirString();
				 Entrada.Mensaje("Cuantos ejemplares recibimos");
				 b.reciveEjemplares(Entrada.pedirInt(), b.buscarLibro(ISBN));
				 break;
		
			 }
			 
		}
		g.store(b);
	}
	

	
}
