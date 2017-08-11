import java.io.*;
import java.util.*;
/**
 * @author @AnalistaSistok 
 */
public class Registro {
    /**
 * @param args the command line arguments
 */
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
   confirm_password();
    confirm_email();
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
    
public static void confirm_password() throws IOException {
    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                String caract_Mayus;
		String caract_minisculas;
                 String caract_password[];
                int clave_mayusculas;
                int clave_minusculas;
                int clave_numeros;
                int long_correcta;
		int long_password;
		String password;
		String password1;
                do{
                do{
                 clave_mayusculas = 0;
                 clave_minusculas = 0;
                 clave_numeros=0;
                 long_correcta=0;
                   System.out.println("Ingrese una contraseña de 8 caracteres y al menos una mayuscula e numero");
			password = bufEntrada.readLine();
                        long_password=password.length();
                        caract_password = new String[long_password];
                      
              for(int i=0;i<long_password;i++){
		caract_password[long_password-1]=password.substring(i,i+1);
                       caract_Mayus=caract_password[long_password-1].toUpperCase();
                       caract_minisculas=caract_password[long_password-1].toLowerCase();
                    char mayus=password.charAt(i);
                       char minusculas=password.charAt(i);
                      if(caract_Mayus.contains(mayus+"")){
		       clave_mayusculas++;}
                      if(caract_minisculas.contains(minusculas + "")){
                       clave_minusculas++;}
                      }
               
              System.out.println("Su contraseña tiene: "+(password.length()-clave_minusculas)+" Mayusc y tiene:"+(password.length()-clave_mayusculas)+" minusculas e tiene:"+((clave_mayusculas+clave_minusculas)-password.length())+" numeros");
               if(password.length()!=8){
                   long_correcta=1;
              System.out.println("Su contraseña debe tener 8 caracteres");
             }
               if((password.length()-clave_minusculas)==0){
                    long_correcta=1;
               } 
               if((password.length()-clave_mayusculas)==0){
                    long_correcta=1;
                }
               if(((clave_mayusculas+clave_minusculas)-password.length())==0){
            long_correcta=1;
             } 
                if((password.length()-clave_minusculas)==8){
            long_correcta=1;
            System.out.println("Se requiere que la contraseña tenga al menos un numero e minuscula"); 
              }
               if((password.length()-clave_mayusculas)==8){
                    long_correcta=1;
                  System.out.println("Se requiere que la contraseña tenga al menos un numero e mayuscula"); 
               } 
              if(((clave_mayusculas+clave_minusculas)-password.length())==8){
                    long_correcta=1;
                     System.out.println("Se requiere que la contraseña tenga al menos una minuscula e mayuscula"); 
              } 
         }while(long_correcta==1);
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
        }
               }while(!password.equals(password1));
                      }
                    
public static void confirm_email() throws IOException {
    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String arroba="@";
                String email;
		int cantidadArroba;
                int long_correcta;
                do{
          cantidadArroba= 0;
          long_correcta=0;
                System.out.println("Ingrese su direccion de correo");
			email = bufEntrada.readLine();
       	for (int i = 0; i < email.length(); i++) {
			char arroba1= email.charAt(i);
			if(arroba.contains(arroba1+"")){
				cantidadArroba++;}
		}
         if(email.length()<18){
             long_correcta=0;
         System.out.println("Su longitud de correo electronico es minima a una cuenta oficial de correo electronico"); }
              if(cantidadArroba>1){
            System.out.println("Es imposible registrarlo ya que imposible que una cuenta de correo tenga:"+cantidadArroba+" arroba");}
	else if(cantidadArroba==1&&email.length()>18){
            long_correcta=long_correcta+1;
       System.out.println("**************************************************");
        System.out.println("**************Correo Registrado**************");
        System.out.println("**************************************************");} 
        }while(long_correcta!=1);
        }
}