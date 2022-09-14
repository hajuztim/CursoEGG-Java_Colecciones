/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    // Metodos
    
    Scanner leer = new Scanner(System.in);
    private ArrayList <Pelicula> peliculas = new ArrayList();
    
    public void crearPelicula() {
        
        Pelicula pel = new Pelicula();
        
        System.out.println("Introduzca el título de la película");
        pel.setTitulo(leer.next());
        
        System.out.println("Introduzca el director de la película");
        pel.setDirector(leer.next());
        
        System.out.println("Introduzca la duración de la película en minutos");
        pel.setDuracion(leer.nextInt());
        
        String pelicula  = "Título: " + pel.getTitulo() + "\nDirector: "+pel.getDirector()+ "\nDuración: "+pel.getDuracion();
        
        peliculas.add(pel);
    }
            
    public void mostrarPeliculas() {
        
        System.out.println("Se mostrarán las películas");
        
        for (Pelicula aux : peliculas) {
            System.out.println("Título: "+aux.getTitulo()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion());
        }
        
        System.out.println("Cantidad = " + peliculas.size());
        
    }
    
    
}
