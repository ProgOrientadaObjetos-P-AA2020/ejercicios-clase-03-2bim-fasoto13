/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public class Cuadrado extends Figura {

    private double lado;

    public void establecerLado(double l) {

        lado = l;

    }

    @Override
    public void calcularArea() {

        area = Math.pow(lado, 2);

    }

    public double lado() {

        return lado;

    }
    
    @Override
    public String toString() {
        
        String cadenaFinal = String.format("%s", super.toString());
        
        cadenaFinal = String.format("Cuadrado: %s", cadenaFinal);
        return cadenaFinal;

    }


}
