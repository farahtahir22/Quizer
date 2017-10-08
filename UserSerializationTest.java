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
public class UserSerializationTest {
    
    public UserSerializationTest() {
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

    @org.junit.Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of save_list method, of class UserSerialization.
     */
    @Test
    public void testSave_list() {
        System.out.println("save_list");
        UserSerialization.save_list();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add_user method, of class UserSerialization.
     */
    @Test
    public void testAdd_user() {
        System.out.println("add_user");
        String username = "";
        String password = "";
        String userType = "";
        boolean expResult = false;
        boolean result = UserSerialization.add_user(username, password, userType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class UserSerialization.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String username = "";
        String password = "";
        boolean expResult = false;
        boolean result = UserSerialization.authenticate(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of load_list method, of class UserSerialization.
     */
    @Test
    public void testLoad_list() {
        System.out.println("load_list");
        UserSerialization.load_list();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
