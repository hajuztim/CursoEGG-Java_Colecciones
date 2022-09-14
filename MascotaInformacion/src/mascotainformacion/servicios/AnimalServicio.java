/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotainformacion.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import mascotainformacion.entidades.Animal;


/**
 *
 * @author MegaTecnologia
 */
public class AnimalServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    private ArrayList<Animal> mascotas; 

    
    public AnimalServicio() {
       this.mascotas = new ArrayList();
    }
    
    public void crearMascota() {
        
        Animal raz = new Animal();
        
        System.out.println("Introduzca la raza");
        raz.setRaza(leer.next());
        
        String mascota = "Raza: "+ raz.getRaza();
        
        mascotas.add(raz);
    }
   
    public void mostrarMascotas() {
        
        System.out.println("Las mascotas actuales de la lista son: ");
        
        for (Animal aux : mascotas) {
            System.out.println(aux.getRaza());
        }
        
        System.out.println("cantidad = " + mascotas.size());
        
        
    }
   
    public void eliminarMascota() {
        
        boolean p= true;
        System.out.println("Diga que raza desea eliminar");
        String perro = leer.next();
        Iterator<Animal> it= mascotas.iterator();
        
        while (it.hasNext()) {
            Animal var = it.next();
            if (var.getRaza().equals(perro)) {
                it.remove();
                System.out.println(" Se elimina la raza "+perro);
            }
        }
        if(p==false){
            System.out.println("No se encontró");
        }
        
    }
    
}
