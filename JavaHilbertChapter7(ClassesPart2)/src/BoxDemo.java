/**
 * Created by jaturul on 26.01.16.
 */
public class BoxDemo
{
    public static void main(String args[])
    {
        Box myBox1 = new Box();
        Box myBox2 = new Box(5);
        Box myBox3 = new Box(5,10,15);
        Box myBox4 = new Box(myBox3);

        System.out.println("The dimensions of the first box are: ");
        System.out.println("D: " + myBox1.ReadDepth() + " H: " + myBox1.ReadHeight() + " W:" + myBox1.ReadWidth());

        System.out.println("The dimensions of the second box are: ");
        System.out.println("D: " + myBox2.ReadDepth() + " H: " + myBox2.ReadHeight() + " W:" + myBox2.ReadWidth());

        System.out.println("The dimensions of the third box are: ");
        System.out.println("D: " + myBox3.ReadDepth() + " H: " + myBox3.ReadHeight() + " W:" + myBox3.ReadWidth());

        System.out.println("The dimensions of the fourth box are: ");
        System.out.println("D: " + myBox4.ReadDepth() + " H: " + myBox4.ReadHeight() + " W:" + myBox4.ReadWidth());
    }
}
