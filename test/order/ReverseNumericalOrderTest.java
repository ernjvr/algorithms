/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class ReverseNumericalOrderTest {
    
    public ReverseNumericalOrderTest() {
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
     * Test of compare method, of class ReverseNumericalOrder.
     */
    @Test
    public void customSorting() {
        System.out.println("compare");
        List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);     
        List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);
        ReverseNumericalOrder instance = new ReverseNumericalOrder();
        Collections.sort(numbers, instance);
        assertEquals(expected, numbers);
    }
    
}
