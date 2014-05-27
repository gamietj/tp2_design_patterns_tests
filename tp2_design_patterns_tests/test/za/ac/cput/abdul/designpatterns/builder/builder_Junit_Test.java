/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.builder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.abdul.designpatterns.creational.builder.ItalianMealBuilder;
import za.ac.cput.abdul.designpatterns.creational.builder.JapaneseMealBuilder;
import za.ac.cput.abdul.designpatterns.creational.builder.Meal;
import za.ac.cput.abdul.designpatterns.creational.builder.MealBuilder;
import za.ac.cput.abdul.designpatterns.creational.builder.MealDirector;

/**
 *
 * @author Khulsum
 */
public class builder_Junit_Test {
    
      MealBuilder mealBuilder = new ItalianMealBuilder();
    
    public builder_Junit_Test() {
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
     public void Meal() {
   
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        Assert.assertEquals(meal.toString(),"drink:red wind, main course:pizza, side:bread");
        
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        Assert.assertEquals(meal.toString(),"drink:sake, main course:chicken teriyaki, side:miso soup");
     }
}
