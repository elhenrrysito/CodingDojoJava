package teoremapitagoras;

/**
 * Compilador
 */
public class Compilador {

    public static void main(String[] args) {
        Pitagoras pitagoras = new Pitagoras();

        double resultado = pitagoras.calcularHipotenusa(5.6, 7.8);

        System.out.println(resultado);
    }
}