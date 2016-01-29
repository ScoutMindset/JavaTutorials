/**
 * Created by jaturul on 29.01.16.
 */
class A
{
    int i,j;

    void showij()
    {
        System.out.println("Values of i and j are: " + i + " " + j);
    }
}

class B extends A
{
    int k;

    void showk()
    {
        System.out.println("Value of k is: " + k);
    }

    void sum()
    {
        System.out.println("i + j + k = " + (i + j + k));
    }
}
