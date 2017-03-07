/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.a09;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2MTurrubiatesGA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Teclado = newScanner (System.in);
        int [][] a, b, r;//declasracion de 3 matrices de dos dimensiones
        int tamaño;//declaracion del tamaño de la matriz
        
        a= crearMatriz ("A"+ tamaño);
        b= crearMatriz ("B"+ tamaño);
    }
    static int solT(){
        Scanner Teclado=new Scanner(System.in);
        int tamaño;
        System.out.println("Introduce el tamaño de la mtriz(concidere que la matriz es cuadrada)");
        tamaño= Teclado.nextInt();
        return tamaño;
    }
    static int validacionenteros(){
        Scanner Teclado=new Scanner(System.in);
        boolean flag;
        
    }
    
}
