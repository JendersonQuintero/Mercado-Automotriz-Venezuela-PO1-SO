/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import main.vehiclePlantBu.VehiclePlant;

/**
 *
 * @author JendersonQ
 */
public class Main {

    public static VehiclePlant vpBu;
    public static VehiclePlant vpLa;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        vpBu = new VehiclePlant("BUGATTI",72, 20,2,2,1,1,1,1);
        vpLa = new VehiclePlant("LAMBORGHINI", 72, 20,2,2,1,1,1,1);
    }
    
}
