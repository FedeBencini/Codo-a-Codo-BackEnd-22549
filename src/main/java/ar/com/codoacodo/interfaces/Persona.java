package ar.com.codoacodo.interfaces;

public class Persona {

	private String nombre;
	private String idioma;//nace
	private String[] otrosIdiomas;//aprende
	
	public Persona(String nombre, String idioma) {
		setNombre(nombre);
		setIdioma(idioma);
		setOtrosIdiomas(new String[0]);
	}

	public void decir(String palabra) {
		System.out.println(getNombre() + " dice " + palabra + " en " + getIdioma());
	}
	
	public void decir(String algo, String idioma) {
		// si this.idioma == idioma || o esta en array de otrosIdiomas
		//	 entonces puede decir algo en ese idioma
		// en Java no se usa == para comparar objetos, se usa el equals !!!
		if(getIdioma().equals(idioma) || existe(idioma)) {
			System.out.println(getNombre() + " puede decir " + algo + " en " + idioma);
		} else {
			System.out.println(getNombre() + " no habla en " + idioma);
		}
	} 
	
	private boolean existe(String idioma) {
		boolean existe = false;
		for (int i = 0; !existe && i < getOtrosIdiomas().length; i++) {
			existe = getOtrosIdiomas()[i] == idioma;
		}
		return existe;
	}
	
	public void aprender(String nuevoIdioma) {
		// si el idioma nativo NO es chino && this.otrosIdiomas no existe chino
		//	agrego a la lista de this.otrosIdiomas
		
		if(!getIdioma().equals("Chino") && !existe(nuevoIdioma)) {
			//setOtrosIdiomas() = nuevoIdioma;
			String[] nuevosIdiomas = new String[this.otrosIdiomas.length + 1];
			for(int i=0; i<this.otrosIdiomas.length; i++) {
				nuevosIdiomas[i] = this.otrosIdiomas[i];
			}
			nuevosIdiomas[this.otrosIdiomas.length] = nuevoIdioma;
			setOtrosIdiomas(nuevosIdiomas);
		}
	}

	// Getters y Setters
	//alt+shit+s -> Generate getters and setters
	
	private void setIdioma(String idioma) {
		this.idioma = idioma;			
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		if(nombre == null) {
			nombre = "";
		};
		this.nombre = nombre;
	}

	public String getIdioma() {
		return idioma;
	}
	
	private void setOtrosIdiomas(String[] idiomas ) {
		this.otrosIdiomas = idiomas;
	}
	
	public String[] getOtrosIdiomas() {
		return otrosIdiomas;
	}
}