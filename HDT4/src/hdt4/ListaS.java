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
public class ListaS<E> extends AbstractList<E>
{
    protected NodoS<E> head;
    protected int size;
    
    public ListaS()
    {
        head = null;
        size = 0;
    }

    @Override
    public int size() 
    {
        return size;
    }

    @Override
    public E get(int i) 
    {
        if(i < 0 || i > size -1)
        {
            return null;
        }
        else
        {
            NodoS<E> curNode = head;
            for(int c = 0; c < i; c++)
            {
                curNode = curNode.getNext();
            }
            return curNode.getItem();
        }
    }

    @Override
    public E remove(int i) 
    {
        if(i < 0 || i > size -1)
        {
            return null;
        }
        
        else
        {            
            E temp = null;
            NodoS<E> curNode = head;
            if(size == 1)
            {
                temp = head.getItem();
                head = null;
                size = 0;
            }
            
            else
            {
                for(int c = 0; c < i-1; c++)
                {
                    curNode = curNode.getNext();
                }
            
                temp = curNode.getNext().getItem();
                curNode.setNext(curNode.getNext().getNext());
                size--;
                
            }
            
            return temp;
        }
    }

    @Override
    public void add(int i, E o) 
    {
        if(i < 0 || i > size)
        {
            return;
        }
        else
        {
            if(head == null)
            {
                head = new NodoS<E>(o, null);
            }
            NodoS<E> curNode = head;
            for(int c = 0; c < i-1; c++)
            {
                curNode = curNode.getNext();
            }
            NodoS<E> nuevoNodo = new NodoS(o, curNode.getNext());
            curNode.setNext(nuevoNodo);
        }
        size++;
    }
}
