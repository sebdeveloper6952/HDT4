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
public class ListaDTest {
    
    public ListaDTest() {
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
    public void tearDown() 
    {
    }

    /**
     * Test of size method, of class ListaD.
     */
    @Test
    public void testSize() 
    {
        System.out.println("size");
        ListaD<Integer> instance = new ListaD();
        Integer val1 = 4;
        Integer val2 = 7;
        Integer val3 = 2;
        instance.add(val3);
        instance.add(val1);
        instance.add(val2);
        Integer expres = 3;
        Integer resultado = instance.size();
        assertEquals(expres, resultado);
    }

    /**
     * Test of get method, of class ListaD.
     */
    @Test
    public void testGet() 
    {
        System.out.println("get");
        int i = 0;
        ListaD instance = new ListaD();
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class ListaD.
     */
    @Test
    public void testRemove() 
    {
        System.out.println("remove");
        ListaD<Integer> instance = new ListaD();
        Integer val1 = 3;
        Integer val2 = 9;
        Integer val3 = 69;
        Integer val4 = 34;
        instance.addFirst(val1);
        instance.addLast(val2);
        instance.add(1, val3);
        instance.addLast(val4);
        for(int i = 0; i < instance.size(); i++)
            System.out.print(instance.get(i) + ",");
        System.out.println();
        Integer res = instance.removeLast();
        assertEquals(res, val3);
    }

    /**
     * Test of add method, of class ListaD.
     */
    @Test
    public void testAdd() 
    {
        System.out.println("add");
        ListaD<String> instance = new ListaD();
        instance.addFirst("sebas");
        instance.addLast("fer");
        instance.add(1, "arenas");
        instance.add(1, "ONE");
        instance.add(2, "TWO");
        instance.addLast("LAST");
        instance.addFirst("FIRST");
        for(int i = 0; i < instance.size(); i++)
            System.out.print(instance.get(i) + ",");
        System.out.println();
        while(instance.size() > 0)
        {
            System.out.println("Removed->"+instance.removeLast());
            for(int i = 0; i < instance.size(); i++)
                System.out.print(instance.get(i) + ",");
            System.out.println();
        }
        assertEquals("arenas", instance.get(4));
    }
    
}
