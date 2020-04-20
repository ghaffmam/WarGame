/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.LinkedList;
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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of addCards method, of class GroupOfCards.
     */
    @Test
    public void testAddCardsGood() {
        System.out.println("addCardsGood");
        GroupOfCards instance = new GroupOfCards(52);
       
        ArrayList<Deck> result = instance.addCards();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testAddCardsBad() {
        System.out.println("addCardsBad");
        GroupOfCards instance = new GroupOfCards(52);
       
        ArrayList<Deck> result = null;
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddCardsBoundary() {
        System.out.println("addCardsBoundary");
        GroupOfCards instance = new GroupOfCards(52);
       
        ArrayList<Deck> result = instance.addCards();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of showCards method, of class GroupOfCards.
     */
   // @Test
   /* public void testShowCards() {
        System.out.println("showCards");
        LinkedList<Deck> deck = null;
        GroupOfCards instance = null;
        instance.showCards(deck);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSizeGood() {
        System.out.println("getSizeGood");
        GroupOfCards instance = new GroupOfCards(52);
        int expResult = 52;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetSizeBad() {
        System.out.println("getSizeBad");
        GroupOfCards instance = new GroupOfCards(52);
        int expResult = 50;
        int result = instance.getSize();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetSizeBoundary() {
        System.out.println("getSizeBoundary");
        GroupOfCards instance = new GroupOfCards(52);
        int expResult = 52;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


   
    /**
     * Test of generateCards method, of class GroupOfCards.
     */
   // @Test
  /*  public void testGenerateCards() {
        System.out.println("generateCards");
        GroupOfCards instance = null;
        instance.generateCards();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
}
