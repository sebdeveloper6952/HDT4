/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 * Stack implementado con ArrayList.
 */
public class StackArrayList<E> implements Stack<E>
{
    protected ArrayList<E> list;
    
    public StackArrayList()
    {
        list = new ArrayList();
    }

    @Override
    public void push(E element) 
    {
        list.add(element);
    }

    @Override
    public E pop() 
    {
        return list.remove(list.size()-1);
    }

    @Override
    public E peek() 
    {
        return list.get(list.size()-1);
    }

    @Override
    public boolean empty() 
    {
        return list.isEmpty();
    }

    @Override
    public int size() 
    {
        return list.size();
    }
}
