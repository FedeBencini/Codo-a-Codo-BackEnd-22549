package ar.com.codoacodo.interfaces.mensajeria;

public class CreadorMensajeria {
	
	public static IEnviar crearMensajeria(String target) {
		
		IEnviar mensajeria = new DefaultImpl();
		switch (target) {
		case "A":
			mensajeria = new EnviarMailImpl();
			break;
		case "B":
			mensajeria = new EnviarHDImpl();
			break;
		case "C":
			mensajeria = new EnviarDBImpl();
			break;
		default:
			System.out.println("Opción Inválida");
			break;
		}
	return mensajeria;
	}
}
