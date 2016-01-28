/**
 * Created by jaturul on 28.01.16.
 */
public class InnerClassDemo
{
    public static void main(String Args[])
    {
        Outer outerExample1 = new Outer();
        Outer outerExample2 = new Outer(100);
        outerExample1.test();
        outerExample2.test();
    }
}
