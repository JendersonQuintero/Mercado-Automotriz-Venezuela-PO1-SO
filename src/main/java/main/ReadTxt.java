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

    private final String dirTxt = "parametros\\pInit.txt";
    private final File txt = new File(dirTxt);
    public InitData saveData;

    /**
     * Constructor del txt
     */
    public ReadTxt() {
        this.saveData = new InitData();
        try {
            if (txt.exists()) {
            } else {
                txt.createNewFile();
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
        try (BufferedWriter escribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(txt, true)))) {
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
    public InitData getParametersInit() {
        try {
            BufferedReader bF = new BufferedReader(new FileReader(dirTxt));
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
                        case "DURACION" -> this.saveData.setDurationInS(Integer.parseInt(pParameter[1]));
                        case "DEADLINE" -> this.saveData.setDeadline(Integer.parseInt(pParameter[1]));
                        case "TCHASIS" -> this.saveData.setMountChasisInit(Integer.parseInt(pParameter[1]));
                        case "TCARROCERIA" -> this.saveData.setMountCarroceriaInit(Integer.parseInt(pParameter[1]));
                        case "TRUEDA" -> this.saveData.setMountRuedaInit(Integer.parseInt(pParameter[1]));
                        case "TMOTOR" -> this.saveData.setMountMotorInit(Integer.parseInt(pParameter[1]));
                        case "TACCESORIO" -> this.saveData.setMountAccesorioInit(Integer.parseInt(pParameter[1]));
                        case "TENSAMBLADOR" -> this.saveData.setMountEnsambladorInit(Integer.parseInt(pParameter[1]));
                        default -> {}
                    }
                }
            }
        } catch (IOException e) {
        }
        return this.saveData;
    }
    
}
