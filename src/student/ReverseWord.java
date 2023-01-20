package student;

import java.util.Scanner;

/**
 * hello
 * @author cody
 */
public class ReverseWord {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String input = kb.nextLine();
        
        char[] word = new char[input.length()];
        
        for(int i=0; i<word.length; i++)
        {
            word[i] = input.charAt(i); 
        }
        for (int i=word.length-1; i>=0; i--)
        {
            System.out.print(word[i]);
        }
    }
    
    
}
