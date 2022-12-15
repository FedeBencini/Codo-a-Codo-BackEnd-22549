package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;
import ar.com.codoacodo.herencia.interfaces.IJugable;

public class PlayStation extends Consola implements IActualizable, IJugable {

	private Integer version;
	
	public PlayStation(Integer bit, Integer version) {
		super("PlayStation", bit, "Sony");
		this.version = version;
	}

	public Integer getVersion() {
		return version;
	}

	public String toString() {
		String toStringDelPadre = super.toString();
		String toStringDelHijo = "PlayStation [version=" + version + "]";
		return toStringDelPadre + toStringDelHijo;
	}
	
	public void actualizar() {
		if(this.version == 3) {
			System.out.println("Play " + this.version + " es actualizable");
			System.out.println("Actualizando Play " + this.version);
			System.out.println("Conectando al servidor de Sony");
			System.out.println("Descargando nuevo software..");		
		} else {
			System.out.println("Play " + this.version + " NO es actualizable");
		}
	}

	public void jugar() {
		System.out.println("Encendiendo Play " + this.version);
		System.out.println("Cargando Juegos");
		System.out.println("Todo listo. Seleccione Juego.");
	}
}
