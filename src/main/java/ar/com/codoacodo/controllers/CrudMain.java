package ar.com.codoacodo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CrudMain {

	public static final Scanner teclado = new Scanner(System.in);

	/** MAIN METHOD */
	public static void main(String[] args) throws Exception {
		/** 1- Start Scanner (outside to avoid erros) and Crud Program */
		System.out.println("\nBienvenido al PROGRAMA CRUD");
		int option;
		int keepGoing = 1;

		/** 2- Make do/while to offer certain options */
		do {
			do {
				System.out.println("Seleccione una de las siguientes opciones: " + "\n\n1- Crear" + "\n2- Actualizar"
						+ "\n3- Eliminar" + "\n4- Buscar por id" + "\n5- Salir\n");
				option = teclado.nextInt();
			} while (option < 1 || option > 5);

			/** Redirect user´s request to corresponding method */
			System.out.println("Eligió la opción " + option + "\n");
			switch (option) {
			case 1:
				String[] arg1 = infoString();
				CreateArticuloControllerConsole.main(arg1);
				break;
			case 2:
				Long id = infoId();
				String[] arr = infoString();
				String[] args2 = joinArrays(arr, id);
				UpdateArticuloControllerConsole.main(args2);
				break;
			case 3:
				Long[] args3 = new Long[1];
				args3[0] = infoId();
				DeleteArticuloControllerConsole.main(args3);
				break;
			case 4:
				Long[] args4 = new Long[1];
				args4[0] = infoId();
				GetArticuloControllerConsole.main(args4);
				break;
			case 5:
				keepGoing = 2;
			default:
				break;
			}

			do {
				System.out.println("¿Quiere seguir usando CRUD? // " + "1 -> Continuar // " + "2 -> Salir");
				keepGoing = teclado.nextInt();
			} while (keepGoing > 2 || keepGoing < 1);

			if (keepGoing != 2) {
				keepGoing = 1;
			}
		} while (keepGoing == 1);

		/** 3- Close Scanner and Crud Program */
		// teclado.close();
		System.out.println("\nMuchas gracias por usar el Programa CRUD.");
	}

	/** METHODS */
	/* 1- Get Info Individually to avoid Errors */
	public static Long infoId() throws Exception {
		System.out.println("Ingrese ID del articulo: ");
		Long id = teclado.nextLong();
		return id;
	};

	public static String infoTitulo() throws Exception {
		System.out.println("Ingrese TITULO del articulo: ");
		String empty = teclado.nextLine();
		String titulo = teclado.nextLine();
		return titulo;
	};

	public static String infoAutor() throws Exception {
		System.out.println("Ingrese AUTOR del articulo (x ej: Apellido, Nombre): ");
		String autor = teclado.nextLine();
		return autor;
	};

	public static String infoImg() throws Exception {
		System.out.println("Ingrese LINK/URL de Imagen del articulo: ");
		String img = teclado.nextLine();
		return img;
	};

	public static float infoPrecio() throws Exception {
		System.out.println("Ingrese PRECIO del articulo (x ej: 100,00): ");
		Float precio = teclado.nextFloat();
		return precio;
	};

	/* 2- Get Info for String[] args */
	public static String[] infoString() throws Exception {

		String titulo = infoTitulo();
		String autor = infoAutor();
		String img = infoImg();
		Float precio = infoPrecio();

		String[] args = new String[4];
		args[0] = titulo;
		args[1] = autor;
		args[2] = img;
		args[3] = precio.toString();

		return args;
	};

	/* 3- Join Info Array and Id */
	public static String[] joinArrays(String[] arr, Long id) throws Exception {

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
		arrayList.add(id.toString());
		String[] finalArr = arrayList.toArray(arr);

		return finalArr;
	}
}