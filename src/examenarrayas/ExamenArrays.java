package examenarrayas;

import java.util.Arrays;
import java.util.Scanner;

public class ExamenArrays {

	// Scanner para leer del teclado
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Cantidad con la que rellenar la maquina
		int cantidad = 5;

		// Relleno la maquina
		Funciones.rellenarMatriz(cantidad);

		// Variable para el menu
		int menu = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para el menu
		do {
			System.out.println("Presione la opcion que desee");
			System.out.println("1.- Mostrar golosinas");
			System.out.println("2.- Pedir golosina");
			System.out.println("3.- Rellenar golosinas");
			System.out.println("4.- Apagar máquina");

			// Leo del teclado
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				Funciones.mostrarGolosinas();
				break;
			case 2:
				pedirGolosina();
				break;
			case 3:
				rellenaGolosina();
				break;
			case 4:
				System.out.println(Arrays.toString(Funciones.ventas));
				System.out.println(Funciones.total);
				break;
			}

		} while (menu != 4);

		// Cierro el Scanner
		sc.close();
	}

	public static void pedirGolosina() {
		int fila;
		int columna;
		boolean valido;
		boolean disponible = true;

		do {
			System.out.println("Introduzca la fila del producto deseado");
			fila = sc.nextInt();

			System.out.println("Introduzca la columna del producto deseado");
			columna = sc.nextInt();

			valido = Funciones.validarPos(fila, columna);

			if (!valido) {
				System.out.println("Posicion introducida incorrecta");
				continue;
			}

			disponible = Funciones.hayValorPosicion(fila, columna);

			if (disponible) {
				System.out.println("Hay existencias del producto seleccionado");
			} else {
				System.out.println("No hay existencias del producto seleccionado");
			}

		} while (!valido && !disponible);

		Funciones.anyadirVenta(fila, columna);

		Funciones.total += Funciones.precio[fila][columna];

		Funciones.reducirPosicion(fila, columna, 1);
	}

	public static void rellenaGolosina() {
		final String CONTRASENYA = "Maquina2023";
		String intento;
		boolean valido;
		int fila;
		int columna;
		int cantidad = 0;

		System.out.println("Introduzca la contraseña");
		intento = sc.nextLine();

		if (CONTRASENYA == intento) {
			do {
				System.out.println("Introduzca la fila del producto deseado");
				fila = sc.nextInt();

				System.out.println("Introduzca la columna del producto deseado");
				columna = sc.nextInt();
				
				System.out.println("Introduzca la cantidad que desea añadir");
				columna = sc.nextInt();

				valido = Funciones.validarPos(fila, columna);

				if (!valido) {
					System.out.println("Posicion introducida incorrecta");
					continue;
				}
			} while (!valido);
			Funciones.aumentarPosicion(fila, columna, cantidad);
		} else {
			System.out.println("Contraseña incorrecta");
		}
	}
}
