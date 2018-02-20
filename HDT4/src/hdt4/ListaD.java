/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;
/**
 *
 * @author Fernando Figueroa
 */
public class ListaD<E> extends AbstractList<E>
{

   protected int size;
   protected NodoH<E> head;
   protected NodoH<E> tail;

   public ListaD()
   {
    size = 0;
    head = null;
    tail = null;
   }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public E get(int i) 
    {

           if(i<0 || i>size-1)
           {
               return null;
           }
           else 
           {
             NodoH<E> curNode = head;
             for (int j = 0; j<i; j++)
                 curNode = curNode.getNext();
             return curNode.getItem(); 
           }
    }

    @Override
    public E remove(int i)
    {
        if(i < 0 || i > size - 1) return null;
        E temp = null;
        if(i == 0)
        {
            temp = head.getItem();
            head = head.getNext();
            if(head != null) head.setPrev(null);
        }
        else if(i == size - 1)
        {
            temp = tail.getItem();
            tail = tail.getPrev();
            if(tail != null) tail.setNext(null);
        }
        else
        {
            NodoH<E> curNode = head;
            for(int c = 0; c < i; c++)
            {
                curNode = curNode.getNext();
            }
            temp = curNode.getPrev().getItem();
        }
        size--;
        return temp;
    }

    @Override
    public void add(int i, E o)
    {
        NodoH<E> nuevoNodo = new NodoH<E>(o, null, null);
        if(i < 0 || i > size) return;
        if(head == null)
        {
             head = nuevoNodo;
             head.setNext(tail);
             tail = head;
             tail.setNext(null);
             tail.setPrev(head);
             size = 1;
             return;
        }
        else if(i == 0)
        {
            nuevoNodo.setNext(head);
            head.setPrev(nuevoNodo);
            head = nuevoNodo;
        }
        else if(i == size)
        {
            nuevoNodo.setPrev(tail);
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
        }
        else
        {
            NodoH<E> curNodo = head;
            for(int c = 0; c < i; c++) curNodo = curNodo.getNext();
            NodoH<E> temp = curNodo.getPrev();
            temp.setNext(nuevoNodo);
            nuevoNodo.setPrev(temp);
            nuevoNodo.setNext(curNodo);
            curNodo.setPrev(nuevoNodo);
        }
        size++;
    }
}
