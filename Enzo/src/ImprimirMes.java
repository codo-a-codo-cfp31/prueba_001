import java.io.*;
import java.util.*;
public class ImprimirMes {

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
		return imprimirmes;}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                Scanner sc=new Scanner(System.in);
		int numerodelmes;
		int opcionseleccionada;
                
		do {
System.out.println("*************************************************************");
System.out.println("*************************************************************");
System.out.println("*Seleccione Un Numero de 1 al 12 para saber el Mes o 0-Salir*");
System.out.println("*************************************************************");
opcionseleccionada = sc.nextInt();
numerodelmes=opcionseleccionada;
System.out.println("*************************************************************");
System.out.println("*************************************************************");
System.out.println("**************Numero Seleccionado Fue: "+opcionseleccionada+"********************");
System.out.println("*************************************************************");
System.out.println("*************************************************************");
                      
			numerodelmes = opcionseleccionada;
			if ((numerodelmes>0 && numerodelmes<13)) {
				System.out.println("**************El Mes es: "+mestexto(numerodelmes)+"****************************");
			} else {
				System.out.println("**************"+mestexto(numerodelmes)+"***********************");}
			System.out.println("Presiona cualquiera tecla");
		} while (opcionseleccionada!=0);}
}