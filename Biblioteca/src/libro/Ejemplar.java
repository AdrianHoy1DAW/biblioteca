package libro;


import entrada.Entrada;
import socio.Socio;

public class Ejemplar extends Libro {



	private boolean prestado;
	private Socio poseedor;
	
	public Ejemplar(String titulo, String autor, String ISBN) {
		super(titulo,autor,ISBN);

		this.prestado = false;
		this.poseedor = null;
	}
	
	public void lend(Socio poseedor) {
		
		if(prestado == true) {
			Entrada.Mensaje("Ese libro ya esta prestado");
		} else {
			prestado = true;
			this.poseedor = poseedor;
		}

		
		
	}
	
	
	
}
