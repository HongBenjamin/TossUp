package tossup;

public class Dice extends Die
{
    int number = 10;
    public int rollPoint = 0;
    int caution = 0;
    int redLight = 0;
    int[] list = new int[0];
    public boolean keepGoing = true;
    public boolean warning = false;
    public Dice()
    {
        
    }
    
    public int returnSize()
    {
        return list.length;
    }
    
    public void rollSet()
    {
        rollPoint = 0;
        caution = 0;
        redLight = 0;
        checkNumDice();
        keepGoing = true;
        warning = false;
        list = new int[number];
        
        System.out.print("| ");
        for(int a = 0; a < list.length; a++)
        {
            int roll = roll();
            list[a] = roll;
            
            if(roll <= 3 )
            {
                rollPoint++;//the die lands on 1, 2, or 3
            }
            else if(roll < 3 && roll > 6)
            {
                caution++;//the die lands on 4 or 5
            }
            else
            {
                redLight++;//the die lands on a 6
            }
            System.out.print(roll + " | ");
        }
        
        if(redLight == number)//player rolls all 6's
        {
            number = 10;
            keepGoing = false;
        }
        else if(caution == number)//player does not score any points
        {
            warning = true;
        }
        else//player scores at least 1 point
        {
            number = number-rollPoint;         
            keepGoing = true;
        }
    }
            
    public void checkNumDice()
    {
        if(number == 0)
        {
             number = 10;
        }
    }
}
