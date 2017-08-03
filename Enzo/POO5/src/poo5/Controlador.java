/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;
import java.util.*;
/**
* 
@AnalistaSistok args the command line arguments
*/
public class Controlador {
    protected UserProfile perfil;
    public UserProfile getPefil(){
    return perfil;}
    
   public Controlador(UserProfile perfil){
       this.perfil=perfil;}
    
   protected IView view;
   public Controlador(IView view){
            this.view=view;}
    
       public void run() {
        Scanner unScanner = new Scanner(System.in);
        String username ;
        String email;
        String password;
        String confirmationPassword;
        int long_correcta;
        Boolean registrationCompleted = Boolean.FALSE;
        perfil = new UserProfile();
 System.out.println("Perfil de usuario:\n" + perfil.comoTeLlamas()+"\n"+perfil.cualEsTuApellido());

        do {
            view.Draw("Ingrese nombre de usuario");
            username = unScanner.next();

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
                do{
                 clave_mayusculas = 0;
                 clave_minusculas = 0;
                 clave_numeros=0;
                 long_correcta=0;
                  System.out.println("Ingrese contraseña");
            password = unScanner.next();
                        caract_password = new String[password.length()];
                      
              for(int i=0;i<password.length();i++){
		caract_password[password.length()-1]=password.substring(i,i+1);
                       caract_Mayus=caract_password[password.length()-1].toUpperCase();
                       caract_minisculas=caract_password[password.length()-1].toLowerCase();
                     long_correcta=i;
                       char mayus=password.charAt(i);
                       char minusculas=password.charAt(i);
                      if(caract_Mayus.contains(mayus+"")){
		       clave_mayusculas++;}
                      if(caract_minisculas.contains(minusculas + "")){
                       clave_minusculas++;}
                      if(caract_Mayus.contains(mayus+"")&&caract_minisculas.contains(minusculas + "")){
                       clave_numeros++; }
                      }
              
               if(password.length()!=8){
                   long_correcta=0;
             view.Draw("Su contraseña debe tener 8 caracteres");
             continue;}
              if(clave_minusculas>=7&&clave_minusculas<9){
                    long_correcta=0;
                      System.out.println("Se requiere que la contraseña tenga al menos una mayuscula"); 
                view.Draw("Se requiere que la contraseña tenga al menos un numero");
         view.Draw("Su contraseña tiene: "+(password.length()-clave_minusculas)+" Mayusc y tiene:"+(password.length()-clave_mayusculas)+" minusculas e tiene:"+((clave_mayusculas+clave_minusculas)-password.length())+" numeros");
               continue;}
               if(clave_mayusculas>=7&&clave_mayusculas<9){
                    long_correcta=0;
               view.Draw("Se requiere que la contraseña tenga al menos una minuscula");
               view.Draw("Se requiere que la contraseña tenga al menos un numero");
              view.Draw("Su contraseña tiene: "+(password.length()-clave_minusculas)+" Mayusc y tiene:"+(password.length()-clave_mayusculas)+" minusculas e tiene:"+((clave_mayusculas+clave_minusculas)-password.length())+" numeros");
              continue;}
                if(clave_numeros>=7&&clave_numeros<9){
            long_correcta=0;
             view.Draw("Se requiere que la contraseña tenga al menos una mayuscula"); 
             view.Draw("Se requiere que la contraseña tenga al menos una minuscula");
          continue;}
               if(clave_mayusculas<1){
                    long_correcta=0;
              view.Draw("Se requiere que la contraseña tenga al menos una mayuscula"); 
               view.Draw("Su contraeña tiene: "+(password.length()-clave_minusculas)+" Mayusc y tiene:"+(password.length()-clave_mayusculas)+" minusculas e tiene:"+((clave_mayusculas+clave_minusculas)-password.length())+" numeros");
              continue;}
               if(clave_minusculas<1){
                    long_correcta=0;
               view.Draw("Se requiere que la contraseña tenga al menos una minuscula");
         view.Draw("Su contraseña tiene: "+(password.length()-clave_minusculas)+" Mayusc y tiene:"+(password.length()-clave_mayusculas)+" minusculas e tiene:"+((clave_mayusculas+clave_minusculas)-password.length())+" numeros");
               continue;}
         if(clave_numeros<=(password.length()-(clave_mayusculas+clave_minusculas))){
            long_correcta=0;
             view.Draw("Se requiere que la contraseña tenga al menos un numero");
          continue;}
        
          if((clave_mayusculas==4&&clave_minusculas==2&&clave_numeros==2)||(clave_mayusculas==2&&clave_minusculas==2&&clave_numeros==4)||(clave_mayusculas==2&&clave_minusculas==4&&clave_numeros==2)||(clave_mayusculas==3&&clave_minusculas==2&&clave_numeros==3)||(clave_mayusculas==2&&clave_minusculas==3&&clave_numeros==3)||(clave_mayusculas==3&&clave_minusculas==3&&clave_numeros==2)||(clave_mayusculas==6&&clave_minusculas==1&&clave_numeros==1)||(clave_mayusculas==1&&clave_minusculas==6&&clave_numeros==1)||(clave_mayusculas==1&&clave_minusculas==1&&clave_numeros==6)||(clave_mayusculas==5&&clave_minusculas==1&&clave_numeros==2)||(clave_mayusculas==5&&clave_minusculas==2&&clave_numeros==1)||(clave_mayusculas==2&&clave_minusculas==5&&clave_numeros==1)||(clave_mayusculas==1&&clave_minusculas==5&&clave_numeros==2)||(clave_mayusculas==1&&clave_minusculas==2&&clave_numeros==5)||(clave_mayusculas==2&&clave_minusculas==1&&clave_numeros==5)){
           long_correcta=long_correcta+1;
            continue;}
            }while(long_correcta==0);

            view.Draw("Ingrese confirmacion de contraseña");
            confirmationPassword = unScanner.next();

            String arroba="@";
             int cantidadArroba;
                do{
          cantidadArroba= 0;
          long_correcta=0;
                view.Draw("Ingrese su direccion de correo");
			email = unScanner.next();
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
       view.Draw("**************************************************");
        view.Draw("**************Correo Registrado**************");
        view.Draw("**************************************************");} 
        }while(long_correcta!=1);
            // if (password.eualToIgnoreCase(confirmationPassword)
            if (password.compareTo(confirmationPassword) == 0) {
                registrationCompleted = Boolean.TRUE;
        view.Draw("**************************************************");
        view.Draw("**************Clave creada con exito**************");
        view.Draw("**************************************************");
        }
        } while (!registrationCompleted);
    }
}