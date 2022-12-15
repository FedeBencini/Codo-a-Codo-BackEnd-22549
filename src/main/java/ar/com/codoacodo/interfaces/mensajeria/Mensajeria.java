package ar.com.codoacodo.interfaces.mensajeria;

public class Mensajeria {
	
	public void enviarMail(String mensaje) {
		System.out.println("Enviar mail : " + mensaje);
	}
	public void enviarHD(String mensaje) {
		System.out.println("Escribiendo en HD en /temp/ : " + mensaje);
	}
	public void enviarDB(String mensaje) {
		System.out.println("Conectando a MySQL");
		System.out.println("Usuario Root");
		System.out.println("Password Root");
		System.out.println("Insertando en tablexyz");
		System.out.println("Insert into tablexyz ... ");
	}
}
