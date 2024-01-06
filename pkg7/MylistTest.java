package lab.pkg7;

/**
 *
 * @author alimo
 */
public class MylistTest 
{
     public static void main(String[] args) 
    {
        Mylist<Integer> intlist = new Mylist<Integer>();
        
        Mylist<Double> doublelist = new Mylist<Double>();
        
        //numbers for the integer list
        intlist.add(43);
        intlist.add(2222);
        intlist.add(21);
        
        //numbers for the double list
        doublelist.add(4.3);
        doublelist.add(22.22);
        doublelist.add(2.1);
        
        //printing largest/smallest integer
        System.out.println("Integers: ");
        System.out.println("Smallest: " + intlist.smallest());
        System.out.println("Largest: " + intlist.largest());
        
        System.out.println(" ");

        //printing largest/smallest Double
        System.out.println("Doubles: ");
        System.out.println("Smallest: " + doublelist.smallest());
        System.out.println("Largest: " + doublelist.largest());
        
        
        
        
    }
}
