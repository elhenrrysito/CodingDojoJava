/**
 * StringManipulation
 */
public class StringManipulation {

    
    public String trimAndConcat(String palabraUno, String palabraDos) {
        String nuevaPalabra = "";
        palabraUno = palabraUno.trim();
        palabraDos = palabraDos.trim();
        nuevaPalabra = palabraUno + palabraDos;

        return nuevaPalabra;
    }
}