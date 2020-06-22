package paquetecinco;

import java.util.ArrayList;
import java.util.Scanner;
import paquetecuatro.Estudiante;
import paquetecuatro.EstudiantePresencial;
import paquetecuatro.EstudianteDistancia;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner sc = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        int opcion;
        int numEstudiantes;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        System.out.println("Ingrese el numero de estudiantes que desea ingresar:");
        numEstudiantes = sc.nextInt();

        for (int i = 0; i < numEstudiantes; i++) {

            System.out.println("BIENVENIDO AL REGISTRO DE ESTUDIANTES:");
            System.out.println("-------------------------------------------");
            System.out.println("INGRESE [1] MODALIDAD PRESENCIAL | [2] MODALIDAD "
                    + "DISTANCIA");
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:
                case 2:

                    System.out.println("Ingrese su nombre, por favor:");
                    nombresEst = sc.nextLine();
                    System.out.println("Ingrese su apellido, por favor:");
                    apellidosEst = sc.nextLine();
                    System.out.println("Ingrese su identificacion, por favor:");
                    identificacionEst = sc.nextLine();
                    System.out.println("Ingrese su edad, por favor:");
                    edadEst = sc.nextInt();

                    if (opcion == 1) {

                        EstudiantePresencial estP = new EstudiantePresencial();

                        System.out.println("Ingrese el numero de creditos"
                                + " que desea cursar:");
                        numeroCreds = sc.nextInt();
                        System.out.println("Ingrese el costo por credito:");
                        costoCred = sc.nextDouble();

                        sc.nextLine();

                        estP.establecerNombresEstudiante(nombresEst);
                        estP.establecerApellidoEstudiante(apellidosEst);
                        estP.establecerIdentificacionEstudiante(identificacionEst);
                        estP.establecerEdadEstudiante(edadEst);
                        estP.establecerNumeroCreditos(numeroCreds);
                        estP.establecerCostoCredito(costoCred);

                        estudiantes.add(estP);

                        estP.establecerLista(estudiantes);

                    } else if (opcion == 2) {

                        EstudianteDistancia estD = new EstudianteDistancia();

                        System.out.println("Ingrese el numero de asignaturas"
                                + " que desea cursar:");
                        numeroAsigs = sc.nextInt();
                        System.out.println("Ingrese el costo por asignatura:");
                        costoAsig = sc.nextDouble();

                        sc.nextLine();

                        estD.establecerNombresEstudiante(nombresEst);
                        estD.establecerApellidoEstudiante(apellidosEst);
                        estD.establecerIdentificacionEstudiante(identificacionEst);
                        estD.establecerEdadEstudiante(edadEst);
                        estD.establecerNumeroAsginaturas(numeroAsigs);
                        estD.establecerCostoAsignatura(costoAsig);

                        estudiantes.add(estD);

                        estD.establecerLista(estudiantes);

                    }
                    
                    break;
                    
                default:
                    
                    System.out.println("INGRESE UN NUMERO VALIDO");
                    
                    break;

            }

        }

        for (int j = 0; j < numEstudiantes; j++) {
            // 1.  
            estudiantes.get(j).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(j));

        }
    }
    

}
