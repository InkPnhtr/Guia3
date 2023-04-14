/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author U
 */
public class Ej8Guia3Cuad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //int l;
        System.out.println("Ing. Lado");
        int l = leer.nextInt();
        String matriz[][] = new String [l][l]; // Le ponemos la dimension a la matriz, 
        // un 3 para las filas o otro para las columnas

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {

                matriz[i][j] = "*"; // Le asignamos a cada posicion de la matriz
                // en sus filas

            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {

                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                if (i>0 && j>0 && i<l-1 && j<l-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print(matriz[i][j]);
                }
                
            }
            System.out.println(" ");
        }
    }
    
}
