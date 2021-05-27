import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTesting {

    public static void main(String[] args) {
        
        BasicJava basicJava = new BasicJava();

        System.out.println("Imprimir 1 - 255");
        basicJava.imprimirDosCicuentaCinco();

        System.out.println("");
        System.out.println("--- Imprimir impares ---");
        basicJava.imprimirImpares();

        System.out.println("");
        System.out.println("--- Imprimir la Suma ---");
        basicJava.imprimirLaSuma();

        System.out.println("");
        System.out.println("--- Recorrer Arreglo ---");
        int[] arreglo = {2, 10, 55};
        basicJava.recorrerArreglo(arreglo);

        System.out.println("");
        System.out.println("--- Encontrar Maximo ---");
        int[] encontrarMaximo = {1,3,4,5,6,7};;
        basicJava.encontrarMaximo(encontrarMaximo);

        System.out.println("");
        System.out.println("--- Obtener Promedio ---");
        int[] arrayPromedio = {3, 5, 7, 8};

        ArrayList<Integer> arregloInteger = new ArrayList<Integer>();
        for(int i = 1; i < 40; i++) {
            arregloInteger.add(i);
        }

        basicJava.obtenerPromedio(arrayPromedio);
        basicJava.obtenerPromedio(arregloInteger);


        System.out.println("");
        System.out.println("--- Arreglo con numeros impares ---");
        basicJava.arregloConNumerosImpares();

        System.out.println("");
        System.out.println("--- Mayor que Y ---");
        basicJava.mayorQueY(arregloInteger, 36);

        System.out.println("");
        System.out.println("--Valores al Cuadrado--");
        int[] arregloCuadrado = {2, 4, 6, 8};
        basicJava.valoresAlCuadrado(arregloCuadrado);

        System.out.println("");
        System.out.println("--- Eliminar negativos ---");
        int[] arrNegativo = {1,-3,6,-7,8};
        arrNegativo = basicJava.eliminarNegativos(arrNegativo);
        System.out.println(Arrays.toString(arrNegativo));

        System.out.println("");
        System.out.println("--- Maximo, Minimo, Promedio ---");
        int[] arregloDos = {1,5,10,20};
        int[] arregloNuevo = basicJava.maxMinProm(arregloDos);
        System.out.println(Arrays.toString(arregloNuevo));

        System.out.println("");
        System.out.println("--- Cambiando Valores ---");
        int[] arregloNormal = {1,5,10,7,-2};
        int[] arregloCambiado = basicJava.cambiarValores(arregloNormal);
        System.out.println(Arrays.toString(arregloCambiado));
    }

    
}
