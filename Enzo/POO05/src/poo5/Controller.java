/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;
import java.io.*;
import java.util.*;
/**
 *
 * @author @AnalistaSistok 
 */
public class Controller {
/**
* 
*@param args the command line arguments
*/
    protected UserProfile perfil;
    
    public UserProfile getPefil(){
    return perfil;}
    
    protected IView view;
   public Controller(IView view){
            this.view=view;}
   
    public void Run() throws IOException{
        Scanner unScanner = new Scanner(System.in);
        String username ;
        String email;
        String password;
        String confirmationPassword;
        int long_correcta;
         int long_usuario;
        Boolean registrationCompleted = Boolean.FALSE;
        perfil = new UserProfile();
 view.draw("Perfil de usuario:\n" + perfil.comoTeLlamas()+"\n"+perfil.cualEsTuApellido());

            do{
                //do{
            view.draw("Ingrese nombre de usuario");
            username = unScanner.next();
           long_usuario =username.length();
if(long_usuario>2){
view.draw("**************************************************\n*******SU NOMBRE DE USUARIO CREADO CON EXITO******\n**************************************************");
      }else {
view.draw("**************************************************\n**********LONGITUD de USUARIO ES MENOR 2************************************************************");
    }} while (long_usuario<=2);
            
            String caract_Mayus;
		String caract_minisculas;
                 String caract_numeros ;
		String caract_password[];
                int clave_mayusculas;
                int clave_minusculas;
                int clave_numeros;
                int clave_total;
		int long_password;
               String password1;
                BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
               do{
                do{
                 clave_mayusculas = 0;
                 clave_minusculas = 0;
                 clave_numeros=0;
                 long_correcta=0;
                 view.draw("Ingrese contraseña");
            password = unScanner.next();
                 caract_password = new String[password.length()];
                      
              for(int i=0;i<password.length();i++){
		caract_password[password.length()-1]=password.substring(i,i+1);
                       caract_Mayus=caract_password[password.length()-1].toUpperCase();
                       caract_minisculas=caract_password[password.length()-1].toLowerCase();
                      char mayus=password.charAt(i);
                       char minusculas=password.charAt(i);
                      if(caract_Mayus.contains(mayus+"")){
		       clave_mayusculas++;}
                      if(caract_minisculas.contains(minusculas + "")){
                       clave_minusculas++;}
                      }
              if(password.length()!=8){
                   long_correcta=1;
              view.draw("Su contraseña debe tener 8 caracteres");
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
            view.draw("Se requiere que la contraseña tenga al menos un numero e minuscula"); 
              }
               if((password.length()-clave_mayusculas)==8){
                    long_correcta=1;
                 view.draw("Se requiere que la contraseña tenga al menos un numero e mayuscula"); 
               } 
              if(((clave_mayusculas+clave_minusculas)-password.length())==8){
                    long_correcta=1;
                     view.draw("Se requiere que la contraseña tenga al menos una minuscula e mayuscula"); 
              } 
            }while(long_correcta==1);
view.draw("Confirme su clave");
        password1 = bufEntrada.readLine();
        if (password.equals(password1)) {
        view.draw("**************************************************\n**************Clave creada con exito**************\n**************************************************");
        } else {
        view.draw("**************************************************\n**************Las claves no coinciden**************\n**************************************************");
        }
       }while(!password.equals(password1));
            
            String arroba="@";
             int cantidadArroba;
                do{
          cantidadArroba= 0;
          long_correcta=0;
                view.draw("Ingrese su direccion de correo");
			email = unScanner.next();
                     	for (int i = 0; i < email.length(); i++) {
			char arroba1= email.charAt(i);
			if(arroba.contains(arroba1+"")){
				cantidadArroba++;}
		}
         if(email.length()<18){
             long_correcta=0;
         view.draw("Su longitud de correo electronico es minima a una cuenta oficial de correo electronico"); }
              if(cantidadArroba>1){
            view.draw("Es imposible registrarlo ya que imposible que una cuenta de correo tenga:"+cantidadArroba+" arroba");}
	else if(cantidadArroba==1&&email.length()>18){
            long_correcta=long_correcta+1;
       view.draw("**************************************************\n**************Correo Registrado**************\n**************************************************");} 
        }while(long_correcta!=1);
            // if (password.eualToIgnoreCase(confirmationPassword)
            /*if (password.compareTo(confirmationPassword) == 0) {
                registrationCompleted = Boolean.TRUE;
        view.draw("**************************************************\n**************Clave creada con exito**************\n**************************************************");
        }
        } while (!registrationCompleted)*/
    }
}