package hdt4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public class HDT4Main 
{
    public static void main(String[] args) 
    {
        
        String path = "src/datos.txt";
        List<String> lineas = leerArchivoDeTexto(path);
        if(lineas == null)
        {
           System.out.println("No se encontro el archivo datos.txt.");
           return;
        }
        
            // TODO: aplicar patron singleton
            CalculadoraI calcu = ImplementacionCalculadora.instance;
            for(String linea : lineas)
                System.out.println("Resultado de: " + linea + " -> " + calcu.calcular(linea));
            
        try
        {
            System.in.read();
        }
        catch(IOException e) {}
    }
    
    /**
     * Devuelve una lista que contiene cada linea del archivo de texto ubicado
     * en path.
     * @param path la ubicacion del archivo de texto para leer
     * @return lista que contiene las lineas del archivo.
     */
    public static List<String> leerArchivoDeTexto(String path)
    {
        try
        {
            return Files.readAllLines(Paths.get(path), Charset.defaultCharset());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
