/**
 * Created by jaturul on 22.01.16.
 */
public class ForEach
{
    public static void main(String args[])
    {
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        int result = 0;

        for(int iterator: numbers)
        {
            result +=iterator;
        }
        System.out.println("The sum of all elements in the array is " + result);
    }
}
