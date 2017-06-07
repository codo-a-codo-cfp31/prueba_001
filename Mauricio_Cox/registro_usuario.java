/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "REGISTRO.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. Técnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos actúa como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) actúa como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deberán modificarse algunos métodos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepción. Si una función A es
// invocada por otra B, B también debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el código generado automáticamante: las funciones que realizan lecturas
// directamente incluyen el código que indica que pueden generar dicha excepción, pero las que
// lo hacen indirectamente (invocando a otras que sí lo hacen), puede que no, y deberán ser
// corregidas manualmente.

import java.io.*;

public class registro {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	public static void imprimirmenu() {
		System.out.println("*************************************");
		System.out.println(" Seleccione una de las opciones");
		System.out.println("*************************************");
		System.out.println(" 1- Registrar Usuario e Correo");
		System.out.println(" 0- Salir del programa");
	}

	public static void menu(int opcionseleccionada) throws IOException {
		int lon_name;
		String nombre;
		switch (opcionseleccionada) {
		case 1:
			do {
				System.out.println("Ingrese su Nombre de Usuario");
				nombre = bufEntrada.readLine();
				lon_name = nombre.length();
				if (lon_name<4) {
					System.out.println("");
					System.out.println("LONGITUD de USUARIO ES MENOR 4");
				}
			} while (lon_name<=4);
			confirma_clave();
			confirmar_correo();
			break;
		case 0:
			System.out.println("Gracias por usar este programa. Saliendo...");
			break;
		default:
			System.out.println("Opcion invalida, presione de vuelta su opcion");
		}
	}

	public static void confirma_clave() throws IOException {
		String clave;
		String clave2;
		int lon;
		do {
			do {
				lon = 0;
				System.out.println("Ingrese una clave de 8 Caracteres");
				clave = bufEntrada.readLine();
				lon = clave.length();
				System.out.println("Confirme su clave");
				clave2 = bufEntrada.readLine();
				if (!clave.equals(clave2)) {
					System.out.println("");
					System.out.println("LAS CLAVES NO COINCIDEN");
				}
				if (lon!=8) {
					System.out.println("");
					System.out.println("LONGITUD NO VALIDA");
				}
			} while (lon!=8);
		} while (!clave.equals(clave2));
	}

	public static void confirmar_correo() throws IOException {
		double bandera;
		String cadena_correo[];
		int cont;
		String correo;
		int lon_mail;
		int total;
		total = 30;
		cadena_correo = new String[total];
		do {
			bandera = 0;
			correo = "";
			cont = 0;
			System.out.println("Ingrese su direccion de correo");
			correo = bufEntrada.readLine();
			lon_mail = correo.length();
			do {
				cadena_correo[cont] = correo.substring(cont,cont+1);
				if (cadena_correo[cont].equals("@")) {
					bandera = bandera+1;
				}
				cont = cont+1;
			} while (cont<total);
			if (lon_mail>=15 && bandera==1) {
				System.out.println("");
				System.out.println("Correo Registrado");
			} else {
				System.out.println("");
				System.out.println("CORREO NO VALIDO");
				System.out.println("Ingrese de nuevo su direccion de correo");
			}
		} while (lon_mail<15);
	}

	public static void main(String args[]) throws IOException {
		double opcion_seleccionada;
		do {
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			imprimirmenu();
			opcion_seleccionada = bufEntrada.readLine();
			menu(opcion_seleccionada);
			System.out.println("Presione una tecla para continuar...");
			System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
		} while ((opcion_seleccionada)!=(0));
	}


}

