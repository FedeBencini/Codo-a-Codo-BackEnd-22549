package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarHDImpl implements IEnviar {
	
	private String fileSystemPath = "/temp/usuario";
	
	// cumplo el contrato escribiendo el método después de implementar interface
	public void enviar(String msj) {
		System.out.println("Grabando en " + fileSystemPath);
		System.out.println("Mensaje: " + msj);
	};
}
