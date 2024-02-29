package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=num; j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				if(j==2&&i==3) {
					System.out.print("# ");
				} else
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println(num);
		sc.close();

	}

}
