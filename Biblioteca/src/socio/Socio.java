package socio;

import java.util.LinkedHashSet;
import java.util.Set;

import entrada.Entrada;
import libro.Libro;

public class Socio {

	private String nombre;
	private String apellidos;
	private String DNI;
	private Set<Libro> prestados;
	private static int cantidadMaxima = 3;
	
	public Socio(String nombre, String apellidos, String DNI) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		prestados = new LinkedHashSet<Libro>();
		
	}
	
	public void lend(Libro libro) {
		
		if(prestados.size() >= cantidadMaxima) {
			Entrada.Mensaje("No puedes solicitar más de tres libros");
		} else {
			prestados.add(libro);
		}
		
	}
	
}
