package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.controllers.validator.CreateArticuloValidator;
import ar.com.codoacodo.controllers.validator.IValidable;
import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/CreateArticuloController")
public class CreateArticuloController extends HttpServlet {

	// En este caso va a usarse un doPost, porque vamos a enviar peticiones por
	// método POST
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*- Recibimos parámetros enviados por formulario
			Instanciaomos un CreateArticuloRequest y creamos un validador desde una interfaz
			Chequeamos posibles errores del request en el validator
		*/
		CreateArticuloRequest createRequest = new CreateArticuloRequest(req);
		IValidable validator = new CreateArticuloValidator(createRequest);
		List<String> errors = validator.validate();

		if (!errors.isEmpty()) {
			// Si hay errores, volver a jsp y mostrar lista errores
			// Guardo lista en request
			req.setAttribute("errors", errors);
			// Redireccion a otro servlet
			getServletContext().getRequestDispatcher("/nuevo.jsp").forward(req, resp);
			// En caso de errores, hay que aplicar un return para que no cree "articulo"
			return;
		}

		var articulo = new Articulo(createRequest.getTitulo(), createRequest.getAutor(), createRequest.getPrecio(),
				createRequest.getImg());

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