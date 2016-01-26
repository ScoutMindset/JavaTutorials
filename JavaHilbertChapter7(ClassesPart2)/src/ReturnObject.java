/**
 * Created by jaturul on 26.01.16.
 */
public class ReturnObject
{
    private int i;

    ReturnObject()
    {
        i = 0;
    }

    ReturnObject(int value)
    {
        SetValue(value);
    }

    void SetValue(int value)
    {
        i = value;
    }

    int ReadValue()
    {
        return i;
    }

    ReturnObject IncreaseByTen()
    {
        ReturnObject result = new ReturnObject(i + 10);

        return result;
    }
}
