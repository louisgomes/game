
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Entity
{
    private Weapon weakness;
    private int money = 0;
    public Enemy(String nm, String desc, int s, int h, int m)
    {
        super(nm, desc, s, h);
        money = m;
    }
    
    public int getMoney()
    {
        return money;
    }
}
