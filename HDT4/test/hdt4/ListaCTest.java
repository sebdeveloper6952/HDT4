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
 * @author sevic69
 */
public class ListaCTest {
    
    public ListaCTest() {
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
     * Test of size method, of class ListaC.
     */
    @Test
    public void testSize() 
    {
        System.out.println("size");
        ListaC<String> instance = new ListaC();
        instance.addLast("sebas");
        instance.addFirst("arenas");
        instance.add(1, "fer");
        assertEquals(3, instance.size());
    }

    /**
     * Test of get method, of class ListaC.
     */
    @Test
    public void testGet() 
    {
        System.out.println("get");
        ListaC<String> instance = new ListaC();
        instance.addLast("sebas");
        instance.addFirst("arenas");
        instance.add(1, "fer");
        String res = instance.get(0);
        assertEquals("arenas", res);
    }

    /**
     * Test of remove method, of class ListaC.
     */
    @Test
    public void testRemove() 
    {
        System.out.println("remove");
        ListaC<String> instance = new ListaC();
        instance.addLast("sebas");
        instance.addFirst("arenas");
        instance.add(1, "fer");
        instance.addLast("hermana de fer");
        assertEquals("hermana de fer", instance.removeLast());
    }

    /**
     * Test of add method, of class ListaC.
     */
    @Test
    public void testAdd() 
    {
        System.out.println("add");
        ListaC<String> instance = new ListaC();
        instance.addLast("sebas");
        instance.addFirst("arenas");
        instance.add(1, "fer");
        assertEquals("sebas", instance.getLast());
    }
    
}
