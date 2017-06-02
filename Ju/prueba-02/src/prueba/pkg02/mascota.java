package prueba.pkg02;

/* Este codigo ha sido generado por el modulo psexport 20150822-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

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

public class mascota {

	public static void imprimirmenu() {
		System.out.println("*************************************");
		System.out.println(" Seleccione una de las opciones de acuerdo a lo que m�s haga su mascota");
		System.out.println("*************************************");
		System.out.println(" 1- Ladrar");
		System.out.println(" 2- Saltar");
		System.out.println(" 3- Maullar");
		System.out.println(" 4- Ayuda");
		System.out.println(" 0- Salir del programa");
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		
		String acciones[];
		double opcion;
		imprimirmenu();
		acciones = new String[5];
		acciones[1] = "Ladrar";
		acciones[2] = "Saltar";
		acciones[3] = "Maullar";
		acciones[4] = "Ayuda";
		acciones[0] = "Salir";
		do {
			opcion = 0;
			opcion = Double.parseDouble(bufEntrada.readLine());
			if ((opcion)==(1)) {
				System.out.println("Perro");
			}
			if ((opcion)==(2)) {
				System.out.println("conejo");
			}
			if ((opcion)==(3)) {
				System.out.println("gato");
			}
			if ((opcion)==(4)) {
				System.out.println("Debe seleccionar accion de su mascota");
			}
			if ((opcion)==(0)) {
				System.out.println("A sido un gusto");
			}
		} while ((opcion)!=(0));
	}


}

