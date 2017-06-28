import java.io.*;
import java.util.*;
public class Registro {
    
public static void imprimirmenu() {
System.out.println("*************************************");
System.out.println("Bienvenido seleccione una de las opciones");
System.out.println("*************************************");
System.out.println("1- Registrar Usuario e Correo");
System.out.println("0- Salir del programa");
System.out.println("*************************************");
System.out.println("*************************************");}
	
public static void menu(String opcion) throws IOException {
		int long_usuario;
                String usuario;
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		switch (opcion) {
                case "0":
			System.out.println("Gracias por usar este programa. Saliendo...");
			break;
		case "1":
			do {
     System.out.println("Ingrese su Nombre de Usuario");
      usuario = bufEntrada.readLine();
      long_usuario = usuario.length();
  if(long_usuario>4){
 System.out.println("Su nombre de usuario es: "+usuario);
  }else {
    System.out.println("");
    System.out.println("LONGITUD de USUARIO ES MENOR 4");
    System.out.println("");
        } } while (long_usuario<=4);
    confirma_clave();
    confirmar_correo();
    break;	
    default:
      System.out.println("Opcion invalida, presione de vuelta su opcion"); 
            }
        }

    public static void main(String args[]) throws IOException {
    String opcion;
    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    do {
   imprimirmenu();
    opcion = bufEntrada.readLine();
    menu(opcion);
    System.out.println("Presione una tecla para continuar...");
   String tecla;
    tecla=bufEntrada.readLine();
} while (opcion=="0");}
    
public static void confirma_clave() throws IOException {
   String caract_mayusculas;
		String caract_password;
		double clave_mayusculas;
		int contador;
		int long_contraseña;
		int long_correcta;
		int long_password;
		String password;
		String password1;
		contador = 0;
		long_contraseña= 0;
		long_correcta = 0;
		clave_mayusculas = 0;
                BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		do {
                do {
                do {
                System.out.println("Ingrese una contraseña de 8 caracteres y al menos una mayuscula");
                password = bufEntrada.readLine();
                long_password = password.length();
                if (long_password==8) {
                        long_correcta = 1;
                } else {
                System.out.println("Su clave no contiene 8 caracteres");
                }
                } while (long_correcta!=1);
                do {
                caract_password = password.substring(contador,contador+1);
                caract_mayusculas = caract_password.toUpperCase();
                if (caract_password.equals(caract_mayusculas)) {
                        clave_mayusculas = 1;
                }
                contador = contador+1;
				} while (!(clave_mayusculas==1 || contador==long_password));
				if (clave_mayusculas==0) {
					System.out.println("Su clave no contiene mayusculas");
				}
			} while (!(long_correcta==1 && clave_mayusculas==1));
                System.out.println("Confirme su clave");
                password1 = bufEntrada.readLine();
                if (password.equals(password1)) {
                        System.out.println("Clave creada con exito");
                } else {
                        System.out.println("Las claves no coinciden");
                }
		} while (!password.equals(password1));
	}

	public static void confirmar_correo() throws IOException {
		String email;
		String emailcaract;
		int emailcorrecto;
		int indice;
		int longitudemail;
		emailcorrecto = 0;
                BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    do {
    System.out.println("Ingrese un email");
    email = bufEntrada.readLine();
    longitudemail = email.length();
    for (indice=0;indice<=longitudemail;indice++) {
    emailcaract = email.substring(indice,indice+1);
    
        if ((emailcaract).equals("@")) {
            emailcorrecto=1;
            indice = longitudemail;
     System.out.println("Email registrado con exito"); }
    }}while (!(emailcorrecto==1 || indice==longitudemail));}
        }