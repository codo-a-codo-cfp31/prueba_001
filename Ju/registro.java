package registro.usuario;

/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "REGISTRO.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. T�cnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos act�a como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) act�a como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deber�n modificarse algunos m�todos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepci�n. Si una funci�n A es
// invocada por otra B, B tambi�n debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el c�digo generado autom�ticamante: las funciones que realizan lecturas
// directamente incluyen el c�digo que indica que pueden generar dicha excepci�n, pero las que
// lo hacen indirectamente (invocando a otras que s� lo hacen), puede que no, y deber�n ser
// corregidas manualmente.

import java.io.*;


public class registro {
	

	public static void imprimirmenu() {
		System.out.println("*************************************");
		System.out.println(" Seleccione una de las opciones");
		System.out.println("*************************************");
		System.out.println(" 1- Registrar Usuario");
		System.out.println(" 0- Salir del programa");
	}

	public static void confirma_clave() throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String clave;
		String clave2;
		int lon;
		do {
			do {
				lon = 0;
				System.out.println("Ingrese una clave de 4 Caracteres");
				clave = bufEntrada.readLine();
				lon = clave.length();
				if (lon!=4) {
					System.out.println("");
					System.out.println("LONGITUD NO VALIDA");
				}
			} while (lon!=4);
			System.out.println("Confirme su clave");
			clave2 = bufEntrada.readLine();
			if (!clave.equals(clave2)) {
				System.out.println("");
				System.out.println("LAS CLAVES NO COINCIDEN");
			}
		} while (!clave.equals(clave2));
	}

	public static void confirmar_correo() throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double bandera;
		String cadena_correo[];
		int cont;
		String correo;
		int total;
		total = 30;
		cadena_correo = new String[total];
		do {
			bandera = 0;
			correo = "";
			cont = 0;
			System.out.println("Ingrese su direccion de correo");
			correo = bufEntrada.readLine();
			do {
				cadena_correo[cont-1] = correo.substring(cont-1,cont);
				if (cadena_correo[cont-1].equals("@")) {
					bandera = bandera+1;
				}
				cont = cont+1;
			} while (cont<total);
			if (bandera==1) {
				System.out.println("Datos Correcto");
			} else {
				System.out.println("");
				System.out.println("CORREO NO VALIDO");
			}
		} while (bandera!=1);
	}

	public static void menu(int opcionseleccionada) throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		switch (opcionseleccionada) {
		case 1:
			System.out.println("Ingrese su Nombre");
			nombre = bufEntrada.readLine();
			confirma_clave();
			confirmar_correo();
			break;
		case 0:
			System.out.println("Gracias por usar este programa. Saliendo...");
			break;
		default:
			System.out.println("Opcion invalida, para mas ayuda ingrese H");
		}
	}

	public static void main(String args[]) throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int opcion_seleccionada;
		do {
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			imprimirmenu();
                        opcion_seleccionada = Integer.parseInt(bufEntrada.readLine());
			
			menu(opcion_seleccionada);
			System.out.println("Presione una tecla para continuar...");
			System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
		} while ((opcion_seleccionada)!=(0));
	}


}

