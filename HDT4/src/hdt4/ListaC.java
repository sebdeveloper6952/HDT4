package hdt4;

/**
 *
 * @author sevic69
 */
public class ListaC<E> extends AbstractList<E>
{
    protected NodoS<E> tail;
    protected int size;
    
    public ListaC()
    {
        tail = null;
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
        if(i < 0 || i > size - 1) return null;
        else
        {
            NodoS<E> curNode = tail.getNext();
            for(int c = 0; c < i; c++) curNode = curNode.getNext();
            return curNode.getItem();
        }
    }

    @Override
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
