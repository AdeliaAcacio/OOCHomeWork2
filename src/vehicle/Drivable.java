/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vehicle;

/**
 *
 * @author sweis/AdeliaAcacio
 */
public interface Drivable{
    
    
    
    //abstract METHODS
    
    public void accelerate(float speed);
    public void brake();
    public void turn(float angle);//sail boat
    public float getDirection(); 
    public float getSpeed();   
    public String getMake();    
    public String getType();

}


    
  