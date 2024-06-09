import poo.SmartDevice;

public class Main {
    public static void main(String[] args) {

        SmartDevice smardecive = new SmartDevice();
        SmartDevice.SmartPhone smartdecive = new SmartDevice.SmartPhone("v1.0", false, 1920, 1080, true, 1023, 234, "Iphone", "X");
        SmartDevice.SmartWatch smartwatch = new SmartDevice.SmartWatch(true, 1920, 1080, true, 1023, 234, "Iphone", "X");


        System.out.println(smardecive);
        System.out.println(smartdecive);
        System.out.println(smartwatch);
    }
}