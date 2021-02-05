package entrada;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		

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
