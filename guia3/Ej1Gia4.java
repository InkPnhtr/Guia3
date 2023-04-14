/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/*
 *
 * @author U
 *
*/

public class Ej1Gia4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ing una Frase: ");
        String cade;
        cade = leer.next();
        System.out.println("Ing= " + cade);
        System.out.println("Largo= " + deco(cade)); // prueba funcion
    }

    
    
    public static String deco(String cade) {
        int lar = cade.length();
        for (int s = 0; s < lar; s++) {
            System.out.println(cade.substring(s,s+1));
            }
        return cade;
    }
}