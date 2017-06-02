/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "MESES.java."

import java.io.*;

public class meses {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = 0;
		System.out.println("Ingrese un numero del 1 al 12");
		num = Integer.parseInt(bufEntrada.readLine());
		switch (num) {
		case 1:
			System.out.println("El mes ingresado en Enero");
			break;
		case 2:
			System.out.println("El mes ingresado en Febrero");
			break;
		case 3:
			System.out.println("El mes ingresado en Marzo");
			break;
		case 4:
			System.out.println("El mes ingresado en Abril");
			break;
		case 5:
			System.out.println("El mes ingresado en Mayo");
			break;
		case 6:
			System.out.println("El mes ingresado en Junio");
			break;
		case 7:
			System.out.println("El mes ingresado en Julio");
			break;
		case 8:
			System.out.println("El mes ingresado en Agosto");
			break;
		case 9:
			System.out.println("El mes ingresado en Septiembre");
			break;
		case 10:
			System.out.println("El mes ingresado en Octubre");
			break;
		case 11:
			System.out.println("El mes ingresado en Noviembre");
			break;
		case 12:
			System.out.println("El mes ingresado en Diciembre");
			break;
		default:
			System.out.println("Error en mes");
		}
	}


}

