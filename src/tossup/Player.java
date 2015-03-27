package tossup;

public class Player extends Dice
{
    String name;
    int currentPoints;
    public int turn;
    int totalPoints;
    
    public Player(String name)
    {
        this.name = name;
        currentPoints = 0;
        turn = 0;
        totalPoints = 0;
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
    
    private void addPoints()//adds points
    {
        totalPoints = totalPoints + rollPoint;
        turn = turn + rollPoint;
    }
    
    public void subtractPoints()//reverts the total points back to the value it was before the turn
    {
        totalPoints = totalPoints - turn;
        turn = 0;
    }
    
    public int getRollPoints()//returns the points rolled this roll
    {
        return rollPoint;
    }
    
    public int getTurn()//returns the points accumulated this turn
    {
        return turn;
    }
    
    public void resetTurn()//resets the turn
    {
        turn = 0;
    }
        
    public int total()//returns total
    {
        return totalPoints;
    }
    
    private boolean loseGame()//this does nothing right now
    {
        return false;
    }
    
    public boolean endTurn()//end the turn
    {
        return !keepGoing;
    }
    
    public boolean almostEndTurn()//almost ends the turn
    {
        return warning;
    }
}
