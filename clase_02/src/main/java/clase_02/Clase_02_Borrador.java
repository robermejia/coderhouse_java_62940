package clase_02;

import javax.swing.JOptionPane;

public class Clase_02_Borrador {

	public static void main(String[] args) {
		// CLASE 02
		// CTRL + SHIFT + F = FORMATEAR EL CÓDIGO
		// CTROL + F7 = COMENTAR EL CÓDIGO SELECCIONADO
		// EJERCICIO 1 
		System.out.println("================= EJERCICIO 1 =======================");
		int edadJuan = 10;
		int edadMarcos = 20;

		if (edadJuan > 18) {
			System.out.println("El número " + edadJuan + " Es menor de 18.");
		} else {
			System.out.println("El número " + edadMarcos + " No es mayor a 18.");
		}
		System.out.println("================= EJERCICIO 2 =======================");
		
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad"));

		if (num3 >= 18 && num3 < 100) {
		    JOptionPane.showMessageDialog(null, "Usted puede ingresar al bar de MOO");
		} else {
		    JOptionPane.showMessageDialog(null, "Usted es demasiado chico o demasiado viejo para ingresar.");
		}
		
		System.out.println("================= EJERCICIO 3 =======================");
		int numeroAleatorio = (int) (Math.random() * 100);
		if(numeroAleatorio >= 0 && numeroAleatorio <= 10) {
			JOptionPane.showMessageDialog(null, "Número entre 0 y 10");
		}else if (numeroAleatorio >= 10 && numeroAleatorio <= 20) {
			JOptionPane.showMessageDialog(null, "Número entre 10 y 20");	
		}else if (numeroAleatorio > 20 && numeroAleatorio <= 30) {
			JOptionPane.showMessageDialog(null, "Número entre 20 y 30");
		}else if (numeroAleatorio > 30 && numeroAleatorio <= 40) {
			JOptionPane.showMessageDialog(null, "Número entre 20 y 30");
		}else if (numeroAleatorio > 40 && numeroAleatorio <= 50) {
			JOptionPane.showMessageDialog(null, "Número entre 20 y 30");
		}else if (numeroAleatorio > 50 && numeroAleatorio <= 60) {
			JOptionPane.showMessageDialog(null, "Número entre 20 y 30");
		}else if (numeroAleatorio > 60 && numeroAleatorio <= 70) {
			JOptionPane.showMessageDialog(null, "Número entre 20 y 30");
		}else if (numeroAleatorio > 70 && numeroAleatorio <= 80) {
			JOptionPane.showMessageDialog(null, "Número entre 20 y 30");
		}else if (numeroAleatorio > 80 && numeroAleatorio <= 90) {
			JOptionPane.showMessageDialog(null, "Número entre 20 y 30");
		}else if(numeroAleatorio > 90 && numeroAleatorio <= 100) {
			JOptionPane.showMessageDialog(null, "Número entre 20 y 30");
		}else {
			JOptionPane.showMessageDialog(null, "Número no esta en el rango");			
		};
		
	}

}
