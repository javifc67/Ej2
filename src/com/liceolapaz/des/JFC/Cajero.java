package com.liceolapaz.des.JFC;

import java.util.Scanner;

public class Cajero {
	private static CuentaBancaria cuenta = null;
	//double cantidad;

	public static void main(String[] args) {
		clear();
		while (true) {
			// Ecribir Menú
			escribirMenu();
			// Leer y almacenar la opcion
			int opcion = leerOpcion();
			switch (opcion) {
			case 0:
				System.exit(0);
				break;
			case 1:
				clear();
				crearCuenta();
				break;
			case 2:
				clear();
				System.out.print("Cantidad a ingresar: ");
				cuenta.ingresar(saldoInicial());
				clear();
				break;
			case 3:
				clear();
				System.out.print("Cantidad a retirar: ");
				cuenta.retirar(saldoInicial());
				break;
			case 4:
				clear();
				System.out.println("Su saldo es de: " + cuenta.consultar());
				break;
			default:
				System.out.println("Opción incorrecta" + "");
				clear();
				break;
			}
			
		}

	}

	private static void clear() {
		System.out.println("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");

	}

	private static void crearCuenta() {
		menu1();

		int subMenu1 = leerOpcion();
		clear();
		switch (subMenu1) {
		case 0:
			break;
		case 1:
			System.out.print("indica tu saldo inicial: ");
			cuenta = new CuentaNormal(saldoInicial());
			break;
		case 2:
			System.out.print("indica tu saldo inicial: ");
			cuenta = new CuentaPremium(saldoInicial());

		}
		clear();
	}

	private static double saldoInicial() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	private static void menu1() {
		System.out.print("Tipo de cuenta\r\n" + "1. Cuenta normal\r\n" + "2. Cuenta Premium\r\n" + "0. Cancelar\r\n"
				+ "Escoja una opción: ");
	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();

	}

	private static void escribirMenu() {
		System.out.print("BANCO\r\n" + "1. Crear cuenta\r\n" + "2. Ingresar dinero\r\n" + "3. Retirar dinero\r\n"
				+ "4. Consultar saldo\r\n" + "0. Salir\r\n" + "Escoja una opción: ");
	}
}