import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * RompeCabezasTesting
 */
public class RompeCabezasTesting {

    public static void main(String[] args) {
        RompeCabezas rompeCabezas = new RompeCabezas();

        System.out.println("--- Primer ejercicio ---");
        int[] arregloSumaYMayor = {3,5,1,2,7,9,8,13,25,32};

        System.out.println("Arreglo: " + Arrays.toString(arregloSumaYMayor));
        ArrayList<Integer> arregloMayorDiez = rompeCabezas.sumaYMayores(arregloSumaYMayor);
        System.out.println("Mayores que 10: " + arregloMayorDiez);

        System.out.println("");
        System.out.println("--- Segundo ejercicio ---");

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Nancy");
        nombres.add("Jinichi");
        nombres.add("Fujibayashi");
        nombres.add("Momochi");
        nombres.add("Ishikawa");
        nombres = rompeCabezas.masDeCinco(nombres);
        System.out.println(Arrays.toString(nombres.toArray()));

        System.out.println("");
        System.out.println("--- Tercer ejercicio ---");
        ArrayList<String> alfabeto = new ArrayList<String>();
        rompeCabezas.imprimiendoAlfabeto(alfabeto);
        

        System.out.println("");
        System.out.println("--- Cuarto ejercicio ---");
        ArrayList<Integer> arregloAleatorio = new ArrayList<Integer>();
        arregloAleatorio = rompeCabezas.generarArregloAleatorio(arregloAleatorio, 10);
        System.out.println(Arrays.toString(arregloAleatorio.toArray()));


        System.out.println("");
        System.out.println("--- Quinto ejercicio ---");
        ArrayList<Integer> arregloAleatorioDos = new ArrayList<Integer>();
        rompeCabezas.imprimirArregloAleatorio(arregloAleatorioDos);

   
        System.out.println("");
        System.out.println("--- Sexto ejercicio ---");
        String cadenaAleatoria = "";
        cadenaAleatoria = rompeCabezas.crearCadenaAleatoria(cadenaAleatoria, 5);
        System.out.println("Cadena Aleatoria: " + cadenaAleatoria);

        System.out.println("");
        System.out.println("--- Septimo ejercicio ---");
        ArrayList<String> cadenasAleatorias = new ArrayList<String>();
        cadenasAleatorias = rompeCabezas.arregloCadenasAleatorias(cadenasAleatorias, 10);
        System.out.println(Arrays.toString(cadenasAleatorias.toArray()));

    }

}