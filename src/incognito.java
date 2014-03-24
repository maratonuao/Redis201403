import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

public class incognito {

    public static void main(String[] args) {
        try 
        {
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            String dato;
            while ((dato = lector.readLine()) != null) 
            {
                for (int i = 0; i < Integer.parseInt(dato); i++) 
                {
                    int cant = Integer.parseInt(lector.readLine());
                    HashMap att = new HashMap<String, Integer>();
                    for (int j = 1; j <= cant; j++) 
                    {
                        StringTokenizer linea = new StringTokenizer(lector.readLine());
                        String nombre = linea.nextToken();
                        String tipo = linea.nextToken();
                        if (att.containsKey(tipo)) 
                            att.put(tipo, (int) att.get(tipo) + 1);
                        else
                            att.put(tipo, 1);
                    }
                    int total = 1;
                    for (Object key : att.keySet()) 
                        total *= ((int) att.get(key.toString())+1);
                    System.out.println(total-1);
                }
            }
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
    }

}