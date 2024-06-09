import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        GenerarErrores error = new GenerarErrores();

        try {
            error.errorArithmetic();
        } catch (ArithmeticException e) {
            System.out.println("ERROR ArithmeticException -> " + e.getMessage());
        }

        try {
            error.errorIndexOut();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR IndexOutOfBoundsException -> " + e.getMessage());
        }

        try {
            error.errorOpenFile();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR FileNotFoundException -> " + e.getMessage());
        }




    }
}