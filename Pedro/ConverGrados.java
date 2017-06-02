/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CONVERGRADOS.java."

import java.io.*;

public class convergrados {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double c;
		double f;
		double k;
		double op1;
		int op2;
		c = 0;
		f = 0;
		k = 0;
		op1 = 1;
		op2 = 0;
		while (op1==1) {
			System.out.println("PROGRAMA DE CONVERSION DE TEMPERATURA");
			System.out.println("Ingrese una temperatura en °C (Grados Celsius)");
			c = Double.parseDouble(bufEntrada.readLine());
			System.out.println("A que tipo de temperatura desea convertirlo:");
			System.out.println("1. Grados Fahrenheit");
			System.out.println("2. Grados Kelvin");
			op2 = Integer.parseInt(bufEntrada.readLine());
			switch (op2) {
			case 1:
				f = 32+(1.8*c);
				System.out.println("La converson a Grados Fahrenheit es:"+f);
				break;
			case 2:
				k = c+273.15;
				System.out.println("La converson a Grados Kelvin es:"+k);
				break;
			default:
				System.out.println("Error de Seleccion");
			}
			System.out.println("Desea volver a convertir un valor");
			System.out.println("1. SI");
			System.out.println("2. NO");
			op1 = Double.parseDouble(bufEntrada.readLine());
		}
	}


}

