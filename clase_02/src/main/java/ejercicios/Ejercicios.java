package ejercicios;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		// EJERCICIO 1
		System.out.println("======= Ejercicios con if =======");
		int num1 = -2;
		if(num1 >= 0) {
			System.out.println("EJERCICIO 1: " + num1 + " es positivo.");
		} else {
			System.out.println("EJERCICIO 1: " + num1 + " es negativo.");
		};
		
		// EJERCICIO 2
		int edadPersona = 18;
		if(edadPersona >= 18) {
			System.out.println("EJERCICIO 2: " + edadPersona + " es mayor de edad.");			
		}else {
			System.out.println("EJERCICIO 2: " + edadPersona + " es menor de edad.");						
		};
		// EJERCICIO 3
		int numImpar = 15;
		if(numImpar % 2 == 0) {			
			System.out.println("EJERCICIO 3: " + numImpar + " es par.");						
		}else {
			System.out.println("EJERCICIO 3: " + numImpar + " es inpar.");						
		};
		// EJERCICIO 4
		String cadena = "";
		if (cadena.isEmpty()) {
			System.out.println("EJERCICIO 4: esta vacia.");									
		}else {
			System.out.println("EJERCICIO 4: esta con caracteres.");									
			
		}
		// EJERCICIO 5
		int NumeroDivisible = 15;
		if (NumeroDivisible % 5 == 0) {
			System.out.println("EJERCICIO 5: Este número es divisible entre 5.");									
		}else {
			System.out.println("EJERCICIO 5: Este número es no divisible entre 5.");												
		}
		// EJERCICIO 6
		System.out.println("======= Ejercicios con if-else =======");
		int numPar = 20;
		if (numPar % 2 == 0) {
			System.out.println("EJERCICIO 6: Este número es par.");												
		}else {
			System.out.println("EJERCICIO 6: Este número es inpar.");															
		}
		// EJERCICIO 7
		int edadIndividuo = 22;
		if (edadIndividuo >= 18) {
			System.out.println("EJERCICIO 7: Es mayor de 18 años.");															
		}else {
			System.out.println("EJERCICIO 7: Es menor de 18 años.");																		
		}
		// EJERCICIO 8 - FORMA 1
		char vocalA = 'a';
        char vocalE = 'e';
        char vocalI = 'i';
        char vocalO = 'o';
        char vocalU = 'u';

        char consB = 'b'; 
        char consC = 'c'; 
        char consD = 'd'; 
        char consF = 'f';
        char consG = 'g';
        char consH = 'h';
        char consJ = 'j';
        char consK = 'k';
        char consL = 'l';
        char consM = 'm';
        char consN = 'n';
        char consP = 'p';
        char consQ = 'q';
        char consR = 'r';
        char consS = 's';
        char consT = 't';
        char consV = 'v';
        char consW = 'w';
        char consX = 'x';
        char consY = 'y';
        char consZ = 'z';

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un carácter: ");
        String caracter = scanner.nextLine();
        char caracterIngresado = caracter.charAt(0);

        if (caracterIngresado == vocalA || caracterIngresado == vocalE || caracterIngresado == vocalI ||
                caracterIngresado == vocalO || caracterIngresado == vocalU) {
            System.out.println("EJERCICIO 8: Es una vocal.");
        } else if (Character.isLetter(caracterIngresado)) { // Verifica si es una letra
            System.out.println("EJERCICIO 8: Es una consonante.");
        } else {
            System.out.println("EJERCICIO 8: Es un carácter especial.");
        }
		// EJERCICIO 9
        int numeroPostivo = -10;
        if (numeroPostivo <= 0) {
        	System.out.println("EJERCICIO 9: El número es positivo.");
		}else {
			System.out.println("EJERCICIO 9: El número es negativo.");
		}
		// EJERCICIO 10
        int anioBisiesto = 1900;
        if (anioBisiesto % 4 == 0 && anioBisiesto % 100 != 0) {
        	System.out.println("EJERCICIO 10: El año es bisiesto.");			
		}else {
			System.out.println("EJERCICIO 10: El año no es bisiesto.");						
		}
		// EJERCICIO 11
        System.out.println("======= Ejercicios con if-else if-else =======");
        int categoria = 10;
        if(categoria > 0 && categoria <= 2) {
        	System.out.println("EJERCICIO 11: La categoría es bebe.");
        }else if (categoria >= 2 && categoria <= 12) {
        	System.out.println("EJERCICIO 11: La categoría es niño.");
		}else if (categoria >= 13 && categoria <= 18) {
			System.out.println("EJERCICIO 11: La categoría es adolecente.");
		}else if(categoria > 18 && categoria <= 64) {
			System.out.println("EJERCICIO 11: La categoría es adulto.");
		}else {
			System.out.println("EJERCICIO : La categoría es anciano.");			
		};
		// EJERCICIO 12
        int precio = 10;
        if (precio >= 2 && precio <= 12) {
        	System.out.println("EJERCICIO 12: 5€");
		}else if (precio >= 13 && precio <= 18) {
			System.out.println("EJERCICIO 12: 10€");
		}else {
			System.out.println("EJERCICIO 12: 7€");
		};
		// EJERCICIO 13
		int nota = 10;
        if  (nota >= 90 && nota < 80) {
        	System.out.println("EJERCICIO 13: Nota A");
		}else if  (nota >= 80 && nota < 70) {
			System.out.println("EJERCICIO 13: Nota B");
		}else if  (nota >= 70 && nota < 60) {
			System.out.println("EJERCICIO 13: Nota C");
		}else if  (nota >= 60 && nota < 60) {
			System.out.println("EJERCICIO 13: Nota D");
		}else {
			System.out.println("EJERCICIO 13: Nota F");
		};
		// EJERCICIO 14
		int categoriaNum = 10;
        if  (categoriaNum > 0) {
        	System.out.println("EJERCICIO 14: Número positivo.");
		}else if  (categoriaNum < 0) {
			System.out.println("EJERCICIO 14: Número negativo.");
		}else if  (categoriaNum == 0) {
			System.out.println("EJERCICIO 14: Número cero.");
		}else {
			System.out.println("EJERCICIO 14: Carcter no admitido.");
		};
		// EJERCICIO 15
		// EJERCICIO 16
		// EJERCICIO 17
		// EJERCICIO 18
		// EJERCICIO 19
		// EJERCICIO 20
		// EJERCICIO 21
		// EJERCICIO 22
		// EJERCICIO 23
		// EJERCICIO 24
		// EJERCICIO 25
		// EJERCICIO 26
		// EJERCICIO 27
		// EJERCICIO 28
		// EJERCICIO 29
		// EJERCICIO 30
		// EJERCICIO 31
		// EJERCICIO 32
		// EJERCICIO 33
		// EJERCICIO 34
		// EJERCICIO 35
		// EJERCICIO 36
		// EJERCICIO 37
		// EJERCICIO 38
		// EJERCICIO 39
		// EJERCICIO 40
		// EJERCICIO 41
		// EJERCICIO 42
		// EJERCICIO 43
		// EJERCICIO 44
		// EJERCICIO 45
		// EJERCICIO 46
		// EJERCICIO 47
		// EJERCICIO 48
		// EJERCICIO 49
		// EJERCICIO 50
		
		
	}

}
