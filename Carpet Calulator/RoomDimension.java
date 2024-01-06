/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpetcalculatorapp;

/**
 *
 * @author alimo
 */
public class RoomDimension implements Comparable <RoomDimension>
{
    private double length;
    private double width;
    
        
 public RoomDimension(double len, double w)
 {
     length = len;
     width = w;
 }
 
  //method that computes the area and returns it 
 public double getarea()
 {  
     return  length * width;
 }
  
    @Override
 public String toString()
 {
     return "Length: " + length + ", Width: " + width;
 }
 
  public double getlength()
 {
     return length;
 }
 
 public double getwidth()
 {
     return width;
 }
 
//copy constructor
  public RoomDimension(RoomDimension object2)
 {
     length = object2.length;
     width = object2.width;
 }
 
    @Override
  public Object clone()
 {
     return new RoomDimension(this);
 }
 
    @Override
  public void finalize()
 {
     System.out.println("RoomDimension object has been destroyed");
 }   
  
  public int hashcode()
 {
     int prime = 31;
     int result = 1;
     
     result = (int) (result * prime + length); 
     result = (int) (result * prime + width); 
     
     return result;
 }
 
  public boolean equals(RoomDimension obj)
    {
      boolean status;
      if ((length == obj.length) && (width == obj.width))
         status = true;
      else
         status = false; 

      return status;
    } 

    
    public int compareTo(RoomDimension other) 
    {
        double thisArea = getarea();
        double otherArea = other.getarea();
        return Double.compare(thisArea, otherArea);
    }
  
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 
 
 
  

 
   


  
    



}
