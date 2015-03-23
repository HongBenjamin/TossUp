package tossup;

import java.util.*;

public class Die 
{
    int arr[];
    Random rdm = new Random();

    public Die() 
    {
        this.arr = new int[]{1, 2, 3, 4, 5, 6};
    }
    
    public int roll()
    {
        int value = arr[rdm.nextInt(arr.length)];
        return value;
    }
}
