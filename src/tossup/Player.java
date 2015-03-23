package tossup;

public class Player extends Dice
{
    String name;
    int currentPoints;
    
    public Player(String name)
    {
        this.name = name;
        currentPoints = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void RollDice()
    {
        rollSet();
        addPoints();
    }
    
    private int getPoints()
    {
        return currentPoints;
    }
    
    private boolean loseGame()
    {
        return false;
    }
    
    public boolean endTurn()
    {
        return true;
    }
}
