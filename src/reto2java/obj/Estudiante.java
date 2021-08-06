/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2java.obj;

/**
 *
 * @author juanpchica
 */
public class Estudiante {
    public int[] notas;
    public String nombre;
    public int edad,estrato;

    public Estudiante(String nombre, int edad, int estrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.estrato = estrato;
    }
    
    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPromedio() {
        int promedio = 0;
        Double[] notasValor = new Double[]{0.3,0.3,0.4};
        for(int i = 0;i<3;i++){
            promedio += this.notas[i]*notasValor[i];
        }
        
        return promedio;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    
}