import java.util.ArrayList;
import java.util.Arrays;

/**
 * BasicJava
 */
public class BasicJava {

    // Escriba un método que imprima todos los número del 1 al 255.
    public void imprimirDosCicuentaCinco() {
        for(int i = 1; i <= 255; i++) {
            System.out.println("Número " + i);
        }
    }

    // Escriba un método que imprima todos los número impares entre el 1 al 255.
    public void imprimirImpares() {
        for(int i = 1; i <= 255; i++) {
            if(i % 2 != 0) {
                System.out.println("Número " + i);
            }
        }
    }

    // Escriba un método que imprima los números desde el 0 hasta el 255, pero esta vez muestre también las suma de los números que ha mostrado en pantalla hasta ahora.

    public void imprimirLaSuma() {
        int j = 0;
        for(int i = 0; i <= 255; i++) {
            System.out.println("Nuevo número: " + i + " Suma: " + (i + j));
            j+=i;
        }
    }

    // Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que recorra cada uno de los elementos del arreglo e imprima cada valor. Ser capaz de recorrer cada elemento de un arreglo es extremadamente importante.

    public void recorrerArreglo(int[] arreglo) {
        for(int i : arreglo) {
            System.out.println(i);
        }
    }

    // Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo. Su método debería funcionar también con todos los números en negativo (ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos, números negativos y cero.

    public void encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];

        for(var i = 0; i < arreglo.length; i++) {
            if(maximo < arreglo[i]) {
                maximo = arreglo[i];
            }
        }

        System.out.println("El máximo valor es: " + maximo);
    }

    // Escribir un método que tome un arreglo e imprima el promedio de los valores en el arreglo. Por ejemplo en un arreglo hay [2,10,3], su método debería Imprimir Promedio de 5. Nuevamente, asegúrese de crear un caso simple y escriba las instrucciones para resolver ese caso primero, luego pruebe sus instrucciones con casos más complicados.

    public void obtenerPromedio(ArrayList<Integer> arreglo) {
        int suma = 0;
        int promedio = 0;

        for(int i : arreglo) {
            suma+=i;
        }

        promedio = suma / arreglo.size();

        System.out.println("Promedio de " + promedio);
    }


    public void obtenerPromedioDouble(ArrayList<Double> arreglo) {
        double suma = 0;
        double promedio = 0;

        for(double i : arreglo) {
            suma+=i;
        }

        promedio = suma / arreglo.size();

        System.out.println("Promedio de " + promedio);
    }

    // sobrecargando el método con otros tipos de arreglo y datos

    // para arreglos fijos tipo int
    public void obtenerPromedio(int[] arr) {
        int suma = 0;
        int promedio = 0;

        for(int i : arr) {
            suma+=i;
        }

        promedio = suma / arr.length;

        System.out.println("Promedio de " + promedio);
    }


    // para arreglos tipo double
    public void obtenerPromedio(double[] arr) {
        double suma = 0;
        double promedio = 0;

        for(double i : arr) {
            suma+=i;
        }

        promedio = suma / arr.length;
        System.out.println("Promedio de " + promedio);
    }

    // Escribir un método que cree un arreglo "y" que contenga todos los números impares entre 1 - 255. Cuando el método haya terminado, "y" debe tener los valores de [1,3,5,7…255].

    public void arregloConNumerosImpares() {
        ArrayList<Integer> y = new ArrayList<Integer>();

        for(int i = 0; i <= 255; i++) {
            if(i % 2 != 0) {
                y.add(i);
            }
        }

       String arreglo = Arrays.toString(y.toArray()); // para imprimir el arreglo sin necesidad de un for 
       System.out.println(arreglo);

    }

    // Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor Y dado. Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, después de terminar el proceso el método debe Imprimir el número 2 (ya que hay 2 valores en el arreglo que son mayores que 3).

    public void mayorQueY(ArrayList<Integer> arreglo, int y) {
        int contador = 0;

        for(int i = 0; i < arreglo.size(); i++) {
            if(arreglo.get(i) > y) {
                contador++;
            }
        }

        System.out.println("Numeros mayores que " + y + ": " + contador);
    } 

    // Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que multiplique cada valor en el arreglo por sí mismo. Cuando el método haya terminado, el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].

    public void valoresAlCuadrado(int[] x) {
        for(int i = 0; i < x.length; i++) {
            x[i] *= x[i];
        }

        String arreglo = Arrays.toString(x);
        System.out.println(arreglo);
    }

    // Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace cualquier número negativo por 0. Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].

    public int[] eliminarNegativos(int[] x) {

        for(int i = 0; i < x.length; i++) {
            if(x[i] < 0) {
                x[i] = 0;
            }
        }

        return x;
    }


    // Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un arreglo con el número máximo, el número mínimo y el valor promedio que hay en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].

    public int[] maxMinProm(int[] x) {
        int maximo = x[0];
        int minimo = x[0];
        int suma = 0;
        int promedio = 0;
        int[] arrNuevo = new int[3];

        for(int i = 0; i < x.length; i++) {
            suma += x[i];
            if(maximo < x[i]) {
                maximo = x[i];
            }
            if(minimo > x[i]) {
                minimo = x[i];
            }
        }
        promedio = suma / x.length;

        arrNuevo[0] = maximo;
        arrNuevo[1] = minimo;
        arrNuevo[2] = promedio; 

        return arrNuevo;
    }

    // Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie cada valor por el valor que sigue. Por ejemplo, cuando el método haya terminado, un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. Observe que el último número es 0. El método no necesita ajustarse para los valores que están fuera de los límites.

    public int[] cambiarValores(int[] x) {
        for(int i = 0; i < x.length; i++) {
            if(i != x.length-1) {
                x[i] = x[i+1];
            } else {
                x[i] = 0;
            }
        }
        return x;
    }
}