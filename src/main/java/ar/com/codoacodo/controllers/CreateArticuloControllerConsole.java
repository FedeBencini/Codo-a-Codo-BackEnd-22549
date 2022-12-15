package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class CreateArticuloControllerConsole {

	public static void main(String[] args) throws Exception {

		// crear un articulo
		// suponemos que recibimos los parametros enviados por un formularios
		String titulo = args[0];
		String autor = args[1];
		String img = args[2];
		float precio = Float.parseFloat(args[3]);

		var articulo = new Articulo(titulo, autor, precio, img);

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		dao.create(articulo);

		System.out.println("Articulo Creado: " + articulo);
	}
}