package fizzbuzz;

public class FizzBuzzTest {
    
    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();

        String fizzBuzzString = fizzbuzz.fizzBuzz(3);
        System.out.println(fizzBuzzString); // debe imprimir Fizz

        fizzBuzzString = fizzbuzz.fizzBuzz(5);
        System.out.println(fizzBuzzString); // debe imprimir Buzz

        fizzBuzzString = fizzbuzz.fizzBuzz(2);
        System.out.println(fizzBuzzString); // debe imprimir 2

    }
}
