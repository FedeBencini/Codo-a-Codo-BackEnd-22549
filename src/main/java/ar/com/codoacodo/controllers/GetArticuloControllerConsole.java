package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class GetArticuloControllerConsole {

	public static void main(Long[] args) throws Exception {

		Long id = args[0];

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		Articulo articuloBuscado = dao.getById(id);

		if (articuloBuscado == null) {
			System.out.println("Articulo No Encontrado.");
		} else {
			System.out.println("Articulo Buscado: " + articuloBuscado);
		}
	}
}
