package ar.com.codoacodo.herencia.interfaces;

import ar.com.codoacodo.herencia.Consola;
import ar.com.codoacodo.herencia.Vendedor;

public class MainConsolas {

	public static void main(String[] args) {

		Consola[] consolas = Vendedor.venderConsolas();
		
		for(int i=0; i<consolas.length; i++) {
			Consola aux = consolas[i];
			aux.mostrar();
			
			// quiero saber si aux implementa la interface IActualizable
			if(aux instanceof IActualizable) {
				IActualizable instancia = (IActualizable)aux;
				instancia.actualizar();
			}
			
			if(aux instanceof IJugable) {
				System.out.println(aux.getNombre() + " es jugable");
				IJugable jugable = (IJugable)aux;
				jugable.jugar();
			} else {
				System.out.println(aux.getNombre() + " NO es jugable");
			}
			
			System.out.println("---------------------------------------------");

		}
	}
}
