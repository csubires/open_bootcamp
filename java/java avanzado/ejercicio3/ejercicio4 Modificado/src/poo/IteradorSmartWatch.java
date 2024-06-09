package poo;

import java.util.NoSuchElementException;

public class IteradorSmartWatch implements  Iterator {

    CollecionDevice coleccion;

    int indice ;


    public IteradorSmartWatch(CollecionDevice coleccion) throws NoSuchElementException {
        this.coleccion = coleccion;
        this.indice = 0;
    }

    @Override
    public SmartDevice obtenerSiguiente() {
        indice++;

        if (coleccion.coleccion.size() > indice) {
            return coleccion.coleccion.get(indice);

        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean hayMas() {
        return coleccion.coleccion.size() > indice;
    }
}
