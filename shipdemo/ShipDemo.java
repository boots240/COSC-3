/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shipdemo;

/**
 *
 * @author alimo
 */
public class ShipDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //creating ships array
        Ship[] ships = new Ship[2];
        
        ships[0] = new CruiseShip("Big bertha", "1955", 522);
        
        ships[1] = new CargoShip("Evergreen", "2008", 1022);
        //tostring outputs 
       System.out.println("ToString outputs:");
       System.out.println("Ship 1:");
       System.out.println(ships[0].toString());
       System.out.println("Ship 2:");
       System.out.println(ships[1].toString());
       
       System.out.println("**********");
       //display outputs
       System.out.println("Display outputs:");
       ships[0].display();
       ships[1].display();
       
       
    
    }
    
}
