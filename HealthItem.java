public class HealthItem extends Item
{
    private int heal;

    public HealthItem(String n ,String d, int v, int h)
    {
        super(n, d, v);
        heal = h;
    }

    public int getHealth()
    {
        return heal;
    }
}