package libro;

import java.awt.List;
import java.util.ArrayList;

import biblioteca.Biblioteca;
import socio.Socio;

public class Libro {

	private int codigo;
	private String titulo;
	private String autor;
	private String ISBN;
	private boolean prestado;
	private Socio poseedor;
	private ArrayList<Libro> ejemplares;
	private Biblioteca biblioteca;
	private static int codigo_libro = 1;
	
	public Libro(String titulo, String autor,String ISBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.codigo = codigo_libro ++;
		this.prestado = false;
		this.poseedor = null;
		this.ejemplares = new ArrayList<Libro>();
		saveBook();
		
	}
	
	public void saveBook() {
		
		biblioteca.getLibros().add(this);
		
	}
	
	public void lend(Socio poseedor) {
		
		prestado = true;
		this.poseedor = poseedor;
		
		
	}
	
}
