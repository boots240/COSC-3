/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carpetcalculatorapp;
import java.util.ArrayList;

/**
 *
 * @author alimo
 */
public class CarpetCalculatorApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        System.out.println("RoomDimension class:");
        RoomDimension dimension1 = new RoomDimension(12,12);
        //calling copy constructor
        RoomDimension dimension2 = new RoomDimension(dimension1);
        //calling clone method of dimension1
        RoomDimension dimension3 = (RoomDimension)dimension1.clone();

        //toString method
        System.out.println("toString method: " + dimension1);
        //hashcode method
        System.out.println("hashcode: " + dimension1.hashCode());
        //equals method
        System.out.println("Equals method: " + dimension1.equals(dimension2));
        //compareTo method
        System.out.println("compareTo method: " + dimension1.compareTo(dimension3));
        //finalize method 
        dimension3.finalize();

        System.out.println("****************");
        System.out.println("RoomCarpet class:");

        RoomCarpet carpet1 = new RoomCarpet(dimension1, 13.0);      
        //calling copy constructor
        RoomCarpet carpet2 = new RoomCarpet(carpet1);      
        // calling clone method 
        RoomCarpet carpet3 = (RoomCarpet)carpet1.clone();
        
        //toString method 
        System.out.println("toString method: " + carpet1);
        //hashcode method
        System.out.println("hashcode: " + carpet1.hashCode());
        //equals method
        System.out.println("Equals method: " + carpet1.equals(carpet2));
        //compareTo method
        System.out.println("compareTo method: " + carpet1.compareTo(carpet3));
        //finalize method 
        carpet3.finalize();
        System.out.println("****************");
        
       //array lists 
        ArrayList<RoomCarpet> arrlist= new ArrayList<RoomCarpet>(0);
        RoomDimension obj = new RoomDimension(23,13);
        arrlist.add(new RoomCarpet(obj,45));
        System.out.println("The cost of a Carpet per square feet is $45. So a carpet with a length of 23 feet and a width of 13 feet costs:  "
           + arrlist.get(0).getTotalCost());
        
        


      
            

        
      

      
    }
    
}
