import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GenerarErrores {

    public void errorArithmetic() throws ArithmeticException {
        int error = 1 / 0;
    }

    public void errorIndexOut() throws IndexOutOfBoundsException {
        int[] aDatos = new int[8];

        for (int i = 0; i < 9; i++) {
            aDatos[i] = i;
        }
    }

    public void errorOpenFile() throws FileNotFoundException {
        File file=new File("C:\\demo\\demofile.txt");
        FileInputStream fis=new FileInputStream(file);     //opens a connection to an actual file
    }

}



