/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.vehiclePlantBu;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 *
 * @author JendersonQ
 */
public class VehiclePlant {

    private String name;
    private ArrayList<Worker> workers;
    private int maxWorkers;
    private long dayDurationInMs;
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
    public int priceVehicleStandard = 550000;
    public int priceVehicleSpecial = 600000;

    public int deliveryDay;

    public Semaphore sem;

    public boolean updateWorkersNow;

    // Control de trabajadores
    private int countWorkerChasis;
    private int countWorkerCarroceria;
    private int countWorkerMotor;
    private int countWorkerRueda;
    private int countWorkerAccesorio;
    private int countWorkerEnsamblador;
    private final int countWorkerDirector = 0;
    private final int countWorkerGerente = 1;

    private final String[] typeWorkers = {"GERENTE", "CHASIS", "CARROCERIA", "MOTOR", "RUEDA", "ACCESORIO", "ENSAMBLADOR", "DIRECTOR"};

    public VehiclePlant(String name, int maxWorkers, long durationInS, int deadline) {
        this.sem = new Semaphore(1);
        this.name = name;
        this.maxWorkers = maxWorkers;
        this.dayDurationInMs = durationInS * 1000;
        this.deadline = deadline;
        this.deliveryDay = this.deadline;
        this.workers = new ArrayList<>(this.maxWorkers);
        this.warehouse = new Warehouse();

        this.updateWorkersNow = true;
        this.stopPlant = false;

        this.earnings = 0;
        this.operCost = 0;
        this.plantUtility = 0;
        this.daysPassed = 0;
        this.hourPassed = 0;

        // Mover estos contadores a DATOS INICIALES
//        this.countWorkerChasis = 2;
//        this.countWorkerCarroceria = 2;
//        this.countWorkerMotor = 1;
//        this.countWorkerRueda = 1;
//        this.countWorkerAccesorio = 2;
//        this.countWorkerEnsamblador = 2;
        this.countWorkerChasis = 0;
        this.countWorkerCarroceria = 0;
        this.countWorkerMotor = 0;
        this.countWorkerRueda = 0;
        this.countWorkerAccesorio = 0;
        this.countWorkerEnsamblador = 0;

        this.startPlant();
    }

    @SuppressWarnings("SleepWhileInLoop")
    private void startPlant() {

        while (this.continuePlant()) {

//            System.out.println("Chasis creados: " + this.warehouse.currentStorageChasis);
//            System.out.println("Motores creados: " + this.warehouse.currentStorageMotor);
//            System.out.println("Carrocerias creadas: " + this.warehouse.currentStorageCarroceria);
//            System.out.println("Ruedas creadas: " + this.warehouse.currentStorageRueda);
//            System.out.println("Accesorios creados: " + this.warehouse.currentStorageAccesorio);
//            System.out.println("Vehiculos S: " + this.warehouse.currentStorageVehicleStandard);
//            System.out.println("Vehiculos Spe: " + this.warehouse.currentStorageVehicleSpecial);
            System.out.println("Dias transcurridos: " + this.daysPassed);
            for (int hour = 0; hour < this.dayDurationInMs; hour += (this.dayDurationInMs / 24)) {
                try {
                    this.hourPassed = hour;

                    if (this.updateWorkersNow) {
                        System.out.println("Actualizó los trabajadores");
                        this.updateWorkers();
                    }

                    Thread.sleep((this.dayDurationInMs / 24) + 10); // Factor de tiempo agregado por procesos internos
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


}
