package CapaAplicacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObservadorOrdenar extends Observador{

    private List frases = new ArrayList<>();

    public ObservadorOrdenar(Cadena cadena){
        this.sujeto=cadena;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        frases.add(sujeto.getCadena());
        Collections.sort(frases);
        
        if (frases.size()== sujeto.getCadena().split(" ").length) {
            for (Object object : frases) {
                System.out.println(object);
            }
        }
    }
    
}
