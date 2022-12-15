package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;

public class DeleteArticuloControllerConsole {

	public static void main(Long[] args) throws Exception {

		Long id = args[0];

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		dao.delete(id);

		System.out.println("Articulo Deleted");
	}
}
