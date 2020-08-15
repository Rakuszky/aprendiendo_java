/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_salida_de_datos;

/**
 *
 * @author leona
 */
import java.util.Scanner;

public class Entrada_Salida_de_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero_entero;
        float numero_real;
        String cadena;
        char letra;
        
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.println("Digite un número entero: ");
        numero_entero = entrada.nextInt();
        System.out.println("Digite un número real: ");
        numero_real = entrada.nextFloat();
        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0);

        
        System.out.println("");
        System.out.println("La cadena es: " + cadena);
        System.out.println("El número entero es: " + numero_entero);
        System.out.println("El número real es: " + numero_real);        
        System.out.println("La letra es: "+ letra);
    }
    
}
