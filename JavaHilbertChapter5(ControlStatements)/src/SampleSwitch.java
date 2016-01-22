/**
 * Created by jaturul on 22.01.16.
 */
public class SampleSwitch
{
    public static void main(String args[])
    {
        for (int ii = 0; ii < 6; ++ii)
        {
            switch(ii)
            {
                case 0:
                    System.out.println("The value of ii is zero");
                    break;
                case 1:
                    System.out.println("The value of ii is one");
                    break;
                case 2:
                    System.out.println("The value of ii is two");
                    break;
                case 3:
                    System.out.println("The value of ii is three");
                    break;
                default:
                    System.out.println("The value of ii is more than three");
                    break;
            }
        }
    }
}
