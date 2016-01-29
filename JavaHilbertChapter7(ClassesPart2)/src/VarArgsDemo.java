/**
 * Created by jaturul on 29.01.16.
 */
public class VarArgsDemo
{
    static void vaTest(int ... v) // "v" is treated as an array
    {
        int counter = 1;
        for (int iterator: v)
        {
            System.out.print("argument " + counter + ": " + iterator + "  ");
            ++counter;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        vaTest(1);
        vaTest(2,3);
        vaTest(4,5,6);
    }

}
