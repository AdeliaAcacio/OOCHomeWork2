/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author AdeliaAcacio
 */
public class SailBoat extends Vehicle implements Sailable{
    
    //Constructor

    public SailBoat(float speed, int numPassengers) {
        super(speed, numPassengers);
    }
    
    
/*
    public SailBoat(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
  */
        
    //All abstract Method implemented
    
    

    @Override
    public float getDirection() {
        return super.getDirection();
       
    }

    @Override
    public void hoistSail() {
        
    }

    @Override
    public void lowerSail() {
      
    }

    @Override
    public boolean isSailHoisted() {
        return true;
        
    }

  

    @Override
    public void landHo() {
        
    }
    
  
    
}
