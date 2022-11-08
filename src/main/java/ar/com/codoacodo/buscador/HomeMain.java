package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		// para crear un objeto se llama al constructor:
		//	x ej -> Clase nombreObjeto = newClase();
		Buscador miBuscador = new Buscador();
		
		// ahora miBuscador está vivo. ya puedo ejecutar cualquiera de
		//	sus métodos públicos, como buscar()
		// primero defino clave búsqueda
		miBuscador.cambiarClave("iron man");
		miBuscador.buscar();
		
		// mostrar cuántos resultados encontró buscador
		System.out.println("Hemos encontrado " + miBuscador.getCantRes() + " resultados para " + miBuscador.getClave());
	}
}
