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
    public void tearDown() {
    }

    /**
     * Test of size method, of class ListaD.
     */
    @Test
    public void testSize() {
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
    public void testGet() {
        System.out.println("get");
        int i = 0;
        ListaD instance = new ListaD();
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ListaD.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        ListaD<Integer> instance = new ListaD();
        Integer val1 = 3;
        Integer val2 = 9;
        instance.addFirst(val1);
        instance.addLast(val2);
        Integer res = instance.removeLast();
        assertEquals(res, val2);
    }

    /**
     * Test of add method, of class ListaD.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int i = 0;
        Object o = null;
        ListaD instance = new ListaD();
        instance.add(i, o);
    }
    
}
