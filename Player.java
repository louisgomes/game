import java.util.ArrayList;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Entity
{
    private static ArrayList<Item> inv;
    private static int money = 0;

    public Player(String nm, String desc, int s, int h)
    {
        super(nm, desc, s, h);
        inv = new ArrayList<Item>();
    }

    public void addInv(Item i)
    {
        inv.add(i);
    }

    public void removeInv(Item i)
    {
        boolean b = true;
        for(Item x: inv)
        {
            if((x.getName()).equals(i.getName()))
            {
                inv.remove(x);
                break;
            }
        }
    }

    public void addMoney(Enemy e)
    {
        money += e.getMoney();
    }

    public void removeMoney(int x)
    {
        money -= x;
    }

    public int getMoney()
    {
        return money;
    }

    public void useHealthItem(Item x)
    {
        changeHealth(((HealthItem)x).getHealth());
    }

    public String getInv()
    {
        String s = "";
        for(Item x : inv)
        {
            s += x + "\n";
        }
        return s;
    }
}
