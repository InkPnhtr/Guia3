/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author barbi
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int correctas=0,incorrectas=0;
        String cadenas ;
        do{
         System.out.println("Ingrese cadenas de texto de 5 carac que empiecen en x y terminen en o");
         cadenas=leer.next();
            if((5==cadenas.length() && "x".equals(cadenas.substring(0,1)) && "o".equals(cadenas.substring(4,5)))){ //&& cadenas.substring(4,5)=="o" && cadenas.length()==5){
                
                correctas++;
                
            }else{
                incorrectas++;
            }
        }while(!"&&&&&".equals(cadenas));
        System.out.println("La cantidad de palabras correctas es de: "+correctas);
        System.out.println("y la cantidad de palabras incorrectas es de: "+(incorrectas-1));
    }
    
}
