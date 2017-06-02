/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SELECCIONADORDEMESES.java."

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

public class Imprimir {

	public static String mestexto(int numerodelmes) {
		String imprimirmes;
		switch (numerodelmes) {
		case 0:
			imprimirmes = "Saliste del Programa";
			break;
		case 1:
			imprimirmes = "Enero";
			break;
		case 2:
			imprimirmes = "Febrero";
			break;
		case 3:
			imprimirmes = "Marzo";
			break;
		case 4:
			imprimirmes = "Abril";
			break;
		case 5:
			imprimirmes = "Mayo";
			break;
		case 6:
			imprimirmes = "Junio";
			break;
		case 7:
			imprimirmes = "Julio";
			break;
		case 8:
			imprimirmes = "Agosto";
			break;
		case 9:
			imprimirmes = "Septiembre";
			break;
		case 10:
			imprimirmes = "Octubre";
			break;
		case 11:
			imprimirmes = "Noviembre";
			break;
		case 12:
			imprimirmes = "Diciembe";
			break;
		default:
			imprimirmes = "Numero Invalido Cambielo";
		}
		return imprimirmes;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int numerodelmes;
		int opcionseleccionada;
		do {
			System.out.println("*************************************************************");
			System.out.println("*************************************************************");
			System.out.println("*Seleccione Un Numero de 1 al 12 para saber el Mes o 0-Salir*");
			System.out.println("*************************************************************");
			opcionseleccionada = bufEntrada.read();
			System.out.println("*************************************************************");
			System.out.println("*************************************************************");
			System.out.println("**************Numero Seleccionado Fue: "+opcionseleccionada+"********************");
			System.out.println("*************************************************************");
			System.out.println("*************************************************************");
			numerodelmes = opcionseleccionada;
			if ((numerodelmes>0 && numerodelmes<13)) {
				System.out.println("**************El Mes es: "+mestexto(numerodelmes)+"****************************");
			} else {
				System.out.println("**************"+mestexto(numerodelmes)+"***********************");
			}
			System.out.println("Presiona cualquiera tecla");
			System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
			System.out.println(""); // no hay forma directa de borrar la consola en Java
		} while (opcionseleccionada!=0);
	}


}

