/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

/**
 *
 * @author sevic69
 */
public class StackFactory
{
    public static Stack createStack(int opcion)
    {
        Stack s = null;
        switch(opcion)
        {
            case 0:
                s = new StackArrayList();
                break;
            case 1:
                s = new StackVector();
                break;
            case 2:
                s = new StackLista(new ListaS<>());
                break;
            case 3:
                
                break;
            case 4:
                s = new StackLista(new ListaC());
                break;
            default:
                break;
        }
        return s;
    }
}
