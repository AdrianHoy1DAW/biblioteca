package libro;




import java.util.ArrayList;

import biblioteca.Biblioteca;


public abstract class Libro {

	private int codigo;
	private String titulo;
	private String autor;
	private String ISBN;
	private static int codigo_libro = 1;
	
	public Libro(String titulo, String autor, String ISBN) {
		
		this.codigo = codigo_libro ++;
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		
		
	}
	

	

	
}
