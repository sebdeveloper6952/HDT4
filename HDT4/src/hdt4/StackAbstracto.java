package hdt4;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 * Clase abstracta de la cual derivan todos los stacks. Se implementa unicamente
 * el metodo empty(), el cual tiene el mismo comportamiento para todos los
 * stacks.
 */
public abstract class StackAbstracto<E> implements Stack<E>
{   
    /**
     * Devuelve true si la lista esta vacia y false si la lista tiene al menos
     * un elemento.
     * @return 
     */
    public boolean empty()
    {
        return size() == 0;
    }
}
