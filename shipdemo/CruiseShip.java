package shipdemo;

/**
 *
 * @author alimo
 */
public class CruiseShip extends Ship
{
    private int passengers;
     
    //constructor 
   public CruiseShip(String n,String y,int p)
    {
        super(n,y);
        passengers = p;   
    }
   //accessor and getter method
   public void setPassengers(int p)
   {
      p = passengers ;
   }
   
   public int getpasssengers()
   {
      return passengers;
   }
   
   //toString method
    @Override
   public String toString()
   {
       return "Name: " + getName() + "\nNumber of Passengers: " + passengers;
   }
           
   //display method 
   @Override
   public void display() 
   {
      System.out.println("Ship Information: " +
              "      \nName: " + getName() +
              "      \nYear Built: " + getyearBuilt() +
              "      \nNumber of Passengers: = " + getpasssengers());
   }
   
  
   
   
}
 