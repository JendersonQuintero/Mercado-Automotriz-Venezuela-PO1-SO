/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author JendersonQ
 */
public class Worker extends Thread {

    // Parámetros de los trabajadores
    // Duración de su trabajo
    private double creationChasisPerDay = 0.5;
    private double creationCarroceriaPerDay = 0.5;
    private double creationMotorPerDay = 3;
    private double creationRuedaPerDay = 3;
    private double creationAccesorioPerDay = 0.33;
    private double creationEnsambladorPerDay = 0.5;

    private float productionCounter;

    private boolean stopWork;

    // Salario para cada tipo
    private int salaryPerHourChasis = 10;
    private int salaryPerHourCarroceria = 13;
    private int salaryPerHourMotor = 20;
    private int salaryPerHourRueda = 8;
    private int salaryPerHourAccesorio = 17;
    private int salaryPerHourEnsamblador = 25;
    private int salaryPerHourGerente = 20;
    private int salaryPerHourDirector = 30;

    public int currentGain;

    // Parameters gerente
    public double timeWatchRaicing;
    public int foulGerente;
    public boolean isWatchRaincing;
    public String statusGerente;
    public double counterHoursGerente;
    public int counterDaysGerente;

    // Parameters director
    public double counterHoursDirector;
    public boolean saveCars;
    public boolean watchGerente;
    public String statusDirector;

    private int salaryPerHour;
    private double productionPerHour;

    private String type;
    private VehiclePlant vp;

