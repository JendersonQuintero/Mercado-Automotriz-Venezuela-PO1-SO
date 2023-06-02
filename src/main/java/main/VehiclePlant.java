/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import interfaces.MainView;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author JendersonQ
 */
public class VehiclePlant extends Thread {

    public String name;
    public ArrayList<Worker> workers;
    public final int maxWorkers = 12;
    public long dayDurationInMs;
    public int deadline;

    public int daysPassed;
    public double hourPassed;
    private boolean stopPlant;

    // Contabilidad
    public double earnings;
    public double operCost;
    public double plantUtility;

    // Almacen y precio de vehiculos
    public Warehouse warehouse;
    public int priceVehicleStandard;
    public int priceVehicleSpecial;

    public int deliveryDay;

    public Semaphore sem;

    public boolean updateWorkersNow;

    // Control de trabajadores
    public int countWorkerChasis;
    public int countWorkerCarroceria;
    public int countWorkerMotor;
    public int countWorkerRueda;
    public int countWorkerAccesorio;
    public int countWorkerEnsamblador;
    public final int countWorkerDirector = 1;
    public final int countWorkerGerente = 1;
    
    public MainView mV;

    private final String[] typeWorkers = {"GERENTE", "DIRECTOR", "CHASIS", "CARROCERIA", "MOTOR", "RUEDA", "ACCESORIO", "ENSAMBLADOR"};

    public VehiclePlant(String plant, long durationInS, int deadline, int iChasis, int iCarroceria, int iMotor, int iRueda, int iAccesorio, int iEnsamblador, MainView mV) {
        
        this.name = plant;
        this.mV = mV;
        
        switch (plant) {
            case "BUGATTI" -> {
                this.priceVehicleStandard = 550000;
                this.priceVehicleSpecial = 600000;
            }
            default -> {
                this.priceVehicleStandard = 400000;
                this.priceVehicleSpecial = 750000;
            }
        }
        
        this.warehouse = new Warehouse(this);
        this.countWorkerChasis = iChasis;
        this.countWorkerCarroceria = iCarroceria;
        this.countWorkerMotor = iMotor;
        this.countWorkerRueda = iRueda;
        this.countWorkerAccesorio = iAccesorio;
        this.countWorkerEnsamblador = iEnsamblador;

        this.sem = new Semaphore(1);
        this.dayDurationInMs = durationInS * 1000;
        this.deadline = deadline;
        this.deliveryDay = this.deadline;
        this.workers = new ArrayList<>(this.maxWorkers);
        

        this.updateWorkersNow = true;
        this.stopPlant = false;

        this.earnings = 0;
        this.operCost = 0;
        this.plantUtility = 0;
        this.daysPassed = 0;
        this.hourPassed = 0;
    }

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        while (this.continuePlant()) {
            for (int hour = 0; hour < this.dayDurationInMs; hour += (this.dayDurationInMs / 24)) {
                try {
                    this.hourPassed = hour;
                    
                    if (this.updateWorkersNow) {
                        this.updateWorkers();
                    }
                    Thread.sleep((this.dayDurationInMs / 24));
                    this.mV.updateDataView();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            this.daysPassed++;

            if (this.daysPassed == 60) {
                this.stopPlant();
            }
        }
    }

    public void addNewWorker(String type) {
        if (this.workers.size() < this.maxWorkers) {
            switch (type) {
                case "CHASIS" ->
                    this.countWorkerChasis++;
                case "CARROCERIA" ->
                    this.countWorkerCarroceria++;
                case "MOTOR" ->
                    this.countWorkerMotor++;
                case "RUEDA" ->
                    this.countWorkerRueda++;
                case "ACCESORIO" ->
                    this.countWorkerAccesorio++;
                case "ENSAMBLADOR" ->
                    this.countWorkerEnsamblador++;
            }
            this.updateWorkersNow = true;
        } else {
            System.out.println("Capacidad maxima de trabajadores en la planta");
            JOptionPane.showMessageDialog(null, "Capacidad maxima de trabajadores en la planta", "Empleados a tope",0);
        }
    }

    public void deleteWorker(String type) {
        long mount = this.workers.stream().filter(w -> w.getType().equals(type)).count();
        if (mount > 1) {
            switch (type) {
                case "CHASIS" ->
                    this.countWorkerChasis--;
                case "CARROCERIA" ->
                    this.countWorkerCarroceria--;
                case "MOTOR" ->
                    this.countWorkerMotor--;
                case "RUEDA" ->
                    this.countWorkerRueda--;
                case "ACCESORIO" ->
                    this.countWorkerAccesorio--;
                case "ENSAMBLADOR" ->
                    this.countWorkerEnsamblador--;
            }
            this.updateWorkersNow = true;
        } else {
            System.out.println("Debe existir al menos un trabajador en la linea");
            JOptionPane.showMessageDialog(null, "Debe existir al menos un trabajador en la linea", "Cero empleados",0);
        }
    }

    private void updateWorkers() {
        Worker worker;
        long count;
        for (String type : this.typeWorkers) {
            long mountReal = this.workers.stream().filter(w -> w.getType().equals(type)).count();
            if (this.getCounterWorker(type) > mountReal && this.getCounterWorker(type) != mountReal) {
                count = this.getCounterWorker(type) - mountReal;
                for (int i = 0; i < count; i++) {
                    worker = new Worker(type, this);
                    this.workers.add(worker);
                    worker.start();
                }
            } else if (this.getCounterWorker(type) < mountReal && this.getCounterWorker(type) != mountReal) {
                count = mountReal - this.getCounterWorker(type);
                for (int i = 0; i < count; i++) {
                    for (Worker w : this.workers) {
                        if (w.getType().equals(type)) {
                            w.stopWork();
                            this.workers.remove(w);
                        }
                    }
                }
            }
        }
        this.updateWorkersNow = false;
    }

    private int getCounterWorker(String type) {
        return switch (type) {
            case "CHASIS" ->
                this.countWorkerChasis;
            case "CARROCERIA" ->
                this.countWorkerCarroceria;
            case "MOTOR" ->
                this.countWorkerMotor;
            case "RUEDA" ->
                this.countWorkerRueda;
            case "ACCESORIO" ->
                this.countWorkerAccesorio;
            case "GERENTE" ->
                this.countWorkerGerente;
            case "DIRECTOR" ->
                this.countWorkerDirector;
            default ->
                this.countWorkerEnsamblador;
        };
    }

    public boolean continuePlant() {
        return !this.stopPlant;
    }

    public void setStopPlant(boolean stopPlant) {
        this.stopPlant = stopPlant;
    }

    public void stopPlant() {
        this.stopPlant = true;
        this.stopAllWorkers();
    }

    public long getDayDurationInMs() {
        return this.dayDurationInMs;
    }

    private void stopAllWorkers() {
        this.workers.forEach(w -> w.stopWork());
    }
    
    public void updateEarnings(int newEarnings) {
        this.earnings += newEarnings;
    }
    
    public Worker checkWorker(String type) {
        return switch (type) {
            case "GERENTE" -> this.workers.get(0);
            default -> this.workers.get(1);
        };
    }


}
