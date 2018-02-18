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
public interface ListsI<E> {
    
   public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

   public E getFirst();
   // pre: list is not empty
   // post: returns first value in list

   public E getLast();
   // pre: list is not empty
   // post: returns last value in list

   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list

   public E removeLast();
   // pre: list is not empty
   // post: removes last value from list

   public void add(E value);
   // post: value is added to tail of list

   public E remove();
   // pre: list has at least one element
   // post: removes last value found in list

   public E get();
   // pre: list has at least one element
   // post: returns last value found in list

   public void add(int i, E o);
   // pre: 0 <= i <= size()
   // post: adds ith entry of list to value o

  
}
