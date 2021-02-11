package test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import biblioteca.Biblioteca;
import libro.Ejemplar;
import libro.Libro;
import socio.Socio;

public class Test {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca();
		Socio socio = new Socio("Adrian","Hoyos","1");
		Socio socio1 = new Socio("Rodriog","Hoyos","1");
		Socio socio2 = new Socio("Zamorano","Hoyos","1");
		Socio socio3 = new Socio("Judith","Hoyos","1");
		
		
		Libro libro = new Libro("Hola","Hola","2");
		Libro libro1 = new Libro("Adios","Manolo","2");
		Libro libro2 = new Libro("Mellizos","Juan","2");
		Libro libro3 = new Libro("Surima","Carlos","2");
		Libro libro4 = new Libro("Thiago","Hoyos","2");
		Set<Libro> libros = b.getLibros();
		Set<Socio> socios = b.getSocios();
		

		
		socios= new	TreeSet<Socio>();
		socios.add(socio);
		socios.add(socio1);
		socios.add(socio2);
		socios.add(socio3);
		
		
		System.out.println(socios);
		
		
		
	}

}
