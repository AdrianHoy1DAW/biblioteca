package controlador;

import biblioteca.Biblioteca;
import entrada.Entrada;

public class ControladorBiblioteca {

	Biblioteca b = new Biblioteca();
	
	public ControladorBiblioteca() {
		
		
	}
	
	
	public  void go() {
		int eleccion = 0;
		while(eleccion != 6) {
			 eleccion = Entrada.Menu();
			 switch(eleccion) {
			 case 1:
				 b.registerBook();
				break;
			 case 2:
				 b.createAccount();
				 break;
			 case 3:
				 Entrada.Mensaje("Introduce el ISBN del libro que quieras alquilar");
				 String ISBN = Entrada.pedirString();
				 Entrada.Mensaje("Introduce tu DNI");
				 String DNI = Entrada.pedirString();
				 b.lendBook(b.buscarSocio(DNI), b.buscarLibro(ISBN));
				 break;
			 case 4:
				 Entrada.Mensaje("Introduce tu DNI");
				 DNI = Entrada.pedirString();
				 b.giveBackBook(b.buscarSocio(DNI));
				 break;
			 case 5:
				 Entrada.Mensaje("De que libro quieres añadir ejemplares?");
				 ISBN = Entrada.pedirString();
				 Entrada.Mensaje("Cuantos ejemplares recibimos");
				 b.reciveEjemplares(Entrada.pedirInt(), b.buscarLibro(ISBN));
				 break;
			 }
		}
		
	}
	

	
}
