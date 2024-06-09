package poo;

import java.util.ArrayList;

public class CollecionDevice implements Iterable {

    ArrayList<SmartDevice> coleccion = new ArrayList<>();

    @Override
    public Iterator iterator() {
        return new IteradorSmartWatch(this);
    }

    @Override
    public void meterDevice(SmartDevice device) {
        coleccion.add(device);
    }
}
