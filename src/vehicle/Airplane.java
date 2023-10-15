/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author AdeliaAcacio
 */
public class Airplane extends Vehicle implements Flyable {
    
    //Constructor

    public Airplane(float speed, int numPassengers) {
        super(speed, numPassengers);
    }
    
    // Added Override Methods
    
    @Override
    public int getNumWings() {
        return super.getNumWings(); 
    }

    @Override
    public float getAltitude() {
        return 0;
        
    }

    @Override
    public void changeAltitude(float change) {
        this.getAltitude();
        this.setDirection(altitude);
    }

    @Override
    public void turn(float angle) {
        
    }

    @Override
    public void accelerate(float speed) {
    }
    
    @Override
    public void brake() {
        
    }
    
    

   
    
}
