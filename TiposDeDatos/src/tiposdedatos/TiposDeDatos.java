/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedatos;

/**
 *
 * @author Rakuszky
 */
public class TiposDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de tipo primitivo
        byte entero = 12;
        int entero2 = 2123456363;
        float decimal = 4.53f;
        double decimal2= 34.1231231;
        char caracter = 's';
        boolean decision = true;
        
        System.out.println("Aquí se presenta un ejemplo de una variable de tipo byte");
        System.out.println("Número entero: " + entero);
        System.out.println("");
        System.out.println("Aquí se presenta una variable de tipo int");
        System.out.println("Número entero: " + entero2);
        System.out.println("");
        System.out.println("Aquí se presenta una variable decimal de tipo float");
        System.out.println("Número decimal : " + decimal);
        System.out.println("");
        System.out.println("Aquí se presenta una variable decimal de tipo double");
        System.out.println("Número decimal : " + decimal2);
        System.out.println("");
        System.out.println("Aquí se presenta una variable de tipo char");
        System.out.println("Caracter : " + caracter);  
        System.out.println("");
        System.out.println("Aquí se presenta una variable de tipo boolean");
        System.out.println("La desición es : " + decision);
        
        //Datos de tipo no primitivo
        Integer numero = 15;
        String palabra = "oi";
        
        System.out.println("");
        System.out.println("Aquí se presenta una variable  de tipo Integer");
        System.out.println("O número é: " + numero);
        System.out.println("");
        System.out.println("Aquí se presenta una variable  de tipo String");
        System.out.println("A palavra é: " + palabra);
    }
    
}
