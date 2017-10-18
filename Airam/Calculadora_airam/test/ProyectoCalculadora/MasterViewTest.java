/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCalculadora;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cfp31-06
 */
public class MasterViewTest {
    
    public MasterViewTest() {
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
     * Test of AddViewEvenListener method, of class MasterView.
     */
    @Test
    public void testAddViewEvenListener() {
        System.out.println("AddViewEvenListener");
        IViewEventListener listener = null;
        MasterView instance = new MasterView();
        instance.AddViewEvenListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveViewEventListener method, of class MasterView.
     */
    @Test
    public void testRemoveViewEventListener() {
        System.out.println("RemoveViewEventListener");
        IViewEventListener listener = null;
        MasterView instance = new MasterView();
        instance.RemoveViewEventListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjTextField1 method, of class MasterView.
     */
    @Test
    public void testGetjTextField1() {
        System.out.println("getjTextField1");
        MasterView instance = new MasterView();
        JTextField expResult = null;
        JTextField result = instance.getjTextField1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjComboBox3 method, of class MasterView.
     */
    @Test
    public void testGetjComboBox3() {
        System.out.println("getjComboBox3");
        MasterView instance = new MasterView();
        JComboBox<String> expResult = null;
        JComboBox<String> result = instance.getjComboBox3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
