package entrada;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		

	}
	
	public static int Menu() {
		Entrada.Mensaje("Qué quieres hacer");
		
		
		Entrada.Mensaje("1. Registrar un libro");
		Entrada.Mensaje("2. Registrar un socio");
		Entrada.Mensaje("3. Alquilar un libro");
		Entrada.Mensaje("4. Devolver un libro");
		Entrada.Mensaje("5 Enseñar los libros");
		Entrada.Mensaje("6. Mostrar los socios");
		Entrada.Mensaje("7. Recibir ejemplares");
		Entrada.Mensaje("8. Guardar los cambios");
		Entrada.Mensaje("9. Salir de la aplicación");
		
		int eleccion = pedirInt();
		return eleccion;
		
		
	}

	public static int pedirInt() {
		int pedido = 0;
		Scanner sc = new Scanner(System.in);
		
		pedido = sc.nextInt();
		return pedido;
	}
	
	public static String pedirString() {
		String pedido = "";
		Scanner sc = new Scanner(System.in);
		
		pedido = sc.nextLine();
		return pedido;
		
		
	}
	
	public static  void Mensaje(String mensaje) {
		System.out.println(mensaje);
	}

	
}
