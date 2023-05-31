/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.vehiclePlantBu;

/**
 *
 * @author JendersonQ
 */
public class Warehouse {

    private final int storageChasis = 25;
    private final int storageCarroceria = 20;
    private final int storageMotor = 55;
    private final int storageRueda = 35;
    private final int storageAccesorio = 10;

    public int currentStorageChasis;
    public int currentStorageCarroceria;
    public int currentStorageMotor;
    public int currentStorageRueda;
    public int currentStorageAccesorio;

    public int currentStorageVehicleStandard;
    private int counterVeStandard;
    public int currentStorageVehicleSpecial;

    private final int requireChasis = 1;
    private final int requireCarroceria = 2;
    private final int requireRueda = 1;
    private final int requireMotor = 4;
    private final int requireAccesorio = 2;

    private boolean readyStartVeSpecial;

    public Warehouse() {

        this.currentStorageChasis = 0;
        this.currentStorageCarroceria = 0;
        this.currentStorageMotor = 0;
        this.currentStorageRueda = 0;
        this.currentStorageAccesorio = 0;

        this.currentStorageVehicleStandard = 0;
        this.currentStorageVehicleSpecial = 0;

        this.counterVeStandard = 0;
        this.readyStartVeSpecial = false;
    }

    public boolean isFullStorage(String type) {
        return switch (type) {
            case "CHASIS" ->
                this.currentStorageChasis == this.storageChasis;
            case "CARROCERIA" ->
                this.currentStorageCarroceria == this.storageCarroceria;
            case "MOTOR" ->
                this.currentStorageMotor == this.storageMotor;
            case "RUEDA" ->
                this.currentStorageRueda == this.storageRueda;
            default ->
                this.currentStorageAccesorio == this.storageAccesorio;
        };
    }

    public void addStorage(String type, int mount) {
        switch (type) {
            case "CHASIS" ->
                this.currentStorageChasis += mount;
            case "CARROCERIA" ->
                this.currentStorageCarroceria += mount;
            case "MOTOR" ->
                this.currentStorageMotor += mount;
            case "RUEDA" ->
                this.currentStorageRueda += mount;
            case "ACCESORIO" ->
                this.currentStorageAccesorio += mount;
            case "STANDARD" -> {
                this.currentStorageVehicleStandard += mount;
                this.monitorVeSpecial();
            }
            case "SPECIAL" ->
                this.currentStorageVehicleSpecial += mount;
        }
    }

    public void useStorage(String type) {
        switch (type) {
            case "SPECIAL" -> {
                this.currentStorageChasis -= this.requireChasis;
                this.currentStorageCarroceria -= this.requireCarroceria;
                this.currentStorageMotor -= this.requireMotor;
                this.currentStorageRueda -= this.requireRueda;
                this.currentStorageAccesorio -= this.requireAccesorio;
                this.readyStartVeSpecial = false;
            }
            default -> {
                this.currentStorageChasis -= this.requireChasis;
                this.currentStorageCarroceria -= this.requireCarroceria;
                this.currentStorageMotor -= this.requireMotor;
                this.currentStorageRueda -= this.requireRueda;
            }
        }
    }

    public int getCurrenteStorage(String type) {
        return switch (type) {
            case "CHASIS" ->
                this.currentStorageChasis;
            case "CARROCERIA" ->
                this.currentStorageCarroceria;
            case "MOTOR" ->
                this.currentStorageMotor;
            case "RUEDA" ->
                this.currentStorageRueda;
            default ->
                this.currentStorageAccesorio;
        };
    }

    public boolean readyToJoinStandard() {
        return ((this.currentStorageChasis >= this.requireChasis)
                && (this.currentStorageCarroceria >= this.requireCarroceria)
                && (this.currentStorageMotor >= this.requireMotor)
                && (this.currentStorageRueda >= this.requireRueda));
    }

    public boolean readyToJoinSpecial() {
        return ((this.currentStorageChasis >= this.requireChasis)
                && (this.currentStorageCarroceria >= this.requireCarroceria)
                && (this.currentStorageMotor >= this.requireMotor)
                && (this.currentStorageRueda >= this.requireRueda)
                && (this.currentStorageAccesorio >= this.requireAccesorio)
                && this.readyStartVeSpecial);
    }

    private void monitorVeSpecial() {
        this.counterVeStandard++;
        if (this.counterVeStandard >= 5) {
            this.readyStartVeSpecial = true;
            this.counterVeStandard -= 5;
        }
    }

}
