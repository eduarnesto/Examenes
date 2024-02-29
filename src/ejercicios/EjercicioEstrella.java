package ejercicios;

import java.util.Scanner;

public class EjercicioEstrella {

	public static void main(String[] args) {
		//Variable para el número
		int num, res=1;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto el número
		System.out.println("Introduce un número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Calculo el factorial
		for(int i=2;i<=num;i++) {
			res*=i;
		}
		
		//Muestro el resultado
		System.out.println(res);
		
		//Cierro el Scanner
		sc.close();
	}

}
