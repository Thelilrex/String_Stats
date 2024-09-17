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
    // Tests for the Characters
    @Test
    public void testCharCountSpacesOnly() 
    {
        assertEquals(0, TestUnit_Assignment.char_Count("     "), "String with only spaces should return 0");
    }
    @Test
    public void testCharCountEmptyString() 
    {
        assertEquals(0, TestUnit_Assignment.char_Count(""), "Empty string should return 0");
    }
    @Test
    public void testCharCountNull() 
    {
        assertEquals(0, TestUnit_Assignment.char_Count(null), "Null should return 0");
    }
    @Test
    public void testCharCountAlphaNumerics() 
    {
        String input = "1a2b3c";
        assertEquals(input.length(), TestUnit_Assignment.char_Count(input), "String with alphaNumerics with no space should return strings len");
    }
    @Test
    public void testCharCountWithSpecialCharacters() 
    {
        String input = "!@#$%^&*";
        assertEquals(input.length(), TestUnit_Assignment.char_Count(input), "String with special characters and no space should return its len");
    }
    @Test
    public void testCharWithForeignCharacters()
    {
        String input = "こんにちは";
        assertEquals(input.length(), TestUnit_Assignment.char_Count(input), "String with foreign characters with no space should return its len");
    }
    
    //Tests for the Vowels
    @Test
    public void testVowelCountSpacesOnly() 
    {
        System.out.println("Supp");
        assertEquals(0, TestUnit_Assignment.vowel_Count("     "), "String with only spaces should return 0");
    }
    @Test
    public void testVowelCountEmptyString() 
    {
        assertEquals(0, TestUnit_Assignment.vowel_Count(""), "Empty string should return 0");
    }
    @Test
    public void testVowelCountNull() 
    {
        assertEquals(0, TestUnit_Assignment.vowel_Count(null), "Null should return 0");
    }
    @Test
    public void testVowelCountAlphaNumerics() 
    {
        String input = "1a2b3c";
        assertEquals(1, TestUnit_Assignment.vowel_Count(input), "String with alphaNumerics should return number of vowels");
    }
    @Test
    public void testVowelCountWithSpecialCharacters() 
    {
        String input = "!@a#$%^&*12";
        assertEquals(1, TestUnit_Assignment.vowel_Count(input), "String with special should return number of vowels");
    }
    @Test
    public void testVowelWithForeignCharacters()
    {
        String input = "こんにちは";
        assertEquals(0, TestUnit_Assignment.vowel_Count(input), "String with foreign characters should return 0");
    }
    @Test
    public void testVowelWithCaptialAndSmallVowels()
    {
        String input = "AaEeIiOoUu";
        assertEquals(input.length(), TestUnit_Assignment.vowel_Count(input), "String with all capital and small vowels should return its len");
    }
    
    // Test for digits
     @Test
    public void testDigitCountSpacesOnly() 
    {
        assertEquals(0, TestUnit_Assignment.digit_Count("     "), "String with only spaces should return 0");
    }
    @Test
    public void testDigitCountEmptyString() 
    {
        assertEquals(0, TestUnit_Assignment.digit_Count(""), "Empty string should return 0");
    }
    @Test
    public void testDigitCountNull() 
    {
        assertEquals(0, TestUnit_Assignment.digit_Count(null), "Null should return 0");
    }
    @Test
    public void testDigitCountAlphaNumerics() 
    {
        String input = "1a2b3c";
        assertEquals(3, TestUnit_Assignment.digit_Count(input), "String with alphaNumerics should return number of digits");
    }
    @Test
    public void testDigitCountWithSpecialCharacters() 
    {
        String input = "!@#$%^&*";
        assertEquals(0, TestUnit_Assignment.digit_Count(input), "String with special characters should return number of digits");
    }
    @Test
    public void testDigitWithForeignCharacters()
    {
        String input = "こんにちは";
        assertEquals(0, TestUnit_Assignment.digit_Count(input), "String with foreign characters should return number of digits");
    }
}
