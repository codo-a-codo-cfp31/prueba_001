import java.io.*;
public class TemperatureConverter {
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double c;
		double f;
		double k;
		String op;
		String opcionelegida = "";
		String tecla;
		
		do {
			System.out.println("Elija una opcion");
			System.out.println("Opcion 1.- Convertir unidades");
			System.out.println("Opcion 2.- Salir");
                        tecla=bufEntrada.readLine();
			System.out.println("******************"+tecla+"*******************");
		if ((tecla).equals(("1"))) {
				c = 0;
				k = 0;
				f = 0;
				op = "";
				System.out.println("***********Ingrese el valor de temperatura en Celsius*****************");
				c = Double.parseDouble(bufEntrada.readLine());
				System.out.println("******************"+c+" C°*******************");
				System.out.println("¿A que unidad desea convertirlo?");
				System.out.println("1. Kelvin o 2. farenheit");
				op = bufEntrada.readLine();
				System.out.println("****************"+op+"********************");
				if ((op).equals("1")) {
					k = (c-273.15);
       
					System.out.println("*******El valor convetido es: "+k+" K°******");
					System.out.println("***********Presiona cualquiera tecla******");
					tecla = bufEntrada.readLine();}
				else {
				if ((op).equals("2")) {
                                    f = (c*9/5)+32;
                                    
                                    System.out.println("*******El valor convertido es: "+f+" F°*****");
                                    System.out.println("***********Presiona cualquiera tecla******");
                                    tecla = bufEntrada.readLine();}}}
                        else if (tecla.equals("2")) {
				System.out.println("***********Usted a Salido**************************");}
                        else{
                        System.out.println("***********Opcion Incorrecta**************************");}
                } while (!(tecla).equals("2"));
		System.out.println("Hasta Luego");}
}
