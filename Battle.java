import java.util.Scanner;
public class Battle
{
    public Battle()
    {
    }

    public static boolean fight(Player p, Enemy e)
    {
        Scanner scan = new Scanner(System.in);
        String d = "";
        boolean b = true;
        while(b)
        {
            System.out.println("\f***" + p.getName() + "***\t\t***" + e.getName() + "***"
                + "\nHP: " + p.getHealth() + "\t\t\tHP: " + e.getHealth());
            System.out.print("What would you like to do (Attack/Defend): ");
            d = scan.nextLine();
            if(Search.check(d, "attack"))
            { 
                e.changeHealth((int)(Math.random()*-5 - p.getStrength()));
                p.changeHealth((int)(Math.random()*-5 - e.getStrength()));
            }
            else if(Search.check(d, "defend"))
            {
                p.changeHealth((int)(Math.random()*-5 - e.getStrength())/2);
            }
            if(e.getHealth() <= 0)
            {
                System.out.println("You won!!");
                return true;
            }

            else if(p.getHealth() <= 0)
            {
                System.out.println("You lost. Sucks to be dead.");
                return false;
            }
        }
        return false;
    }
}


