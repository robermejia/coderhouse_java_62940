package clase.operadores;

public class Operadores {

	public static void main(String[] args) {
		// Incrementar
		int contador = 0; // Definiendo a la Variable e Inicializandola (Asignarle un valor)
		System.out.println(contador);
		contador = 1; // Reasignar a otro valor
		System.out.println(contador);
		contador = contador; // Se reasigna a si mismo, o sea que vale lo que valia antes
		System.out.println(contador);
		contador = contador + 1;
		System.out.println(contador);
		contador = contador + 1;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		contador = contador - 1;
		System.out.println(contador);
		contador--;
		System.out.println(contador);
		++contador;
		System.out.println(contador);
		--contador;
		System.out.println(contador);

		
		int numeroA = 10;
		int numeroB = 10;
		
		System.out.println(numeroA == numeroB); // Son iguales?
		
		System.out.println(numeroA != numeroB); // Son distintos?
		
		System.out.println(numeroA > numeroB); // El primero es mayor que el segundo?
		
		System.out.println(numeroA < numeroB); // El primero es menor que el segundo?
		
		System.out.println(numeroA >= numeroB); // El primero es mayor o igual que el segundo?
		
		System.out.println(numeroA <= numeroB); // El primero es menor o igual que el segundo?

	}

}
