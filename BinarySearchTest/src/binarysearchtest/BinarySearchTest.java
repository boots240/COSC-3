package binarysearchtest;

import java.io.*;

/**
 *
 * @author alimo
 */
public class BinarySearchTest 
{

   public static void main(String [] args) throws IOException
   {
      int result; 
      String searchValue;
      String input;
      
      // An array of numbers to search.
      String numbers[] = {"barbra","ellizabeth", "linda", "mary", "patricia"};
      
      // Create the console input objects.
      InputStreamReader reader =
                 new InputStreamReader(System.in);
      BufferedReader keyboard =
                 new BufferedReader(reader);

      // First we must sort the array in ascending order.
      ObjectQuickSorter.quickSort(numbers);
      
      do
      {
         // Get a value to search for.
         System.out.print("Enter a value to search for: ");
         input = keyboard.readLine();
         searchValue = input;

         // Search for the value
         result = ObjectBinarySearcher.search(numbers, searchValue);

        // Display the results.
        if (result == -1)
           System.out.println(searchValue + " was not found.");
        else
        {
           System.out.println(searchValue + " was found at " +
                              "element " + result);
        }

        // Does the user want to search again?
        System.out.print("Do you want to search again? (Y or N): ");
        input = keyboard.readLine();
      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
   }
    
}
