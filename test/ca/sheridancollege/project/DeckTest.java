/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Deck.Suit.DIAMONDS;
import static ca.sheridancollege.project.Deck.Suit.HEARTS;
import static ca.sheridancollege.project.Deck.Value.FOUR;
import static ca.sheridancollege.project.Deck.Value.THREE;
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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of getValue method, of class Deck.
     */
    @Test
    public void testGetValueGood() {
        System.out.println("getValueGood");
        Deck instance = new Deck(HEARTS,THREE);
        Deck.Value expResult = THREE;
        Deck.Value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetValueBad() {
        System.out.println("getValueBad");
        Deck instance = new Deck(HEARTS,THREE);
        Deck.Value expResult = FOUR;
        Deck.Value result = instance.getValue();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testGetValueBoundary() {
        System.out.println("getValueBoundary");
        Deck instance = new Deck(HEARTS,THREE);
        Deck.Value expResult = THREE;
        Deck.Value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getSuit method, of class Deck.
     */
    @Test
    public void testGetSuitGood() {
        System.out.println("getSuitGood");
        Deck instance = new Deck(HEARTS,THREE);
        Deck.Suit expResult = HEARTS;
        Deck.Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetSuitBad() {
        System.out.println("getSuitBad");
        Deck instance = new Deck(HEARTS,THREE);
        Deck.Suit expResult = DIAMONDS;
        Deck.Suit result = instance.getSuit();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetSuitBoundary() {
        System.out.println("getSuitBoundary");
        Deck instance = new Deck(HEARTS,THREE);
        Deck.Suit expResult = HEARTS;
        Deck.Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of getCardValue method, of class Deck.
     */
    @Test
    public void testGetCardValueGood() {
        System.out.println("getCardValueGood");
        Deck instance = new Deck(HEARTS,THREE);
        int expResult = 3;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetCardValueBad() {
        System.out.println("getCardValueBad");
        Deck instance = new Deck(HEARTS,THREE);
        int expResult = 4;
        int result = instance.getCardValue();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testGetCardValueBoundary() {
        System.out.println("getCardValueBoundary");
        Deck instance = new Deck(HEARTS,THREE);
        int expResult = 3;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toStringGood");
        Deck instance = new Deck(HEARTS,THREE);
        String expResult = "HEARTS THREE";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testToStringBad() {
        System.out.println("toStringBad");
        Deck instance = new Deck(HEARTS,THREE);
        String expResult = "HEARTS FOUR";
        String result = instance.toString();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testToStringBoundary() {
        System.out.println("toStringBoundary");
        Deck instance = new Deck(HEARTS,THREE);
        String expResult = "HEARTS THREE";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
