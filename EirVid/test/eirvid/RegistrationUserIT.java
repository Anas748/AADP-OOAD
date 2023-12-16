/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package eirvid;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class RegistrationUserIT {
    
    public RegistrationUserIT() {
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

   @Test
    public void testConstructor1() {
        // Create a RegistrationUser instance
        RegistrationUser user = new RegistrationUser("John Doe", "john.doe@example.com", "passwr");
        // Verify the user attributes
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("passwr", user.getPassword());
    }
      @Test
    public void testConstructor2() {
        RegistrationUser user = new RegistrationUser("John Doe", "john.doe@example.com", "pass123");
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("passA23", user.getPassword());
    }
       @Test
       public void testConstructor3() {
        RegistrationUser user = new RegistrationUser("Joe", "joeexample.com", "passrd");
        assertEquals("Joe", user.getName());
        assertEquals("joe@example.com", user.getEmail());
        assertEquals("passrd", user.getPassword());
    }
       @Test
       public void testConstructor4() {
        RegistrationUser user = new RegistrationUser("Jo", "joeexample.com", "passrd");
        assertEquals("Joe", user.getName());
        assertEquals("joe@example.com", user.getEmail());
        assertEquals("passrd", user.getPassword());
    }
    
}
