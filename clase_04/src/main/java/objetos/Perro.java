package objetos;

public class Perro {
// Variables de instancia o Atributos del Objeto
	private String nombre;
	private String raza;
	private String color;
	private String tamanio;
	private Integer edad;

	// Metodos
	public void ladrar() {
		System.out.println("El perro esta ladrando.!");
	}

	public void caminar() {
		System.out.println("El perro esta Caminando.!");
	}

	public void comer() {
		System.out.println("El perro esta Comiendo.!");
	}

	// Getters y Setters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return this.tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", edad="
				+ edad + "]";
	}

}
