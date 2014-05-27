/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.factorymethod;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.abdul.designpatterns.creational.factorymethod.Animal;
import za.ac.cput.abdul.designpatterns.creational.factorymethod.AnimalFactory;
import za.ac.cput.abdul.designpatterns.creational.singleton.SingletonExample;

/**
 *
 * @author Khulsum
 */
public class factorymethod_Junit_Test {
    
    AnimalFactory animalFactory = AnimalFactory.getAnimalFactoryInstance();
    
    public factorymethod_Junit_Test() {
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
     public void makeSound() 
     {
         Animal a1 = animalFactory.getAnimal("feline");
         Assert.assertEquals(a1.makeSound(),"Meow");
         Animal a2 = animalFactory.getAnimal("canine");
         Assert.assertEquals(a2.makeSound(),"Woof");
         
     }
}
