package shipdemo;

/**
 *
 * @author alimo
 */
public class CargoShip extends Ship
{
    private int tonnage;
 
    //constructor 
 public CargoShip(String n,String y,int t)
 {
     super(n,y);   
     tonnage = t;   
 }
 //accessor and getter methods 
 public void setTonnage(int t)
 {
     t = tonnage;
 }
 
 public int getTonnage()
 {
     return tonnage;
 }
 //to String method 
 @Override
 public String toString()
 {
     return "Name: " + getName() + "\nWeight: " + tonnage + " tons";
 }
 //display method
 @Override
 public void display() 
 {
    System.out.println("Ship Information: " +
            "      \nName: " + getName() +
            "      \nYear Built: " + getyearBuilt() +
            "      \nWeight: " + getTonnage());
 }  
    
   
}
