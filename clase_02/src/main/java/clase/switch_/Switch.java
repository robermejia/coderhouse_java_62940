package clase.switch_;

public class Switch {

	public static void main(String[] args) {
		// SWITCH 1
		int diaDeLaSemana = 12;
		String nombreDelDiaDeLaSemana = null;
		
		switch(diaDeLaSemana) {		
			case 1:
				nombreDelDiaDeLaSemana = "Lunes";
				break;
			case 2:
				nombreDelDiaDeLaSemana = "Martes";
				break;
			case 3:
				nombreDelDiaDeLaSemana = "Miercoles";
				break;
			case 4:
				nombreDelDiaDeLaSemana = "Jueves";
				break;
			case 5:
				nombreDelDiaDeLaSemana = "Viernes";
				break;
			case 6:
				nombreDelDiaDeLaSemana = "Sabado";
				break;
			case 7:
				nombreDelDiaDeLaSemana = "Domingo";
				break;
			default:
				nombreDelDiaDeLaSemana = "Dia Incorrecto";
				break;
		}
		
		System.out.println("El dia de la semana correspondiente al Numero " 
				+ diaDeLaSemana + " es el " + nombreDelDiaDeLaSemana);
		
		// SWITCH 2
		
		String dia = "Luneds";
		
		switch(dia.toLowerCase()) { // Lo convierte en minuscula
		case "lunes":
			System.out.println("Hoy es " + dia);
			break;
		case "martes":
			System.out.println("Hoy es " + dia);
			break;
		case "miercoles":
			System.out.println("Hoy es " + dia);
			break;
		case "jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "sabado":
			System.out.println("Hoy es " + dia);
			break;
		case "domingo":
			System.out.println("Hoy es " + dia);
			break;
		default:
			System.err.println("El dia Ingresado fue: " + dia + " y es Incorrecto.!");
			break;
		}
		
		System.out.println("Fin del Switch.!!");
		

	}

}
