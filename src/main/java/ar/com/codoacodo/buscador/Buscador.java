// paquete
package ar.com.codoacodo.buscador;

// nombre clase
public class Buscador {
	// bajo el OOP, los atributos tienen que ser privados,
	//	 son propios de la clase
	
	// atributos
	private String claveBusqueda;
	private Articulo[] resultados;
	private int cantRes;
	
	// constructores -> para definir valores por defecto !
	public Buscador() {
		System.out.println("nace un buscador");
		// cuando nace un atributo hay que definir su tamaño para evitar un "null", x ej:
		resultados = new Articulo[0];
	}
	
	// metodos -> como el function x() de js
	//	 pero siempre dentro de una clase !!!
	public void buscar() {
		System.out.println("buscando " + claveBusqueda);
		
		// acá debo cargar array resultados con obj de clase Articulo
		//	simular que encontramos 3 resultados
		Articulo res1 = new Articulo(); 
		Articulo res2 = new Articulo(); 
		Articulo res3 = new Articulo();
		
		// instanciar nuevamente resultados con 3 posiciones
		//	y cargar esos 3 res
		resultados = new Articulo[3];
		
		resultados[0]=res1;
		resultados[1]=res2;
		resultados[2]=res3;
		
		// actualizo cantidad de resultados, una vez definido arriba
		cantRes = resultados.length;
	};
	
	public void cambiarClave(String nuevaClave) {
		claveBusqueda = nuevaClave;
	};
	
	public int getCantRes() {
		return cantRes;
	};
	
	public String getClave() {
		return claveBusqueda;
	};
};

