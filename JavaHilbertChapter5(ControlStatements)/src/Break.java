/**
 * Created by jaturul on 22.01.16.
 */
public class Break
{
    public static void main(String args[])
    {
        boolean whatever = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before break");
                    break second;
                    //System.out.println("We're inside the third block.") - this will not execute
                }
                //System.out.println("We're inside the second block."); - this will not execute
            }
            System.out.println("We're inside the first block.");
        }
    }
}
