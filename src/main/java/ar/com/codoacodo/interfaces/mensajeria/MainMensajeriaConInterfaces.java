package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConInterfaces {

	public static void main(String[] args) {
		String target = "A";
		String mensaje = "Aprendiendo interfaces en Java";
		
		var mensajeria = new Mensajeria();
		
		switch (target) {
			case "A":
				mensajeria.enviarMail(mensaje);
				break;
			case "B":
				mensajeria.enviarHD(mensaje);
				break;
			case "C":
				mensajeria.enviarDB(mensaje);
				break;
		default:
			System.out.println("Opción Inválida");
			break;
		}
	}
}
