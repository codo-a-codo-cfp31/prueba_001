import java.io.*;

public class registro {

	public static void imprimirmenu() {
		System.out.println("*************************************");
		System.out.println(" Seleccione una de las opciones");
		System.out.println("*************************************");
		System.out.println(" 1- Registrar Usuario e Correo");
		System.out.println(" 0- Salir del programa");
	}

	public static void menu(int opcionseleccionada) throws IOException {
            	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int lon_name;
		String nombre;
		switch (opcionseleccionada) {
		case 1:
			do {
				System.out.println("Ingrese su Nombre de Usuario");
				nombre = bufEntrada.readLine();
				lon_name = nombre.length();
				if (lon_name<4) {
					System.out.println("");
					System.out.println("LONGITUD de USUARIO ES MENOR 4");
				}
			} while (lon_name<=4);
			confirma_clave();
			confirmar_correo();
			break;
		case 0:
			System.out.println("Gracias por usar este programa. Saliendo...");
			break;
		default:
			System.out.println("Opcion invalida, presione de vuelta su opcion");
		}
	}

	public static void confirma_clave() throws IOException {
            	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String clave;
		String clave2;
		int lon;
		do {
			do {
				lon = 0;
				System.out.println("Ingrese una clave de 8 Caracteres");
				clave = bufEntrada.readLine();
				lon = clave.length();
				System.out.println("Confirme su clave");
				clave2 = bufEntrada.readLine();
				if (!clave.equals(clave2)) {
					System.out.println("");
					System.out.println("LAS CLAVES NO COINCIDEN");
				}
				if (lon!=8) {
					System.out.println("");
					System.out.println("LONGITUD NO VALIDA");
				}
			} while (lon!=8);
		} while (!clave.equals(clave2));
	}

	public static void confirmar_correo() throws IOException {
            	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                
		double bandera;
		String cadena_correo[];
		int cont;
		String correo;
		int lon_mail;
		do {
			bandera = 0;
			correo = "";
			cont = 0;
			System.out.println("Ingrese su direccion de correo");
			correo = bufEntrada.readLine();
			lon_mail = correo.length();
			do {
			cadena_correo = new String[correo.length()];
                        cadena_correo[cont] = correo.substring(cont,cont+1);
				if (cadena_correo[cont].equals("@")) {
					bandera = bandera+1;
				}
				cont = cont+1;
			} while (cont<correo.length());
			if (lon_mail>=15 && bandera==1) {
				System.out.println("");
				System.out.println("Correo Registrado");
			} else {
				System.out.println("");
				System.out.println("CORREO NO VALIDO");
				System.out.println("Ingrese de nuevo su direccion de correo");
			}
		} while (lon_mail<15);
	}

	public static void main(String args[]) throws IOException {
            	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

		int opcion_seleccionada;
		do {
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			imprimirmenu();
			opcion_seleccionada = Integer.parseInt(bufEntrada.readLine());
			menu(opcion_seleccionada);
			System.out.println("Presione una tecla para continuar...");
			System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
		} while ((opcion_seleccionada)!=(0));
	}


}

