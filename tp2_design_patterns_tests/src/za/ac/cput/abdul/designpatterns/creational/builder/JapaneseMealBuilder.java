/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.creational.builder;

/**
 *
 * @author Abdul
 */
public class JapaneseMealBuilder implements MealBuilder{
    private Meal meal;
    
    public JapaneseMealBuilder(){
        meal = new Meal();
    }
    @Override
    public void buildDrink(){
        meal.setDrink("sake");
    }
        @Override
        public void buildMainCourse(){
        meal.setMainCourse("chicken teriyaki");
        }
        @Override
        public void buildSide(){
        meal.setSide("miso soup");
    }
        @Override 
        public Meal getMeal(){
        return meal;
    
        
        
    }
    
    
    
}
