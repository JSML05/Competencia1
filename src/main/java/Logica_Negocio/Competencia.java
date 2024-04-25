/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jsml
 */
public class Competencia {

    private static ArrayList<Atleta> Atletas = new ArrayList<>();

    public static void main(String[] args) {
        // Inicializacion de las variables
        double Tiempo = 0;
        int Num_tiempos = 0;
        Scanner scan = new Scanner(System.in);

        int opc = 0;
        do {
            System.out.println("\n");
            System.out.println("     Competencia     ");
            System.out.println("1. Registrar tiempos");
            System.out.println("2. Ordenar tiempos");
            System.out.println("3. Salir");
            System.out.println("\n");
            System.out.println("Ingrese la opcion");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Escribir el numero de tiempos a ingresar");
                    Num_tiempos = scan.nextInt();
                    scan.nextLine();

                    for (int i = 0; i < Num_tiempos; i++) {
                        System.out.println("Digite el tiempo del atleta numero: " + (i + 1));
                        Tiempo = scan.nextDouble();

                        Atleta objAtleta = new Atleta(Tiempo);
                        Atletas.add(objAtleta);

                    }

                    System.out.println("\n");
                    System.out.println("Tiempos registrados: " + Num_tiempos);
                    System.out.println("\n");

                    break;

                case 2:
                    if (!Atletas.isEmpty()) {
                        ordenarPorSeleccion();
                        MostrarTiempos();

                    } else {
                        System.out.println("No hay tiempos registrados");
                    }
                    break;

                case 3:
                    //salir
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opc != 3);

    }

    public static void ordenarPorSeleccion() {
        for (int i = 0; i < Atletas.size() - 1; i++) {
            Atleta menor = Atletas.get(i);
            int posMenor = i;
            for (int j = i + 1; j < Atletas.size(); j++) {
                Atleta actual = Atletas.get(j);
                if (actual.getTiempo() < menor.getTiempo()) {
                    menor = actual;
                    posMenor = j;
                }
            }
            Atleta temp = Atletas.get(i);
            Atletas.set(i, menor);
            Atletas.set(posMenor, temp);
        }
    }

    public static void MostrarTiempos() {
        System.out.println("Podio de la competencia: ");
        for (int i = 0; i < Atletas.size(); i++) {
            System.out.println("\n");
            System.out.println("Atleta " + (i + 1));
            System.out.println("Tiempo: " + Atletas.get(i).getTiempo());

        }
    }

}
