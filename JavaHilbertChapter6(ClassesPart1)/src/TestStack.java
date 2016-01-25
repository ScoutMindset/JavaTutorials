/**
 * Created by jaturul on 25.01.16.
 */
public class TestStack
{
    public static void main(String args[])
    {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //place numbers on stacks
        for (int ii = 0; ii < 10; ++ii)
        {
            myStack1.push(ii);
            myStack2.push(ii + 10);
        }

        System.out.println("myStack1:");
        for(int ii = 0; ii < 10; ++ii)
            System.out.println(myStack1.pop());

        System.out.println("myStack2:");
        for(int ii = 0; ii < 10; ++ii)
            System.out.println(myStack2.pop());
    }
}
