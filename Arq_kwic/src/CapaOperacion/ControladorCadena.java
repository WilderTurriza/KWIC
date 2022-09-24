/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaOperacion;

import java.util.ArrayList;
import java.util.Arrays;


public class ControladorCadena {
    
    //Métodos
    public String[] generarFrases(String frase){
        String[] palabras = separar(frase);
        String[] frases;
        frases = new String[palabras.length];
        
        int control = 0;

        do {
            String cadena = "";
            for (int i = 0; i < palabras.length; i++) {
                cadena = cadena + palabras[i] + " ";
            }

            frases[control] = cadena;

            rotar(palabras);
            control = control + 1;
        } while (palabras.length > control);
        
         Arrays.sort(frases, String.CASE_INSENSITIVE_ORDER);
         return frases;
    }
    
    public String[] separar(String frase) {
        ArrayList palabra = new ArrayList();
        
        for (int i = 0; i < frase.split(" ").length; i++) {
            palabra.add(i, frase.split(" ")[i]);
        }

        String[] palabras = new String[palabra.size()];
        for (int i = 0; i < palabra.size(); i++) {
            palabras[i] = (String) palabra.get(i);
        }
        
        return palabras;
    }
    
    public String[] rotar(String[] palabras){
        String primero = palabras[0];
        int i;

        for (i = 0; i < palabras.length - 1; i++) {
            palabras[i] = palabras[i + 1];
        }

        palabras[i] = primero;

        return palabras;
    }
}
