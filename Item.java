public class Item extends NamedThing
{
    private int value;
   

    public Item(String n, String des, int v)
    {
        super(n, des);
        value = v;
        
    }

    public int getValue()
    {
        return value;
    }
    
    public String getInfo()
    {
        return getName() + ": " + value;
    }
}