package hdt4;
/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public interface ListsI<E> {
    
   /**
    * 
    * @return el tamaño de la lista
    */
    public int size();
   

   /**
    * 
    * @return regresa el estado de la lista. True si esta vacia la lista, o false
    * si hay algun elemento dentro de la lista
    */
    public boolean isEmpty();
   

   /**
    * 
    * @param value el valor que se quiere agregar al principio de la lista
    */
   public void addFirst(E value);
   

   
   /**
    * 
    * @param value el valor que se quiere agregar al final de la lista 
    */
   public void addLast(E value);
   

   /**
    * 
    * @return el primer valor dentro de la lista
    * 
    */
   public E getFirst();
   

   /**
    * 
    * @return el valor que esta en la ultima posicion de la lista
    */
   public E getLast();
   

   /**
    * 
    * @return el valor de la primera posicion de la lista, y luego elimina
    * ese valor
    */
   public E removeFirst();
   

   /**
    * 
    * @return el valor de la ultima posicion de la lista, y luego lo elimina.
    */
   public E removeLast();
  

   /**
    * 
    * @param value el valor que se quiera agregar al final de la lista
    */
   public void add(E value);
   

   /**
    * 
    * @return elimina el ultimo valor encontrado en la lista
    */
   public E remove();
   

   /**
    * 
    * @return el valor de la ultima posicion de la lista
    */
   public E get();
  
   
   /**
    * 
    * @param i la posicion del valor que se quiere obtener
    * @return el valor en la posicion indicada
    */
   public E get (int i);
   
   
   /**
    * 
    * @param i posicion del valor que se quiere eliminar
    * @return el valor de la posicion indicada y lo elimina de la lista
    */
   public E remove (int i);
   

   /**
    * 
    * @param i la posicion de la lista en la cual se quiere agregar un elemento
    * @param o el elemento que se quiere agregar a la lista 
    */
   public void add(int i, E o);
   
}
