/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Deck.Suit.HEARTS;
import static ca.sheridancollege.project.Deck.Suit.SPADES;
import static ca.sheridancollege.project.Deck.Value.JACK;
import static ca.sheridancollege.project.Deck.Value.KING;
import static ca.sheridancollege.project.Deck.Value.QUEEN;
import java.util.Scanner;

/**
 *
 * @author Laptop
 */
public class WarMain {
    public static void main(String args[])
    {
        WarGame wg= WarGame.getInstance("WarGame"); // since only one instance of WarGame is needed
        Scanner k=new Scanner(System.in);
        wg.dealCards();
        int rounds;
         while(true)
        {
            System.out.println("Press Y to continue or N to exit");
            //System.out.println("Press Y to continue or N to exit");
            String choice=k.nextLine();
            if(choice.equalsIgnoreCase("y"))
            {
                wg.play();
            }
            else
            {
                wg.declareWinner();
                rounds=wg.getRounds();
                System.out.println("Number of rounds: "+rounds);
                break;
            }
        }
        
    }
    
}
