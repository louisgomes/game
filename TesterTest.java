import java.util.ArrayList;
public class TesterTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> r = new ArrayList<Integer>();
        ArrayList<String> p = new ArrayList<String>();
        int[] x = {1, 2 , 3 ,4};
        int[] y = new int[0];
        String[] pp = {"Ian", "Ian", "Vasanth is an idiot"};
        r.add(10);
        r.add(13);
        r.add(13);
        p.add("Java");
        p.add("Steve");
        p.add("Ian");
        p.add("Ian");
        System.out.println(numCount(r, 13));
        removeStrings(p, "I");
        System.out.println(p);
        System.out.println(numInArray(pp, "Ian"));
        System.out.println(average(x, 4));
        System.out.println(average(y, 0));
    }

    public static int numCount(ArrayList<Integer> rayList, int num)
    {
        int count = 0;
        for(int i = 0; i < rayList.size(); i++)
        {
            if(rayList.get(i) == num)
                count++;

        }
        return count;
    }

    public static void removeStrings(ArrayList<String> rayList, String firstLetter)
    {
        int i = 0;
        while(i < rayList.size()){
            if((rayList.get(i)).charAt(0) == (firstLetter).charAt(0))
            {
                rayList.remove(i);
            }
            else
                i++;
        }

    }

    public static int numInArray(String[] A, String s)
    {
        int count = 0;
        for(int i = 0; i < A.length; i++)
        {
            if(A[i].equals(s))
                count++;
        }
        return count;
    }

    public static double average(int[] x,int num)
    {
        double total = 0;
        if(num > 0)
        {
            for(int i = 0; i < x.length; i++)
            {
                total += x[i];
            }
            return total/num;
        }
        else 
            return 0;
    }
}