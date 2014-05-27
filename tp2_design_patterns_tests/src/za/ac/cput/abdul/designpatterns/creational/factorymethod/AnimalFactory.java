/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.creational.factorymethod;

import za.ac.cput.abdul.designpatterns.creational.singleton.SingletonExample;

/**
 *
 * @author Abdul
 */
public class AnimalFactory {
    
    private static AnimalFactory animalFactory = null;
    
    private AnimalFactory(){
        }
         
     public static AnimalFactory getAnimalFactoryInstance(){
        if(animalFactory == null){
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
     
    public Animal getAnimal(String type){
        if("canine".equals(type)){
            return new Dog();
        }
        else{
            return new Cat();
        }
     }
    
    
}
