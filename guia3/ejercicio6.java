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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1,num2,suma,opcion;
        String respuesta;
        System.out.println("Ingrese dos numeros positivos");
        num1=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("elija una opcion del siguiente menu:");
        do{
        
        System.out.println("*** MENU ***");
           System.out.println("1. Sumar ");
           System.out.println("2. Restar ");
           System.out.println("3. Multiplicar ");
           System.out.println("4. Dividir ");
           System.out.println("5. Salir ");
           System.out.println();
           System.out.print("Elija una opcion: ");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("la suma es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("la resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("la multiplicacion es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("la division es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que quiere salir? S/N");
                    respuesta=leer.next();
                    if ("N".equals(respuesta)){
                        opcion=0;
                    }
                       break ;
                 default:
                    System.out.println("Elija otra opcion del menu");
                    break;
            
            
            }
        }while(opcion!=5);
    }
    
}
