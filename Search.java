/**
 * The main search engine in the game
 * @author Thomas Michel
 * @version October 18, 2016
 */
import java.util.Scanner;
public class Search
{
    public static boolean check(String input, String word)
    {
        
        if (input.length() >= word.length())
        {
            for(int x = 0; x <= input.length() - word.length(); x++)
            {
                String inputPart = input.substring(x, word.length() + x);

                if (inputPart.equalsIgnoreCase(word))
                {
                    return true;
                }
                
            }
        }
        return false;
    }
}
