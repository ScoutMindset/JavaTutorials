/**
 * Created by jaturul on 26.01.16.
 */
public class ReturnObjectDemo
{
    public static void main(String args[])
    {
        ReturnObject example = new ReturnObject(5);
        System.out.println("The value of the object before incrementation by 10 is: " + example.ReadValue());

        ReturnObject example2 = example.IncreaseByTen();
        System.out.println("The value of the object incremented by 10 is: " + example2.ReadValue());
    }
}
