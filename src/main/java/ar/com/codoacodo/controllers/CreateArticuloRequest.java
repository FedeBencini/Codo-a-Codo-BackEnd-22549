package ar.com.codoacodo.controllers;

import javax.servlet.http.HttpServletRequest;

public class CreateArticuloRequest {
	private String titulo;
	private String autor;
	private String img;
	private float precio;

	@SuppressWarnings("removal")
	public CreateArticuloRequest(HttpServletRequest req) {
		this.titulo = req.getParameter("titulo");
		this.autor = req.getParameter("autor");
		this.img = req.getParameter("img");

		try {
			this.precio = new Float(req.getParameter("precio"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getImg() {
		return img;
	}

	public float getPrecio() {
		return precio;
	}

}
