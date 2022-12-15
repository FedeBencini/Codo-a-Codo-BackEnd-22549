package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

// Controlador web = Va a poder escuchar peticiones del Front
// Para convertirse en Servlet -> tiene que externder de HttpServlet

@WebServlet("/FindAllArticuloController")
// http://localhost:8080/webapp/FindAllArticuloController
public class FindAllArticuloController extends HttpServlet {

	// CONTROLADOR
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		List<Articulo> articulosBuscados = new ArrayList<>();
		try {
			articulosBuscados = dao.findAll();
			System.out.println("Lista de Articulos Encontrados: " + "\n");
			for (Articulo articulo : articulosBuscados) {
				System.out.println(articulo + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Guardo bajo nombre "articulos" la lista de articulos
		req.setAttribute("articulos", articulosBuscados);

		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}

	// Hacer doPost para que petición de Create se redireccione a doGet de Find
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
