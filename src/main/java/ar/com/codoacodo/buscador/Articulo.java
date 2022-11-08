package ar.com.codoacodo.buscador;

public class Articulo {
	// attributes
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	
	// constructors
	public Articulo() {};
	
	// methods
	public void detalle() {
		//mostrar por consola datos
		System.out.println("Imagen: " + img);
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Precio: " + precio);
	}
	
}
