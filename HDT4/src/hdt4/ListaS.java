/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

/**
 *
 * @author Jose Arenas No. 14470
 * @author Sebastian Arriola No. 11463
 * @author Fernando Figueroa nO. 14175
 * 
 * 
 * Esta clase es una lista simplemente enlazada. Se utiliza una referencia para
 * apuntar a la cabeza de la lista para despues usando esa referencia, poder
 * ir recorriendo toda la lista en un solo sentido
 * 
 * 
 */
public class ListaS<E> extends AbstractList<E>
{
    /**
     * Referencia al primer nodo de la lista simple
     */
    protected NodoS<E> head;
    
    /**
     * 
     * Variable que guarda la cantidad que nodos existentes en la lista
     * 
     */
    protected int size;
    
    public ListaS()
    {
        head = null;
        size = 0;
    }

    @Override
    /**
     * Devuelve la cantidad de nodos que hay en la lista
     * pre: no hay precondiciones
     * post: la lisa no cambia de estado
     */
    public int size() 
    {
        return size;
    }

    @Override
    /**
     * Devuelve el elemento ubicado en la posicion i en la lista. El primer
     * elemento esta en la posicion 0.
     * pre: la lista no esta vacia y i esta en el rango [0...size-1]
     * post: la lista no cambia de estado
     */
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
    /**
     * Elimina y devuelve de la lista el elemento en la posicion i. El primer
     * elemento esta en la posicion 0.
     * pre: la lista no esta vacia y i es un valor en el rango [0...size-1]
     * post: la lista contiene un nodo menos en la posicion i indicada.
     */
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
    /**
     * Agrega un nuevo elemento a la lista en la posicion i.
     * pre: i esta en el rango [0...size]
     * post: la lista contiene un nuevo nodo en la posicion i
     */
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
