/**
 * Created by jaturul on 22.01.16.
 */
public class BoxDemo
{
    public static void main(String args[])
    {
        Box myBox = new Box();
        double volume = 0;

        myBox.depth = 10;
        myBox.height = 15;
        myBox.width = 20;

        volume = myBox.depth * myBox.height * myBox.width;
        System.out.println("The volume of this program's box is " + volume);
    }
}
