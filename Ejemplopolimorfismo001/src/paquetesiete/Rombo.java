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
public class Rombo extends Figura {

    private double diagonalMayor;
    private double diagonalMenor;

    public void establecerDiagonalMayor(double dM) {

        diagonalMayor = dM;

    }

    public void establecerDiagonalMenor(double dMe) {

        diagonalMenor = dMe;

    }

    @Override
    public void calcularArea() {

        area = (diagonalMayor * diagonalMenor) / 2;

    }

    public double obtenerDiagonalMayor() {

        return diagonalMayor;

    }

    public double obtenerDiagonalMenor() {

        return diagonalMenor;

    }
    
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("Triangulo: %s", cadenaFinal);
        return cadenaFinal;

    }


}
