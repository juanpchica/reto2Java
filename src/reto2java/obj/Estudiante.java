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
public final class Estudiante {
    public Double[] notas;
    public String nombre;
    public int edad,estrato,valorDescontado;
    public boolean tieneDescuento,yaTieneDescuento = false;
    

    public Estudiante(String nombre, int edad, int estrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.estrato = estrato;
        
        //Obtengo promedio y descuentos
        this.getPromedio();
        this.validarTieneDescuento();
    }

    public int getValorDescontado() {
        return valorDescontado;
    }

    public void setValorDescontado(int valorDescontado) {
        this.valorDescontado = valorDescontado;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }
    
    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
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

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    
    public int getPromedio() {
        int promedio = 0;
        Double[] notasValor = new Double[]{0.3,0.3,0.4};
        for(int i = 0;i<3;i++){
            promedio += this.notas[i]*notasValor[i];
        }
        
        return promedio;
    }
    
    public int calcularValorDescontado(int porcentaje){
        if(porcentaje == 0){
            this.tieneDescuento = false;
            return 0;
        }else{
            this.tieneDescuento = true;
            this.yaTieneDescuento = true;
            int valorMatricula = (this.yaTieneDescuento)?this.getValorDescontado():630000;
            return valorMatricula * (porcentaje/100);
        }
    }
    
    public void validarTieneDescuento(){
        if((this.estrato == 1 || this.estrato == 2 || this.estrato == 3)){
            if(this.edad < 18){
                this.setValorDescontado(calcularValorDescontado(70));
            }else{
                this.setValorDescontado(calcularValorDescontado(0));
            }
        }else{
            this.setValorDescontado(calcularValorDescontado(20));
        }
        
        if(getPromedio() >= 4){
            if(this.yaTieneDescuento){
                this.setValorDescontado(this.getValorDescontado()+calcularValorDescontado(50));
            }else{
                this.setValorDescontado(calcularValorDescontado(20));
            }
        }
    }
    
    
    
}