package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;

public class UpdateArticuloControllerConsole {

	public static void main(String[] args) throws Exception {

		String titulo = args[0];
		String autor = args[1];
		String img = args[2];
		float precio = Float.parseFloat(args[3]);

		// necesitamos id para verificar si existe primero
		Long id = Long.parseLong(args[4]);

		// 1- Busco articulo a actualizar
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		var articulo = dao.getById(id);

		if (articulo != null) {
			articulo.setImg(img);
			articulo.setAutor(autor);
			articulo.setPrecio(precio);
			articulo.setTitulo(titulo);

			dao.update(articulo);

			System.out.println("Articulo Actualizado: " + articulo);
		}
	}
}