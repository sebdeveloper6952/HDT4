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
 */

public abstract class StackAbstracto<E> implements Stack<E>
{   
    public boolean empty()
    {
        return size() == 0;
    }
}
