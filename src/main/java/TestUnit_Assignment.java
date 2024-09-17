
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Anuraag Reddy
 */
public class TestUnit_Assignment 
{

     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired string");
        String user_Input = input.nextLine(); //Rule number one "Dont press enter"
        
        int char_Num = char_Count(user_Input);
        int vowel_Num = vowel_Count(user_Input);
        int digit_Num = digit_Count(user_Input);
        
        if((char_Num == -1) || (vowel_Num == -1) || (digit_Num == -1))
        {
            System.out.println("Its an empty string");
        }
        else
        {
            System.out.println("The character count is: " + char_Num);
            System.out.println("The vowel count is: " + vowel_Num);
            System.out.println("The digit count is: " + digit_Num);
        }
    }
    
    public static int char_Count(String input)
    {
        int size = input.length();
        int result = 0;
        if(size == 0)
        {
            return -1;
        }
        
        for (int i = 0; i < size; i++)
        {
            if(input.charAt(i) != ' ')
            {
                result++;
            }
        }
        
        return result;
    }
    public static int vowel_Count(String input)
    {
        int size = input.length();
        int result = 0;
        if(size == 0)
        {
            return -1;
        }
        
        for (int i = 0; i < size; i++)
        {
            if(Character.isLetter(input.charAt(i)))
            {
                switch(Character.toLowerCase(input.charAt(i)))
                {
                    case('a'):
                    case('e'):
                    case('i'):
                    case('o'):
                    case('u'):
                        result++;
                        break;
                }
            }
        }
        
        return result;
    }
    public static int digit_Count(String input)
    {
        int size = input.length();
        int result = 0;
        if(size == 0)
        {
            return -1;
        }
        
        for (int i = 0; i < size; i++)
        {
            if(Character.isDigit(input.charAt(i)))
            {
                result++;
            }
        }
        
        return result;
    }
}
