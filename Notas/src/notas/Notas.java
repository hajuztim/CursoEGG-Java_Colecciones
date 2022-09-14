/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.ArrayList;
import java.util.Scanner;
import notas.notasentidades.Alumno;

/**
 *
 * @author MegaTecnologia
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> alumnes = new ArrayList();
        
        String salir = "";
        while (!salir.equalsIgnoreCase("n")) {
            Alumno A1 = new Alumno();
            System.out.println("Ingrese un nombre: ");
            A1.setNombre(leer.next());
            
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese un nota: "+(i+1));
                notas.add(leer.nextInt());
            }
            
            A1.setNotas(notas);
            
            System.out.println("¿Desea crear otro alumno? (s/n)");
            salir = leer.next();
            alumnes.add(A1);
            
        }
        
        double sumNot = 0;
        
        do {
            System.out.println("Ingrese el nombre del alumno que desea buscar: ");
            String alum = leer.next();
            for (Alumno aux: alumnes) {
                
                if (aux.getNombre().equals(alum)) {
                    
                    for (int i = 0; i < 3; i++) {
                        sumNot = aux.getNotas().get(i);
                    }
                    System.out.println("El promedio del alumno " + aux.getNombre() + " es: " + (sumNot / 3));
                    
                }
                
                System.out.println("Desea ver otro promedio (s/n)"); 
                
            }
            
        } while (leer.next().equalsIgnoreCase("s"));
        
    }
    
}
