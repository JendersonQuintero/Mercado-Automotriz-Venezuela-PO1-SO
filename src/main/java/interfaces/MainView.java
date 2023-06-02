/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import main.InitData;
import main.ReadTxt;
import main.VehiclePlant;

/**
 *
 * @author JendersonQ
 */
public class MainView extends javax.swing.JFrame {
    public VehiclePlant vpBu;
    public VehiclePlant vpLa;
    public InitData dataInit;
    public ReadTxt txt;
    
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.txt = new ReadTxt();
        
        this.dataInit = txt.getParametersInit();
    }

    public void updateDataView() {
        // ACTUALIZACIÓN DE DATOS PARA BUGATTI
        this.textDaysRemainingBu.setText(Integer.toString(this.vpBu.deliveryDay));
        this.textAChasisBu.setText(Integer.toString(this.vpBu.warehouse.currentStorageChasis));
        this.textACarroceriaBu.setText(Integer.toString(this.vpBu.warehouse.currentStorageCarroceria));
        this.textAMotorBu.setText(Integer.toString(this.vpBu.warehouse.currentStorageMotor));
        this.textARuedaBu.setText(Integer.toString(this.vpBu.warehouse.currentStorageRueda));
        this.textAAccesorioBu.setText(Integer.toString(this.vpBu.warehouse.currentStorageAccesorio));
        this.textAVeStandardBu.setText(Integer.toString(this.vpBu.warehouse.getStandardVehicles()));
        this.textAVeSpecialBu.setText(Integer.toString(this.vpBu.warehouse.getSpecialVehicles()));
        this.textEEarningsBu.setText(Double.toString(this.vpBu.earnings));
        this.textECostBu.setText(Double.toString(this.vpBu.operCost));
        this.textEUtilityBu.setText(Double.toString(this.vpBu.plantUtility));
        this.textStatusGerenteBu.setText(this.vpBu.checkWorker("GERENTE").statusGerente);
        this.textStatusDirectorBu.setText(this.vpBu.checkWorker("DIRECTOR").statusDirector);
        this.textDiscountGerenteBu.setText(Integer.toString(this.vpBu.checkWorker("GERENTE").foulGerente));
        this.textFoulGerenteBu.setText(Integer.toString(this.vpBu.checkWorker("GERENTE").moneyDiscount));
        
        // ACTUALIZACIÓN DE DATOS PARA LAMBORGHINI
        this.textDaysRemainingLam.setText(Integer.toString(this.vpLa.deliveryDay));
        this.textAChasisLam.setText(Integer.toString(this.vpLa.warehouse.currentStorageChasis));
        this.textACarroceriaLam.setText(Integer.toString(this.vpLa.warehouse.currentStorageCarroceria));
        this.textAMotorLam.setText(Integer.toString(this.vpLa.warehouse.currentStorageMotor));
        this.textARuedaLam.setText(Integer.toString(this.vpLa.warehouse.currentStorageRueda));
        this.textAAccesorioLam.setText(Integer.toString(this.vpLa.warehouse.currentStorageAccesorio));
        this.textAVeStandardLam.setText(Integer.toString(this.vpLa.warehouse.getStandardVehicles()));
        this.textAVeSpecialLam.setText(Integer.toString(this.vpLa.warehouse.getSpecialVehicles()));
        this.textEEarningsLam.setText(Double.toString(this.vpLa.earnings));
        this.textECostLam.setText(Double.toString(this.vpLa.operCost));
        this.textEUtilityLam.setText(Double.toString(this.vpLa.plantUtility));
        this.textStatusGerenteLam.setText(this.vpLa.checkWorker("GERENTE").statusGerente);
        this.textStatusDirectorLam.setText(this.vpLa.checkWorker("DIRECTOR").statusDirector);
        this.textDiscountGerenteLam.setText(Integer.toString(this.vpLa.checkWorker("GERENTE").foulGerente));
        this.textFoulGerenteLam.setText(Integer.toString(this.vpLa.checkWorker("GERENTE").moneyDiscount));
        
        
        
    }
    
    public void updateWorkersBu() {
        this.textCChasisBu.setText(Integer.toString(this.vpBu.countWorkerChasis));
        this.textCCarroceriaBu.setText(Integer.toString(this.vpBu.countWorkerCarroceria));
        this.textCMotorBu.setText(Integer.toString(this.vpBu.countWorkerMotor));
        this.textCRuedaBu.setText(Integer.toString(this.vpBu.countWorkerRueda));
        this.textCAccesorioBu.setText(Integer.toString(this.vpBu.countWorkerAccesorio));
        this.textEnsambladorBu.setText(Integer.toString(this.vpBu.countWorkerEnsamblador));
        this.textGerenteBu.setText(Integer.toString(this.vpBu.countWorkerGerente));
        this.textDirectorBu.setText(Integer.toString(this.vpBu.countWorkerDirector));
        this.textTotalWorkersBu.setText(Integer.toString(this.vpBu.workers.size()));
    }
    
    public void updateWorkersLam() {
        this.textCChasisLam.setText(Integer.toString(this.vpLa.countWorkerChasis));
        this.textCCarroceriaLam.setText(Integer.toString(this.vpLa.countWorkerCarroceria));
        this.textCMotorLam.setText(Integer.toString(this.vpLa.countWorkerMotor));
        this.textCRuedaLam.setText(Integer.toString(this.vpLa.countWorkerRueda));
        this.textCAccesorioLam.setText(Integer.toString(this.vpLa.countWorkerAccesorio));
        this.textEnsambladorLam.setText(Integer.toString(this.vpLa.countWorkerEnsamblador));
        this.textGerenteLam.setText(Integer.toString(this.vpLa.countWorkerGerente));
        this.textDirectorLam.setText(Integer.toString(this.vpLa.countWorkerDirector));
        this.textTotalWorkersLam.setText(Integer.toString(this.vpLa.workers.size()));
    }
    
    private void loadInitParameters() {
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPantalla = new javax.swing.JPanel();
        panelBugatti = new javax.swing.JPanel();
        panelTituloBugatti = new javax.swing.JPanel();
        titulo4 = new javax.swing.JLabel();
        panelEmpleadosBugatti = new javax.swing.JPanel();
        titulo5 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo10 = new javax.swing.JLabel();
        titulo11 = new javax.swing.JLabel();
        titulo12 = new javax.swing.JLabel();
        titulo13 = new javax.swing.JLabel();
        titulo14 = new javax.swing.JLabel();
        titulo15 = new javax.swing.JLabel();
        textDirectorBu = new javax.swing.JTextField();
        textCChasisBu = new javax.swing.JTextField();
        textCCarroceriaBu = new javax.swing.JTextField();
        textCMotorBu = new javax.swing.JTextField();
        textCRuedaBu = new javax.swing.JTextField();
        textCAccesorioBu = new javax.swing.JTextField();
        textEnsambladorBu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnMinusChasisBu = new javax.swing.JButton();
        btnMoreChasisBu = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        titulo16 = new javax.swing.JLabel();
        titulo17 = new javax.swing.JLabel();
        textGerenteBu = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        textTotalWorkersBu = new javax.swing.JTextField();
        titulo59 = new javax.swing.JLabel();
        panelAlmacenBugatti = new javax.swing.JPanel();
        titulo40 = new javax.swing.JLabel();
        titulo42 = new javax.swing.JLabel();
        titulo43 = new javax.swing.JLabel();
        titulo44 = new javax.swing.JLabel();
        titulo45 = new javax.swing.JLabel();
        titulo46 = new javax.swing.JLabel();
        titulo47 = new javax.swing.JLabel();
        titulo48 = new javax.swing.JLabel();
        textAChasisBu = new javax.swing.JTextField();
        textACarroceriaBu = new javax.swing.JTextField();
        textAMotorBu = new javax.swing.JTextField();
        textARuedaBu = new javax.swing.JTextField();
        textAAccesorioBu = new javax.swing.JTextField();
        textAVeStandardBu = new javax.swing.JTextField();
        textAVeSpecialBu = new javax.swing.JTextField();
        panelDiasBugatti = new javax.swing.JPanel();
        titulo60 = new javax.swing.JLabel();
        textDaysRemainingBu = new javax.swing.JTextField();
        panelGerenteDirectorBugatti = new javax.swing.JPanel();
        titulo58 = new javax.swing.JLabel();
        titulo62 = new javax.swing.JLabel();
        titulo27 = new javax.swing.JLabel();
        titulo28 = new javax.swing.JLabel();
        titulo29 = new javax.swing.JLabel();
        textDiscountGerenteBu = new javax.swing.JTextField();
        textStatusDirectorBu = new javax.swing.JTextField();
        textStatusGerenteBu = new javax.swing.JTextField();
        textFoulGerenteBu = new javax.swing.JTextField();
        titulo33 = new javax.swing.JLabel();
        panelEstadisticasBugatti = new javax.swing.JPanel();
        titulo61 = new javax.swing.JLabel();
        titulo30 = new javax.swing.JLabel();
        titulo31 = new javax.swing.JLabel();
        titulo32 = new javax.swing.JLabel();
        textEEarningsBu = new javax.swing.JTextField();
        textEUtilityBu = new javax.swing.JTextField();
        textECostBu = new javax.swing.JTextField();
        btnStopSimulation = new javax.swing.JButton();
        btnStartSimulation = new javax.swing.JButton();
        panelLamborghini = new javax.swing.JPanel();
        panelTituloLamborghini = new javax.swing.JPanel();
        titulo6 = new javax.swing.JLabel();
        panelEmpleadosLamborghini = new javax.swing.JPanel();
        titulo9 = new javax.swing.JLabel();
        titulo26 = new javax.swing.JLabel();
        titulo41 = new javax.swing.JLabel();
        titulo50 = new javax.swing.JLabel();
        titulo69 = new javax.swing.JLabel();
        titulo70 = new javax.swing.JLabel();
        titulo71 = new javax.swing.JLabel();
        titulo72 = new javax.swing.JLabel();
        textDirectorLam = new javax.swing.JTextField();
        textCChasisLam = new javax.swing.JTextField();
        textCCarroceriaLam = new javax.swing.JTextField();
        textCMotorLam = new javax.swing.JTextField();
        textCRuedaLam = new javax.swing.JTextField();
        textCAccesorioLam = new javax.swing.JTextField();
        textEnsambladorLam = new javax.swing.JTextField();
        btnMinusChasisLam = new javax.swing.JLabel();
        btnMinusMotorLam = new javax.swing.JLabel();
        btnMinusCarroceriaLam = new javax.swing.JLabel();
        btnMoreMotorLam = new javax.swing.JLabel();
        btnMoreRuedaLam = new javax.swing.JLabel();
        btnMoreCarroceriaLam = new javax.swing.JLabel();
        btnMoreChasisLam = new javax.swing.JLabel();
        btnMinusAccesorioLam = new javax.swing.JLabel();
        btnMoreAccesorioLam = new javax.swing.JLabel();
        btnMinusEnsambladorLam = new javax.swing.JLabel();
        btnMoreEnsambladorLam = new javax.swing.JLabel();
        btnMinusRuedaLam = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        titulo73 = new javax.swing.JLabel();
        titulo74 = new javax.swing.JLabel();
        textGerenteLam = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        textTotalWorkersLam = new javax.swing.JTextField();
        titulo75 = new javax.swing.JLabel();
        panelAlmacenLamborghini = new javax.swing.JPanel();
        titulo49 = new javax.swing.JLabel();
        titulo51 = new javax.swing.JLabel();
        titulo52 = new javax.swing.JLabel();
        titulo53 = new javax.swing.JLabel();
        titulo54 = new javax.swing.JLabel();
        titulo55 = new javax.swing.JLabel();
        titulo56 = new javax.swing.JLabel();
        titulo57 = new javax.swing.JLabel();
        textAVeSpecialLam = new javax.swing.JTextField();
        textAChasisLam = new javax.swing.JTextField();
        textACarroceriaLam = new javax.swing.JTextField();
        textAMotorLam = new javax.swing.JTextField();
        textARuedaLam = new javax.swing.JTextField();
        textAAccesorioLam = new javax.swing.JTextField();
        textAVeStandardLam = new javax.swing.JTextField();
        panelDiasLamborghini = new javax.swing.JPanel();
        textDaysRemainingLam = new javax.swing.JTextField();
        titulo64 = new javax.swing.JLabel();
        panelGerenteDirectorLamborghini = new javax.swing.JPanel();
        titulo65 = new javax.swing.JLabel();
        titulo66 = new javax.swing.JLabel();
        titulo34 = new javax.swing.JLabel();
        titulo35 = new javax.swing.JLabel();
        titulo36 = new javax.swing.JLabel();
        textDiscountGerenteLam = new javax.swing.JTextField();
        textStatusDirectorLam = new javax.swing.JTextField();
        textStatusGerenteLam = new javax.swing.JTextField();
        textFoulGerenteLam = new javax.swing.JTextField();
        titulo37 = new javax.swing.JLabel();
        panelEstadisticasLamborghini = new javax.swing.JPanel();
        titulo67 = new javax.swing.JLabel();
        titulo38 = new javax.swing.JLabel();
        titulo39 = new javax.swing.JLabel();
        titulo68 = new javax.swing.JLabel();
        textEEarningsLam = new javax.swing.JTextField();
        textEUtilityLam = new javax.swing.JTextField();
        textECostLam = new javax.swing.JTextField();
        btnLoadInitParameters = new javax.swing.JButton();
        btnWatchGraphic = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        tituloPrincipal = new javax.swing.JLabel();
        Copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelPantalla.setBackground(new java.awt.Color(255, 255, 255));
        panelPantalla.setMinimumSize(new java.awt.Dimension(1366, 768));
        panelPantalla.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBugatti.setBackground(new java.awt.Color(255, 153, 153));
        panelBugatti.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelBugatti.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTituloBugatti.setBackground(new java.awt.Color(255, 102, 102));
        panelTituloBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo4.setBackground(new java.awt.Color(0, 0, 0));
        titulo4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        titulo4.setForeground(new java.awt.Color(0, 0, 0));
        titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo4.setText("Bugatti");
        titulo4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTituloBugatti.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 710, 40));

        panelBugatti.add(panelTituloBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 690, 40));

        panelEmpleadosBugatti.setBackground(new java.awt.Color(255, 102, 102));
        panelEmpleadosBugatti.setForeground(new java.awt.Color(0, 0, 0));
        panelEmpleadosBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo5.setBackground(new java.awt.Color(0, 0, 0));
        titulo5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo5.setForeground(new java.awt.Color(0, 0, 0));
        titulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo5.setText("Empleados");
        panelEmpleadosBugatti.add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 20));

        titulo3.setBackground(new java.awt.Color(0, 0, 0));
        titulo3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo3.setForeground(new java.awt.Color(0, 0, 0));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo3.setText("Total de empleados:");
        panelEmpleadosBugatti.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, -1));

        titulo10.setBackground(new java.awt.Color(0, 0, 0));
        titulo10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo10.setForeground(new java.awt.Color(0, 0, 0));
        titulo10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo10.setText("Creadores de Chasis:");
        panelEmpleadosBugatti.add(titulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, -1));

        titulo11.setBackground(new java.awt.Color(0, 0, 0));
        titulo11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo11.setForeground(new java.awt.Color(0, 0, 0));
        titulo11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo11.setText("Creadores de Carrocerías:");
        panelEmpleadosBugatti.add(titulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        titulo12.setBackground(new java.awt.Color(0, 0, 0));
        titulo12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo12.setForeground(new java.awt.Color(0, 0, 0));
        titulo12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo12.setText("Creadores de Motores:");
        panelEmpleadosBugatti.add(titulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, -1));

        titulo13.setBackground(new java.awt.Color(0, 0, 0));
        titulo13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo13.setForeground(new java.awt.Color(0, 0, 0));
        titulo13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo13.setText("Creadores de Ruedas:");
        panelEmpleadosBugatti.add(titulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        titulo14.setBackground(new java.awt.Color(0, 0, 0));
        titulo14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo14.setForeground(new java.awt.Color(0, 0, 0));
        titulo14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo14.setText("Creadores de Accesorios:");
        panelEmpleadosBugatti.add(titulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, -1));

        titulo15.setBackground(new java.awt.Color(0, 0, 0));
        titulo15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo15.setForeground(new java.awt.Color(0, 0, 0));
        titulo15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo15.setText("Director");
        panelEmpleadosBugatti.add(titulo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, -1));

        textDirectorBu.setEditable(false);
        textDirectorBu.setBackground(new java.awt.Color(255, 255, 255));
        textDirectorBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textDirectorBu.setForeground(new java.awt.Color(0, 0, 0));
        textDirectorBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDirectorBu.setToolTipText("");
        panelEmpleadosBugatti.add(textDirectorBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 50, 20));

        textCChasisBu.setEditable(false);
        textCChasisBu.setBackground(new java.awt.Color(255, 255, 255));
        textCChasisBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCChasisBu.setForeground(new java.awt.Color(0, 0, 0));
        textCChasisBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCChasisBu.setToolTipText("");
        panelEmpleadosBugatti.add(textCChasisBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 50, 20));

        textCCarroceriaBu.setEditable(false);
        textCCarroceriaBu.setBackground(new java.awt.Color(255, 255, 255));
        textCCarroceriaBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCCarroceriaBu.setForeground(new java.awt.Color(0, 0, 0));
        textCCarroceriaBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCCarroceriaBu.setToolTipText("");
        panelEmpleadosBugatti.add(textCCarroceriaBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 50, 20));

        textCMotorBu.setEditable(false);
        textCMotorBu.setBackground(new java.awt.Color(255, 255, 255));
        textCMotorBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCMotorBu.setForeground(new java.awt.Color(0, 0, 0));
        textCMotorBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCMotorBu.setToolTipText("");
        panelEmpleadosBugatti.add(textCMotorBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 50, 20));

        textCRuedaBu.setEditable(false);
        textCRuedaBu.setBackground(new java.awt.Color(255, 255, 255));
        textCRuedaBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCRuedaBu.setForeground(new java.awt.Color(0, 0, 0));
        textCRuedaBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCRuedaBu.setToolTipText("");
        panelEmpleadosBugatti.add(textCRuedaBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 50, 20));

        textCAccesorioBu.setEditable(false);
        textCAccesorioBu.setBackground(new java.awt.Color(255, 255, 255));
        textCAccesorioBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCAccesorioBu.setForeground(new java.awt.Color(0, 0, 0));
        textCAccesorioBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCAccesorioBu.setToolTipText("");
        panelEmpleadosBugatti.add(textCAccesorioBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 50, 20));

        textEnsambladorBu.setBackground(new java.awt.Color(255, 255, 255));
        textEnsambladorBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textEnsambladorBu.setForeground(new java.awt.Color(0, 0, 0));
        textEnsambladorBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEnsambladorBu.setToolTipText("");
        panelEmpleadosBugatti.add(textEnsambladorBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 50, 20));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        panelEmpleadosBugatti.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 30, 20));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        panelEmpleadosBugatti.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 30, 20));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("+");
        panelEmpleadosBugatti.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 30, 20));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("+");
        panelEmpleadosBugatti.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 30, 20));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("+");
        panelEmpleadosBugatti.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 30, 20));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        panelEmpleadosBugatti.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 30, 20));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("+");
        panelEmpleadosBugatti.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 30, 20));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-");
        panelEmpleadosBugatti.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 30, 20));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("+");
        panelEmpleadosBugatti.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 30, 20));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");
        panelEmpleadosBugatti.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 30, 20));

        btnMinusChasisBu.setBackground(new java.awt.Color(255, 255, 255));
        btnMinusChasisBu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMinusChasisBu.setForeground(new java.awt.Color(0, 0, 0));
        btnMinusChasisBu.setText("-");
        btnMinusChasisBu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusChasisBuActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(btnMinusChasisBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 30, 20));

        btnMoreChasisBu.setBackground(new java.awt.Color(255, 255, 255));
        btnMoreChasisBu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMoreChasisBu.setForeground(new java.awt.Color(0, 0, 0));
        btnMoreChasisBu.setText("+");
        btnMoreChasisBu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoreChasisBuActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(btnMoreChasisBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 30, 20));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 30, 20));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 30, 20));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 30, 20));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 30, 20));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 30, 20));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 30, 20));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 30, 20));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 30, 20));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 30, 20));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        panelEmpleadosBugatti.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 30, 20));

        titulo16.setBackground(new java.awt.Color(0, 0, 0));
        titulo16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo16.setForeground(new java.awt.Color(0, 0, 0));
        titulo16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo16.setText("Ensambladores:");
        panelEmpleadosBugatti.add(titulo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        titulo17.setBackground(new java.awt.Color(0, 0, 0));
        titulo17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo17.setForeground(new java.awt.Color(0, 0, 0));
        titulo17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo17.setText("Gerente:");
        panelEmpleadosBugatti.add(titulo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        textGerenteBu.setEditable(false);
        textGerenteBu.setBackground(new java.awt.Color(255, 255, 255));
        textGerenteBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textGerenteBu.setForeground(new java.awt.Color(0, 0, 0));
        textGerenteBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textGerenteBu.setToolTipText("");
        panelEmpleadosBugatti.add(textGerenteBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 20));

        jTextField16.setBackground(new java.awt.Color(255, 255, 255));
        jTextField16.setText("jTextField1");
        panelEmpleadosBugatti.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 20));

        textTotalWorkersBu.setEditable(false);
        textTotalWorkersBu.setBackground(new java.awt.Color(255, 255, 255));
        textTotalWorkersBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textTotalWorkersBu.setForeground(new java.awt.Color(0, 0, 0));
        textTotalWorkersBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTotalWorkersBu.setToolTipText("");
        panelEmpleadosBugatti.add(textTotalWorkersBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 50, 20));

        titulo59.setBackground(new java.awt.Color(0, 0, 0));
        titulo59.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo59.setForeground(new java.awt.Color(0, 0, 0));
        titulo59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo59.setText("Gestion de Trabajo");
        panelEmpleadosBugatti.add(titulo59, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 260, 20));

        panelBugatti.add(panelEmpleadosBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, 350));

        panelAlmacenBugatti.setBackground(new java.awt.Color(255, 102, 102));
        panelAlmacenBugatti.setForeground(new java.awt.Color(0, 0, 0));
        panelAlmacenBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo40.setBackground(new java.awt.Color(0, 0, 0));
        titulo40.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo40.setForeground(new java.awt.Color(0, 0, 0));
        titulo40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo40.setText("Almacen");
        panelAlmacenBugatti.add(titulo40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, 20));

        titulo42.setBackground(new java.awt.Color(0, 0, 0));
        titulo42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo42.setForeground(new java.awt.Color(0, 0, 0));
        titulo42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo42.setText("Vehiculos Especiales:");
        panelAlmacenBugatti.add(titulo42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        titulo43.setBackground(new java.awt.Color(0, 0, 0));
        titulo43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo43.setForeground(new java.awt.Color(0, 0, 0));
        titulo43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo43.setText("Chasis:");
        panelAlmacenBugatti.add(titulo43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, -1));

        titulo44.setBackground(new java.awt.Color(0, 0, 0));
        titulo44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo44.setForeground(new java.awt.Color(0, 0, 0));
        titulo44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo44.setText("Carrocerías:");
        panelAlmacenBugatti.add(titulo44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        titulo45.setBackground(new java.awt.Color(0, 0, 0));
        titulo45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo45.setForeground(new java.awt.Color(0, 0, 0));
        titulo45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo45.setText("Motores:");
        panelAlmacenBugatti.add(titulo45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));

        titulo46.setBackground(new java.awt.Color(0, 0, 0));
        titulo46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo46.setForeground(new java.awt.Color(0, 0, 0));
        titulo46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo46.setText("Ruedas:");
        panelAlmacenBugatti.add(titulo46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        titulo47.setBackground(new java.awt.Color(0, 0, 0));
        titulo47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo47.setForeground(new java.awt.Color(0, 0, 0));
        titulo47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo47.setText("Accesorios:");
        panelAlmacenBugatti.add(titulo47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, -1));

        titulo48.setBackground(new java.awt.Color(0, 0, 0));
        titulo48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo48.setForeground(new java.awt.Color(0, 0, 0));
        titulo48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo48.setText("Vehiculos Estandar:");
        panelAlmacenBugatti.add(titulo48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        textAChasisBu.setEditable(false);
        textAChasisBu.setBackground(new java.awt.Color(255, 255, 255));
        textAChasisBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAChasisBu.setForeground(new java.awt.Color(0, 0, 0));
        textAChasisBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAChasisBu.setToolTipText("");
        panelAlmacenBugatti.add(textAChasisBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 20));

        textACarroceriaBu.setEditable(false);
        textACarroceriaBu.setBackground(new java.awt.Color(255, 255, 255));
        textACarroceriaBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textACarroceriaBu.setForeground(new java.awt.Color(0, 0, 0));
        textACarroceriaBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textACarroceriaBu.setToolTipText("");
        panelAlmacenBugatti.add(textACarroceriaBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 50, 20));

        textAMotorBu.setEditable(false);
        textAMotorBu.setBackground(new java.awt.Color(255, 255, 255));
        textAMotorBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAMotorBu.setForeground(new java.awt.Color(0, 0, 0));
        textAMotorBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAMotorBu.setToolTipText("");
        panelAlmacenBugatti.add(textAMotorBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 50, 20));

        textARuedaBu.setEditable(false);
        textARuedaBu.setBackground(new java.awt.Color(255, 255, 255));
        textARuedaBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textARuedaBu.setForeground(new java.awt.Color(0, 0, 0));
        textARuedaBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textARuedaBu.setToolTipText("");
        panelAlmacenBugatti.add(textARuedaBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 20));

        textAAccesorioBu.setEditable(false);
        textAAccesorioBu.setBackground(new java.awt.Color(255, 255, 255));
        textAAccesorioBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAAccesorioBu.setForeground(new java.awt.Color(0, 0, 0));
        textAAccesorioBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAAccesorioBu.setToolTipText("");
        panelAlmacenBugatti.add(textAAccesorioBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 50, 20));

        textAVeStandardBu.setEditable(false);
        textAVeStandardBu.setBackground(new java.awt.Color(255, 255, 255));
        textAVeStandardBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAVeStandardBu.setForeground(new java.awt.Color(0, 0, 0));
        textAVeStandardBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAVeStandardBu.setToolTipText("");
        panelAlmacenBugatti.add(textAVeStandardBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, 20));

        textAVeSpecialBu.setEditable(false);
        textAVeSpecialBu.setBackground(new java.awt.Color(255, 255, 255));
        textAVeSpecialBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAVeSpecialBu.setForeground(new java.awt.Color(0, 0, 0));
        textAVeSpecialBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAVeSpecialBu.setToolTipText("");
        panelAlmacenBugatti.add(textAVeSpecialBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 20));

        panelBugatti.add(panelAlmacenBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 290, 270));

        panelDiasBugatti.setBackground(new java.awt.Color(255, 102, 102));
        panelDiasBugatti.setForeground(new java.awt.Color(0, 0, 0));
        panelDiasBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo60.setBackground(new java.awt.Color(0, 0, 0));
        titulo60.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo60.setForeground(new java.awt.Color(0, 0, 0));
        titulo60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo60.setText("Dias para la Entrega");
        panelDiasBugatti.add(titulo60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 20));

        textDaysRemainingBu.setEditable(false);
        textDaysRemainingBu.setBackground(new java.awt.Color(255, 255, 255));
        textDaysRemainingBu.setForeground(new java.awt.Color(0, 0, 0));
        textDaysRemainingBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDaysRemainingBu.setToolTipText("");
        panelDiasBugatti.add(textDaysRemainingBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 90, 30));

        panelBugatti.add(panelDiasBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 290, 70));

        panelGerenteDirectorBugatti.setBackground(new java.awt.Color(255, 102, 102));
        panelGerenteDirectorBugatti.setForeground(new java.awt.Color(0, 0, 0));
        panelGerenteDirectorBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo58.setBackground(new java.awt.Color(0, 0, 0));
        titulo58.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo58.setForeground(new java.awt.Color(0, 0, 0));
        titulo58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo58.setText("del Gerente y Director");
        panelGerenteDirectorBugatti.add(titulo58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 20));

        titulo62.setBackground(new java.awt.Color(0, 0, 0));
        titulo62.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo62.setForeground(new java.awt.Color(0, 0, 0));
        titulo62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo62.setText("Gestion de Trabajo");
        panelGerenteDirectorBugatti.add(titulo62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 20));

        titulo27.setBackground(new java.awt.Color(0, 0, 0));
        titulo27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo27.setForeground(new java.awt.Color(0, 0, 0));
        titulo27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo27.setText("Qué está haciendo el Director:");
        panelGerenteDirectorBugatti.add(titulo27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, -1));

        titulo28.setBackground(new java.awt.Color(0, 0, 0));
        titulo28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo28.setForeground(new java.awt.Color(0, 0, 0));
        titulo28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo28.setText("Faltas del Gerente:");
        panelGerenteDirectorBugatti.add(titulo28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        titulo29.setBackground(new java.awt.Color(0, 0, 0));
        titulo29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo29.setForeground(new java.awt.Color(0, 0, 0));
        titulo29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo29.setText("Dinero descontado:");
        panelGerenteDirectorBugatti.add(titulo29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, -1));

        textDiscountGerenteBu.setEditable(false);
        textDiscountGerenteBu.setBackground(new java.awt.Color(255, 255, 255));
        textDiscountGerenteBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textDiscountGerenteBu.setForeground(new java.awt.Color(0, 0, 0));
        textDiscountGerenteBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDiscountGerenteBu.setToolTipText("");
        panelGerenteDirectorBugatti.add(textDiscountGerenteBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 20));

        textStatusDirectorBu.setEditable(false);
        textStatusDirectorBu.setBackground(new java.awt.Color(255, 255, 255));
        textStatusDirectorBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textStatusDirectorBu.setForeground(new java.awt.Color(0, 0, 0));
        textStatusDirectorBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textStatusDirectorBu.setToolTipText("");
        panelGerenteDirectorBugatti.add(textStatusDirectorBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, 20));

        textStatusGerenteBu.setEditable(false);
        textStatusGerenteBu.setBackground(new java.awt.Color(255, 255, 255));
        textStatusGerenteBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textStatusGerenteBu.setForeground(new java.awt.Color(0, 0, 0));
        textStatusGerenteBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textStatusGerenteBu.setToolTipText("");
        panelGerenteDirectorBugatti.add(textStatusGerenteBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, 20));

        textFoulGerenteBu.setEditable(false);
        textFoulGerenteBu.setBackground(new java.awt.Color(255, 255, 255));
        textFoulGerenteBu.setForeground(new java.awt.Color(0, 0, 0));
        textFoulGerenteBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFoulGerenteBu.setToolTipText("");
        panelGerenteDirectorBugatti.add(textFoulGerenteBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 20));

        titulo33.setBackground(new java.awt.Color(0, 0, 0));
        titulo33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo33.setForeground(new java.awt.Color(0, 0, 0));
        titulo33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo33.setText("Qué está haciendo el Gerente de Op:");
        panelGerenteDirectorBugatti.add(titulo33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, -1));

        panelBugatti.add(panelGerenteDirectorBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 290, 240));

        panelEstadisticasBugatti.setBackground(new java.awt.Color(255, 102, 102));
        panelEstadisticasBugatti.setForeground(new java.awt.Color(0, 0, 0));
        panelEstadisticasBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo61.setBackground(new java.awt.Color(0, 0, 0));
        titulo61.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo61.setForeground(new java.awt.Color(0, 0, 0));
        titulo61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo61.setText("Estadisticas");
        panelEstadisticasBugatti.add(titulo61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 20));

        titulo30.setBackground(new java.awt.Color(0, 0, 0));
        titulo30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo30.setForeground(new java.awt.Color(0, 0, 0));
        titulo30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo30.setText("Ganancias en bruto:");
        panelEstadisticasBugatti.add(titulo30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, -1));

        titulo31.setBackground(new java.awt.Color(0, 0, 0));
        titulo31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo31.setForeground(new java.awt.Color(0, 0, 0));
        titulo31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo31.setText("Costos Operativos:");
        panelEstadisticasBugatti.add(titulo31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, -1));

        titulo32.setBackground(new java.awt.Color(0, 0, 0));
        titulo32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo32.setForeground(new java.awt.Color(0, 0, 0));
        titulo32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo32.setText("Utilidad:");
        panelEstadisticasBugatti.add(titulo32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        textEEarningsBu.setEditable(false);
        textEEarningsBu.setBackground(new java.awt.Color(255, 255, 255));
        textEEarningsBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textEEarningsBu.setForeground(new java.awt.Color(0, 0, 0));
        textEEarningsBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEEarningsBu.setToolTipText("");
        panelEstadisticasBugatti.add(textEEarningsBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 150, 20));

        textEUtilityBu.setEditable(false);
        textEUtilityBu.setBackground(new java.awt.Color(255, 255, 255));
        textEUtilityBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textEUtilityBu.setForeground(new java.awt.Color(0, 0, 0));
        textEUtilityBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEUtilityBu.setToolTipText("");
        panelEstadisticasBugatti.add(textEUtilityBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 150, 20));

        textECostBu.setEditable(false);
        textECostBu.setBackground(new java.awt.Color(255, 255, 255));
        textECostBu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textECostBu.setForeground(new java.awt.Color(0, 0, 0));
        textECostBu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textECostBu.setToolTipText("");
        panelEstadisticasBugatti.add(textECostBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, 20));

        panelBugatti.add(panelEstadisticasBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 340, 140));

        btnStopSimulation.setBackground(new java.awt.Color(204, 204, 204));
        btnStopSimulation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStopSimulation.setForeground(new java.awt.Color(0, 0, 0));
        btnStopSimulation.setText("Terminar Simulación");
        btnStopSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopSimulationActionPerformed(evt);
            }
        });
        panelBugatti.add(btnStopSimulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 340, 30));

        btnStartSimulation.setBackground(new java.awt.Color(204, 204, 204));
        btnStartSimulation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStartSimulation.setForeground(new java.awt.Color(0, 0, 0));
        btnStartSimulation.setText("Iniciar Simulación");
        btnStartSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartSimulationActionPerformed(evt);
            }
        });
        panelBugatti.add(btnStartSimulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 340, 30));

        panelPantalla.add(panelBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 690, 690));

        panelLamborghini.setBackground(new java.awt.Color(255, 255, 153));
        panelLamborghini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTituloLamborghini.setBackground(new java.awt.Color(255, 255, 0));
        panelTituloLamborghini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo6.setBackground(new java.awt.Color(0, 0, 0));
        titulo6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        titulo6.setForeground(new java.awt.Color(0, 0, 0));
        titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo6.setText("Lamborghini");
        titulo6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTituloLamborghini.add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 710, 40));

        panelLamborghini.add(panelTituloLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 690, 40));

        panelEmpleadosLamborghini.setBackground(new java.awt.Color(255, 255, 0));
        panelEmpleadosLamborghini.setForeground(new java.awt.Color(0, 0, 0));
        panelEmpleadosLamborghini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo9.setBackground(new java.awt.Color(0, 0, 0));
        titulo9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo9.setForeground(new java.awt.Color(0, 0, 0));
        titulo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo9.setText("Empleados");
        panelEmpleadosLamborghini.add(titulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 20));

        titulo26.setBackground(new java.awt.Color(0, 0, 0));
        titulo26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo26.setForeground(new java.awt.Color(0, 0, 0));
        titulo26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo26.setText("Total de empleados:");
        panelEmpleadosLamborghini.add(titulo26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, -1));

        titulo41.setBackground(new java.awt.Color(0, 0, 0));
        titulo41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo41.setForeground(new java.awt.Color(0, 0, 0));
        titulo41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo41.setText("Creadores de Chasis:");
        panelEmpleadosLamborghini.add(titulo41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, -1));

        titulo50.setBackground(new java.awt.Color(0, 0, 0));
        titulo50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo50.setForeground(new java.awt.Color(0, 0, 0));
        titulo50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo50.setText("Creadores de Carrocerías:");
        panelEmpleadosLamborghini.add(titulo50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        titulo69.setBackground(new java.awt.Color(0, 0, 0));
        titulo69.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo69.setForeground(new java.awt.Color(0, 0, 0));
        titulo69.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo69.setText("Creadores de Motores:");
        panelEmpleadosLamborghini.add(titulo69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, -1));

        titulo70.setBackground(new java.awt.Color(0, 0, 0));
        titulo70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo70.setForeground(new java.awt.Color(0, 0, 0));
        titulo70.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo70.setText("Creadores de Ruedas:");
        panelEmpleadosLamborghini.add(titulo70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        titulo71.setBackground(new java.awt.Color(0, 0, 0));
        titulo71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo71.setForeground(new java.awt.Color(0, 0, 0));
        titulo71.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo71.setText("Creadores de Accesorios:");
        panelEmpleadosLamborghini.add(titulo71, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, -1));

        titulo72.setBackground(new java.awt.Color(0, 0, 0));
        titulo72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo72.setForeground(new java.awt.Color(0, 0, 0));
        titulo72.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo72.setText("Director");
        panelEmpleadosLamborghini.add(titulo72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, -1));

        textDirectorLam.setEditable(false);
        textDirectorLam.setBackground(new java.awt.Color(255, 255, 255));
        textDirectorLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textDirectorLam.setForeground(new java.awt.Color(0, 0, 0));
        textDirectorLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDirectorLam.setToolTipText("");
        textDirectorLam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDirectorLamActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(textDirectorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 50, 20));

        textCChasisLam.setEditable(false);
        textCChasisLam.setBackground(new java.awt.Color(255, 255, 255));
        textCChasisLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCChasisLam.setForeground(new java.awt.Color(0, 0, 0));
        textCChasisLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCChasisLam.setToolTipText("");
        textCChasisLam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCChasisLamActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(textCChasisLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 50, 20));

        textCCarroceriaLam.setEditable(false);
        textCCarroceriaLam.setBackground(new java.awt.Color(255, 255, 255));
        textCCarroceriaLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCCarroceriaLam.setForeground(new java.awt.Color(0, 0, 0));
        textCCarroceriaLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCCarroceriaLam.setToolTipText("");
        textCCarroceriaLam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCCarroceriaLamActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(textCCarroceriaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 50, 20));

        textCMotorLam.setEditable(false);
        textCMotorLam.setBackground(new java.awt.Color(255, 255, 255));
        textCMotorLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCMotorLam.setForeground(new java.awt.Color(0, 0, 0));
        textCMotorLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCMotorLam.setToolTipText("");
        textCMotorLam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCMotorLamActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(textCMotorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 50, 20));

        textCRuedaLam.setEditable(false);
        textCRuedaLam.setBackground(new java.awt.Color(255, 255, 255));
        textCRuedaLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCRuedaLam.setForeground(new java.awt.Color(0, 0, 0));
        textCRuedaLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCRuedaLam.setToolTipText("");
        panelEmpleadosLamborghini.add(textCRuedaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 50, 20));

        textCAccesorioLam.setEditable(false);
        textCAccesorioLam.setBackground(new java.awt.Color(255, 255, 255));
        textCAccesorioLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textCAccesorioLam.setForeground(new java.awt.Color(0, 0, 0));
        textCAccesorioLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCAccesorioLam.setToolTipText("");
        panelEmpleadosLamborghini.add(textCAccesorioLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 50, 20));

        textEnsambladorLam.setEditable(false);
        textEnsambladorLam.setBackground(new java.awt.Color(255, 255, 255));
        textEnsambladorLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textEnsambladorLam.setForeground(new java.awt.Color(0, 0, 0));
        textEnsambladorLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEnsambladorLam.setToolTipText("");
        panelEmpleadosLamborghini.add(textEnsambladorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 50, 20));

        btnMinusChasisLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMinusChasisLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinusChasisLam.setText("-");
        panelEmpleadosLamborghini.add(btnMinusChasisLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 30, 20));

        btnMinusMotorLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMinusMotorLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinusMotorLam.setText("-");
        panelEmpleadosLamborghini.add(btnMinusMotorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 30, 20));

        btnMinusCarroceriaLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMinusCarroceriaLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinusCarroceriaLam.setText("-");
        panelEmpleadosLamborghini.add(btnMinusCarroceriaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 30, 20));

        btnMoreMotorLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMoreMotorLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMoreMotorLam.setText("+");
        panelEmpleadosLamborghini.add(btnMoreMotorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 30, 20));

        btnMoreRuedaLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMoreRuedaLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMoreRuedaLam.setText("+");
        panelEmpleadosLamborghini.add(btnMoreRuedaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 30, 20));

        btnMoreCarroceriaLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMoreCarroceriaLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMoreCarroceriaLam.setText("+");
        panelEmpleadosLamborghini.add(btnMoreCarroceriaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 30, 20));

        btnMoreChasisLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMoreChasisLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMoreChasisLam.setText("+");
        panelEmpleadosLamborghini.add(btnMoreChasisLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 30, 20));

        btnMinusAccesorioLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMinusAccesorioLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinusAccesorioLam.setText("-");
        panelEmpleadosLamborghini.add(btnMinusAccesorioLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 30, 20));

        btnMoreAccesorioLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMoreAccesorioLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMoreAccesorioLam.setText("+");
        panelEmpleadosLamborghini.add(btnMoreAccesorioLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 30, 20));

        btnMinusEnsambladorLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMinusEnsambladorLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinusEnsambladorLam.setText("-");
        panelEmpleadosLamborghini.add(btnMinusEnsambladorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 30, 20));

        btnMoreEnsambladorLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMoreEnsambladorLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMoreEnsambladorLam.setText("+");
        panelEmpleadosLamborghini.add(btnMoreEnsambladorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 30, 20));

        btnMinusRuedaLam.setForeground(new java.awt.Color(0, 0, 0));
        btnMinusRuedaLam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinusRuedaLam.setText("-");
        panelEmpleadosLamborghini.add(btnMinusRuedaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 30, 20));

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 0, 0));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 30, 20));

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 0, 0));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 30, 20));

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 0, 0));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 30, 20));

        jButton28.setBackground(new java.awt.Color(255, 255, 255));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 0, 0));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 30, 20));

        jButton29.setBackground(new java.awt.Color(255, 255, 255));
        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 0, 0));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 30, 20));

        jButton30.setBackground(new java.awt.Color(255, 255, 255));
        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 0, 0));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 30, 20));

        jButton31.setBackground(new java.awt.Color(255, 255, 255));
        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 0, 0));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 30, 20));

        jButton32.setBackground(new java.awt.Color(255, 255, 255));
        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 0, 0));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 30, 20));

        jButton33.setBackground(new java.awt.Color(255, 255, 255));
        jButton33.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton33.setForeground(new java.awt.Color(0, 0, 0));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 30, 20));

        jButton34.setBackground(new java.awt.Color(255, 255, 255));
        jButton34.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton34.setForeground(new java.awt.Color(0, 0, 0));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 30, 20));

        jButton35.setBackground(new java.awt.Color(255, 255, 255));
        jButton35.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton35.setForeground(new java.awt.Color(0, 0, 0));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 30, 20));

        jButton36.setBackground(new java.awt.Color(255, 255, 255));
        jButton36.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton36.setForeground(new java.awt.Color(0, 0, 0));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 30, 20));

        titulo73.setBackground(new java.awt.Color(0, 0, 0));
        titulo73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo73.setForeground(new java.awt.Color(0, 0, 0));
        titulo73.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo73.setText("Ensambladores:");
        panelEmpleadosLamborghini.add(titulo73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        titulo74.setBackground(new java.awt.Color(0, 0, 0));
        titulo74.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo74.setForeground(new java.awt.Color(0, 0, 0));
        titulo74.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo74.setText("Gerente:");
        panelEmpleadosLamborghini.add(titulo74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        textGerenteLam.setEditable(false);
        textGerenteLam.setBackground(new java.awt.Color(255, 255, 255));
        textGerenteLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textGerenteLam.setForeground(new java.awt.Color(0, 0, 0));
        textGerenteLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textGerenteLam.setToolTipText("");
        panelEmpleadosLamborghini.add(textGerenteLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 20));

        jTextField59.setBackground(new java.awt.Color(255, 255, 255));
        jTextField59.setText("jTextField1");
        panelEmpleadosLamborghini.add(jTextField59, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 20));

        textTotalWorkersLam.setEditable(false);
        textTotalWorkersLam.setBackground(new java.awt.Color(255, 255, 255));
        textTotalWorkersLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textTotalWorkersLam.setForeground(new java.awt.Color(0, 0, 0));
        textTotalWorkersLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTotalWorkersLam.setToolTipText("");
        textTotalWorkersLam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTotalWorkersLamActionPerformed(evt);
            }
        });
        panelEmpleadosLamborghini.add(textTotalWorkersLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 50, 20));

        titulo75.setBackground(new java.awt.Color(0, 0, 0));
        titulo75.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo75.setForeground(new java.awt.Color(0, 0, 0));
        titulo75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo75.setText("Gestion de Trabajo");
        panelEmpleadosLamborghini.add(titulo75, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 260, 20));

        panelLamborghini.add(panelEmpleadosLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, 350));

        panelAlmacenLamborghini.setBackground(new java.awt.Color(255, 255, 0));
        panelAlmacenLamborghini.setForeground(new java.awt.Color(0, 0, 0));
        panelAlmacenLamborghini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo49.setBackground(new java.awt.Color(0, 0, 0));
        titulo49.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo49.setForeground(new java.awt.Color(0, 0, 0));
        titulo49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo49.setText("Almacen");
        panelAlmacenLamborghini.add(titulo49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, 20));

        titulo51.setBackground(new java.awt.Color(0, 0, 0));
        titulo51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo51.setForeground(new java.awt.Color(0, 0, 0));
        titulo51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo51.setText("Vehiculos Especiales:");
        panelAlmacenLamborghini.add(titulo51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        titulo52.setBackground(new java.awt.Color(0, 0, 0));
        titulo52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo52.setForeground(new java.awt.Color(0, 0, 0));
        titulo52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo52.setText("Chasis:");
        panelAlmacenLamborghini.add(titulo52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, -1));

        titulo53.setBackground(new java.awt.Color(0, 0, 0));
        titulo53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo53.setForeground(new java.awt.Color(0, 0, 0));
        titulo53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo53.setText("Carrocerías:");
        panelAlmacenLamborghini.add(titulo53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        titulo54.setBackground(new java.awt.Color(0, 0, 0));
        titulo54.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo54.setForeground(new java.awt.Color(0, 0, 0));
        titulo54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo54.setText("Motores:");
        panelAlmacenLamborghini.add(titulo54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));

        titulo55.setBackground(new java.awt.Color(0, 0, 0));
        titulo55.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo55.setForeground(new java.awt.Color(0, 0, 0));
        titulo55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo55.setText("Ruedas:");
        panelAlmacenLamborghini.add(titulo55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        titulo56.setBackground(new java.awt.Color(0, 0, 0));
        titulo56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo56.setForeground(new java.awt.Color(0, 0, 0));
        titulo56.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo56.setText("Accesorios:");
        panelAlmacenLamborghini.add(titulo56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, -1));

        titulo57.setBackground(new java.awt.Color(0, 0, 0));
        titulo57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo57.setForeground(new java.awt.Color(0, 0, 0));
        titulo57.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo57.setText("Vehiculos Estandar:");
        panelAlmacenLamborghini.add(titulo57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        textAVeSpecialLam.setEditable(false);
        textAVeSpecialLam.setBackground(new java.awt.Color(255, 255, 255));
        textAVeSpecialLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAVeSpecialLam.setForeground(new java.awt.Color(0, 0, 0));
        textAVeSpecialLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAVeSpecialLam.setToolTipText("");
        panelAlmacenLamborghini.add(textAVeSpecialLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 20));

        textAChasisLam.setEditable(false);
        textAChasisLam.setBackground(new java.awt.Color(255, 255, 255));
        textAChasisLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAChasisLam.setForeground(new java.awt.Color(0, 0, 0));
        textAChasisLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAChasisLam.setToolTipText("");
        panelAlmacenLamborghini.add(textAChasisLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 20));

        textACarroceriaLam.setEditable(false);
        textACarroceriaLam.setBackground(new java.awt.Color(255, 255, 255));
        textACarroceriaLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textACarroceriaLam.setForeground(new java.awt.Color(0, 0, 0));
        textACarroceriaLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textACarroceriaLam.setToolTipText("");
        panelAlmacenLamborghini.add(textACarroceriaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 50, 20));

        textAMotorLam.setEditable(false);
        textAMotorLam.setBackground(new java.awt.Color(255, 255, 255));
        textAMotorLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAMotorLam.setForeground(new java.awt.Color(0, 0, 0));
        textAMotorLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAMotorLam.setToolTipText("");
        panelAlmacenLamborghini.add(textAMotorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 50, 20));

        textARuedaLam.setEditable(false);
        textARuedaLam.setBackground(new java.awt.Color(255, 255, 255));
        textARuedaLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textARuedaLam.setForeground(new java.awt.Color(0, 0, 0));
        textARuedaLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textARuedaLam.setToolTipText("");
        panelAlmacenLamborghini.add(textARuedaLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 20));

        textAAccesorioLam.setEditable(false);
        textAAccesorioLam.setBackground(new java.awt.Color(255, 255, 255));
        textAAccesorioLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAAccesorioLam.setForeground(new java.awt.Color(0, 0, 0));
        textAAccesorioLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAAccesorioLam.setToolTipText("");
        panelAlmacenLamborghini.add(textAAccesorioLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 50, 20));

        textAVeStandardLam.setEditable(false);
        textAVeStandardLam.setBackground(new java.awt.Color(255, 255, 255));
        textAVeStandardLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textAVeStandardLam.setForeground(new java.awt.Color(0, 0, 0));
        textAVeStandardLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAVeStandardLam.setToolTipText("");
        panelAlmacenLamborghini.add(textAVeStandardLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, 20));

        panelLamborghini.add(panelAlmacenLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 290, 270));

        panelDiasLamborghini.setBackground(new java.awt.Color(255, 255, 0));
        panelDiasLamborghini.setForeground(new java.awt.Color(0, 0, 0));
        panelDiasLamborghini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textDaysRemainingLam.setEditable(false);
        textDaysRemainingLam.setBackground(new java.awt.Color(255, 255, 255));
        textDaysRemainingLam.setForeground(new java.awt.Color(0, 0, 0));
        textDaysRemainingLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDaysRemainingLam.setToolTipText("");
        panelDiasLamborghini.add(textDaysRemainingLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 80, 30));

        titulo64.setBackground(new java.awt.Color(0, 0, 0));
        titulo64.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo64.setForeground(new java.awt.Color(0, 0, 0));
        titulo64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo64.setText("Dias para la Entrega");
        panelDiasLamborghini.add(titulo64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 20));

        panelLamborghini.add(panelDiasLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 290, 70));

        panelGerenteDirectorLamborghini.setBackground(new java.awt.Color(255, 255, 0));
        panelGerenteDirectorLamborghini.setForeground(new java.awt.Color(0, 0, 0));
        panelGerenteDirectorLamborghini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo65.setBackground(new java.awt.Color(0, 0, 0));
        titulo65.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo65.setForeground(new java.awt.Color(0, 0, 0));
        titulo65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo65.setText("del Gerente y Director");
        panelGerenteDirectorLamborghini.add(titulo65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 20));

        titulo66.setBackground(new java.awt.Color(0, 0, 0));
        titulo66.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo66.setForeground(new java.awt.Color(0, 0, 0));
        titulo66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo66.setText("Gestion de Trabajo");
        panelGerenteDirectorLamborghini.add(titulo66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 20));

        titulo34.setBackground(new java.awt.Color(0, 0, 0));
        titulo34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo34.setForeground(new java.awt.Color(0, 0, 0));
        titulo34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo34.setText("Qué está haciendo el Director:");
        panelGerenteDirectorLamborghini.add(titulo34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, -1));

        titulo35.setBackground(new java.awt.Color(0, 0, 0));
        titulo35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo35.setForeground(new java.awt.Color(0, 0, 0));
        titulo35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo35.setText("Faltas del Gerente:");
        panelGerenteDirectorLamborghini.add(titulo35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        titulo36.setBackground(new java.awt.Color(0, 0, 0));
        titulo36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo36.setForeground(new java.awt.Color(0, 0, 0));
        titulo36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo36.setText("Dinero descontado:");
        panelGerenteDirectorLamborghini.add(titulo36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, -1));

        textDiscountGerenteLam.setEditable(false);
        textDiscountGerenteLam.setBackground(new java.awt.Color(255, 255, 255));
        textDiscountGerenteLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textDiscountGerenteLam.setForeground(new java.awt.Color(0, 0, 0));
        textDiscountGerenteLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDiscountGerenteLam.setToolTipText("");
        panelGerenteDirectorLamborghini.add(textDiscountGerenteLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 20));

        textStatusDirectorLam.setEditable(false);
        textStatusDirectorLam.setBackground(new java.awt.Color(255, 255, 255));
        textStatusDirectorLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textStatusDirectorLam.setForeground(new java.awt.Color(0, 0, 0));
        textStatusDirectorLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textStatusDirectorLam.setToolTipText("");
        panelGerenteDirectorLamborghini.add(textStatusDirectorLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, 20));

        textStatusGerenteLam.setEditable(false);
        textStatusGerenteLam.setBackground(new java.awt.Color(255, 255, 255));
        textStatusGerenteLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textStatusGerenteLam.setForeground(new java.awt.Color(0, 0, 0));
        textStatusGerenteLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textStatusGerenteLam.setToolTipText("");
        panelGerenteDirectorLamborghini.add(textStatusGerenteLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, 20));

        textFoulGerenteLam.setEditable(false);
        textFoulGerenteLam.setBackground(new java.awt.Color(255, 255, 255));
        textFoulGerenteLam.setForeground(new java.awt.Color(0, 0, 0));
        textFoulGerenteLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFoulGerenteLam.setToolTipText("");
        panelGerenteDirectorLamborghini.add(textFoulGerenteLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 20));

        titulo37.setBackground(new java.awt.Color(0, 0, 0));
        titulo37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo37.setForeground(new java.awt.Color(0, 0, 0));
        titulo37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo37.setText("Qué está haciendo el Gerente de Op:");
        panelGerenteDirectorLamborghini.add(titulo37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, -1));

        panelLamborghini.add(panelGerenteDirectorLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 290, 240));

        panelEstadisticasLamborghini.setBackground(new java.awt.Color(255, 255, 0));
        panelEstadisticasLamborghini.setForeground(new java.awt.Color(0, 0, 0));
        panelEstadisticasLamborghini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo67.setBackground(new java.awt.Color(0, 0, 0));
        titulo67.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo67.setForeground(new java.awt.Color(0, 0, 0));
        titulo67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo67.setText("Estadisticas");
        panelEstadisticasLamborghini.add(titulo67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 20));

        titulo38.setBackground(new java.awt.Color(0, 0, 0));
        titulo38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo38.setForeground(new java.awt.Color(0, 0, 0));
        titulo38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo38.setText("Ganancias en bruto:");
        panelEstadisticasLamborghini.add(titulo38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, -1));

        titulo39.setBackground(new java.awt.Color(0, 0, 0));
        titulo39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo39.setForeground(new java.awt.Color(0, 0, 0));
        titulo39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo39.setText("Costos Operativos:");
        panelEstadisticasLamborghini.add(titulo39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, -1));

        titulo68.setBackground(new java.awt.Color(0, 0, 0));
        titulo68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo68.setForeground(new java.awt.Color(0, 0, 0));
        titulo68.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo68.setText("Utilidad:");
        panelEstadisticasLamborghini.add(titulo68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        textEEarningsLam.setEditable(false);
        textEEarningsLam.setBackground(new java.awt.Color(255, 255, 255));
        textEEarningsLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textEEarningsLam.setForeground(new java.awt.Color(0, 0, 0));
        textEEarningsLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEEarningsLam.setToolTipText("");
        panelEstadisticasLamborghini.add(textEEarningsLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 150, 20));

        textEUtilityLam.setEditable(false);
        textEUtilityLam.setBackground(new java.awt.Color(255, 255, 255));
        textEUtilityLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textEUtilityLam.setForeground(new java.awt.Color(0, 0, 0));
        textEUtilityLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEUtilityLam.setToolTipText("");
        panelEstadisticasLamborghini.add(textEUtilityLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 150, 20));

        textECostLam.setEditable(false);
        textECostLam.setBackground(new java.awt.Color(255, 255, 255));
        textECostLam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        textECostLam.setForeground(new java.awt.Color(0, 0, 0));
        textECostLam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textECostLam.setToolTipText("");
        panelEstadisticasLamborghini.add(textECostLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, 20));

        panelLamborghini.add(panelEstadisticasLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 340, 140));

        btnLoadInitParameters.setBackground(new java.awt.Color(204, 204, 204));
        btnLoadInitParameters.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLoadInitParameters.setForeground(new java.awt.Color(0, 0, 0));
        btnLoadInitParameters.setText("Cargar Valores Iniciales");
        btnLoadInitParameters.setToolTipText("");
        btnLoadInitParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadInitParametersActionPerformed(evt);
            }
        });
        panelLamborghini.add(btnLoadInitParameters, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 340, 30));

        btnWatchGraphic.setBackground(new java.awt.Color(204, 204, 204));
        btnWatchGraphic.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnWatchGraphic.setForeground(new java.awt.Color(0, 0, 0));
        btnWatchGraphic.setText("Ver Grafica");
        btnWatchGraphic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWatchGraphicActionPerformed(evt);
            }
        });
        panelLamborghini.add(btnWatchGraphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 340, 30));

        panelPantalla.add(panelLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 683, 690));

        salir.setBackground(new java.awt.Color(255, 51, 51));
        salir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("x");
        salir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        salir.setBorderPainted(false);
        salir.setFocusPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        panelPantalla.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 40));

        tituloPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        tituloPrincipal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("Simulación Automotriz");
        panelPantalla.add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1380, 40));

        Copyright.setBackground(new java.awt.Color(0, 0, 0));
        Copyright.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Copyright.setForeground(new java.awt.Color(0, 0, 0));
        Copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Copyright.setText("2023 © Norangel Marin y Jenderson Quintero");
        panelPantalla.add(Copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1380, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoreChasisBuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoreChasisBuActionPerformed
        this.vpBu.addNewWorker("CHASIS");
    }//GEN-LAST:event_btnMoreChasisBuActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.vpBu.addNewWorker("CARROCERIA");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.vpBu.addNewWorker("MOTOR");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.vpBu.addNewWorker("RUEDA");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.vpBu.addNewWorker("ACCESORIO");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.vpBu.addNewWorker("ENSAMBLADOR");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.vpBu.deleteWorker("ENSAMBLADOR");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.vpBu.deleteWorker("ACCESORIO");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        this.vpBu.deleteWorker("RUEDA");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.vpBu.deleteWorker("MOTOR");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        this.vpBu.deleteWorker("CARROCERIA");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void btnStopSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopSimulationActionPerformed
        this.vpBu.stopPlant();
        this.vpLa.stopPlant();
    }//GEN-LAST:event_btnStopSimulationActionPerformed

    private void btnLoadInitParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadInitParametersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoadInitParametersActionPerformed

    private void btnWatchGraphicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWatchGraphicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWatchGraphicActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnMinusChasisBuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusChasisBuActionPerformed
        this.vpBu.deleteWorker("CHASIS");
    }//GEN-LAST:event_btnMinusChasisBuActionPerformed

    private void textDirectorLamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDirectorLamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDirectorLamActionPerformed

    private void textCChasisLamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCChasisLamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCChasisLamActionPerformed

    private void textCCarroceriaLamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCCarroceriaLamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCCarroceriaLamActionPerformed

    private void textCMotorLamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCMotorLamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCMotorLamActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void textTotalWorkersLamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalWorkersLamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalWorkersLamActionPerformed

    private void btnStartSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartSimulationActionPerformed
        vpBu = new VehiclePlant("BUGATTI",
                this.dataInit.getDurationInS(), 
                this.dataInit.getDeadline(),
                this.dataInit.getMountChasisInit(),
                this.dataInit.getMountCarroceriaInit(),
                this.dataInit.getMountMotorInit(),
                this.dataInit.getMountRuedaInit(),
                this.dataInit.getMountAccesorioInit(),
                this.dataInit.getMountEnsambladorInit(), this);
        
        vpLa = new VehiclePlant("LAMBORGHINI",
                this.dataInit.getDurationInS(), 
                this.dataInit.getDeadline(),
                this.dataInit.getMountChasisInit(),
                this.dataInit.getMountCarroceriaInit(),
                this.dataInit.getMountMotorInit(),
                this.dataInit.getMountRuedaInit(),
                this.dataInit.getMountAccesorioInit(),
                this.dataInit.getMountEnsambladorInit(), this);
        
        vpBu.start();
        vpLa.start();
        
        this.updateDataView();
    }//GEN-LAST:event_btnStartSimulationActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Copyright;
    private javax.swing.JButton btnLoadInitParameters;
    private javax.swing.JLabel btnMinusAccesorioLam;
    private javax.swing.JLabel btnMinusCarroceriaLam;
    private javax.swing.JButton btnMinusChasisBu;
    private javax.swing.JLabel btnMinusChasisLam;
    private javax.swing.JLabel btnMinusEnsambladorLam;
    private javax.swing.JLabel btnMinusMotorLam;
    private javax.swing.JLabel btnMinusRuedaLam;
    private javax.swing.JLabel btnMoreAccesorioLam;
    private javax.swing.JLabel btnMoreCarroceriaLam;
    private javax.swing.JButton btnMoreChasisBu;
    private javax.swing.JLabel btnMoreChasisLam;
    private javax.swing.JLabel btnMoreEnsambladorLam;
    private javax.swing.JLabel btnMoreMotorLam;
    private javax.swing.JLabel btnMoreRuedaLam;
    private javax.swing.JButton btnStartSimulation;
    private javax.swing.JButton btnStopSimulation;
    private javax.swing.JButton btnWatchGraphic;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JPanel panelAlmacenBugatti;
    private javax.swing.JPanel panelAlmacenLamborghini;
    private javax.swing.JPanel panelBugatti;
    private javax.swing.JPanel panelDiasBugatti;
    private javax.swing.JPanel panelDiasLamborghini;
    private javax.swing.JPanel panelEmpleadosBugatti;
    private javax.swing.JPanel panelEmpleadosLamborghini;
    private javax.swing.JPanel panelEstadisticasBugatti;
    private javax.swing.JPanel panelEstadisticasLamborghini;
    private javax.swing.JPanel panelGerenteDirectorBugatti;
    private javax.swing.JPanel panelGerenteDirectorLamborghini;
    private javax.swing.JPanel panelLamborghini;
    private javax.swing.JPanel panelPantalla;
    private javax.swing.JPanel panelTituloBugatti;
    private javax.swing.JPanel panelTituloLamborghini;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textAAccesorioBu;
    private javax.swing.JTextField textAAccesorioLam;
    private javax.swing.JTextField textACarroceriaBu;
    private javax.swing.JTextField textACarroceriaLam;
    private javax.swing.JTextField textAChasisBu;
    private javax.swing.JTextField textAChasisLam;
    private javax.swing.JTextField textAMotorBu;
    private javax.swing.JTextField textAMotorLam;
    private javax.swing.JTextField textARuedaBu;
    private javax.swing.JTextField textARuedaLam;
    private javax.swing.JTextField textAVeSpecialBu;
    private javax.swing.JTextField textAVeSpecialLam;
    private javax.swing.JTextField textAVeStandardBu;
    private javax.swing.JTextField textAVeStandardLam;
    private javax.swing.JTextField textCAccesorioBu;
    private javax.swing.JTextField textCAccesorioLam;
    private javax.swing.JTextField textCCarroceriaBu;
    private javax.swing.JTextField textCCarroceriaLam;
    private javax.swing.JTextField textCChasisBu;
    private javax.swing.JTextField textCChasisLam;
    private javax.swing.JTextField textCMotorBu;
    private javax.swing.JTextField textCMotorLam;
    private javax.swing.JTextField textCRuedaBu;
    private javax.swing.JTextField textCRuedaLam;
    private javax.swing.JTextField textDaysRemainingBu;
    private javax.swing.JTextField textDaysRemainingLam;
    private javax.swing.JTextField textDirectorBu;
    private javax.swing.JTextField textDirectorLam;
    private javax.swing.JTextField textDiscountGerenteBu;
    private javax.swing.JTextField textDiscountGerenteLam;
    private javax.swing.JTextField textECostBu;
    private javax.swing.JTextField textECostLam;
    private javax.swing.JTextField textEEarningsBu;
    private javax.swing.JTextField textEEarningsLam;
    private javax.swing.JTextField textEUtilityBu;
    private javax.swing.JTextField textEUtilityLam;
    private javax.swing.JTextField textEnsambladorBu;
    private javax.swing.JTextField textEnsambladorLam;
    private javax.swing.JTextField textFoulGerenteBu;
    private javax.swing.JTextField textFoulGerenteLam;
    private javax.swing.JTextField textGerenteBu;
    private javax.swing.JTextField textGerenteLam;
    private javax.swing.JTextField textStatusDirectorBu;
    private javax.swing.JTextField textStatusDirectorLam;
    private javax.swing.JTextField textStatusGerenteBu;
    private javax.swing.JTextField textStatusGerenteLam;
    private javax.swing.JTextField textTotalWorkersBu;
    private javax.swing.JTextField textTotalWorkersLam;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo11;
    private javax.swing.JLabel titulo12;
    private javax.swing.JLabel titulo13;
    private javax.swing.JLabel titulo14;
    private javax.swing.JLabel titulo15;
    private javax.swing.JLabel titulo16;
    private javax.swing.JLabel titulo17;
    private javax.swing.JLabel titulo26;
    private javax.swing.JLabel titulo27;
    private javax.swing.JLabel titulo28;
    private javax.swing.JLabel titulo29;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo30;
    private javax.swing.JLabel titulo31;
    private javax.swing.JLabel titulo32;
    private javax.swing.JLabel titulo33;
    private javax.swing.JLabel titulo34;
    private javax.swing.JLabel titulo35;
    private javax.swing.JLabel titulo36;
    private javax.swing.JLabel titulo37;
    private javax.swing.JLabel titulo38;
    private javax.swing.JLabel titulo39;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo40;
    private javax.swing.JLabel titulo41;
    private javax.swing.JLabel titulo42;
    private javax.swing.JLabel titulo43;
    private javax.swing.JLabel titulo44;
    private javax.swing.JLabel titulo45;
    private javax.swing.JLabel titulo46;
    private javax.swing.JLabel titulo47;
    private javax.swing.JLabel titulo48;
    private javax.swing.JLabel titulo49;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo50;
    private javax.swing.JLabel titulo51;
    private javax.swing.JLabel titulo52;
    private javax.swing.JLabel titulo53;
    private javax.swing.JLabel titulo54;
    private javax.swing.JLabel titulo55;
    private javax.swing.JLabel titulo56;
    private javax.swing.JLabel titulo57;
    private javax.swing.JLabel titulo58;
    private javax.swing.JLabel titulo59;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo60;
    private javax.swing.JLabel titulo61;
    private javax.swing.JLabel titulo62;
    private javax.swing.JLabel titulo64;
    private javax.swing.JLabel titulo65;
    private javax.swing.JLabel titulo66;
    private javax.swing.JLabel titulo67;
    private javax.swing.JLabel titulo68;
    private javax.swing.JLabel titulo69;
    private javax.swing.JLabel titulo70;
    private javax.swing.JLabel titulo71;
    private javax.swing.JLabel titulo72;
    private javax.swing.JLabel titulo73;
    private javax.swing.JLabel titulo74;
    private javax.swing.JLabel titulo75;
    private javax.swing.JLabel titulo9;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
