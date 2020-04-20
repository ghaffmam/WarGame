/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Deck.Suit.HEARTS;
import static ca.sheridancollege.project.Deck.Suit.SPADES;
import static ca.sheridancollege.project.Deck.Value.KING;
import static ca.sheridancollege.project.Deck.Value.QUEEN;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laptop
 */
public class WarGameTest {

    public WarGameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing class starts");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Testing class finishes");
    }

    @Before
    public void setUp() {
        System.out.println("Testing method starts");
    }

    @After
    public void tearDown() {
        System.out.println("Testing method finishes");
    }

    /**
     * Test of dealCards method, of class WarGame.
     */
    /*
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        WarGame instance = null;
        instance.dealCards();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getRounds method, of class WarGame.
     */
    /*
    @Test
    public void testGetRounds() {
        System.out.println("getRounds");
        WarGame instance = null;
        int expResult = 0;
        int result = instance.getRounds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of compareCards method, of class WarGame.
     */
    @Test
    public void testCompareCardsGood() {
        System.out.println("compareCardsGood");
        Deck one = new Deck(HEARTS,KING);
        Deck two = new Deck(SPADES,QUEEN);
        WarGame instance = WarGame.getInstance("WarGame");
        int expResult = 1;
        int result = instance.compareCards(one, two);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCompareCardsBad() {
        System.out.println("compareCardsBad");
        Deck one = new Deck(HEARTS,QUEEN);
        Deck two = new Deck(SPADES,KING);
        WarGame instance = WarGame.getInstance("WarGame");
        int expResult = -1;
        int result = instance.compareCards(one, two);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCompareCardsBoundary() {
        System.out.println("compareCardsBoundary");
        Deck one = new Deck(HEARTS,KING);
        Deck two = new Deck(SPADES,KING);
        WarGame instance = WarGame.getInstance("WarGame");
        int expResult = 0;
        int result = instance.compareCards(one, two);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of play method, of class WarGame.
     */
    /*
    @Test
    public void testPlay() {
        System.out.println("play");
        WarGame instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of declareWinner method, of class WarGame.
     */
    /*@Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        WarGame instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

}
