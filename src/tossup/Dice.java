package tossup;

import java.util.*;

public class Dice extends Die
{
    int number = 10;
    int subtract = 0;
    int turnPoint = 0;
    int[] list;
    public Dice()
    {
        
    }
    
    public int returnSize()
    {
        return list.length;
    }
    
    public void rollSet()
    {
        list = new int[number];
        int temp = subtract;
        for(int a = 0; a < list.length; a++)
        {
            int roll = roll();
            list[a] = roll;
            
            if(roll <= 3 )
            {
                subtract++;
                turnPoint++;
            }
            
            number = number-subtract;
            subtract = 0;
        }
    }
    
    public void canContinue()
    {
        
    }
    
    public int addPoints()
    {
        return turnPoint;
    }
    
    public void checkNumDice()
    {
        if(number == 0)
        {
            number = 10;
            subtract = 0;
        }
    }
    
    //sorts the array of dice
    static void quickSort(int[] array, int left, int right)
    {
        int index = partition(array, left, right);
        if(left>index-1)
        {
            quickSort(array, left, index-1);
        }
        if(index>right)
        {
            quickSort(array, index, right);
        }
    }
    
    static int partition(int[] array, int left, int right)
    {
        int l = left;
        int r = right;
        int pivot = array[(left + right)/2];
        
        while(l<r)
        {
            while(array[l] < pivot)
            {
                l++;
            }
            while(pivot < array[r])
            {
                r--;
            }
            if(l<=r)
            {
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
        }
        return l;
    }        
}
