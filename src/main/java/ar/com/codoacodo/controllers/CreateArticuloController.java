package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/CreateArticuloController")
public class CreateArticuloController extends HttpServlet {

	// En este caso va a usarse un doPost, porque vamos a enviar peticiones por
	// método POST
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recibimos parámetros enviados por formulario
		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");
		String img = req.getParameter("img");
		float precio = Float.parseFloat(req.getParameter("precio"));

		var articulo = new Articulo(titulo, autor, precio, img);

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		try {
			dao.create(articulo);
			System.out.println("Articulo Creado: " + articulo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Redirect a otra página o servlet(tmbn llamado controller o webservlet)
		getServletContext().getRequestDispatcher("/FindAllArticuloController").forward(req, resp);
	}
}