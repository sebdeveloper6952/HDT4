package hdt4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("Ingrese opcion: ");
        System.out.println("0 -> StackArrayList");
        System.out.println("1 -> StackVector");
        System.out.println("2 -> StackListaSimple");
        System.out.println("3 -> StackListaDoble");
        System.out.println("4 -> StackListaCircular");
        try
        {
            Scanner s = new Scanner(System.in);
            int opcion = s.nextInt();
            ImplementacionCalculadora.getInstance(opcion);
            
        }
        catch(Exception e){ System.out.println(e.getMessage()); }
        
        
        String path = "src/datos.txt";
        List<String> lineas = leerArchivoDeTexto(path);
        if(lineas == null)
        {
           System.out.println("No se encontro el archivo datos.txt.");
           return;
        }
        
            // TODO: aplicar patron singleton
            for(String linea : lineas)
                System.out.println("Resultado de: " + linea + " -> " + 
                        ImplementacionCalculadora.instance.calcular(linea));
            
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
