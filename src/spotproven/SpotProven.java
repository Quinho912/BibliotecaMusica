/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotproven;

import java.util.*;

/**
 *
 * @author marcomorando
 */
public class SpotProven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CancionDAO utils = new CancionDAO();
        List<Cancion> biblioteca = new ArrayList();
        Cancion usada;

        int opcion;
        do {
            System.out.println("\n================================== BIBLIOTECA DE MUSICA ==================================");
            System.out.println("");
            System.out.println("1. Insertar Canción");
            System.out.println("2. Borrar Canción");
            System.out.println("3. Listar Canciones");
            System.out.println("4. Generar Lista de canciones dinámica para reproducir");
            System.out.println("5. Generar biblioteca");
            System.out.println("6. Salir\n");
            System.out.print("Elige una opcion del menu: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("--------------- Insertar Canción ---------------");
                    System.out.print("Ingresa la clave de la cancion que quieres ingresar: ");
                    usada = new Cancion(sc.nextLine());
                    utils.insertarCancion(biblioteca,usada);
                    break;
                case 2:
                    System.out.println("--------------- Borrar Canción ---------------");
                    utils.listarCanciones(biblioteca);
                    System.out.print("Indica la clave de la cancion a eliminar: ");
                    usada = new Cancion(sc.nextLine());
                    utils.borrarCancion(biblioteca,usada);
                    break;
                case 3:
                    System.out.println("--------------- Listar Canciones ---------------");
                    utils.listarCanciones(biblioteca);
                    break;
                case 4:
                    System.out.println("--------------- Lista dinámica para reproducir ---------------");
                    utils.listarCanciones(utils.generarListaDinamica(biblioteca));
                    break;
                case 5:
                    System.out.println("--------------- Generar biblioteca ---------------");
                    biblioteca.addAll(utils.generarBiblioteca());
                    utils.listarCanciones(biblioteca);
                    break;
                case 6:
                    System.out.println("Has salido.");
                    break;
                default:
                    System.out.println("Esa no es una opcion del menu");
                    break;
            }
        } while (opcion != 6);
    }
}