/**
 * Created by jaturul on 22.01.16.
 */
public class ForEach2
{
    public static void main(String args[])
    {
        int sum = 0;
        int numbers[][] = new int[3][5];

        for (int ii = 0; ii < 3; ++ii)
        {
            for (int jj = 0; jj < 5; ++jj) {
                numbers[ii][jj] = (ii + 1) * (jj + 1);
                System.out.print("[" + ii + ", " + jj + "] - " + numbers[ii][jj]);
                if (numbers[ii][jj]>9)
                    System.out.print(" ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        for(int[] row: numbers)
        {
            for(int columnElement: row)
            {
                System.out.print(columnElement);
                if (columnElement>9)
                    System.out.print(" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
