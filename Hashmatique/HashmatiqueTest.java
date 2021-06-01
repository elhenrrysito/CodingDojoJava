import java.util.HashMap;
import java.util.Set;

public class HashmatiqueTest {

    public static void main(String[] args) {

        HashMap<String, String> canciones = new HashMap<String, String>();
        canciones.put("No Long Talk","We don't need to hear about a next man");
        canciones.put("Passionfruit","Between us just like picket fences");
        canciones.put("Jorja Interlude","Tryna stay light on my toes. Just ran a light in a Rolls");
        canciones.put("Madiba Riddim","I cannot tell who is my friend. I need distance between me and them");
        canciones.put("Blem","Unruly, unruly, maddas. Who keeps bringing more? I've had too many");

        String titulo = canciones.get("Blem");
        System.out.println(titulo);
        Set<String> keys = canciones.keySet();

        System.out.println("");
        for(String key : keys) {
            System.out.println(key);
            System.out.println(canciones.get(key));
            System.out.println("");
        }
    }
    
}
