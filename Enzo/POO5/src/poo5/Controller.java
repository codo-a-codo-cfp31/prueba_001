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
 * @author @AnalistaSistok #CFP31 #SEducA
 */
public class Controller {

    protected UserProfile perfil;

    public UserProfile getPerfil() {
        return perfil;
    }

    protected IView view;

    public Controller(IView view) {
        this.view = view;
    }

    public void Run() throws IOException {
        Scanner unScanner = new Scanner(System.in);
        String username = "";
        String email = "";
        String password = "";
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
	int long_usuario;
        
        perfil = new UserProfile();

        view.Draw("Perfil de usuario" + perfil.comoTeLlamas());

      do {
view.Draw("Ingrese su Nombre de Usuario");
username = bufEntrada.readLine();
long_usuario = username.length();
if(long_usuario>2){
view.Draw("**************************************************\n*******SU NOMBRE DE USUARIO CREADO CON EXITO******\n**************************************************");
      }else {
System.out.println("**************************************************\n**********LONGITUD de USUARIO ES MENOR 2**********\n**************************************************");
    }} while (long_usuario<=2);

           String arroba="@";
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
         view.Draw("Su longitud de correo electronico es minima a una cuenta oficial de correo electronico"); }
              if(cantidadArroba>1){
            view.Draw("Es imposible registrarlo ya que imposible que una cuenta de correo tenga:"+cantidadArroba+" arroba");}
	else if(cantidadArroba==1&&email.length()>18){
            long_correcta=long_correcta+1;
       view.Draw("**************************************************\n**************Correo Registrado**************\n**************************************************");} 
        }while(long_correcta!=1);

             String caract_Mayus;
		String caract_minisculas;
                 String caract_password[];
                int clave_mayusculas;
                int clave_minusculas;
                int clave_numeros;
		int long_password;
		String password1;
                do{
                do{
                 clave_mayusculas = 0;
                 clave_minusculas = 0;
                 clave_numeros=0;
                 long_correcta=0;
                  view.Draw("Ingrese una contraseña de 8 caracteres y al menos una mayuscula e numero");
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
               
             view.Draw("Su contraseña tiene: "+(password.length()-clave_minusculas)+" Mayusc y tiene:"+(password.length()-clave_mayusculas)+" minusculas e tiene:"+((clave_mayusculas+clave_minusculas)-password.length())+" numeros");
               if(password.length()!=8){
                   long_correcta=1;
              view.Draw("Su contraseña debe tener 8 caracteres");
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
            view.Draw("Se requiere que la contraseña tenga al menos un numero e minuscula"); 
              }
               if((password.length()-clave_mayusculas)==8){
                    long_correcta=1;
                 view.Draw("Se requiere que la contraseña tenga al menos un numero e mayuscula"); 
               } 
              if(((clave_mayusculas+clave_minusculas)-password.length())==8){
                    long_correcta=1;
                     view.Draw("Se requiere que la contraseña tenga al menos una minuscula e mayuscula"); 
              } 
         }while(long_correcta==1);
        view.Draw("Confirme su clave");
        password1 = bufEntrada.readLine();
        if (password.equals(password1)) {
        view.Draw("**************************************************\n**************Clave creada con exito**************\n**************************************************");
        } else {
        view.Draw("**************************************************\n**************Las claves no coinciden**************\n**************************************************");
        }
               }while(!password.equals(password1));
    }
}