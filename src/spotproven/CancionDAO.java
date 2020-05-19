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
public class CancionDAO {

    public void insertarCancion(List<Cancion> biblioteca,Cancion nueva) {
        
        Scanner sc = new Scanner(System.in);
        boolean noesta = true;
        for (int i = 0; i < biblioteca.size(); i++) {
            if (biblioteca.get(i).equalsclau(nueva.getClave())) {
                System.out.println("ERROR: La clave de la canción ya existe.");
                noesta = false;
            }
        }
        if (noesta) {
            System.out.println("La cancion no está en la biblioteca");
            System.out.print("Ingresa el interprete: ");
            nueva.setInterprete(sc.nextLine());
            System.out.print("Ingresa el autor: ");
            nueva.setAutor(sc.nextLine());
            System.out.print("Ingresa el album: ");
            nueva.setAlbum(sc.nextLine());
            System.out.print("Ingresa la duración: ");
            nueva.setDuración(sc.nextInt());
            sc.nextLine();
            biblioteca.add(nueva);
        }
    }

    public void borrarCancion(List<Cancion> biblioteca,Cancion borrada) {
        
        boolean noesta = true;
        for (int i = 0; i < biblioteca.size(); i++) {
            if(biblioteca.get(i)!=null){
            if (biblioteca.get(i).equalsclau(borrada.getClave())) {
                biblioteca.remove(i);
                System.out.println("Cancion eliminada");
                noesta = false;
            }
            }
        }
        if (noesta) {
            System.out.println("Canción no encontrada");
        }
    }

    public void listarCanciones(List<Cancion> biblioteca) {
        /*for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println(biblioteca.get(i).toString());
        }*/
        for(Cancion song:biblioteca){
            System.out.println(song.toString());
        }
        //biblioteca.forEach((final Cancion song)->System.out.println(song.toString())); funcion lambda
    }

    public List<Cancion> generarListaDinamica(List<Cancion> biblioteca) {
        List<Cancion> listad = new ArrayList();
        int[] aleatorios = new int[5];
        /*Metodos extraidos de la documentacion de java
        ints: define limite inferior y superior
        distinct: evita generar numeros repetidos
        limit: define la cantidad de numeros a generar
        toArray: para convertir Intstream a un array int*/
        aleatorios = new Random().ints(0,biblioteca.size()-1).distinct().limit(5).toArray();
        for (int i = 0; i < 5; i++) {
            listad.add(biblioteca.get(aleatorios[i]));
        }
        return listad;
    }
    
    public List<Cancion> generarBiblioteca() {
        List<Cancion> canciones = new ArrayList(){{
            add(new Cancion("ae01", "Aerosmith", "Tyler", "Crazy", 5));
            add(new Cancion("ac01", "AC/DC", "Mike", "Thunderstruck", 4));
            add(new Cancion("lp01", "Linkin Park", "Ted", "Number", 5));
            add(new Cancion("ae02", "Aerosmith", "Tyler", "Dream On", 3));
            add(new Cancion("ac02", "AC/DC", "Mike", "Back in Black", 4));
            add(new Cancion("ks01", "Kiss", "Lauren", "Revenge", 6));
            add(new Cancion("ev01", "Evanescence", "Amy", "My Inmortal", 3));
            add(new Cancion("ev02", "Evanescence", "Amy", "Bring me to Life", 4));
            add(new Cancion("ev03", "Evanescence", "Amy", "Call Me When You're Sober", 6));
            add(new Cancion("cp01", "Cold Play", "Juan", "Viva la Vida", 3));}};
        return canciones;
    }
}
