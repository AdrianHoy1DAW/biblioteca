package test;

import biblioteca.Biblioteca;
import libro.Ejemplar;
import libro.Libro;
import socio.Socio;

public class Test {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca();
		Socio socio = new Socio("Adrian","Hoyos","1");
		Libro libro = new Libro("Hola","Hola","2");
		
		b.logIn(socio);
		b.addBook(libro);
		b.reciveEjemplares(2, libro);
		b.lendBook(socio, libro);
		b.lendBook(socio, libro);
		b.giveBackBook(socio, libro);
		
		System.out.println(b);

		
	}

}
