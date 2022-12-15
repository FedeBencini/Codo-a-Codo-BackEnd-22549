package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/UpdateArticuloController")
public class UpdateArticuloController extends HttpServlet {

	// Para cargar artículo en la JSP
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Long id = Long.parseLong(req.getParameter("id"));

		var dao = new ArticuloDAOMysqlImpl();

		try {
			var articulo = dao.getById(id);
			req.setAttribute("articulo", articulo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		getServletContext().getRequestDispatcher("/editar.jsp").forward(req, resp);

	}

	// Para realizar la actualización
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");
		String img = req.getParameter("img");
		float precio = Float.parseFloat(req.getParameter("precio"));

		Long id = Long.parseLong(req.getParameter("id"));

		var dao = new ArticuloDAOMysqlImpl();

		try {
			Articulo articulo = dao.getById(id);
			if (articulo != null) {
				articulo.setImg(img);
				articulo.setAutor(autor);
				articulo.setPrecio(precio);
				articulo.setTitulo(titulo);

				dao.update(articulo);
				System.out.println("Articulo Actualizado: " + articulo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		getServletContext().getRequestDispatcher("/FindAllArticuloController").forward(req, resp);
	}
}
