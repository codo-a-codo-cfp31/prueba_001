package mascota;
import java.io.*;
/**
 * @author @AnalistaSistok 
 */
public class Mascota {
public static void imprimirmenu() {
		System.out.println("***********************************************************************");
		System.out.println(" Seleccione una de las opciones de acuerdo a lo que más haga su mascota");
		System.out.println("***********************************************************************");
		System.out.println(" 1- Ladrar");
		System.out.println(" 2- Saltar");
		System.out.println(" 3- Maullar");
		System.out.println(" 4- Ayuda");
		System.out.println(" 0- Salir del programa");
                System.out.println("***********************************************************************");
                System.out.println("***********************************************************************");
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		
		String acciones[];
		int opcion;
	
		acciones = new String[5];
		acciones[1] = "Ladrar";
		acciones[2] = "Saltar";
		acciones[3] = "Maullar";
		acciones[4] = "Ayuda";
		acciones[0] = "Salir";
		do {
                    imprimirmenu();
			opcion = 0;
			opcion = Integer.parseInt(bufEntrada.readLine());
                System.out.println("***********************************************************************");
		System.out.println("Opcion seleccionada es: "+opcion);
		System.out.println("***********************************************************************");
			if ((opcion)==(1)) {
				System.out.println("La Mascota es un Perro");
			}else if ((opcion)==(2)) {
				System.out.println("La Mascota es un Conejo");
			}else if ((opcion)==(3)) {
				System.out.println("La Mascota es un Gato");
			}else if ((opcion)==(4)) {
                                System.out.println("***********************************************************************");
				System.out.println("Debe seleccionar accion de su mascota");
                                System.out.println(" 1- Ladrar");
                                System.out.println(" 2- Saltar");
                                System.out.println(" 3- Maullar");
                                System.out.println(" 4- Ayuda");
                                System.out.println(" 0- Salir del programa");
                                System.out.println("***********************************************************************");
			}else if ((opcion)==(0)) {
				System.out.println("A sido un gusto que uses este programa");
			}else{ 
                         System.out.println("**************************************");
                         System.out.println("Error de seleccion e vuelva intentarlo");
                         System.out.println("**************************************");}
		} while ((opcion)!=(0));
            }
        }