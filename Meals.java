/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messmanagement;

/**
 *
 * @author peyash
 */
public abstract class Meals {
    
    private int totalMeals;
    
    public Meals(){
        
    }
    
    public Meals(int totalMeals){
        this.totalMeals = totalMeals;
    }
    
    
    // Abstract Methods
    public abstract int getTotalMeals();
    
    public abstract void setTotalMeals(int totalMeals);
    
   
}
