package socio;

import java.util.LinkedHashSet;
import java.util.Set;

import libro.Libro;

public class Socio {

	private String nombre;
	private String apellidos;
	private String DNI;
	private Set<Libro> prestados;
	
	public Socio(String nombre, String apellidos, String DNI) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		prestados = new LinkedHashSet<Libro>();
		
	}
	
}
