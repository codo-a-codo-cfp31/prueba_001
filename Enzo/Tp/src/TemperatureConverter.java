import java.io.*;
/**
 * @author @AnalistaSistok 
 */
public class TemperatureConverter {
/**
* 
*@param  args the command line arguments
*/
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double c;
		double f;
		double k;
		String opcion;
	        String tecla;
		
                do {   
        System.out.println("*************************************");
        System.out.println("Elija una opcion");
        System.out.println("Opcion 1.- Convertir unidades");
        System.out.println("Opcion 2.- Salir");
        System.out.println("*************************************");
        opcion=bufEntrada.readLine();
        System.out.println("***********Opcion elegida es: "+opcion+"*******************");
		if ((opcion).equals(("1"))) {
				c = 0;
				k = 0;
				f = 0;
				System.out.println("Ingrese el valor de temperatura en Celsius");
				c = Double.parseDouble(bufEntrada.readLine());
                        System.out.println("******************"+c+" C°*******************");
                        System.out.println("¿A que unidad desea convertirlo?");
                        System.out.println("1. Kelvin o 2. farenheit");
                        opcion = bufEntrada.readLine();
                        System.out.println("***********Opcion elegida es: "+opcion+"********************");
                        if ((opcion).equals("1")) {
                        k = (c-273.15);

                        System.out.println("*******El valor convetido es: "+k+" K°******");
                        System.out.println("***********Presiona cualquiera tecla******");
                        opcion = bufEntrada.readLine();}
                        else {
                        if ((opcion).equals("2")) {
                            f = (c*9/5)+32;
                                    
                        System.out.println("*******El valor convertido es: "+f+" F°*****");
                        System.out.println("***********Presiona cualquiera tecla******");
                        tecla = bufEntrada.readLine();}}}
                        else if (opcion.equals("2")) {
				System.out.println("***********Usted a Salido**************************");}
                        else{
                        System.out.println("***********Opcion Incorrecta**************************");}
                } while (!(opcion).equals("2"));
		System.out.println("Hasta Luego");}
                }