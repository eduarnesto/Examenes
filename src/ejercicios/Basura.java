package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basura {
	public static void main(String[] args) {
		//Variable para guardar el numero
		int num = -1;
		
		//Variable para guardar las líneas
		String espacio = "", asterisco = "", espacio2 = "", asterisco2 = "";
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				//Pregunto por un numero
				System.out.println("Introduzca un número");
				
				//Leo del teclado
				num=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while(num<0);
		
		//Muestro la pirámide
		for(int i=1; i<=num-1; i++) {
			System.out.print("  ");
			for(int j=num-1; j>i; j--) {
				espacio=espacio+" ";
			}
			asterisco=asterisco+"* ";
			System.out.println(espacio+asterisco);
			espacio="";
		}
		System.out.println(asterisco+"* "+"* ");
		System.out.println("  "+asterisco);
		for(int i=1; i<=num/2; i++) {
			System.out.print("  ");
			for(int j=num/2; j>=i; j--) {
				espacio2=espacio2+"* ";
			}
			System.out.println(espacio2+asterisco2+asterisco2+espacio2);
			asterisco2=asterisco2+"  ";
			espacio2="";
		}
		
		//Cierro el scanner
		sc.close();
		

	}

}
