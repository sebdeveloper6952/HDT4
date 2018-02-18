/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author sevic69
 */
public class HDT4Main 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
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
