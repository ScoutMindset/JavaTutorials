/**
 * Created by jaturul on 21.01.16.
 */
public class Conversion
{
    public static void main(String args[])
    {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nInt to byte conversion.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("\nDouble to int conversion.");
        i = (int) d;
        System.out.println("i and d " + i + " " + d);

        System.out.println("\nDouble to byte conversion.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }

}
