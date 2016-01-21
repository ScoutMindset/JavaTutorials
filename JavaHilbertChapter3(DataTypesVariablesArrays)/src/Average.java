/**
 * Created by jaturul on 21.01.16.
 */
public class Average
{
    public static void main(String args[])
    {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (int i = 0; i < 5; ++i)
            result = result + nums[i];

        System.out.println("The average of the elements in the nums[] array is " + result/5);
    }
}
