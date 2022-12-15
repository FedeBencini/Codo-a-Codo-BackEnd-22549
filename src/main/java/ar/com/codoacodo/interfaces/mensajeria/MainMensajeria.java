package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeria {

	public static void main(String[] args) {
		String target = "C";
		String mensaje = "Aprendiendo interfaces en Java";
		
		var mensajero = new Mensajero();
		
		switch (target) {
			case "A":
				mensajero.setMensajeria(new EnviarMailImpl());;
				break;
			case "B":
				mensajero.setMensajeria(new EnviarHDImpl());
				break;
			case "C":
				mensajero.setMensajeria(new EnviarDBImpl());
				break;
		default:
			System.out.println("Opción Inválida");
			break;
		}
	
		if (mensajero.tieneMensajeria()) {
			mensajero.mandarMensaje(mensaje);
		}
	}
}
