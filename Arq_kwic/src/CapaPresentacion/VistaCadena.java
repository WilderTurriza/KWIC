package CapaPresentacion;

import java.util.Scanner;

import CapaAplicacion.*;

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
