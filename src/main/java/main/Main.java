/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


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
        
        ReadTxt txt = new ReadTxt();
        
        InitData dataBug = txt.getParametersInitBu();
        InitData dataLam = txt.getParametersInitLam();
        System.out.println("BUGATTI");
        System.out.println(dataBug.getDurationInS());
        System.out.println(dataBug.getDeadline());
        System.out.println(dataBug.getMountChasisInit());
        System.out.println(dataBug.getMountCarroceriaInit());
        System.out.println(dataBug.getMountRuedaInit());
        System.out.println(dataBug.getMountMotorInit());
        System.out.println(dataBug.getMountAccesorioInit());
        System.out.println(dataBug.getMountEnsambladorInit());
        
        System.out.println("LAMBORGHINI");
        System.out.println(dataLam.getDurationInS());
        System.out.println(dataLam.getDeadline());
        System.out.println(dataLam.getMountChasisInit());
        System.out.println(dataLam.getMountCarroceriaInit());
        System.out.println(dataLam.getMountRuedaInit());
        System.out.println(dataLam.getMountMotorInit());
        System.out.println(dataLam.getMountAccesorioInit());
        System.out.println(dataLam.getMountEnsambladorInit());
        
        
        
//        vpBu = new VehiclePlant("BUGATTI",72, 20,2,2,1,1,1,1);
//        vpLa = new VehiclePlant("LAMBORGHINI", 72, 20,2,2,1,1,1,1);
    }
    
}
