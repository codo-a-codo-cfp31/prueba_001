/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CONVERSORDETEMPERATURA.java."

package ejerciciospseint;
        
import java.io.*;

public class conversordetemperatura {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double c;
		double f;
		double k;
		double op;
		double opcionelegida;
		opcionelegida = 0;
		do {
			System.out.println("Elija una opcion");
			System.out.println("Opcion 1.- Convertir unidades");
			System.out.println("Opcion 2.- Salir");
			opcionelegida = Double.parseDouble(bufEntrada.readLine());
			if ((opcionelegida)==(1)) {
				c = 0;
				k = 0;
				f = 0;
				op = 0;
				System.out.println("ingrese el valor de temperatura en Celsius");
				c = Double.parseDouble(bufEntrada.readLine());
				System.out.println("�a que unidad desea convertirlo?");
				System.out.println("1. Kelvin o 2. farenheit");
				op = Double.parseDouble(bufEntrada.readLine());
				if ((op==1)) {
					k = (c-273.15);
					System.out.println("el valor convetido es"+k);
				} else {
					if ((op==2)) {
						f = (c*9/5)+32;
						System.out.println("el valor convertido es"+f);
					}
				}
			}
		} while ((opcionelegida)!=(2));
		System.out.println("Hasta Luego");
	}


}

