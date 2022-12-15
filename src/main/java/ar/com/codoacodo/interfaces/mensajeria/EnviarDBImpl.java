package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarDBImpl implements IEnviar {
	
	private String username = "yo";
	private String password = "1234hola";
	private String host = "";
			
	
	// cumplo el contrato escribiendo el método después de implementar interface
	public void enviar(String msj) {
		System.out.println("Conectando a MySQL con Username: " + this.username + " y Password: " + this.password);
		System.out.println("Conectando al host: " + this.host);
		System.out.println("Insertando en tabla xyz: " + msj);
	};
}
