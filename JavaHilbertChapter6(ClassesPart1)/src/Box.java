/**
 * Created by jaturul on 22.01.16.
 */
public class Box
{
    double depth;
    double height;
    double width;

    Box(double d, double h, double w)
    {
        SetDimensions(d,h,w);
    }

    double ComputeVolume()
    {
        return depth * width * height;
    }

    void SetDimensions(double d, double h, double w)
    {
        depth = d;
        height = h;
        width = w;
    }
}
