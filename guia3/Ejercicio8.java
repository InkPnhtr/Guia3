/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;



import java.util.Scanner;

/**
 *
 * @author MAURICIO
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        for(int i=0 ; i <= num-1; i++){
            if( i == 0 || i == num-1) {
                for(int j=0 ; j <= num-1 ; j++){
                    System.out.print(" * ");
                }
            
        } else{
                for(int j=0 ; j<= num ; j++){
                    if(j == 0 || j == num-1){
                        System.out.print(" * ");
                }else {
                        System.out.print("   ");
                    }
            
        
            }
         
    
    }
            System.out.println("");


        
        }
    }
}

