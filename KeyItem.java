public class KeyItem extends Item
{
    private Place useplace;
    
    public KeyItem(String n, String d, int v, Place u)
    {
        super(n, d, v);
        useplace = u;
    }
    
    public Place getLocation()
    {
        return useplace;
    }
}
        