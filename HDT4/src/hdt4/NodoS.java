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
public class NodoS<E>
{
    protected NodoS<E> next;
    protected E item;
    
    public NodoS(E item, NodoS<E> next)
    {
        this.item = item;
        this.next = next;
    }
    
    public void setItem(E item) { this.item = item; }
    public E getItem() { return item; }
    public void setNext(NodoS<E> next) { this.next = next; }
    public NodoS<E> getNext() { return next; }
}
