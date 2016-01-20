/**
 * Created by jaturul on 20.01.16.
 */
public class Light
{
    public static void main(String args[])
    {
        int lightspeed = 0;
        long days = 0;
        long seconds = 0;
        long distance = 0;

        lightspeed = 299792;

        days = 1000;

        distance = days * lightspeed * days * 24 * 60 * 60;

        System.out.print("In " + days);
        System.out.print(" light will travel ");
        System.out.println(distance + " metres.");
    }
}
