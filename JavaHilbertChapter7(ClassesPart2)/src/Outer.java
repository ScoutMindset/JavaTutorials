/**
 * Created by jaturul on 28.01.16.
 */
public class Outer
{
    int outer_x;

    Outer()
    {
        outer_x = 0;
    }
    Outer(int n)
    {
        outer_x = n;
    }

    void test()
    {
        Inner innerTest = new Inner();
        innerTest.Display();
    }

    class Inner
    {
        void Display()
        {
            System.out.println("outer_x = " + outer_x);
        }
    }
}