    public Worker(String type, VehiclePlant vp) {
        this.type = type;
        this.vp = vp;
        this.productionCounter = 0;
        this.currentGain = 0;
        this.stopWork = false;

        switch (this.type) {
            case "CHASIS" -> {
                this.salaryPerHour = this.salaryPerHourChasis;
                this.productionPerHour = this.creationChasisPerDay / 24;
            }
            case "RUEDA" -> {
                this.salaryPerHour = this.salaryPerHourRueda;
                this.productionPerHour = this.creationRuedaPerDay / 24;
            }
            case "MOTOR" -> {
                this.salaryPerHour = this.salaryPerHourMotor;
                this.productionPerHour = this.creationMotorPerDay / 24;
            }
            case "ACCESORIO" -> {
                this.salaryPerHour = this.salaryPerHourAccesorio;
                this.productionPerHour = this.creationAccesorioPerDay / 24;
            }
            case "CARROCERIA" -> {
                this.salaryPerHour = this.salaryPerHourCarroceria;
                this.productionPerHour = this.creationCarroceriaPerDay / 24;
            }
            case "ENSAMBLADOR" -> {
                this.salaryPerHour = this.salaryPerHourEnsamblador;
                this.productionPerHour = this.creationEnsambladorPerDay / 24;
            }
            case "GERENTE" -> {
                this.salaryPerHour = this.salaryPerHourGerente;
                this.timeWatchRaicing = 0;
                this.foulGerente = 0;
                this.isWatchRaincing = false;
                this.statusGerente = "";
                this.counterHoursGerente = 0;
                this.counterDaysGerente = 0;
            }
            case "DIRECTOR" -> {
                this.salaryPerHour = this.salaryPerHourDirector;
                this.counterHoursDirector = 0;
                this.saveCars = true;
                this.watchGerente = true;
                this.statusDirector = "";
            }
        }
    }

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        while (!this.stopWork) {
            long hour = (this.vp.getDayDurationInMs() / 24);
            if (this.type.equals("CHASIS") || this.type.equals("CARROCERIA") || this.type.equals("MOTOR") || this.type.equals("RUEDA") || this.type.equals("ACCESORIO")) {
                this.creatorWorker(this.type, hour);
            } else if (this.type.equals("ENSAMBLADOR")) {
                this.ensamblerWorker(hour);
            } else if (this.type.equals("GERENTE")) {
                this.gerenteWorker(hour);
            } else {
                this.directorWorker(hour);
            }
            this.payWorker();
        }
    }

    public String getType() {
        return this.type;
    }

    public void stopWork() {
        this.stopWork = true;
    }

    private void creatorWorker(String type, long hour) {
        try {
            if (!this.vp.warehouse.isFullStorage(type)) {
                this.productionCounter += this.productionPerHour;
                if (this.productionCounter >= 1) {
                    try {
                        this.vp.sem.acquire();
                        this.vp.warehouse.addStorage(type, (int) Math.floor(this.productionCounter));
                        this.vp.sem.release();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    this.productionCounter -= Math.floor(this.productionCounter);
                }
            }
            sleep(hour);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    private void ensamblerWorker(long hour) {
        try {
            if (this.vp.warehouse.readyToJoinSpecial()) {
                this.productionCounter += this.productionPerHour;

                if (this.productionCounter >= 1) {
                    try {
                        this.vp.sem.acquire();
                        this.vp.warehouse.useStorage("SPECIAL");
                        this.vp.warehouse.addStorage("SPECIAL", (int) Math.floor(this.productionCounter));
                        //System.out.println("Se agregó vehiculo SPECIAL al almacen");
                        this.vp.sem.release();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    this.productionCounter -= Math.floor(this.productionCounter);
                }
            } else if (this.vp.warehouse.readyToJoinStandard()) {
                this.productionCounter += this.productionPerHour;

                if (this.productionCounter >= 1) {
                    try {
                        this.vp.sem.acquire();
                        this.vp.warehouse.useStorage("STANDARD");
                        this.vp.warehouse.addStorage("STANDARD", (int) Math.floor(this.productionCounter));
                        //System.out.println("Se agregó vehiculo STANDARD al almacen");
                        this.vp.sem.release();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    this.productionCounter -= Math.floor(this.productionCounter);
                }
            }
            sleep(hour);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    private void gerenteWorker(long hour) {
        try {
            this.counterHoursGerente += hour;
            System.out.println(this.counterHoursGerente);
            if (this.counterHoursGerente <= (hour * 16)) {
                this.statusGerente = "Viendo carreras";
                this.isWatchRaincing = true;
                this.timeWatchRaicing += (hour / 2);
                sleep((hour / 2));
                this.statusGerente = "Revisando contabilidad";
                this.checkAccounting();
                sleep((hour / 2));
            } else {
                this.statusGerente = "Actualizando dias restantes para entrega";
                this.updateRemainingDays();
                if (this.counterHoursGerente == (hour * 24)) {
                    this.counterHoursGerente = 0;
                    this.counterDaysGerente++;
                }
                System.out.println("Dias restantes: " + this.vp.deliveryDay);
                sleep(hour);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("SleepWhileInLoop")
    private void directorWorker(long hour) {
        try {
            if (this.vp.deliveryDay == 0) {
                this.counterHoursDirector += hour;
                this.statusDirector = "Enviado vehiculos al concesionario";
                if (this.saveCars) {
                    this.vp.warehouse.setVehiclesSaved(this.vp.warehouse.getStandardVehicles(), this.vp.warehouse.getSpecialVehicles());
                    this.vp.sem.acquire();
                    this.vp.warehouse.sendVechicles();
                    this.vp.sem.release();
                    this.saveCars = false;
                }
                if (this.counterHoursDirector > (hour * 24)) {
                    int earnings = (this.vp.warehouse.getStandardVehicleSaved() * this.vp.priceVehicleStandard) + (this.vp.warehouse.getSpecialVehicleSaved() * this.vp.priceVehicleSpecial);
                    this.vp.warehouse.resetVehiclesSaved();
                    this.vp.updateEarnings(earnings);
                    this.vp.deliveryDay = this.vp.deadline;
                    this.counterHoursDirector = 0;
                }
                sleep(hour);
            } else {
                this.counterHoursDirector += hour;
                double randomNum = Math.floor((Math.random()*10 + 1));
                
                if (this.counterHoursDirector == (hour * 24)) {
                    this.watchGerente = true;
                    this.counterHoursDirector = 0;
                }
                
                if (randomNum > 8 && this.watchGerente) {
                    double minutes = (hour / 60);
                    boolean checkFoul = true;
                    for (double i = minutes; i <= (minutes*25); i += minutes) {
                        this.statusDirector = "Observando al gerente";
                        if (this.vp.checkWorker("GERENTE").statusGerente.equals("Viendo carreras") && checkFoul) {
                            this.foulGerente++;
                            this.discountGerente(this.vp.checkWorker("GERENTE"), 50);
                            checkFoul = false;
                        } 
                        sleep((long)minutes);
                    }
                    this.statusDirector = "Realizando labores administrativas";
                    sleep((long)(minutes * 35));
                    this.watchGerente = false;
                } else {
                    this.statusDirector = "Realizando labores administrativas";
                    sleep(hour);
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    private void checkAccounting() {
        // AQUÍ MOVERÁ TODO LO RELACIONADO A COSTOS A LA VISTA DE LA INTERFAZ
    }

    private void updateRemainingDays() {
        if (this.vp.deliveryDay > 0) {
            this.vp.deliveryDay -= this.counterDaysGerente;
            this.counterDaysGerente = 0;
        }
    }

    private void payWorker() {
        this.currentGain += this.salaryPerHour;
        this.vp.operCost += this.salaryPerHour;
    }
    
    private void discountGerente(Worker w, int mount) {
        w.currentGain -= mount;
    }

}
