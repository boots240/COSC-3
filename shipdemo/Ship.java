package shipdemo;

/**
 *
 * @author alimo
 */
public abstract class Ship implements Displayable
{
    private String name;
    private String yearBuilt;
  
    public Ship(String n,String y)
    {
        name = n;
        yearBuilt = y;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setyearBuilt(String y)
    {
        yearBuilt = y;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getyearBuilt()
    {
        return yearBuilt;
    }

    @Override
    public String toString()
    {
        return "Ship name: "+ name + "\n Year Built: " + yearBuilt;
    }
    

}
