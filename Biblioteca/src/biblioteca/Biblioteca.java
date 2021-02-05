package biblioteca;

import java.util.LinkedHashSet;
import java.util.Set;

import entrada.Entrada;
import libro.Ejemplar;
import libro.Libro;
import socio.Socio;

public class Biblioteca {

	private Set<Libro> libros;
	private Set<Socio> socios;
	
	public Biblioteca() {
		
		libros = new LinkedHashSet<Libro>();
		socios = new LinkedHashSet<Socio>();
		
	}

	public Set<Libro> getLibros() {
		return libros;
	}

	public Set<Socio> getSocios() {
		return socios;
	}
	
	public void lendBook(Socio socio, Ejemplar libro) {
		
		if(socios.contains(socio) && libros.contains(libro)) {
			libro.lend(socio);
			socio.lend(libro);
		} else if(!socios.contains(socio)) {
			Entrada.Mensaje("Para pedir prestado un libro necesitas estar registrado");
			createAccount();
		} else {
			Entrada.Mensaje("No disponimos de ese libro");
		}
		
	}

	private void createAccount() {
		String nombre ;
		String apellidos;
		String DNI;
		
		Entrada.Mensaje("Introduce tu nombre de usuario");
		nombre = Entrada.pedirString();
		Entrada.Mensaje("Introduce tus apellidos");
		apellidos = Entrada.pedirString();
		Entrada.Mensaje("Introduce tu DNI");
		DNI = Entrada.pedirString();
		socios.add(new Socio(nombre , apellidos, DNI));
		
	}
	
	private void registerBook() {
		String titulo;
		String autor;
		String ISBN;
		
		
		libros.add(new Ejemplar(titulo, autor, ISBN));
		
		
	}
	
}
