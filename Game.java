import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    public static void main(String[] args)
    {
        boolean playing = true;
        Place[][] location = new Place[3][3];
        location[0][0] = new Place("Paddy's", "A dingy pub");
        location[0][1] = new Place("Alley", "A distgusting alleyway");
        location[0][2] = new Place("Charlie's Apartment", "A disgusting apartment filled with cats");
        location[1][0] = new Place("Park", "A beautiful, bright park");
        location[1][1] = new Place("The Hospital", "A pristine Philadelphia hospital");
        location[1][2] = new Place("Dee's Apartment", "An apartment made for a large bird");
        location[2][0] = new Place("The Comedy Club", "A place for yucks");
        location[2][1] = new Place("Wolf Cola HQ", "Home of Wolf Cola: The cola to ease the pain");
        location[2][2] = new Place("Nightman's palace", "The seat of all evil in the world");
        int x = 0;
        int y = 0;
        Enemy[] enemies = new Enemy[3];
        enemies[0] = new Enemy("Hobo", "A strong, proud hobo", 12, 20, 1);
        enemies[1] = new Enemy("Police officer", "A veteran policeman", 11, 25, 24);
        enemies[2] = new Enemy("Rat", "A disgusting rodent of the night", 6, 30, 10);
        Enemy nightman = new Enemy("The Nightman", "The enemy of the Dayman", 18, 50, 100000);

        ArrayList<Player> party = new ArrayList<Player>();
        Player tman = new Player("The Trashman", "A fierce trash warrior", 15, 40);
        Player cricket = new Player("Rickety Cricket", "A devout priest with ringworm", 6, 50);
        Player dayman = new Player("The Dayman", "He is the champion of the sun", 20, 50);
        party.add(tman);
        Item[] items = new Item[6];
        items[0] = new HealthItem("Rum Ham", "A delicious ham soaked in rum", 5, 25);
        items[1] = new HealthItem("Cat Food", "Food for cats or humans", 2, 10);
        items[2] = new Weapon("Toe Knife", "The world's most powerful knife", 25, 2);
        items[3] = new Weapon("Gun", "A run of the mill gun", 12, 5);
        items[4] = new KeyItem("Karate Book", "A book filled with Karate moves", 2, location[0][2]);
        items[5] = new KeyItem("Sun Trophy", "The trophy signifying mastery of the sun", 1, location[1][2]);
        Scanner scan = new Scanner(System.in);
        String ans = "";
        boolean thing = true;

        System.out.println("\f _____               _ " +                       
            "\n/__   \\_ __ __ _ ___| |__     /\\/\\   __ _ _ __  " +
            "\n  / /\\/ '__/ _` / __| '_ \\   /    \\ / _` | '_ \\ " +
            "\n / /  | | | (_| \\__ \\ | | | / /\\/\\ \\ (_| | | | |" +
            "\n \\/   |_|  \\__,_|___/_| |_| \\/    \\/\\__,_|_| |_|");

        while(playing)
        {
            System.out.println("Welcome to " + location[x][y]);
            int random = (int)Math.random()*3;
            System.out.println("You have been attacked! Which party member do you want to fight with: ");
            for(Player i: party)
            {
                System.out.println(i.getName() + " HP: " + i.getHealth());
            }
            ans = scan.nextLine();
            while(thing)
            {
                for(Player i: party)
                {
                    if(Search.check(ans, i.getName()))
                    {
                        Battle.fight(i, enemies[random]);
                        thing = false;
                        break;
                    }
                }

                System.out.println("Input Invalid");
            }

        }
        
    }

}
