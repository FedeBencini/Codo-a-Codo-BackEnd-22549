package ar.com.codoacodo.interfaces.mensajeria;

public class DefaultImpl implements IEnviar {
	
// cumplo el contrato escribiendo el método después de implementar interface
	public void enviar(String msj) {
		System.out.println("Implementación por defecto! para target: " + msj);
		
	}
}
