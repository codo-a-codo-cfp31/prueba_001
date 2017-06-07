/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "MESESDELA�O.java."

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
package ejerciciospseint;

import java.io.*;

public class SeleccionarMesesMejorado {

	public static void pintarmenu() {
		System.out.println("----------------------------------------------");
		System.out.println("seleccione un numero del 1 a 12 o 0 para salir");
		System.out.println("----------------------------------------------");
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String listademeses[];
		int mes_seleccionado;
		listademeses = new String[13];
		listademeses[0] = "Hasta Luego";
		listademeses[1] = "Enero";
		listademeses[2] = "Febrero";
		listademeses[3] = "Marzo";
		listademeses[4] = "Abril";
		listademeses[5] = "Mayo";
		listademeses[6] = "Junio";
		listademeses[7] = "Julio";
		listademeses[8] = "Agosto";
		listademeses[9] = "Septiembre";
		listademeses[10] = "Octubre";
		listademeses[11] = "Noviembre";
		listademeses[12] = "Diciembre";
		do {
			pintarmenu();
			mes_seleccionado = Integer.parseInt (bufEntrada.readLine());
			System.out.println(listademeses[mes_seleccionado]);
			//System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
			System.out.println(""); // no hay forma directa de borrar la consola en Java
		} while ((mes_seleccionado)!=(0));
	}


}

