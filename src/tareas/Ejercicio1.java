/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareas;

/**
 *
 * @author carlo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombres = "Juan María Pedro Luis";
        int cont = 0;
        for (int i = 0; i<nombres.length(); i++) {
            if (nombres.charAt(i) == ' ') {
                cont++;
            }
        }
        System.out.println("El numero de espacios es: "+cont);
    }
    
}
