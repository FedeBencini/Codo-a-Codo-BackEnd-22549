package ar.com.codoacodo.controllers.validator;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import ar.com.codoacodo.controllers.CreateArticuloRequest;

@WebServlet
public class CreateArticuloValidator implements IValidable {

	private CreateArticuloRequest datosAValidar;

	public CreateArticuloValidator(CreateArticuloRequest datos) {
		this.datosAValidar = datos;
	}

	public List<String> validate() {
		List<String> errores = new ArrayList<>();
		if (datosAValidar.getTitulo() == null || "".equals(datosAValidar.getTitulo())) {
			errores.add("Titulo es nulo");
		}
		if (datosAValidar.getAutor() == null || "".equals(datosAValidar.getAutor())) {
			errores.add("Autor es nulo");
		}
		if (datosAValidar.getPrecio() == 0.0f || Float.isNaN(datosAValidar.getPrecio())) {
			errores.add("Precio invalido");
		}
		return errores;
	}
}
