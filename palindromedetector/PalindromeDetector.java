/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromedetector;

/**
 *
 * @author alimo
 */
public class PalindromeDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String str = "kayak";
        
        boolean result  = palindrome(str);
        System.out.println( "Is " + str + " a palindrome? (true or false): " + result);
 
    }
    
    //palindrome method 
    public static boolean palindrome(String str)
    {
        
        if (str.length()<=1)
        {
            return true;
        }
        
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1,str.length());
        if(!first.equals(last))
        {
            return false;
        }
        else
        {
            return palindrome(str.substring(1,str.length()-1));
        }
    }
    
    
}
