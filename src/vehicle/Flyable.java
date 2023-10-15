/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vehicle;

/**
 *
 * @author sweis/AdeliaAcacio
 */
   public interface Flyable extends Drivable {
    
    //PROPRIETIES
    float altitude = 0 ;
    
    
    //METHODS
    
    public void changeAltitude(float change);
    
    public float getAltitude();
    
    
    
}

  
