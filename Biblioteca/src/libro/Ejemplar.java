package libro;


import entrada.Entrada;
import socio.Socio;

public class Ejemplar {


	private int codigo;
	private Socio poseedor;
	
	
	
	public Ejemplar() {
		
		
		codigo = 1;
		this.poseedor = null;
	
	}
	

	public void lend(Socio poseedor) {
		
		if(poseedor == null) {
			Entrada.Mensaje("Ese libro ya esta prestado");
		} else {
			this.poseedor = poseedor;
		}
	}
	
	public void giveBack() {
		
	
		this.poseedor = null;
		
		
	}
	


	public Socio getPoseedor() {
		return poseedor;
	}


	@Override
	public String toString() {
		return "Ejemplar [codigo=" + codigo + ", poseedor=" + poseedor + "]";
	}


	
	
	
	
	
	
	
}
