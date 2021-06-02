import java.util.ArrayList;

/**
 * ListaExcepciones
 */
public class ListaExcepciones {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        for (int i = 0; i < myList.size(); i++) {
            try {
                int castearInteger = (Integer) myList.get(i);

            } catch (Exception e) {
                System.out.println("Estas casteando mal :(");
                System.out.println(e);
                System.out.println("Indice del error: " + i);
                System.out.println("Valor del indice: " + myList.get(i));

            }
        }

        System.out.println("Continuando el codigo babyyyyy! :)");

    }
}