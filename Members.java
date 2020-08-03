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
public abstract class Members {
    private String name;

    
    public Members(){
        
    }
    
    public Members(String name){
        this.name = name;

    }
    
    //setters
    public void setName(String name){
        this.name = name;
    }
    

    
    //getters
    public String getName(){
        return name;
    }
    

    //////////////////////asbtract methods
    //add user
    public abstract void addMember(String name);
    
    //remove user
    public abstract void removeMember(String name);
    
    //total members
    public abstract int getTotalMembers();
    
    
    
    
    
}
