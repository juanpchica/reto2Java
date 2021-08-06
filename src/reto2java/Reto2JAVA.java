/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2java;

import java.util.Scanner;
import reto2java.obj.Estudiante;

/**
 *
 * @author H
 */
public class Reto2JAVA {
    
    public static Estudiante[] listaEstudiantes;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        colectarEstudiantes();
        
        
    }
    
    public static void colectarEstudiantes(){
        System.out.println("Bienvenido\nPor favor digite el total de estudiantes que desea ingresar: ");
        Scanner sc = new Scanner(System.in);
        
        //total de estudiantes
        int numEstudiantes = sc.nextInt();
        
        listaEstudiantes = new Estudiante[numEstudiantes];
        
        
    }
    
}
