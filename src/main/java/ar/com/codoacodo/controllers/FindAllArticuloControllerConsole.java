package ar.com.codoacodo.controllers;

import java.util.List;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class FindAllArticuloControllerConsole {

	// Acá es aplicación de consola
	public static void main(String[] args) throws Exception {

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		List<Articulo> articulosBuscados = dao.findAll();

		System.out.println("Lista de Articulos Encontrados: " + "\n");
		for (Articulo articulo : articulosBuscados) {
			System.out.println(articulo + "\n");
		}
	}
}
