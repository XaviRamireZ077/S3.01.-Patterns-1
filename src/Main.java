import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner entrada;
    private static UndoSingleton undo;

    public static void main(String[] args) {

        entrada = new Scanner(System.in);

        undo = UndoSingleton.getInstance();//instanciamos objeto de la clase undo
        int opcio;

        do {

            System.out.println(" =======================================");
            System.out.println("|       1. Afegir una paraula          |");
            System.out.println("|       2. Borrar les paraules         |");
            System.out.println("|       3. Mostrar les paraules        |");
            System.out.println(" =======================================");
            System.out.println("");
            System.out.print("Quina opcio vols triar: ");

            opcio = entrada.nextInt();
            entrada.nextLine();

            switch (opcio) {

                case 1:
                    String paraula;
                    paraula = entrada.nextLine();
                    // Llamamos al objeto de la clase y le pasamos por parametro la palabra recogida por consola
                    undo.addToArray(paraula);
                    System.out.println("La paraula escrita ha estat afegida a la llista");
                    System.out.println(" ");
                    break;

                case 2:
                    int indexBorrar;
                    indexBorrar = entrada.nextInt();
                    mostrarStrings();
                    undo.removeToarray(indexBorrar);
                    System.out.println(" ");

                    break;

                case 3:

                    mostrarStrings();

                    break;

                default:
                    System.out.println("Debe escoger una opcion valida");


            }
        } while (opcio != 0);


        //Crear metodo mostrar e incializarlo dentro de case 2 y case 3
    }

    public static void mostrarStrings() {
        undo.getArray();
        List<String> paraules = undo.getArray();

        for (int i = 0; i < paraules.size(); i++) {
            System.out.println(i + 1 + " " + paraules.get(i));


        }

    }
}










