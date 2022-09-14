/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotainformacion;

import java.util.Iterator;
import java.util.Scanner;
import mascotainformacion.servicios.AnimalServicio;

/**
 *
 * @author MegaTecnologia
 */
public class MascotaInformacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        AnimalServicio a = new AnimalServicio();
        
        // Crear y mostrar mascotas
        
        String respuesta;
        
        do {
            
            a.crearMascota();
        
            System.out.println("¿Quiere ingresar otra mascota? (s/n)");
            respuesta = leer.next();
            
        } while (respuesta.equals("s") );       
        
        a.mostrarMascotas();
        
        a.eliminarMascota();
        
        a.mostrarMascotas();
        
        
    }
    
}
