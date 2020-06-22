/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        Scanner sc = new Scanner(System.in);

        ArrayList<Figura> figuras = new ArrayList<>();
        int opcion;
        int numFiguras;
        double valor1;
        double valor2;

        System.out.println("Ingrese el numero de figuras que desea ingresar:");
        numFiguras = sc.nextInt();

        for (int i = 0; i < numFiguras; i++) {
            
            System.out.println("BIENVENIDO:");
            System.out.println("INGRESE [1] AREA CUADRADO | [2] AREA ROMBO | "
                    + "[3] AREA TRIANGULO");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    Cuadrado c = new Cuadrado();
                    System.out.println("Ingrese el lado del cuadrado:");
                    valor1 = sc.nextDouble();

                    c.establecerLado(valor1);

                    figuras.add(c);

                    break;

                case 2:

                    Rombo r = new Rombo();

                    System.out.println("Ingrese la diagonal mayor:");
                    valor1 = sc.nextDouble();
                    System.out.println("Ingrese la diagonal menor:");
                    valor2 = sc.nextDouble();

                    r.establecerDiagonalMayor(valor1);
                    r.establecerDiagonalMenor(valor2);

                    figuras.add(r);

                    break;

                case 3:

                    Triangulo t = new Triangulo();

                    System.out.println("Ingrese la base del triangulo:");
                    valor1 = sc.nextDouble();
                    System.out.println("Ingrese la altura del triangulo:");
                    valor2 = sc.nextDouble();

                    t.establecerBase(valor1);
                    t.establecerAltura(valor2);

                    figuras.add(t);

                    break;

                default:

                    System.out.println("INGRESE UN VALOR VALIDO:");

                    break;

            }

        }

        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcularArea();

            System.out.printf("Datos de Figura\n"
                    + "%s\n",
                    figuras.get(i));
        }
    }
}
