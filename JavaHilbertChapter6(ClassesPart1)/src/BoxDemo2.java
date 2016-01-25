/**
 * Created by jaturul on 25.01.16.
 */
public class BoxDemo2
{
    public static void main(String args[])
    {
        Box myBox1 = new Box(10,15,20);
        System.out.println("The volume of the first box is " + myBox1.ComputeVolume());

        Box myBox2 = new Box(25,30,35);
        System.out.println("The volume of the first box is " + myBox2.ComputeVolume());
    }
}
