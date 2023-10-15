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

        System.out.println("***Motorcycle***");
        Motorcycle motocycle = new Motorcycle(80f,1);
        motocycle.getNumWheels();
        

        System.out.println("***Sail Boat***");
        SailBoat sboat = new SailBoat(100f, 7);
        sboat.getDirection();
        sboat.getNumSails();
        

        System.out.println("***Airplane***");
        Airplane airplane = new Airplane(900f,215);
        airplane.getNumWings() ;
        airplane.getNumPassengers();
        

    }

}
