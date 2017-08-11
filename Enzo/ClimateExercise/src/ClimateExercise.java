/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author @AnalistaSistok
 */
import java.io.*;
public class ClimateExercise {
    public static void main(String args[]) throws IOException{
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String opcioningresada;
		double porcentaje;
		double porcentajeingresado;
		porcentaje = 0;
		do {
			System.out.println("Elija una opcion");
			System.out.println("Opcion 1.- Consultar pronostico");
			System.out.println("opcion 2.- Salir");
			opcioningresada = bufEntrada.readLine();
			if (opcioningresada.equals("1")) {
				System.out.println("Bienvenido ingrese el porcentaje de precipitacion");
				porcentajeingresado = Double.parseDouble(bufEntrada.readLine());
				if (porcentajeingresado<=29) {
					System.out.println("Su pronostico es muy despejado");
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
		} while (!(opcioningresada).equals("2"));
		System.out.println("Hasta luego");
                }
            }