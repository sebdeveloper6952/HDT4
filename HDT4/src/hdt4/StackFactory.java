/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 * 
 * Fabrica de stacks, para seguir el patron de diseño Factory. Crea y devuelve
 * un stack dependiendo de la opcion que se le proporcione.
 */
public class StackFactory
{
    /**
     * Crea y devuelve una clase que implemente la interfaz Stack.
     * @param opcion Determina el tipo de stack que se crea y devuelve.
     * @return El nuevo stack.
     */
    public static Stack createStack(int opcion)
    {
        Stack s = null;
        switch(opcion)
        {
            case 0:
                s = new StackArrayList();
                break;
            case 1:
                s = new StackVector();
                break;
            case 2:
                s = new StackLista(new ListaS<>());
                break;
            case 3:
                
                break;
            case 4:
                s = new StackLista(new ListaC());
                break;
            default:
                break;
        }
        return s;
    }
}
