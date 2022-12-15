package ar.com.codoacodo.domain;

public class Articulo {
	// attributes
	private Long id; // pk de la tabla
	private String img;
	private String titulo;
	private String autor;
	private float precio;

	// constructors
	// 1 para volcar datos de la consulta
	public Articulo(String titulo, String autor, float precio, String img) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	// otro para insertar el dato
	public Articulo(Long id, String titulo, String autor, float precio, String img) {
		this.id = id;
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	// Getter y Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImg() {
		return img != null ? img : "";
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	// methods
	public void detalle() {
		// mostrar por consola datos
		System.out.println("ID: " + id);
		System.out.println("Imagen: " + img);
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Precio: " + precio);
	}

	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", img=" + img
				+ "]";
	}
}
