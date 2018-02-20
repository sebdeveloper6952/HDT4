package hdt4;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 * 
 * Esta clase es una lista enlazada circularmente. Se guarda una referencia al
 * ultimo nodo de la lista, lo cual permite insercion rapida en ambos extremos
 * de la lista.
 */
public class ListaC<E> extends AbstractList<E>
{
    /**
     * Referencia al ultimo nodo de la lista.
     */
    protected NodoS<E> tail;
    /**
     * Guarda la cantidad de nodos en la lista.
     */
    protected int size;
    
    public ListaC()
    {
        tail = null;
        size = 0;
    }
    
    @Override
    /**
     * Devuelve la cantidad de nodos en esta lista.
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
        if(i < 0 || i > size - 1) return null;
        else
        {
            NodoS<E> curNode = tail.getNext();
            for(int c = 0; c < i; c++) curNode = curNode.getNext();
            return curNode.getItem();
        }
    }

    @Override
    /**
     * Elimina y devuelve de la lista el elemento en la posicion i. El primer
     * elemento esta en la posicion 0.
     * pre: la lista no esta vacia y i es un valor en el rango [0...size-1]
     */
    public E remove(int i)
    {
       if(i < 0 || i > size - 1) return null;
       E temp = null;
       if(size == 1)
       {
           temp = tail.getItem();
           tail = null;
           size = 0;
       }
       else
       {
           if(i == 0) return tail.getNext().getItem();
           NodoS<E> curNode = tail.getNext();
           for(int c = 0; c < i - 1; c++) curNode = curNode.getNext();
           temp = curNode.getNext().getItem();
           curNode.setNext(curNode.getNext().getNext());
           size--;
       }
       return temp;
    }

    @Override
    /**
     * Agrega un nuevo elemento a la lista en la posicion i.
     * pre: i esta en el rango [0...size]
     * post: la lista contiene un nuevo nodo en la posicion i
     */
    public void add(int i, E o) 
    {
        if(i < 0 || i > size) return;
        NodoS<E> nuevoNodo = new NodoS(o, null);
        if(tail == null)
        {
            tail = nuevoNodo;
            tail.setNext(tail);
            size = 1;
        }
        else
        {
            if(i == size)
            {
                nuevoNodo.setNext(tail.getNext());
                tail.setNext(nuevoNodo);
                tail = nuevoNodo;
            }
            else
            {
                NodoS<E> curNode = tail.getNext();
                for(int c = 0; c < i - 1; c++) curNode = curNode.getNext();
                NodoS<E> temp = curNode.getNext();
                curNode.setNext(nuevoNodo);
                nuevoNodo.setNext(temp);
            }
            size++;
        }
    }
    
}
