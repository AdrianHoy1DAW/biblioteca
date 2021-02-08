package libro;




import java.util.ArrayList;

import biblioteca.Biblioteca;
import entrada.Entrada;
import socio.Socio;


public class Libro {


	protected String titulo;
	protected String autor;
	protected String ISBN;
	private ArrayList<Ejemplar> ejemplares = new ArrayList<Ejemplar>();
	
	
	public Libro(String titulo, String autor, String ISBN) {
		
		
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		
		
	}
	
	public Ejemplar prestarEjemplar() {
		Ejemplar e = null; 
		
		if(hayEjemplares() == true) {
			for(int i = 0; i<ejemplares.size(); i ++) {
				if(ejemplares.get(i).getPoseedor() == null){
					e = ejemplares.get(i);
				}
			}
		} else {
			return null;
		}

		
		return e;
		
	}
	
	public boolean hayEjemplares() {
		
		if(ejemplares.isEmpty()) {
			return false;
		} else {
			return true;
		}
		
	}

	public void añadirEjemplares(int cantidad) {
		
		for(int i = 0; i< cantidad; i++) {
			
			ejemplares.add(new Ejemplar());
			
		}
		
	}

	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public String getISBN() {
		return ISBN;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", ejemplares=" + ejemplares + "]";
	}
	
	
	
	


	

	
}
