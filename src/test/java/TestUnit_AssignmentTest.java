/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Anuraag Reddy
 */
public class TestUnit_AssignmentTest {
    
    public TestUnit_AssignmentTest() {
    }

    /**
     * Test of main method, of class TestUnit_Assignment.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestUnit_Assignment.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of char_Count method, of class TestUnit_Assignment.
     */
    @Test
    public void testChar_Count() {
        System.out.println("char_Count");
        String input = "";
        int expResult = 0;
        int result = TestUnit_Assignment.char_Count(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vowel_Count method, of class TestUnit_Assignment.
     */
    @Test
    public void testVowel_Count() {
        System.out.println("vowel_Count");
        String input = "";
        int expResult = 0;
        int result = TestUnit_Assignment.vowel_Count(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of digit_Count method, of class TestUnit_Assignment.
     */
    @Test
    public void testDigit_Count() {
        System.out.println("digit_Count");
        String input = "";
        int expResult = 0;
        int result = TestUnit_Assignment.digit_Count(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
