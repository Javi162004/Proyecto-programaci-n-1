/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

/**
 *
 * @author javier
 */
public class VerificadorPassword {

    public static boolean passwordSegura(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean minuscula = false;
        boolean mayuscula = false;
        boolean numero = false;
        boolean caracter = false;

        for (int i = 0; i < password.length(); i++) {
            char a = password.charAt(i);

            if (Character.isLowerCase(a)) {
                minuscula = true;
            } else if (Character.isUpperCase(a)) {
                mayuscula = true;
            } else if (Character.isDigit(a)) {
                numero = true;

            } else {
                caracter = true;
            }

        }
        return minuscula && mayuscula && numero && caracter;
    }

}
