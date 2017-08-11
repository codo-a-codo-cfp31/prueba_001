/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo05;
/**
 *
 *@author @AnalistaSistok
 * 
 */
import java.util.*;
/**
* 
*@param  args the command line arguments
*/
public class Controlador {
    protected UserProfile perfil;
    
    public UserProfile getPefil(){
    return perfil;}
    
   public void run(){
        Scanner unScanner = new Scanner(System.in);
        String username ;
        String email;
        String password;
        String confirmationPassword;
        int long_correcta;
         int long_usuario;
        Boolean registrationCompleted = Boolean.FALSE;
        perfil = new UserProfile();
System.out.println("**************************************************");
System.out.println("Perfil de usuario:\n" + perfil.comoTeLlamas()+"\n"+perfil.cualEsTuApellido());
System.out.println("**************************************************");
        do {
            do{
            System.out.println("**************************************************");
            System.out.println("Ingrese nombre de usuario:");
            System.out.println("****************             *********************");
            System.out.println("**************************************************");
            username = unScanner.next();
      long_usuario =username.length();
if(long_usuario>2){
System.out.println("**************************************************");
System.out.println("*******SU NOMBRE DE USUARIO CREADO CON EXITO******");
System.out.println("**************************************************");
      }else {
System.out.println("**************************************************");
System.out.println("**********LONGITUD de USUARIO ES MENOR 2**********");
System.out.println("**************************************************");
    }} while (long_usuario<=2);
            
            String caract_Mayus;
		String caract_minisculas;
                String caract_password[];
                int clave_mayusculas;
                int clave_minusculas;
                int clave_numeros;
                int clave_total;
		int long_password;
               String password1;
                do{
                 clave_mayusculas = 0;
                 clave_minusculas = 0;
                 clave_numeros=0;
                 long_correcta=0;
                System.out.println("Ingrese contraseña");
            password = unScanner.next();
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

            System.out.println("Ingrese confirmacion de contraseña");
            confirmationPassword = unScanner.next();

            String arroba="@";
             int cantidadArroba;
                do{
          cantidadArroba= 0;
          long_correcta=0;
                System.out.println("Ingrese su direccion de correo");
			email = unScanner.next();
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
            // if (password.eualToIgnoreCase(confirmationPassword)
            if (password.compareTo(confirmationPassword) == 0) {
                registrationCompleted = Boolean.TRUE;
        System.out.println("**************************************************");
        System.out.println("**************Clave creada con exito**************");
        System.out.println("**************************************************");
        }
        } while (!registrationCompleted);
    }
}