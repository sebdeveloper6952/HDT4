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
 * Nodo doblemente enlazado.
 */
public class NodoH<E> 
{
    /**
     * Referencia al siguiente nodo en la lista.
     */
    protected NodoH<E> next;
    /**
     * Referencia al nodo anterior en la lista.
     */
    protected NodoH<E> prev;
    /**
     * Valor que se almacena en este nodo.
     */
    protected E item;
    
    
    public NodoH(E item, NodoH<E> next, NodoH<E> prev)
    {
        this.next = next;
        this.prev = prev;
        this.item = item;
        
    }
    
    public void setItem(E item) { this.item = item; }
    public E getItem() { return item; }
    public void setNext(NodoH<E> next) { this.next = next; }
    public NodoH<E> getNext() { return next; }
    public void setPrev(NodoH<E> prev) { this.prev = prev; }
    public NodoH<E> getPrev() { return prev; }
    
    
    
}
