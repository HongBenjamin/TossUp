package tossup;

import java.util.Scanner;

public class TossUp 
{
    static Scanner kbReader = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("How many players are playing today?");
        int players = kbReader.nextInt();
        System.out.println("Enter your names.");
        
        createPlayer(players);
    }
    
    private static void createPlayer(int x)
    {
        if(x == 2)
        {
            System.out.println("What is Player 1's name?");
            String name = kbReader.nextLine();
            Player p1 = new Player(name);
            
            System.out.println("What is Player 2's name?");
            String name2 = kbReader.nextLine();
            Player p2 = new Player(name2);
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
        }
    }
}
