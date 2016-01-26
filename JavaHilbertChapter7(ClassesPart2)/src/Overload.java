/**
 * Created by jaturul on 26.01.16.
 */
public class Overload
{
    void test()
    {
        System.out.println("This is the message of the empty test() function");
    }

    void test(int a)
    {
        System.out.println("This is the message of the integer test() function\n a = " + a);
    }

    void test(double b)
    {
        System.out.println("This is the message of the double test() function\n b = " + b);
    }
}
