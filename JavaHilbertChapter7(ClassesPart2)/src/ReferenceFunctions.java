/**
 * Created by jaturul on 26.01.16.
 */
public class ReferenceFunctions
{
    int i;
    int j;

    ReferenceFunctions()
    {
        i = 0;
        j = 0;
    }

    ReferenceFunctions(int a, int b)
    {
        i = a;
        j = b;
    }

    public void Modify(ReferenceFunctions ob)
    {
        ob.i *= 2;
        ob.j *= 2;
    }
}
