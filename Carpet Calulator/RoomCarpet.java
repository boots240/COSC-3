/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpetcalculatorapp;

/**
 *
 * @author alimo
 */
public class RoomCarpet 
{
  private RoomDimension size;
  private double carpetcost;

public RoomCarpet(RoomDimension dim,double cost)
{
    size = dim;
    carpetcost = cost;
    
}

public double getTotalCost()
{
   return size.getarea() * carpetcost; 
}


  @Override
  public String toString()
{
  return "Room Dimension: " + size + ", Cost per Sq Foot: $" + carpetcost;
}
  
public RoomCarpet(RoomCarpet object2)
{
   size = object2.size;
   carpetcost = object2.carpetcost;   
}

  @Override
 public Object clone() 
 {
   return new RoomCarpet(this);
 }
 
 
  public int hashcode()
 {
     int prime = 31;
     int result = 1;
     
     result = (int) (result * prime + size.getarea()); 
     result = (int) (result * prime + carpetcost); 
     
     return result;
 }
  
  public boolean equals(RoomCarpet obj)
    {
      boolean status;
      if ((size == obj.size) && (carpetcost== obj.carpetcost))
         status = true;
      else
         status = false; 

      return status;
    } 

    public int compareTo(RoomCarpet obj) 
    {
        double thiscost = getTotalCost();
        double objcost = obj.getTotalCost();
        return Double.compare(thiscost, objcost);
    }
  
   public void finalize()
 {
     System.out.println("RoomCarpet object has been destroyed");
 }


  
    
}
