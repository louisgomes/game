import java.util.ArrayList;
/**
 * Write a description of class Place here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Place extends NamedThing
{
    private ArrayList<Item> items;
    private ArrayList<Entity> people;
    
    public Place(String n, String d)
    {
        super(n, d);
        items = new ArrayList<Item>();
        people = new ArrayList<Entity>();
    }
    
    public void addEnemy(Enemy e)
    {
        people.add(e);
    }
    
    public void addItem(Item i)
    {
        items.add(i);
    }
}
