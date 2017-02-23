public class Weapon extends Item
{
    private int damage;

    public Weapon(String n, String d, int v, int dam)
    {
        super(n, d, v);
        damage = dam;
    }

    public int getDamage()
    {
        return damage;
    }
}

    