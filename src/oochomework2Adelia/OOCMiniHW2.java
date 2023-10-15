/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oochomework2Adelia;

import vehicle.Motorcycle;
import vehicle.SailBoat;
import vehicle.Airplane;

/**
 *
 * @author sweiss/AdeliaAcacio
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creating instance of the Motorcycle
        //set number of wheels, speed and numPassengers
        System.out.println("***Motorcycle***");
        Motorcycle motorcycle = new Motorcycle(80f,1);
        motorcycle.getNumWheels();
        motorcycle.setSpeed(0);
        
        //Creating instance of the SailBoat
        //set speed and numPassengers
        System.out.println("***SailBoat***");
        SailBoat sboat = new SailBoat(100f, 7);
        sboat.getDirection();
        sboat.getNumSails();
        sboat.isSailHoisted();
        
        //Creating instance of the Airplane 
        //set number of wings, speed and numPassengers
        System.out.println("***Airplane***");
        Airplane airplane = new Airplane(900f,215);
        airplane.setNumWings(2) ;
        airplane.changeAltitude(0);

    }

}
