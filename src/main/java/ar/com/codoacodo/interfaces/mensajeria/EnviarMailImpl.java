package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarMailImpl implements IEnviar {
	
	private String emailTarget = "destino@mail.com";
	private String emailSource = "yo@yo.com";
	private String provider = "Gmail";
	
	// cumplo el contrato escribiendo el método después de implementar interface
	public void enviar(String msj) {
		System.out.println("Enviando Mail a " + emailTarget);
		System.out.println("Enviando Mail desde " + emailSource);
		System.out.println("Usando " + provider);
	};
}
