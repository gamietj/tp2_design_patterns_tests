/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.singleton;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.abdul.designpatterns.creational.singleton.SingletonExample;

/**
 *
 * @author Khulsum
 */
public class Singleton_Junit_Test {
    
    SingletonExample singletonExample = SingletonExample.getInstance();
    
    public Singleton_Junit_Test() {
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
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Sayhello() 
     {
         Assert.assertEquals(singletonExample.sayHello(),"Hello");
         
     }
}
