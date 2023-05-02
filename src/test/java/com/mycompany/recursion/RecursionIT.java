
package com.mycompany.recursion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ethanbuck
 */
public class RecursionIT {

    public RecursionIT() {
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
     * Test of fact method, of class Recursion.
     */
    @Test
    public void testFact() {
        System.out.println("fact");
        int n = 0;
        int expResult = 1;
        int result = Recursion.fact(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of reverseString method, of class Recursion.
     */
    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String input = "";
        String expResult = "";
        String result = Recursion.reverseString(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isPalindrome method, of class Recursion.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String input = "";
        boolean expResult = true;
        boolean result = Recursion.isPalindrome(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Recursion.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 0;
        int expResult = 0;
        int result = Recursion.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Recursion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Recursion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
