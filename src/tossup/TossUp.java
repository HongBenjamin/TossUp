package tossup;

import java.util.*;

public class TossUp 
{
    static Scanner kbReader = new Scanner(System.in);
    static ArrayList<Player> list = new ArrayList<>();
    static int[] points;
    static int players;
    static boolean finished = false;
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Toss Up, an obscure dice game now available to play on any java supported devices!");
        System.out.println("The point of the game is to have the most points! Each turn, you will roll 10 dice, each of which are numbered 1-6.");
        System.out.println("You get one point for each die that lands 1-3, and no points for the die that land 4-6.");
        System.out.println("HOWEVER, if you land all 6's, you will lose all the points you accumulated that turn and then the game will move on to the next player!");
        System.out.println("If a player ends their turn with over 100 points, then the game will go into SUDDEN DEATH mode. Every player except the player that intiated the mode will get ONE more change to beat the top score!");
        System.out.println("So good luck to all you players! And may the odds be ever in your favor...");
        System.out.println("\nHow many players are playing today? This game supports between 2-6 players.");
        players = kbReader.nextInt();
        
        if(players <2 || players > 6)
        {
            System.out.println("Didn't you read? This game only supports between 2-6 players!"
            +"\nThe game cannot withstand such an insult and will now terminate. Please try again later.");
            finished = true;
        }
        else
        {
            playGame();
        }        
    }
    
    private static void playGame()
    {                
        createPlayer(players);
        System.out.println(" ");
        
        while(!finished)
        {
            for(int a = 0; a < players; a++)
            {
                Player temp1 = list.get(a);
                boolean turnFinished = false;
                while(!turnFinished)
                {
                    System.out.println("Hey " + temp1.getName() + ", it's your turn! What would you like to do?");
                    System.out.println("[Roll, End Turn]");
                    String command = kbReader.nextLine();
                    switch(command.toLowerCase())
                    {
                        case "roll":
                            temp1.RollDice();
                            if(temp1.endTurn())
                            {
                                turnFinished = true;
                                temp1.subtractPoints();
                                System.out.println("Oh no! You've rolled all 6's, which means you lose the points you've gained this turn! :(");
                                System.out.println("Your total is now back to where it was before your turn: " + temp1.total() + " points.");
                                System.out.println("Hopefully you'll be more lucky next turn! NEXT!!!");
                                break;
                            }
                            else if(temp1.almostEndTurn())
                            {
                                System.out.println("Whoa there! You may have not rolled all 6's, but you didn't roll any dice that gives you points!");
                                System.out.println("To keep going or not to keep going...that is the question...");
                                break;
                            }
                            else
                            {
                                System.out.println("Nice roll! You've rolled " + temp1.getRollPoints() + " good die/dice and your points this turn is now " + temp1.getTurn() + " points!");
                                System.out.println("Care to try your luck once more?");
                            }                            
                            break;
                        case "end turn":
                            System.out.println("You have decided to end your turn and you are now at " + temp1.total() + " points. Are you scared? Or was that simply a strategic move? I guess we'll see...");
                            System.out.println(" ");
                            turnFinished = true;
                            temp1.resetTurn();
                            break;
                    }
                }
            }
        }
    }    
    
    private static void createPlayer(int x)
    {        
        System.out.println("Please enter your names.");
        if(x == 2)
        {
            String blank = kbReader.nextLine();
            System.out.println("What is Player 1's name?");
            String name = kbReader.nextLine();
            Player p1 = new Player(name);
            
            System.out.println("What is Player 2's name?");
            String name2 = kbReader.nextLine();
            Player p2 = new Player(name2);
            
            list.add(p1);
            list.add(p2);
        }
        else if(x == 3)
        {
            String blank = kbReader.nextLine();
            System.out.println("What is Player 1's name?");
            String name = kbReader.nextLine();
            Player p1 = new Player(name);
            
            System.out.println("What is Player 2's name?");
            String name2 = kbReader.nextLine();
            Player p2 = new Player(name2);
            
            System.out.println("What is Player 3's name?");
            String name3 = kbReader.nextLine();
            Player p3 = new Player(name3);
            
            list.add(p1);
            list.add(p2);
            list.add(p3);
        }
        else if(x == 4)
        {
            String blank = kbReader.nextLine();
            System.out.println("What is Player 1's name?");
            String name = kbReader.nextLine();
            Player p1 = new Player(name);
            
            System.out.println("What is Player 2's name?");
            String name2 = kbReader.nextLine();
            Player p2 = new Player(name2);
            
            System.out.println("What is Player 3's name?");
            String name3 = kbReader.nextLine();
            Player p3 = new Player(name3);
            
            System.out.println("What is Player 4's name?");
            String name4 = kbReader.nextLine();
            Player p4 = new Player(name4);
            
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);
        }
        else if(x == 5)
        {
            String blank = kbReader.nextLine();
            System.out.println("What is Player 1's name?");
            String name = kbReader.nextLine();
            Player p1 = new Player(name);
            
            System.out.println("What is Player 2's name?");
            String name2 = kbReader.nextLine();
            Player p2 = new Player(name2);
            
            System.out.println("What is Player 3's name?");
            String name3 = kbReader.nextLine();
            Player p3 = new Player(name3);
            
            System.out.println("What is Player 4's name?");
            String name4 = kbReader.nextLine();
            Player p4 = new Player(name4);
            
            System.out.println("What is Player 5's name?");
            String name5 = kbReader.nextLine();
            Player p5 = new Player(name5);
            
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);
            list.add(p5);
        }
        else if(x == 6)
        {
            String blank = kbReader.nextLine();
            System.out.println("What is Player 1's name?");
            String name = kbReader.nextLine();
            Player p1 = new Player(name);
            
            System.out.println("What is Player 2's name?");
            String name2 = kbReader.nextLine();
            Player p2 = new Player(name2);
            
            System.out.println("What is Player 3's name?");
            String name3 = kbReader.nextLine();
            Player p3 = new Player(name3);
            
            System.out.println("What is Player 4's name?");
            String name4 = kbReader.nextLine();
            Player p4 = new Player(name4);
            
            System.out.println("What is Player 5's name?");
            String name5 = kbReader.nextLine();
            Player p5 = new Player(name5);
            
            System.out.println("What is Player 6's name?");
            String name6 = kbReader.nextLine();
            Player p6 = new Player(name6);
            
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);
            list.add(p5);
            list.add(p6);
        }
    }
}