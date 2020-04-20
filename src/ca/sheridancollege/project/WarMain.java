/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Laptop
 */
public class WarMain {
    public static void main(String args[])
    {
        WarGame wg=new WarGame("WarGame");
        Scanner k=new Scanner(System.in);
        wg.dealCards();
        int rounds=0;
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
