/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import java.util.Scanner;

/**
 *
 * @author CFP31-15
 */
public class Controlador {
    
    public void Run() {
            Scanner unScanner = new Scanner(System.in);
        String username = "";
        String email = "";
        String password = "";
        String confirmationPassword = "";
        Boolean registrationCompleted = Boolean.FALSE;
        UserProfile perfil = new UserProfile();

        System.out.println("Perfil de usuario" + perfil.comoTeLlamas());

        do {
            System.out.println("Ingrese nombre de usuario");
            username = unScanner.next();

            System.out.println("Ingrese email");
            email = unScanner.next();

            if (!email.contains("@")) {
                System.out.println("ERROR, No es un email");
                continue;
            }

            System.out.println("Ingrese contraseña");
            password = unScanner.next();

            if (password.length() < 8) {
                System.out.println("ERROR, la contrassñea debe ser mayor a 8 caracteres");
                continue;
            }

            System.out.println("Ingrese confirmacion de contraseña");
            confirmationPassword = unScanner.next();

            // if (password.eualToIgnoreCase(confirmationPassword)
            if (password.compareTo(confirmationPassword) == 0) {
                registrationCompleted = Boolean.TRUE;
            }
        } while (!registrationCompleted);
    }
}
