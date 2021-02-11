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
	
	public void lendBook(Socio socio, Libro libro) {
		
		if(socios.contains(socio) && libros.contains(libro)) {
			if(libro.hayEjemplares() == true) {
				if(libro.prestarEjemplar() != null) {
					Ejemplar e = libro.prestarEjemplar();
					socio.lend(e);
					e.lend(socio);
				} else {
					Entrada.Mensaje("No hay ejemplares disponibles en este momento");
				}
			} else {
				Entrada.Mensaje("No disponemos de ejemplares de ese libro en ese momento");
			}
		} else if(!socios.contains(socio)) {
			Entrada.Mensaje("Para pedir prestado un libro necesitas estar registrado");
		} else {
			Entrada.Mensaje("No disponimos de ese libro");
		}
		
	}
	
	public void giveBackBook(Socio socio) {
		
		socio.giveBack();
		
	}

	public void createAccount() {
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
	
	public void logIn(Socio socio) {
		
		socios.add(socio);
		
	}
	
	public void addBook(Libro libro) {
		libros.add(libro);
	}
	
	public void registerBook() {
		String titulo;
		String autor;
		String ISBN;
		
		Entrada.Mensaje("Introduce el título del libro");
		titulo = Entrada.pedirString();
		Entrada.Mensaje("Introduce el autor del libro");
		autor = Entrada.pedirString();
		Entrada.Mensaje("Introduce el ISBN");
		ISBN = Entrada.pedirString();
		libros.add(new Libro(titulo, autor, ISBN));
	}
	
	public void reciveEjemplares(int cantidad, Libro libro) {
		
		if(libros.contains(libro)) {
			libro.añadirEjemplares(cantidad);
		}
		
	}
	

	@Override
	public String toString() {
		return "Biblioteca [libros=" + libros + "\n" + ", socios=" + socios + "]";
	}
	
	
	
}
