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
if(long_usuario>2){
System.out.println("**************************************************");
System.out.println("*******SU NOMBRE DE USUARIO CREADO CON EXITO******");
System.out.println("**************************************************");
      }else {
System.out.println("**************************************************");
System.out.println("**********LONGITUD de USUARIO ES MENOR 2**********");
System.out.println("**************************************************");
    }} while (long_usuario<=2);
    confirma_clave();
    confirmar_correo();
    break;	
    default:
System.out.println("Opcion invalida, presione de vuelta su opcion"); 
            }
        }

public static void main(String args[]) throws IOException {
String opcion;
String tecla;
BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
do {
imprimirmenu();
opcion = bufEntrada.readLine();
menu(opcion);
System.out.println("Presione una tecla para continuar...");
tecla=bufEntrada.readLine();
} while (!(opcion.equals("0")));}
    
public static void confirma_clave() throws IOException {
        String caract_mayusculas;
        String caract_password;
        int contador;
        int long_contraseña;
        int long_correcta;
        int long_password;
        int clave_mayusculas;
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
        }} while (long_correcta!=1);
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
        }} while (!(long_correcta==1 && clave_mayusculas==1));
        System.out.println("Confirme su clave");
        password1 = bufEntrada.readLine();
        if (password.equals(password1)) {
        System.out.println("**************************************************");
        System.out.println("**************Clave creada con exito**************");
        System.out.println("**************************************************");
        } else {
        System.out.println("**************************************************");
        System.out.println("**************Las claves no coinciden**************");
        System.out.println("**************************************************");
        }} while (!password.equals(password1));
    }

public static void confirmar_correo() throws IOException {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
	 String arroba;
          arroba = "@";
		double bandera;
                bandera = 0;
		String cadena_correo[];
		int cont;
                cont = 0;
		String correo;
		int long_mail;
		int total;
		total = 15;
		cadena_correo = new String[total];
		do {
			System.out.println("Ingrese su direccion de correo");
			correo = bufEntrada.readLine();
			long_mail = correo.length();
			do{
				cadena_correo[total-1] = correo.substring(cont,cont+1);
				cont = cont+1;
				if (cadena_correo[total-1].equals(arroba)) {
					bandera = bandera+1;
				}
			 }while(cont<total);
			if (bandera==1) {
				System.out.println("**************************************************");
				System.out.println("****************Correo Registrado*****************");
				System.out.println("**************************************************");
			} else {
				System.out.println("**************************************************");
				System.out.println("*************CORREO NO VALIDO*********************");
				System.out.println("**************************************************");
				System.out.println("Registre de nuevo usuario y su direccion de correo");
			}
		} while (bandera!=1);
}
}