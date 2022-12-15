package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConCreadorMensajeria {

	public static void main(String[] args) {
		String target = "";
		String mensaje = "Aprendiendo interfaces en Java";
		
		// var mensajero = new Mensajero();

		IEnviar msj = CreadorMensajeria.crearMensajeria(target);
		
		msj.enviar(mensaje);
		
		/*
		mensajero.setMensajeria(msj);

		if(mensajero.tieneMensajeria()) {
			mensajero.mandarMensaje(mensaje);
		}
		*/
	}
}
