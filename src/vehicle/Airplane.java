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
    
    // Override Methods
    
    @Override
    public void setNumPassengers(int numPassengers) {
        super.setNumPassengers(numPassengers); 
    }

    @Override
    public int getNumWings() {
        return super.getNumWings(); 
    }

    @Override
    public void changeAltitude(float change) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

   
    
}
