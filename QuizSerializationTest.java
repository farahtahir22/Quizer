/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farahtahir_bscs5a_123030;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Neha Tahir
 */
public class QuizSerializationTest {
    
    public QuizSerializationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save_quiz method, of class QuizSerialization.
     */
    @Test
    public void testSave_quiz() throws Exception {
        System.out.println("save_quiz");
        QuizSerialization.save_quiz();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of load_quiz method, of class QuizSerialization.
     */
    @Test
    public void testLoad_quiz() {
        System.out.println("load_quiz");
        QuizSerialization.load_quiz();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add_quiz method, of class QuizSerialization.
     */
    @Test
    public void testAdd_quiz() {
        System.out.println("add_quiz");
        boolean expResult = false;
        boolean result = QuizSerialization.add_quiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
