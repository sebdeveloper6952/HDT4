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
 * Stack que utiliza una lista (simple, doble, o circular) para implementar sus
 * operaciones.
 */
public class StackLista<E> implements Stack<E>
{
    protected ListsI<E> lista;
    
    public StackLista(ListsI lista)
    {
        this.lista = lista;
    }

    @Override
    public void push(E element) 
    {
        lista.addLast(element);
    }

    @Override
    public E pop() 
    {
        return lista.removeLast();
    }

    @Override
    public E peek() 
    {
        return lista.getLast();
    }

    @Override
    public boolean empty() 
    {
        return lista.isEmpty();
    }

    @Override
    public int size() 
    {
        return lista.size();
    }
}
