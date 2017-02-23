
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String[] args)
    {
        boolean poop;
        Player p = new Player("Louis", "He is a man", 5, 100);
        Enemy e = new Enemy("Thomas", "He is a man also", 6, 75, 7);
        
        poop = Battle.fight(p, e);
    }
}
