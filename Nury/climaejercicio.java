/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PROBABILIDADPRECIPITACION.java."

import java.io.*;

public class climaejercicio {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String opcioningresada;
		double porcentaje;
		String porcentajeingresado;
		porcentaje = 0;
		do {
			System.out.println("elija una opcion");
			System.out.println("Opcion 1.- Consultar pronostico");
			System.out.println("opcion 2.- Salir");
			opcioningresada = bufEntrada.readLine();
			if ((opcioningresada)==(1)) {
				System.out.println("Bienvenido ingrese el porcentaje de precipitacion");
				porcentajeingresado = bufEntrada.readLine();
				if (porcentajeingresado<=29) {
					System.out.println("Supronostico es muy despejado");
				}
				if ((porcentajeingresado>=30) && (porcentajeingresado<=69)) {
					System.out.println("Su pronostico es despejado");
				}
				if ((porcentajeingresado>=70) && (porcentajeingresado<=99)) {
					System.out.println("Su pronostico es lluvioso");
				}
				if (porcentajeingresado==100) {
					System.out.println("Su pronostico es tormenta electrica");
				}
				System.out.println("Gracias por consultarnos");
			}
		} while ((opcioningresada)!=(2));
		System.out.println("Hasta luego");
	}


}

