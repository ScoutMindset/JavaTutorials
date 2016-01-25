/**
 * Created by jaturul on 25.01.16.
 */
public class Stack
{
    int stackData[] = new int[10];
    int topIndex;

    Stack()
    {
        topIndex = -1;
    }

    void push(int x)
    {
        if(topIndex < 10)
        {
            topIndex++;
            stackData[topIndex] = x;
        }
        else
            System.out.println("The stack is full!");
    }

    int pop()
    {
        if(topIndex > -1)
        {
            topIndex--;
            return stackData[topIndex+1];
        }
        else
        {
            System.out.println("The stack is empty!");
            return 0;
        }
    }
}
