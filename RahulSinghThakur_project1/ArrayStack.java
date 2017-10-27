//Rahul Singh Thakur

import java.util.EmptyStackException;

public class ArrayStack extends ListStack implements DStack {
    static int maximum = 10;
    int top;
    double data[] = new double[maximum];


    @Override
    public boolean isEmpty() {
        return (top < 0);
    }

    ArrayStack() {
        top = -1;
    }

    @Override
    public boolean push(double d) {
        if (isFull()) {
            expandArray();
        }
        data[++top] = d;
        return true;
    }

    @Override
    public double pop() {
        if (top < 0) {
            throw new EmptyStackException();
        } else {
            double d = data[top--];
            return d;
        }
    }

    @Override
    public double peek() {
        if (top < 0)
            throw new EmptyStackException();
        else
            return data[top];
    }

    //new function in order to increase array length

    public void expandArray() {
        int curr_size = top;
        double[] new_array = new double[curr_size * 2];
        for (int i = 0; i < curr_size; i++) {
            new_array[i] = data[i];
        }
        data = new_array;              
        maximum = new_array.length;
    }

    public boolean isFull() {
        if (maximum == top + 1)
            return true;
        else
            return false;
    }

}

