/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author JendersonQ
 */
public class ReadTxt {

    private final String dirTxtBu = "parametros\\pInitBu.txt";
    private final String dirTxtLam = "parametros\\pInitLam.txt";
    private final File txtBu = new File(dirTxtBu);
    private final File txtLam = new File(dirTxtLam);
    public InitData saveDataBu;
    public InitData saveDataLam;

    /**
     * Constructor del txt
     */
    public ReadTxt() {
        this.saveDataBu = new InitData();
        this.saveDataLam = new InitData();
        try {
            if (txtBu.exists()) {
            } else {
                txtBu.createNewFile();
            }
            
            if (txtLam.exists()) {
            } else {
                txtLam.createNewFile();
            }
        } catch (IOException e) {
        }
    }

    /**
     * Escribe los datos ingresados por el usuario en el txt.
     *
     * @param dato
     */
    public void escribirTxt(String dato) {
        try (BufferedWriter escribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(txtBu, true)))) {
            escribe.write(dato);
            escribe.close();
        } catch (IOException e) {
        }
    }

    /**
     * Almacena el contenido del txt en un String.
     *
     * @return String
     */
    public InitData getParametersInitBu() {
        try {
            BufferedReader bF = new BufferedReader(new FileReader(dirTxtBu));
            String temp = "";
            String bfRead;
            while ((bfRead = bF.readLine()) != null) {
                temp += bfRead;
            }
            String[] partes = temp.split("/");
            for (String parameter : partes) {
                String[] pParameter = parameter.split(":");
                
                for (int i = 0; i < pParameter.length; i++) {
                    switch (pParameter[0]) {
                        case "DURACION" -> this.saveDataBu.setDurationInS(Integer.parseInt(pParameter[1]));
                        case "DEADLINE" -> this.saveDataBu.setDeadline(Integer.parseInt(pParameter[1]));
                        case "TCHASIS" -> this.saveDataBu.setMountChasisInit(Integer.parseInt(pParameter[1]));
                        case "TCARROCERIA" -> this.saveDataBu.setMountCarroceriaInit(Integer.parseInt(pParameter[1]));
                        case "TRUEDA" -> this.saveDataBu.setMountRuedaInit(Integer.parseInt(pParameter[1]));
                        case "TMOTOR" -> this.saveDataBu.setMountMotorInit(Integer.parseInt(pParameter[1]));
                        case "TACCESORIO" -> this.saveDataBu.setMountAccesorioInit(Integer.parseInt(pParameter[1]));
                        case "TENSAMBLADOR" -> this.saveDataBu.setMountEnsambladorInit(Integer.parseInt(pParameter[1]));
                        default -> {}
                    }
                }
            }
        } catch (IOException e) {
        }
        return this.saveDataBu;
    }
    
    public InitData getParametersInitLam() {
        try {
            BufferedReader bF = new BufferedReader(new FileReader(dirTxtLam));
            String temp = "";
            String bfRead;
            while ((bfRead = bF.readLine()) != null) {
                temp += bfRead;
            }
            String[] partes = temp.split("/");
            for (String parameter : partes) {
                String[] pParameter = parameter.split(":");
                
                for (int i = 0; i < pParameter.length; i++) {
                    switch (pParameter[0]) {
                        case "DURACION" -> this.saveDataLam.setDurationInS(Integer.parseInt(pParameter[1]));
                        case "DEADLINE" -> this.saveDataLam.setDeadline(Integer.parseInt(pParameter[1]));
                        case "TCHASIS" -> this.saveDataLam.setMountChasisInit(Integer.parseInt(pParameter[1]));
                        case "TCARROCERIA" -> this.saveDataLam.setMountCarroceriaInit(Integer.parseInt(pParameter[1]));
                        case "TRUEDA" -> this.saveDataLam.setMountRuedaInit(Integer.parseInt(pParameter[1]));
                        case "TMOTOR" -> this.saveDataLam.setMountMotorInit(Integer.parseInt(pParameter[1]));
                        case "TACCESORIO" -> this.saveDataLam.setMountAccesorioInit(Integer.parseInt(pParameter[1]));
                        case "TENSAMBLADOR" -> this.saveDataLam.setMountEnsambladorInit(Integer.parseInt(pParameter[1]));
                        default -> {}
                    }
                }
            }
        } catch (IOException e) {
        }
        return this.saveDataLam;
    }
}
