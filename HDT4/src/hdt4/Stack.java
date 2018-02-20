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
 */
public interface Stack<E>
{
    /**
     * 
     * @param element el elemento que se quiere agregar al stack
     */
    public void push(E element);
    
    /**
     * 
     * @return regresa el ultimo elemento ingresado al stack
     */
    public E pop();
    
    /**
     * 
     * @return regresa el valor del ultimo elemento ingresado
     */
    public E peek();
    
    /**
     * 
     * @return el estado del stack, true si no hay ninguno elemento en el stack
     * y false si hay algun elemento en el stack
     */
    public boolean empty();
    
    
    /**
     * 
     * @return regresa el tamaño actual del stack. En otras palabras, el numero
     * de elementos dentro del stack
     */
    public int size();
}