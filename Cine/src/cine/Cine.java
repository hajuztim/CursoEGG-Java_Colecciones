/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import cine.entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Crear película
         
        Pelicula a = new Pelicula();
        String respuesta;
        
        do {
            
            a.crearPelicula();
            
            System.out.println("¿Desea ingresar otra película?");
            respuesta = leer.next();
            
        } while (respuesta.equals("s"));
        
        // Mostrar películas
        
        a.mostrarPeliculas();
        
        
    
        
        
        
        
        
        
        
        
        
    }
    
}
