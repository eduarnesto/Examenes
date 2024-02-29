package examenarrayas;

import java.util.Arrays;

public class Funciones {

	public static String[][] nombresGolosinas = { { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" } };

	public static double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 } };

	public static int stock[][] = new int[nombresGolosinas.length][nombresGolosinas[0].length];

	public static String ventas[] = new String[50];

	public static double total = 0;
	
	public static int pedido =0;

	public static void rellenarMatriz(int cantidad) {
		for (int i = 0; i < stock.length; i++) {
			Arrays.fill(stock[i], cantidad);
		}
	}

	public static void mostrarGolosinas() {
		for (int i = 0; i < nombresGolosinas.length; i++) {
			for (int j = 0; j < nombresGolosinas[i].length; j++) {
				System.out.println(i + "" + j + " " + nombresGolosinas[i][j] + " " + precio[i][j] + "€");
			}
		}
	}

	public static boolean validarPos(int fila, int columna) {
		boolean valido = true;

		if (fila < 0 || fila > nombresGolosinas.length) {
			valido = false;
		} else if (columna < 0 || fila > nombresGolosinas[fila].length) {
			valido = false;
		}

		return valido;
	}

	public static boolean hayValorPosicion(int fila, int columna) {
		boolean hay = true;
		
		if (stock[fila][columna] == 0) {
			hay = false;
		}
		
		return hay;
	}

	public static void aumentarPosicion(int fila, int columna, int cantidad) {
		stock[fila][columna] += cantidad;
	}
	
	public static void reducirPosicion(int fila, int columna, int cantidad) {
		stock[fila][columna] -= cantidad;
	}
	
	public static void anyadirVenta(int fila, int columna) {
		ventas[pedido++] = nombresGolosinas[fila][columna];
	}
	
	public static void imprimirVentasTotales() {
		System.out.println(Arrays.toString(ventas));
	}
	
}
