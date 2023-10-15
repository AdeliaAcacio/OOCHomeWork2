/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author AdeliaAcacio
 */
public class Motorcycle extends Vehicle implements Drivable{
    
    //Constructor

    public Motorcycle(float speed, int numPassengers) {
        super(speed, numPassengers);
    }
    
    // Add Method from Vehicle
    
     public int setNumWheels() {
        return numWheels = 2;
    }

    @Override
    public void accelerate(float speed) {
        this.getSpeed();
    }

    @Override
    public void brake() {
        
    }

    @Override
    public void turn(float angle) {
        
    }
    
    
    
    
    
}
