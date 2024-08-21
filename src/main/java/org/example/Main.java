package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado= new Scanner(System.in);

        int elegirOpcion;

        System.out.println("1. Ingresar producto ");
        System.out.println("2. Buscar todos ");
        System.out.println("3. Buscar por nombre ");
        System.out.println("4. Modificar calificacion ");
        System.out.println("0. para salir ");

        ArrayList<HashMap<String, Object>> peliculas = new ArrayList<>();

        do {
            HashMap<String, Object> pelicula = new HashMap<>();
            System.out.println("Digite una opcion");
            elegirOpcion=leerTeclado.nextInt();
            leerTeclado.nextLine();

            if (elegirOpcion==1) {
                System.out.println("Ingresa el nombre de la pelicula: ");
                String nombrePelicula = leerTeclado.nextLine();
                System.out.println("Ingresa la duracion de la pelicula en horas: ");
                int duracionPelicula = leerTeclado.nextInt();
                System.out.println("Ingresa la clafificacion de la pelicula: ");
                leerTeclado.nextLine();
                String clasificacionPelicula = leerTeclado.nextLine();
                System.out.println("Ingresa la sinopsis de la pelicula ");
                String sinopsisPelicula = leerTeclado.nextLine();
                System.out.println("Esta es la fecha de estreno de la pelicula ");
                LocalDate fechaEstrenoPelicula=LocalDate.of(2024,12,24);
                System.out.println(fechaEstrenoPelicula);

                int idPelicula = new Random().nextInt(200);

                pelicula.put("nombre", nombrePelicula);
                pelicula.put("duracion", duracionPelicula);
                pelicula.put("clasificacion", clasificacionPelicula);
                pelicula.put("sinopsis", sinopsisPelicula);
                pelicula.put("id", idPelicula);

                peliculas.add(pelicula);

            }else if (elegirOpcion==2) {
                System.out.println("Buscando todos");
                for (HashMap<String, Object> peliculaAuxiliar: peliculas){
                    System.out.println(peliculaAuxiliar);
                }
            } else if (elegirOpcion==3) {
                System.out.println("Buscando pelicula");
                System.out.println("Digita el nombre de la pelicula a buscar");
                String nombrePeliculaABuscar= leerTeclado.nextLine();

                for (HashMap<String, Object> peliculaAuxiliar:peliculas){
                    if (nombrePeliculaABuscar.equals(peliculaAuxiliar.get("nombre"))){
                        System.out.println("Pelicula encontrada");
                        System.out.println(peliculaAuxiliar);
                    }
                }
            } else if (elegirOpcion==4) {
                System.out.println("Modificando clasificacion, Digite la nueva clasificacion:");
                String nuevaClasificacion=leerTeclado.nextLine();
                System.out.println("Clasificacion guardada");
            } else if (elegirOpcion==0){
                System.out.println("Cerrando....");
            } else {
                System.out.println("Opcion invalida");
            }

        } while (elegirOpcion!=0);

    }
}