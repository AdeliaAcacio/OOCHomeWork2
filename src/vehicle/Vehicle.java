/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author sweis/AdeliaAcacio
 */
public abstract class Vehicle {
    
    //PROPRIETIES 
    
    private float speed;
    private float direction = 0;
    private String make; //drive - air, sea, road 
    private String type; //Motocycle, Airplane, SailBoat
    
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    
    private int numPassengers;
    
    public Vehicle(){
        System.out.println("Vehicle 1");
    }
    //CONSTRUCTORS (all class can use coz it is public)
    
    public Vehicle(float speed, String make, String type, int numPassengers) {
        this.speed = speed;
        this.make = make;
        this.type = type; 
        this.numPassengers = numPassengers;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDirection() {
        return direction;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumWings() {
        return numWings;
    }

    public void setNumWings(int numWings) {
        this.numWings = numWings;
    }

    public int getNumSails() {
        return numSails;
    }

    public void setNumSails(int numSails) {
        this.numSails = numSails;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    
  
}

