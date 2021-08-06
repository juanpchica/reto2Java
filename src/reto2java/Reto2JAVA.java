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
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante;
        
        System.out.println("Bienvenido\nPor favor digite el total de estudiantes que desea ingresar: ");
       
        
        //total de estudiantes
        int numEstudiantes = sc.nextInt();
        
        listaEstudiantes = new Estudiante[numEstudiantes];
        
        for(int i=0;i<numEstudiantes;i++){
            double[] notas = new double[3];
            
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            
            System.out.print("Estrato: ");
            int estrato = sc.nextInt();
            
            System.out.print("Nota 1: ");
            notas[0] = sc.nextDouble();
            
            System.out.print("Nota 2: ");
            notas[1] = sc.nextDouble();
            
            System.out.print("Nota 3: ");
            notas[2] = sc.nextDouble();
            
            estudiante = new Estudiante(nombre,edad,estrato);
            estudiante.setNotas(notas);
            
            //Obtengo promedio y descuentos
            estudiante.calcularPromedio();
            estudiante.validarTieneDescuento();
            
            listaEstudiantes[i] = estudiante;
        }
        
    }
    
}
