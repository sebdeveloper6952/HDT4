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
 * Clase abstracta de la cual todas las listas derivan. Los metodos para agregar
 * se basan en add(int i, E e) y los metodos para remover se basan en
 * remove(int i).
 */
public abstract class AbstractList<E> implements ListsI<E>
{
    public AbstractList()
    {
        // post: does nothing
    }
    
    /**
     * post: devuelve true si la lista esta vacia.
     * @return 
     */
    public boolean isEmpty()
    {
        return size() == 0;
    }
    
    /**
     * pre: no hay precondiciones
     * post: se agrega el nuevo elemento al inicio de la lista.
     * @param value El nuevo elemento a agregar.
     */
    public void addFirst(E value)
    {
        add(0,value);
    }
    
    /**
     * pre: no hay precondiciones
     * post: se agrega el nuevo elemento al final de la lista.
     * @param value El nuevo elemento a agregar.
     */
    public void addLast(E value)
    {
        add(size(),value);
    }
    /**
     * pre: la lista no esta vacia.
     * post: devuelve el primer elemento en la lista.
     * @return El primer elemento de la lista.
     */
    public E getFirst()
    {
        return get(0);
    }
    
    
    /**
     * pre: la lista no esta vacia.
     * post: devuelve el ultimo elemento en la lista.
     * @return El ultimo elemento de la lista.
     */
    public E getLast()
    {
        return get(size()-1);
    }
    
    /**
     * pre: la lista no esta vacia.
     * post: remueve el primer elemento de la lista
     * @return El primer elemento de la lista.
     */
    public E removeFirst()
    {
        return remove(0);
    }
    
    /**
     * pre: la lista no esta vacia
     * post: devuelve el ultimo elemento de la lista.
     * @return El ultimo elemento de la lista.
     */
    public E removeLast()
    {
        return remove(size()-1);
    }
    
    /**
     * pre: no hay precondiciones
     * post: se agrega el nuevo elemento al final de la lista.
     * @param value El nuevo elemento a agregar.
     */
    public void add(E value)
    {
        addLast(value);
    }
    
    /**
     * pre: la lista tiene al menos un elemento.
     * post: remueve y devuelve el ultimo elemento de la lista.
     * @return El ultimo elemento de la lista.
     */
    public E remove()
    {
        return removeLast();
    }
    
    /**
     * pre: la lista tiene al menos un elemento.
     * post: devuelve el ultimo elemento de la lista.
     * @return 
     */
    public E get()
    {
        return getLast();
    }
}

