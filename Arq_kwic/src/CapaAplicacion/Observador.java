package CapaAplicacion;

/**
 * Clase abstracta que heredan todos los observadores
 */
public abstract class Observador {
    protected Cadena sujeto; // protected: solo las subclases o clases del mismo paquete pueden llamar a este atributo.
    public abstract void actualizar();
}
