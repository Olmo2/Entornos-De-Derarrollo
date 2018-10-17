package ejercicios;

import java.util.Scanner;

public class lenguajedemarcas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		float area;
		
		System.out.print("Valor del lado a: ");
		a = teclado.nextInt();
		
		System.out.print("Valor del lado b: ");
		b = teclado.nextInt();
		
		System.out.print("Valor del lado c: ");
		c = teclado.nextInt();
		System.out.print("Valor del Area=" + ((c*b) + ((a-c) * b)/2));
		
	}

}
