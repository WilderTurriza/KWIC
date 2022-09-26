package CapaAplicacion;

import java.util.ArrayList;

public class ObservadorRotar extends Observador{

    int contador = 0;

    public ObservadorRotar(Cadena cadena){
        this.sujeto=cadena;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        ArrayList<String> palabra = new ArrayList<>();
        String cadena = "";

        for (int i = 0; i < sujeto.getCadena().split(" ").length; i++) {
            palabra.add(i, sujeto.getCadena().split(" ")[i]);
        }

        for (int i = 1; i < palabra.size(); i++) {
            cadena = cadena + palabra.get(i) + " ";
        }

        cadena = cadena + palabra.get(0);
        contador = contador +1;

        if (contador<sujeto.getCadena().split(" ").length) {
            this.sujeto.setCadena(cadena);
        }

    }
    
}
