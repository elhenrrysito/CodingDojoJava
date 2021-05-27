/**
 * StringManipulationTesting
 */
public class StringManipulationTesting {

    public static void main(String[] args) {

        StringManipulation manipulation = new StringManipulation();
        
        String str = manipulation.trimAndConcat("    Hola     ","     Mundo    ");

        System.out.println(str);
    }
}