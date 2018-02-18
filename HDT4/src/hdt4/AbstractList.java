/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

/**
 *
 * @author Jose Arenas
 */
public abstract class AbstractList<E> implements ListsI<E>
{
    public AbstractList()

    {
        // post: does nothing
    }
    public boolean isEmpty()
    // post: returns true iff list has no elements
    {
        return size() == 0;
    }
    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        add(0,value);
    }
    public void addLast(E value)
    // post: value is added to end of list
    {
        add(size(),value);
    }
    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return get(0);
    }
    public E getLast()
    // pre: list is not empty
    // post: returns last value in list
    {
        return get(size()-1);
    }
    public E removeFirst()
    // pre: list is not empty
    // post: removes first value from list
    {
        return remove(0);
    }
    public E removeLast()
    // pre: list is not empty
    // post: removes last value from list
    {
        return remove(size()-1);
    }
    public void add(E value)
    // post: value is added to tail of list
    {
        addLast(value);
    }
    public E remove()
    // pre: list has at least one element
    // post: removes last value found in list
    {
        return removeLast();
    }
    public E get()
    // pre: list has at least one element
    // post: returns last value found in list
    {
        return getLast();
    }
}

