package CapaAplicacion;
import java.util.ArrayList;

/**
 * Clase encargada de los datos de la cadena y de la notificación a los observadores
 */
public class Cadena {
    private ArrayList<Observador> observadores = new ArrayList<>();
    private String cadena;

    public Cadena(){
    }
    
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
        notificarTodosObservadores();
    }

    public void agregar(Observador observador) {
        this.observadores.add(observador);
    }

    public void notificarTodosObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
}
