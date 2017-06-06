package ejerciciospseint;

import java.io.*;

public class climaejercicio {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                
		Integer opcioningresada;
		Integer porcentajeingresado;
                
		do {
			System.out.println("elija una opcion");
			System.out.println("Opcion 1.- Consultar pronostico");
			System.out.println("opcion 2.- Salir");
			opcioningresada =  Integer.parseInt( bufEntrada.readLine());

			if ((opcioningresada)==(1)){
				System.out.println("Bienvenido ingrese el porcentaje de precipitacion");
                                porcentajeingresado = bufEntrada.read();
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
