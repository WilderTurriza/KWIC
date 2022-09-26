/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaPresentacion;

import java.util.Scanner;

import CapaAplicacion.Cadena;
import CapaAplicacion.ObservadorOrdenar;
import CapaAplicacion.ObservadorRotar;

/**
 * Clase encargada de pedir los datos al usuario e iniciar los observadores
 */
public class VistaCadena {
    

    public void iniciar() {
        Cadena sujeto = new Cadena();
        new ObservadorOrdenar(sujeto);
        new ObservadorRotar(sujeto);
        
        sujeto.setCadena(obtenerCadena());
    }

    public String obtenerCadena(){
        Scanner teclado = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingresa una frase: ");
        frase = teclado.nextLine();
        
        teclado.close();

        System.out.println("\nSalida:");
        return frase;
    }
    
}
