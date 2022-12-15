package ar.com.codoacodo.interfaces;

public class Mainidiomas {

	public static void main(String[] args) {
		
		//nace la persona
		var persona = new Persona("carlos","español");

		persona.decir("hola","portuñol");
		
		persona.aprender("portuñol");
		
		persona.decir("hola","portuñol");
	
		persona.decir("bonjour", "frances");
	}

}