/**
 * Created by jaturul on 29.01.16.
 */
class SimpleInheritanceDemo
{
    public static void main(String args[])
    {
        A superOb = new A();
        B subOb = new B();

        // Base class operations
        superOb.i = 10;
        superOb.j = 20;

        System.out.println("The content of \"superOb\": ");
        superOb.showij();

        // Child class operations
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("The content of \"subOp\": ");
        subOb.showij();
        subOb.showk();

        System.out.println("The sum of i, j and k in \"subOp\": ");
        subOb.sum();
    }



}
