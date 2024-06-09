public class Main {
    public static void main(String[] args) {

        String[] nombres = {"moto", "coche", "bicicleta", "patinete"};

        for (String item: nombres) {
            System.out.print(item + " ");
        }

        System.out.println(String.join(" ", nombres));

    }
}