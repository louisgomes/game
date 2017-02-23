import java.util.ArrayList;
/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entity extends NamedThing
{
    private int strength;
    private int health;
    private ArrayList<Item> items;
    
    public Entity (String nm, String desc, int s, int h)
    {
        super(nm, desc);
        strength = s;
        health = h;
        items = new ArrayList<Item>();
    }
    
    public int getStrength()
    {
        return strength;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void changeHealth(int x)
    {
        health += x;
    }
    
}
