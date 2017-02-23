import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends Place
{
    ArrayList<Item> buy;
    public Shop(String n, String d)
    {
        super(n, d);
        buy = new ArrayList<Item>();
    }

    public String stock()
    {
        String s = "We have: ";
        for(Item x: buy)
        {
            s += x.getInfo() + "\n";
        }
        s += "in stock";
        return s;
    }

    public void purchase(Player p)
    {
        Scanner scan = new Scanner(System.in);
        String i;
        String ans = "y";
        boolean k = false;
        System.out.print("What would you like to buy?\n" + stock() +"\n");
        while(ans.equals("y"))
        {
            i = scan.nextLine();
            for(Item x: buy)
            {
                if(Search.check(i, x.getName()))
                {
                    p.removeMoney(x.getValue());
                    p.addInv(x);
                    System.out.print("Continue shopping(y/n)? ");
                    ans = scan.nextLine();
                    k = true;
                }
            }
            if(!k)
            {
                System.out.print("Invalid input please enter a valid one: ");
            }
        }
    }
}
    
    
    