/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;
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
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of bubbleSort method, of class BubbleSort.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        int[] numbers = {3,7,5,2,1,4,6};
        int[] expected = {1,2,3,4,5,6,7};
        BubbleSort instance = new BubbleSort();
        instance.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
        assertTrue(Arrays.equals(expected, numbers));
    }
    @Test
    public void testBubbleSort2() {
        System.out.println("bubbleSort");
        int[] numbers = {3};
        int[] expected = {3};
        BubbleSort instance = new BubbleSort();
        instance.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
        assertTrue(Arrays.equals(expected, numbers));
    }
    
}
