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
        int index = 0;

        try {
            for (int i = 0; i < myList.size(); i++) {
                int castedValue = (int) myList.get(i);
                index = i;
            }

        } catch(Exception e) {
            System.out.println("Estas casteando mal :(");
            System.out.println("Indice del error: " + index);
            System.out.println("Valor del indice: " + myList.get(index));
        
        }

        System.out.println("Continuando el codigo babyyyyy! :)");

    }
}