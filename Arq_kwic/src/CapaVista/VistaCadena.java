/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaVista;

import java.util.Scanner;

import CapaOperacion.ControladorCadena;


public class VistaCadena {
    
    ControladorCadena controlador = new ControladorCadena();

    public void iniciar() {
        String cadena=obtenerCadena();
        mostrarFrases(controlador.generarFrases(cadena));
    }

    public String obtenerCadena(){
        Scanner teclado = new Scanner(System.in);
        String frase;
        
        mostrarEnPantalla("Ingresa una frase: ");
        frase = teclado.nextLine();
        
        teclado.close();
        return frase;
    }
    
    public void mostrarFrases(String[] frases){
        mostrarEnPantalla("Salidas: ");
        for(int i = 0; i < frases.length; i++){
            mostrarEnPantalla("["+(i+1)+"] "+frases[i]);
         }
    }

    public void mostrarEnPantalla(String aviso){
        System.out.println(aviso);
    }
}
