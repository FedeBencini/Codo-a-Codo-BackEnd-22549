package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;

public class XBox360 extends Consola implements IActualizable{
	
	// escribo explícitamente constructor XBox360 para evitar error
	// PERO debo enviarle al padre los 3 param que me pide
	public XBox360() {
		// la primer linea de un constructor de una clase hija
		//  es invocar al constructor del padre, con los param que requiere
		super("XBox360", 1024, "Microsoft");

	}
	
	public void actualizar() {
		System.out.println("Conectando xbox al servidor de Microsoft...");
		System.out.println("Descargando nuevo Firmware... ");
		System.out.println("Finalizando Instalación");
	}
}
