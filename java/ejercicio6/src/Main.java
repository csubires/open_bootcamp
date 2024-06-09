import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {



    public static void main(String[] args) {


        System.out.println(reverse("Hola mundo!!!"));


        String[] arrayStr = {"uno", "dos", "tres"};

        for (String item : arrayStr) {
            System.out.println(item);
        }
        Integer[][] arrayInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.println("Posición:" + i + " " + j + ", Valor: " + arrayInt[i][j]);
            }
        }

        Vector<Integer> vectorInt = new Vector<Integer>(5);
        vectorInt.add(1);
        vectorInt.add(2);
        vectorInt.add(3);
        vectorInt.add(4);
        vectorInt.add(5);

        vectorInt.remove(2);
        vectorInt.remove(3);

        System.out.println(vectorInt);

        ArrayList<String> arrayLst = new ArrayList<>(4);
        arrayLst.add("1");
        arrayLst.add("2");
        arrayLst.add("3");
        arrayLst.add("4");
        arrayLst.add("5");

        for (String item : arrayLst) {
            System.out.println(item);
        }

        LinkedList<String> linkedLst = new LinkedList<>(arrayLst);
        for (String item : linkedLst) {
            System.out.println(item);
        }

        ArrayList<Integer> arrayListInt = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            arrayListInt.add(i);
        }

        for (int item : arrayListInt) {
            System.out.println(item);
        }

        for (int i = 0; i < arrayListInt.size(); i++) {
            if (i % 2 == 0) {
                arrayListInt.remove(i);
            }
        }

        for (int item : arrayListInt) {
            System.out.println(item);
        }


        try {
            dividePorCero();
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        clonar("algo.txt", "copia.txt");

        /* Que el vector tendría que estar constantemente incrementando su tamaño y consumiendo recursos del sistema */


    }
    private static void dividePorCero() throws ArithmeticException{
        try {
            int result = 1234 / 0;
        } catch (Exception e) {
            System.out.println("Error dentro");
        }
    }

    private static void clonar (String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Error al clonar");
        }
    }

    public static String reverse(String texto) {
        String resultado = "";
        for (int i = texto.length()-1; i > -1; i--) {
            resultado += texto.charAt(i);
        }
        return  resultado;
    }

}