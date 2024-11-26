package clase.if_;

public class If {

	public static void main(String[] args) {
		
		int numeroA = 1;
		int numeroB = 2;

		if (numeroA > numeroB) { // (Condicion) puede ser true o false
			System.out.println("El numero " + numeroA + " es Mayor que " + numeroB);
		} else {
			System.out.println("El numero " + numeroA + " es Menor que " + numeroB);
		}

		System.out.println("Si llegamos hasta aca, es porque se ejecuto el If");
		 
		
		//Calculadora
		
		float numeroC = 1.5f;
		float numeroD = 5.0f;
		
		float resultado = numeroC / numeroD;
		
		if (numeroD != 0) {			
			System.out.println("El resultado es: " + resultado);
		} else {
			System.err.println("Error, No se puede dividir por Cero.!");
		}
		
		
		int ingreseUnNumero = 0;
		
		if( ingreseUnNumero > 0 ) {
			System.out.println("El Numero ingresado es Positivo");
		} else if(ingreseUnNumero < 0 ){
			System.out.println("El Numero ingresado es Negativo");
		} else if (ingreseUnNumero == 0 ){
			System.out.println("El numero ingresado es Cero");
		} else {
			System.err.println("El dato ingresado no es un numero");
		}
		
		
		int diaDeLaSemana = -1;
		
		if (diaDeLaSemana == 1) {
			System.out.println("El dia Actual es Lunes");
		} else if (diaDeLaSemana == 2) {
			System.out.println("El dia Actual es Martes");
		} else if (diaDeLaSemana == 3) {
			System.out.println("El dia Actual es Miercoles");
		} else if (diaDeLaSemana == 4) {
			System.out.println("El dia Actual es Jueves");
		} else if (diaDeLaSemana == 5) {
			System.out.println("El dia Actual es Viernes");
		} else if (diaDeLaSemana == 6) {
			System.out.println("El dia Actual es Sabado");
		} else if (diaDeLaSemana == 7) {
			System.out.println("El dia Actual es Domingo");
		} else {
			System.err.println("El dia ingresado es Incorrecto.!");
		}
		
		
		int ingreseSuEdad = 18;
		
		if (ingreseSuEdad >= 18 && ingreseSuEdad <= 100) {
			System.out.println("Usted puede ingresar.!!");
		} else if (ingreseSuEdad > 0 && ingreseSuEdad < 18){
			System.err.println("Ud. Es menor de Edad y no puede ingresar");
		} else {
			System.err.println("Ud. Ingreso una Edad Incorrecta. O es muy viejo para tomar Alcohol");
		}
		
		

	}

}
