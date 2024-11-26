package clase.operadorTernario;

public class Ternario {

	public static void main(String[] args) {
		// Operador Ternario
				
			int numeroA = 10;
			int numeroB = 2;
				
			boolean condicion = numeroA > numeroB; // Esto puede ser o true o false
				
			String resultado = condicion 
				? "El numero " + numeroA + " es Mayor que " + numeroB 
				: "El numero " + numeroA + " es Menor que " + numeroB; 
				// El valor de verdad de condicion es false
				
			System.out.println(resultado);
				

	}

}
