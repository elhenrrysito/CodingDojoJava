import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class RompeCabezas {

    // 1. Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir la suma de todos los números en el arreglo. El método también debe retornar un arreglo que incluya solo los números que son mayores a 10 (Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los valores de 13,25,32).

    public ArrayList<Integer> mayoresADiez(int[] arr) {
        ArrayList<Integer> nuevoArreglo = new ArrayList<Integer>();

            for(int i : arr) {
                if(i > 10) {
                    nuevoArreglo.add(i);
                }
            }
        return nuevoArreglo;
    } 

    public int sumaArray(int[] arr) {
        int suma = 0;

        for(int i : arr) {
            suma+=i;
        }

        return suma;
    }
    
    public ArrayList<Integer> sumaYMayores(int[] arr) {
        int sumaArreglo = this.sumaArray(arr);
        ArrayList<Integer> arrMayorDiez = this.mayoresADiez(arr);

        System.out.println("La suma del arreglo es: " + sumaArreglo);

        return arrMayorDiez;
    }

    // 2. Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona. Haga que el método también devuelva un arreglo con los nombres que tienes más de 5 caracteres.


    public ArrayList<String> mezclarArreglo(ArrayList<String> arreglo) {
        Collections.shuffle(arreglo);
        return arreglo;
    }

    public void imprimirNombres(ArrayList<String> arreglo) {
        for(String nombre : arreglo) {
            System.out.println("Nombre: " + nombre);
        } 

    }

    public ArrayList<String> masDeCinco(ArrayList<String> arreglo) {
        ArrayList<String> nuevoArrNombres = new ArrayList<String>();
        this.mezclarArreglo(arreglo);
        this.imprimirNombres(arreglo); // imprime los valores del array

        for(String nombre : arreglo) {
            if(nombre.length() > 5) {
                nuevoArrNombres.add(nombre);
            }

        }

        return nuevoArrNombres;
    }

    // 3. Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. También debe imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal, haga que muestre un mensaje

    public ArrayList<String> crearAlfabeto(ArrayList<String> arreglo) {
        char letras;
        for(letras = 'a'; letras <= 'z'; ++letras) {
            arreglo.add(String.valueOf(letras));
        }

        return arreglo;
    }

    public void imprimiendoAlfabeto(ArrayList<String> arreglo) {
        arreglo = this.crearAlfabeto(arreglo);
        arreglo = this.mezclarArreglo(arreglo);

        // imprimiendo primera letra
        System.out.println("Última letra: " + arreglo.get(arreglo.size()-1));
        // imprimiendo ultima
        System.out.println("Primera letra: " + arreglo.get(0));

        // Este switch case es un poquto largo, pero con esto buscaba aprenderme la sintáxis :)
        switch(arreglo.get(0)) {
            case "a":
                System.out.println("La primera es una vocal! 'a' :)");
                break;
            
            case "e":
                System.out.println("La primera es una vocal! 'e' :)");
                break;

            case "i":
                System.out.println("La primera es una vocal! 'i' :)");
                break;

            case "o":
                System.out.println("La primera es una vocal! 'o' :)");
                break;

            case "u":
                System.out.println("La primera es una vocal! 'u' :)");
                break;
        }

    }

        // Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
    public ArrayList<Integer> generarArregloAleatorio(ArrayList<Integer> arreglo, int tamanioArreglo) {
        Random random = new Random();
        int numeroAleatorio = 0;

        for(int i = 0; i < tamanioArreglo; i++) {
            numeroAleatorio = random.nextInt(100);
            if(numeroAleatorio > 55) {
                arreglo.add(numeroAleatorio);
            } else {
                i--;
            }
        }
        return arreglo;
    }

    // 5.

    public ArrayList<Integer> ordenarArreglo(ArrayList<Integer> arreglo) {
        Collections.sort(arreglo);
        return arreglo;
    }

    public int encontrarMinimo(ArrayList<Integer> arreglo) {
        int minimo = arreglo.get(0);
        for(int i : arreglo) {
            if (minimo > i) {
                minimo = i;
            }
        }

        return minimo;
    }

    public int encontrarMaximo(ArrayList<Integer> arreglo) {
        int maximo = arreglo.get(0);
        for(int i : arreglo) {
            if (maximo < i) {
                maximo = i;
            }
        }

        return maximo;
    }

    public void imprimirArregloAleatorio(ArrayList<Integer> arreglo) {
        arreglo = this.generarArregloAleatorio(arreglo, 10);
        arreglo = this.ordenarArreglo(arreglo);
        int minimo = this.encontrarMinimo(arreglo);
        int maximo = this.encontrarMaximo(arreglo);
        System.out.println(Arrays.toString(arreglo.toArray()));
        System.out.println("Valor minimo arreglo: " + minimo);
        System.out.println("Valor maximo arreglo: " + maximo);
    }

    // Crear una cadena aleatoria con 5 caracteres de longitud.

    public String crearCadenaAleatoria(String cadena, int tamanoCadena) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 0; i < tamanoCadena; i++) {
            // generando índices aleatorio con el tamaño del alfabeto
            int indice = random.nextInt(alfabeto.length());
            // tomando una letra aleatoria del alfabeto
            char charAleatorio = alfabeto.charAt(indice);
            // agregando letra aleatoria al String Builder
            sb.append(charAleatorio);
        }

        // finalmente asignadole la cadena aleatoria
        cadena = sb.toString();
        return cadena;
    }

    public ArrayList<String> arregloCadenasAleatorias(ArrayList<String> arreglo, int tamanoArreglo) {
        String cadenaAleatoria = "";

        for(int i = 0; i < tamanoArreglo; i++) {
            cadenaAleatoria = this.crearCadenaAleatoria(cadenaAleatoria, 5);

            arreglo.add(cadenaAleatoria);
        }

        return arreglo;
    }



    
}
