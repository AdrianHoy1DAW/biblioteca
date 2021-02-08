package socio;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import entrada.Entrada;
import libro.Ejemplar;


public class Socio {

	private String nombre;
	private String apellidos;
	private String DNI;
	private ArrayList<Ejemplar> prestados;
	private static int cantidadMaxima = 3;
	
	public Socio(String nombre, String apellidos, String DNI) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		prestados = new ArrayList<Ejemplar>();
		
	}
	
	public void lend(Ejemplar libro) {
		
		if(prestados.size() >= cantidadMaxima) {
			Entrada.Mensaje("No puedes solicitar más de tres libros");
		} else {
			prestados.add(libro);
		}
		
	}
	
	public boolean giveBack() {
		int numero = Entrada.pedirInt();	
		Entrada.Mensaje("Que libro quieres devolver: " + prestados);
		prestados.get(numero);
		
		
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI  + 
				"]";
	}
	
	
	
}
