/**
 * Created by jaturul on 26.01.16.
 */

public class Box
{
    private double depth;
    private double width ;
    private double height;
    Box()
    {
        depth = 0;
        width = 0;
        height = 0;
    }

    Box(double init)
    {
        depth = init;
        width = init;
        height = init;
    }

    Box(double depthInit, double widthInit, double heightInit)
    {
        depth = depthInit;
        width = widthInit;
        height = heightInit;
    }

    Box(Box boxInit)
    {
        depth = boxInit.ReadDepth();
        height = boxInit.ReadHeight();
        width = boxInit.ReadWidth();
    }

    public void SetWidth(double w)
    {
        width = w;
    }

    public void SetHeight(double h)
    {
        height = h;
    }

    public void SetDepth(double d)
    {
        depth = d;
    }

    public double ReadWidth()
    {
        return width;
    }

    public double ReadHeight()
    {
        return height;
    }

    public double ReadDepth()
    {
        return depth;
    }
}
