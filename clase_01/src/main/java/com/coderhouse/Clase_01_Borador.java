package com.coderhouse;

public class Clase_01_Borador {

	public static void main(String[] args) {
		System.out.println("CLASE 01");
		//============================ Variables ======================================
		int variableA = 1000;
		long numeroLargo = 1234567890L;
		double variableDecimal = 1000.50d;
		char variableChar = 'R';
		
		String variableString = "Roberto";
		boolean variableBoleana = true;
		
		String saludo = "Hola!";
		String nombre = "Rober";
		System.out.println(saludo);
		System.out.println(saludo + " " + nombre);
		//========================== Concatenación ====================================
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		String num4 = "400";
		System.out.println(num1 + num2 + num3 + " " + num4);
		//============================ Incrementar ====================================
		int contador = 0; // Definicion e inicializar
		System.out.println(contador);
		contador = 1;
		System.out.println(contador);
		contador = contador + 1;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador--;
		System.out.println(contador);
		//============================== Comparaciones ===============================
		int numA[] = {10,20,30};
		int numB[] = {10,20,30};
		System.out.println(numA.equals(numB));
		int numD = 100;
		int numE = 100;
		System.out.println(numD == numE);

	}

}
