package lab.pkg7;
import java.util.ArrayList;

/**
 *
 * @author alimo
 */
public class Mylist <T extends Number>
{
   private ArrayList<T> list;
    
   public Mylist()
   {
       list = new ArrayList<>();
   }
   
   public void add(T figure)
   {
      list.add(figure); 
   }
   
   public T largest()
   {   
     T largest = list.get(0);
     
     for(T figure: list)
     {
         if(figure.doubleValue() > largest.doubleValue())
         {
             largest = figure;
         }
     }
     
     return largest;
   }
   
   public T smallest()
   {
     T smallest = list.get(0);
     
     for(T figure: list)
     {
         if(figure.doubleValue() < smallest.doubleValue())
         {
             smallest = figure;
         }
     }
     
     return smallest;
   }
    
   }
   
   
   
   
   

