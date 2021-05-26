package fizzbuzz;

public class FizzBuzz {
    public String fizzBuzz(int numero) {

        String salida = "";

        if(numero % 3 == 0 && numero % 5 == 0) {
            salida = "FizzBuzz";
        } else if (numero % 3 == 0) {
            salida = "Fizz";
        } else if (numero % 5 == 0) {
            salida = "Buzz";
        } else {
            salida = salida.valueOf(numero);
        }

        return salida;
    }
}
