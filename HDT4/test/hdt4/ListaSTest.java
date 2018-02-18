/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Arenas
 */
public class ListaSTest {
    
    public ListaSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class ListaS.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaS<Integer> instance = new ListaS();
        Integer res = 6;
        for(int i = 0; i < 6; i++)
        {
            instance.add(i);
        }
        Integer size = instance.size();
        assertEquals(res, size);        
    }

    /**
     * Test of get method, of class ListaS.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        ListaS<Integer> instance = new ListaS();
        Integer val1 = 3;
        Integer val2 = 9;
        instance.addFirst(val1);
        instance.addLast(val2);
        Integer resultado = instance.getLast();
        assertEquals(resultado, val2);
       
    }

    /**
     * Test of remove method, of class ListaS.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        ListaS<Integer> instance = new ListaS();
        Integer val1 = 3;
        Integer val2 = 9;
        instance.addFirst(val1);
        instance.addLast(val2);
        Integer res = instance.removeLast();
        assertEquals(res, val2);
    }

    /**
     * Test of add method, of class ListaS.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        ListaS<Integer> instance = new ListaS();
        Integer nuevo = 1;
        instance.add(0, nuevo);
        Integer temp = instance.get(0);
        assertEquals(temp, nuevo);
        
    }
    
}
