package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;

@WebServlet("/DeleteArticuloController")
public class DeleteArticuloController extends HttpServlet {

	// CONTROLADOR
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		try {
			dao.delete(id);
			System.out.println("Articulo Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}

		getServletContext().getRequestDispatcher("/FindAllArticuloController").forward(req, resp);
	}
}
