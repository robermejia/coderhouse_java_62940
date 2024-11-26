package clase.aleatorio;

public class Aleatorio {

	public static void main(String[] args) {
		// Datos Aleatoreos
		
		//double randon = 0.0d;
		int randon = 0;
		//randon = Math.random();
		//System.out.println(randon);
				
		int minimo = 1;
		int maximo = 6;
				
		int rango = maximo - minimo + 1; // de 1 a 100
				
		randon = ( int ) (Math.random() * rango ) + minimo;
		System.out.println(randon);
				
		final double PI = Math.PI;
				
		System.out.println(String.format("%.2f", PI));

	}

}
