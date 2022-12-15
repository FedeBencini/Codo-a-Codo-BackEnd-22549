package ar.com.codoacodo.herencia;

// todas las clases heredan de Object
public abstract class Consola /* extends Object */{
	private String nombre;
	protected Integer bit;
	private String marca;
	
	// constructor con todos los parámetros para los hijos
	
	public Consola(String nombre, Integer bit, String marca) {
		this.nombre = nombre;
		this.bit = bit;
		this.marca = marca;
	}

	// como nombre y marca son private, les ponemos get y set
	
	public String getNombre() {
		return nombre;
	}

	public Integer getBit() {
		return bit;
	}

	public String getMarca() {
		return marca;
	}
	
	@Override
	public String toString() {
		return "Consola [nombre=" + nombre + ", bit=" + bit + ", marca=" + marca + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
}
