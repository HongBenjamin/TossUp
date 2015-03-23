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
        System.out.println("Welcome to Toss Up, an obscure dice game now available to play on any java supported devices!"
                + "\nHow many players are playing today? This game supports between 2-6 players.");
        players = kbReader.nextInt();
        
        if(players <2 || players > 6)
        {
            System.out.println("Didn't you read? This game only supports between 2-6 players!"
            +"\nThe game will now terminate. Please try again.");
            finished = true;
        }
        else
        {
            playGame();
            endGame();
        }        
    }
    
    private static void playGame()
    {                
        createPlayer(players);
        
        while(!finished)
        {
            for(int a = 0; a < players; a++)
            {
                Player temp1 = list.get(a);
                boolean turnFinished = false;
                while(!turnFinished)
                {
                    System.out.println("Hey " temp1.getName() + "! It's your turn! What would you like to do?")
                    System.out.println("[Roll, End Turn]");
                    String command = kbReader.nextLine;
                    
                }
            }
        }
    }
    
    private static void endGame()
    {
        
    }
    
    private static void createPlayer(int x)
    {
        System.out.println("Please enter your names.");
        if(x == 2)
        {
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