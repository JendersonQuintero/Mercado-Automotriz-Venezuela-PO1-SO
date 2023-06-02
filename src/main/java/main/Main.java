/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import interfaces.MainView;


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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });

//        ReadTxt txt = new ReadTxt();
//        
//       InitData dataInit = txt.getParametersInit();
//
//        vpBu = new VehiclePlant("BUGATTI",
//                6, 
//                dataInit.getDeadline(),
//                dataInit.getMountChasisInit(),
//                dataInit.getMountCarroceriaInit(),
//                dataInit.getMountMotorInit(),
//                dataInit.getMountRuedaInit(),
//                dataInit.getMountAccesorioInit(),
//                dataInit.getMountEnsambladorInit());
//        
//        vpLa = new VehiclePlant("LAMBORGHINI",
//                12, 
//                dataInit.getDeadline(),
//                dataInit.getMountChasisInit(),
//                dataInit.getMountCarroceriaInit(),
//                dataInit.getMountCarroceriaInit(),
//                dataInit.getMountRuedaInit(),
//                dataInit.getMountAccesorioInit(),
//                dataInit.getMountEnsambladorInit());
//        
//        vpBu.start();
//        vpLa.start();
    }
    
}
