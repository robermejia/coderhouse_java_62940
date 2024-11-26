package ejercicios;

public class Ejercicios {

	public static void main(String[] args) {
	// ========== EJERCICIOS CLASE 1 ========
	System.out.println("======== VARIABLES Y TIPOS DE VARIABLES ======");
	// EJERCICIO 1
	int edadUsuario = 33;
	System.out.print("EJERCICIO 1: ");
	System.out.println("Variable entera " + edadUsuario);
	// EJERCICIO 2
	final int NUMERO_DIAS = 7;
	System.out.print("EJERCICIO 2: ");
	System.out.println("Constante " + NUMERO_DIAS);
	// EJERCICIO 3
	double precioTV = 2000;
	System.out.print("EJERCICIO 3: ");
	System.out.println("Precio TV es de: " + precioTV);
	// EJERCICIO 4
	boolean estudianteAprobado = true;
	System.out.print("EJERCICIO 4: ");
	System.out.println("Alumno aprobado: " + estudianteAprobado);
	// EJERCICIO 5
	char inicialNombre = 'R';
	System.out.print("EJERCICIO 5: ");
	System.out.println("Inicial nombre: " + inicialNombre);
	// EJERCICIO 6
	System.out.print("EJERCICIO 6: El array es de: ");
	int notasEstudiantes[] = {15,17,16,18,20};
	for(int i = 0; i < notasEstudiantes.length; i++) {
		System.out.print(" " + notasEstudiantes[i]);
	}
	System.out.println("");
	for(int i = 0; i < notasEstudiantes.length; i++) {
		System.out.println("Nota de estudiante "+ (i + 1) + " es de: " + notasEstudiantes[i]);
	}
	// EJERCICIO 7
	String nombrePersona = "Roberto";
	System.out.print("EJERCICIO 7: ");
	System.out.println("Nombre de una persona es: " + nombrePersona);
	// EJERCICIO 8
	float pesoPersona = 70.5F;
	System.out.print("EJERCICIO 8: ");
	System.out.println("El peso de una persona es de: " + pesoPersona + " kilos");
	System.out.println("");
	
	System.out.println("================= COSNTANTES ===============");
	// EJERCICIO 9
	final double PI = 3.14;
	System.out.print("EJERCICIO 9: ");
	System.out.println("El número PI es de: " + PI);
	// EJERCICIO 10
	final int CANTIDAD_MAX_ESTUDIANTES = 100;
	System.out.print("EJERCICIO 10: ");
	System.out.println("La cantidad máxima de estudiantes es de: " + CANTIDAD_MAX_ESTUDIANTES);
	System.out.println("");
	
	System.out.println("================= OPERADORES ===============");
	// EJERCICIO 11
	int num1 = 100;
	int num2 = 200;
	int numSumado = num1 + num2;
	System.out.print("EJERCICIO 11: ");
	System.out.println("Suma de " + num1 + " y " + num2 + " es de: " + numSumado);
	// EJERCICIO 12
	double num3 = 10.5d;
	double num4 = 20.5d;
	double numRestado = num4 - num3;
	System.out.print("EJERCICIO 12: ");
	System.out.println("La resta de " + num4 + " y " + num3 + " es de: " + numRestado);
	// EJERCICIO 13
	int num5 = 12;
	int num6 = 30;
	int numMultiplicado = num5 * num6;
	System.out.print("EJERCICIO 13: ");
	System.out.println("La multiplicación de " + num5 + " y " + num6 + " es de: " + numMultiplicado);
	// EJERCICIO 14
	int num7 = 300;
	int num8 = 3;
	int numDividido = num7 / num8;
	System.out.print("EJERCICIO 14: ");
	System.out.println("La división de " + num7 + " y " + num8 + " es de: " + numDividido);
	// EJERCICIO 15
	double num9 = 1000;
	double num10 = 199;
	double numModulo = num9 % num10;
	System.out.print("EJERCICIO 15: ");
	System.out.println("El modulo de " + num9 + " y " + num10 + " es de: " + numModulo);
	System.out.println("");
	
	System.out.println("============ OPERADORES RELACIONALES ==========");
	// EJERCICIO 16
	int num11 = 10;
	int num12 = 20;
	String aux = num11 > num12 ? "num11 es mayor que num12" : "sum12 es mayor que num11";
	System.out.println("EJERCICIO 16: El resultado es: " + aux);
	// EJERCICIO 17
	int num13 = 10;
	int num14 = 2;
	String aux1 = num13 % num14 == 0? "Es par":"Es impar";
	System.out.println("EJERCICIO 17: El resultado es: " + aux1);
	// EJERCICIO 18
	String nombre1 = "Roberto";
	String nombre2 = "Gustavo";
	String aux2 = nombre1 == nombre2? "Son iguales" : "No son iguales";
	System.out.println("EJERCICIO 18: El resultado es: " + aux2);
	// EJERCICIO 19
	int notaEstudiante = 15;
	String resultado = notaEstudiante > 10 ? "Aprobado" : "Desaprobado";
	System.out.println("EJERCICIO 19: El resultado es: " + resultado);
	// EJERCICIO 20
	int num15 = 15;
	String aux3 = num15 > 0 && num15 < 11 ? "Número entre 1 y 10" : "Número fuera del rango";
	System.out.println("EJERCICIO 20: " + num15 + " " + aux3);
	
	System.out.println("============ BUENAS PRÁCTICAS ==========");
	// EJERCICIO 21
	String nombreAlumno = "Roberto";
	System.out.println("EJERCICIO 21: Bienvenido " + nombreAlumno);
	// EJERCICIO 22
	// Este es un comentario para el ejercicio 21 de buenas prácticas
	String comentario = "Antes de esta línea hay un comentario";
	System.out.println("EJERCICIO 22: " + comentario);
	// EJERCICIO 23
	int num16 = 10;
	int num17 = num16 + 10;
	int num18 = num17 + num16;
	System.out.println("EJERCICIO 23: Variable refactorizada num18 es igual a: " + num18);
	// EJERCICIO 24
	class Ejemplo {
		public void saludar() {
			String nombreSaludo = "Juan";
			System.out.println("EJERCICIO 24: Saludos a: " + nombreSaludo);
		}	
	}
	Ejemplo saludo = new Ejemplo();
	saludo.saludar();
	// EJERCICIO 25
	class Programa1{
		public void sumarDosNumeros() {
			int anioNacimiento = 1989;
			int edadActual = 35;
			System.out.println("EJERCICIO 26: La suma de 2 números es el año actual que es: " + (anioNacimiento + edadActual));
		}
	}
	Programa1 pro1 = new Programa1();
	pro1.sumarDosNumeros();
	
	System.out.println("============ VARIABLES PRIMITIVAS Y NO PRIMITIVAS ==========");
	// EJERCICIO 26
	
	

	
	
	
	    
	
	
		
		

	}

}
