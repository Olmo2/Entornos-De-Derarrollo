package ejercicios;

import java.util.Scanner;

public class TRAJES {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float valor;
		float descuento;
		
		System.out.println("Valor del traje: ");
		valor = teclado.nextInt();
		
		if(valor>=2500) {
			descuento=0.18f;
			
		}
		else {
			descuento=0.08f;
			
		}
		System.out.println("descuento: " + (valor * descuento));
		System.out.println("Valor con descuento: " + (valor - (valor * descuento)));
		}
	}

