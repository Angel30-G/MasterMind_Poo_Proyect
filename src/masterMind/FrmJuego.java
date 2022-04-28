/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterMind;

import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/*
 * This class initialize the components needed for the interface
 * @version 1.0 04/24/2022
 * @author Ángel Varela - Michael Oviedo
 * @see javax.swing.JFrame
 */
public class FrmJuego extends javax.swing.JFrame {

    /**
     * Creates new form FrmJuego
     */
    public FrmJuego() {
        initComponents();
    }
    public static int contadorAzul = 0;
    public static int contadorRojo = 0;
    public static int contadorVerde = 0;
    public static int contadorAmarillo = 0;
    public static int contadorRosado = 0;

    public static int intentos = 0;

/*
    * This class generates the random colors for guessing them
    * @version 1.0 04/24/2022
    * @author Ángel Varela - Michael Oviedo
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioAzul = new javax.swing.JRadioButton();
        jRadioVerde = new javax.swing.JRadioButton();
        jRadiorojo = new javax.swing.JRadioButton();
        jRadioAmarillo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadiosolucion4 = new javax.swing.JRadioButton();
        jRadiosolucion3 = new javax.swing.JRadioButton();
        jRadiosolucion2 = new javax.swing.JRadioButton();
        jRadiosolucion1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioAzul1 = new javax.swing.JRadioButton();
        jRadioVerde1 = new javax.swing.JRadioButton();
        jRadiorojo1 = new javax.swing.JRadioButton();
        jRadioAmarillo1 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioAzul2 = new javax.swing.JRadioButton();
        jRadioVerde2 = new javax.swing.JRadioButton();
        jRadiorojo2 = new javax.swing.JRadioButton();
        jRadioAmarillo2 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jRadioAzul3 = new javax.swing.JRadioButton();
        jRadioVerde3 = new javax.swing.JRadioButton();
        jRadiorojo3 = new javax.swing.JRadioButton();
        jRadioAmarillo3 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jRadioAzul4 = new javax.swing.JRadioButton();
        jRadioVerde4 = new javax.swing.JRadioButton();
        jRadiorojo4 = new javax.swing.JRadioButton();
        jRadioAmarillo4 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jRadioAzul5 = new javax.swing.JRadioButton();
        jRadioVerde5 = new javax.swing.JRadioButton();
        jRadiorojo5 = new javax.swing.JRadioButton();
        jRadioAmarillo5 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jRadioAzul6 = new javax.swing.JRadioButton();
        jRadioVerde6 = new javax.swing.JRadioButton();
        jRadiorojo6 = new javax.swing.JRadioButton();
        jRadioAmarillo6 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jRadioAzul7 = new javax.swing.JRadioButton();
        jRadioVerde7 = new javax.swing.JRadioButton();
        jRadiorojo7 = new javax.swing.JRadioButton();
        jRadioAmarillo7 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jRadioAzul8 = new javax.swing.JRadioButton();
        jRadioVerde8 = new javax.swing.JRadioButton();
        jRadiorojo8 = new javax.swing.JRadioButton();
        jRadioAmarillo8 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jRadioAzul10 = new javax.swing.JRadioButton();
        jRadioVerde10 = new javax.swing.JRadioButton();
        jRadiorojo10 = new javax.swing.JRadioButton();
        jRadioAmarillo10 = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jRadioAzul9 = new javax.swing.JRadioButton();
        jRadioVerde9 = new javax.swing.JRadioButton();
        jRadiorojo9 = new javax.swing.JRadioButton();
        jRadioAmarillo9 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jRdbPistaAzul9 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo9 = new javax.swing.JRadioButton();
        jRdbPistaVerde9 = new javax.swing.JRadioButton();
        jRdbPistaRojo9 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jRdbPistaAzul = new javax.swing.JRadioButton();
        jRdbPistaAmarillo = new javax.swing.JRadioButton();
        jRdbPistaVerde = new javax.swing.JRadioButton();
        jRdbPistaRojo = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jRdbPistaAzul1 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo1 = new javax.swing.JRadioButton();
        jRdbPistaVerde1 = new javax.swing.JRadioButton();
        jRdbPistaRojo1 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jRdbPistaAzul2 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo2 = new javax.swing.JRadioButton();
        jRdbPistaVerde2 = new javax.swing.JRadioButton();
        jRdbPistaRojo2 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jRdbPistaAzul3 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo3 = new javax.swing.JRadioButton();
        jRdbPistaVerde3 = new javax.swing.JRadioButton();
        jRdbPistaRojo3 = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jRdbPistaAzul4 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo4 = new javax.swing.JRadioButton();
        jRdbPistaVerde4 = new javax.swing.JRadioButton();
        jRdbPistaRojo4 = new javax.swing.JRadioButton();
        jPanel20 = new javax.swing.JPanel();
        jRdbPistaAzul5 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo5 = new javax.swing.JRadioButton();
        jRdbPistaVerde5 = new javax.swing.JRadioButton();
        jRdbPistaRojo5 = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jRdbPistaAzul6 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo6 = new javax.swing.JRadioButton();
        jRdbPistaVerde6 = new javax.swing.JRadioButton();
        jRdbPistaRojo6 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jRdbPistaAzul7 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo7 = new javax.swing.JRadioButton();
        jRdbPistaVerde7 = new javax.swing.JRadioButton();
        jRdbPistaRojo7 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jRdbPistaAzul8 = new javax.swing.JRadioButton();
        jRdbPistaAmarillo8 = new javax.swing.JRadioButton();
        jRdbPistaVerde8 = new javax.swing.JRadioButton();
        jRdbPistaRojo8 = new javax.swing.JRadioButton();
        jPanel24 = new javax.swing.JPanel();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, 160, 50));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jRadioAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAzulActionPerformed(evt);
            }
        });

        jRadioVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioVerdeActionPerformed(evt);
            }
        });

        jRadiorojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiorojoActionPerformed(evt);
            }
        });

        jRadioAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAmarilloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul)
                    .addComponent(jRadioVerde)
                    .addComponent(jRadiorojo)
                    .addComponent(jRadioAmarillo))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 540, 40));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jRadiosolucion1)
                .addGap(2, 2, 2)
                .addComponent(jRadiosolucion2)
                .addGap(2, 2, 2)
                .addComponent(jRadiosolucion3)
                .addGap(2, 2, 2)
                .addComponent(jRadiosolucion4)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadiosolucion1)
                    .addComponent(jRadiosolucion2)
                    .addComponent(jRadiosolucion3)
                    .addComponent(jRadiosolucion4)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 540, 40));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul1)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde1)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo1)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo1)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul1)
                    .addComponent(jRadioVerde1)
                    .addComponent(jRadiorojo1)
                    .addComponent(jRadioAmarillo1))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 540, 40));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul2)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde2)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo2)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo2)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul2)
                    .addComponent(jRadioVerde2)
                    .addComponent(jRadiorojo2)
                    .addComponent(jRadioAmarillo2))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 540, 40));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul3)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde3)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo3)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo3)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul3)
                    .addComponent(jRadioVerde3)
                    .addComponent(jRadiorojo3)
                    .addComponent(jRadioAmarillo3))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 540, 40));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul4)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde4)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo4)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo4)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul4)
                    .addComponent(jRadioVerde4)
                    .addComponent(jRadiorojo4)
                    .addComponent(jRadioAmarillo4))
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 540, 40));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul5)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde5)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo5)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo5)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul5)
                    .addComponent(jRadioVerde5)
                    .addComponent(jRadiorojo5)
                    .addComponent(jRadioAmarillo5))
                .addContainerGap())
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 540, 40));

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul6)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde6)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo6)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo6)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul6)
                    .addComponent(jRadioVerde6)
                    .addComponent(jRadiorojo6)
                    .addComponent(jRadioAmarillo6))
                .addContainerGap())
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 540, 40));

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul7)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde7)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo7)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo7)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul7)
                    .addComponent(jRadioVerde7)
                    .addComponent(jRadiorojo7)
                    .addComponent(jRadioAmarillo7))
                .addContainerGap())
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 540, 40));

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul8)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde8)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo8)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo8)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul8)
                    .addComponent(jRadioVerde8)
                    .addComponent(jRadiorojo8)
                    .addComponent(jRadioAmarillo8))
                .addContainerGap())
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 540, 40));

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));

        jRadioAmarillo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAmarillo10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul10)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde10)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo10)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo10)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul10)
                    .addComponent(jRadioVerde10)
                    .addComponent(jRadiorojo10)
                    .addComponent(jRadioAmarillo10))
                .addContainerGap())
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 540, 40));

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioAzul9)
                .addGap(2, 2, 2)
                .addComponent(jRadioVerde9)
                .addGap(2, 2, 2)
                .addComponent(jRadiorojo9)
                .addGap(2, 2, 2)
                .addComponent(jRadioAmarillo9)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioAzul9)
                    .addComponent(jRadioVerde9)
                    .addComponent(jRadiorojo9)
                    .addComponent(jRadioAmarillo9))
                .addContainerGap())
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 540, 40));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul9.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul9.setEnabled(false);

        jRdbPistaAmarillo9.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo9.setEnabled(false);

        jRdbPistaVerde9.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde9.setEnabled(false);

        jRdbPistaRojo9.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo9.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRdbPistaAmarillo9, jRdbPistaAzul9, jRdbPistaRojo9, jRdbPistaVerde9});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRdbPistaAmarillo9, jRdbPistaAzul9, jRdbPistaRojo9, jRdbPistaVerde9});

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 60, 50));

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul.setEnabled(false);

        jRdbPistaAmarillo.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo.setEnabled(false);

        jRdbPistaVerde.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde.setEnabled(false);

        jRdbPistaRojo.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo.setEnabled(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 60, 50));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul1.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul1.setEnabled(false);

        jRdbPistaAmarillo1.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo1.setEnabled(false);

        jRdbPistaVerde1.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde1.setEnabled(false);

        jRdbPistaRojo1.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo1.setEnabled(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 60, 50));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul2.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul2.setEnabled(false);

        jRdbPistaAmarillo2.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo2.setEnabled(false);

        jRdbPistaVerde2.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde2.setEnabled(false);

        jRdbPistaRojo2.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo2.setEnabled(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 60, 50));

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul3.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul3.setEnabled(false);

        jRdbPistaAmarillo3.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo3.setEnabled(false);

        jRdbPistaVerde3.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde3.setEnabled(false);

        jRdbPistaRojo3.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo3.setEnabled(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jRdbPistaRojo3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaAmarillo3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaVerde3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAzul3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 60, 50));

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul4.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul4.setEnabled(false);

        jRdbPistaAmarillo4.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo4.setEnabled(false);

        jRdbPistaVerde4.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde4.setEnabled(false);

        jRdbPistaRojo4.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo4.setEnabled(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 60, 50));

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul5.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul5.setEnabled(false);

        jRdbPistaAmarillo5.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo5.setEnabled(false);

        jRdbPistaVerde5.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde5.setEnabled(false);

        jRdbPistaRojo5.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo5.setEnabled(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 60, 50));

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul6.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul6.setEnabled(false);

        jRdbPistaAmarillo6.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo6.setEnabled(false);

        jRdbPistaVerde6.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde6.setEnabled(false);

        jRdbPistaRojo6.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo6.setEnabled(false);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 60, 50));

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul7.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul7.setEnabled(false);

        jRdbPistaAmarillo7.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo7.setEnabled(false);

        jRdbPistaVerde7.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde7.setEnabled(false);

        jRdbPistaRojo7.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo7.setEnabled(false);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 60, 50));

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));

        jRdbPistaAzul8.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAzul8.setEnabled(false);

        jRdbPistaAmarillo8.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaAmarillo8.setEnabled(false);

        jRdbPistaVerde8.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaVerde8.setEnabled(false);

        jRdbPistaRojo8.setBackground(new java.awt.Color(0, 51, 153));
        jRdbPistaRojo8.setEnabled(false);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jRdbPistaAzul8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaVerde8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jRdbPistaRojo8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbPistaAmarillo8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRdbPistaAzul8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaVerde8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPistaRojo8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbPistaAmarillo8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 60, 50));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jRadioButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jRadioButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 60, 50));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jRadioButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jRadioButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 60, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarColores() {
        int random1 = (int) (Math.random() * 5);
        int random2 = (int) (Math.random() * 5);
        int random3 = (int) (Math.random() * 5);
        int random4 = (int) (Math.random() * 5);
        int random5 = (int) (Math.random() * 5);

        switch (random1) {
            case 1:
                jRadiosolucion1.setBackground(Color.RED);
                break;

            case 2:
                jRadiosolucion1.setBackground(Color.YELLOW);
                break;

            case 3:
                jRadiosolucion1.setBackground(Color.BLUE);
                break;
            
            case 4:
                jRadiosolucion1.setBackground(Color.GREEN);
                break;
            default:
                jRadiosolucion1.setBackground(Color.PINK);
                break;
        }

        switch (random2) {
            case 1:
                jRadiosolucion2.setBackground(Color.RED);
                break;

            case 2:
                jRadiosolucion2.setBackground(Color.YELLOW);
                break;

            case 3:
                jRadiosolucion2.setBackground(Color.BLUE);
                break;

            case 4:
                jRadiosolucion2.setBackground(Color.GREEN);
                break;
                
            default:
                jRadiosolucion2.setBackground(Color.PINK);
                break;
        }

        switch (random3) {
            case 1:
                jRadiosolucion3.setBackground(Color.RED);
                break;

            case 2:
                jRadiosolucion3.setBackground(Color.YELLOW);
                break;

            case 3:
                jRadiosolucion3.setBackground(Color.BLUE);
                break;
                
            case 4:
                jRadiosolucion3.setBackground(Color.GREEN);
                break;
                
            default:
                jRadiosolucion3.setBackground(Color.PINK);
                break;
        }

        switch (random1) {
            case 1:
                jRadiosolucion4.setBackground(Color.RED);
                break;

            case 2:
                jRadiosolucion4.setBackground(Color.YELLOW);
                break;

            case 3:
                jRadiosolucion4.setBackground(Color.BLUE);
                break;

            case 4:
                jRadiosolucion4.setBackground(Color.GREEN);
                break;
                
            default:
                jRadiosolucion4.setBackground(Color.PINK);
                break;
        }
    }

    private void jRadioAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAmarilloActionPerformed
        contadorAmarillo++;
        switch (contadorAmarillo) {
            case 1:
                jRadioAmarillo.setBackground(Color.BLUE);
                break;
            case 2:
                jRadioAmarillo.setBackground(Color.RED);
                break;
            case 3:
                jRadioAmarillo.setBackground(Color.YELLOW);
                break;
            case 4:
                jRadioAmarillo.setBackground(Color.GREEN);
                break;
            
            case 5:
                jRadioAmarillo.setBackground(Color.PINK);
                break;
            default:
                contadorAmarillo = 0;
                jRadioAmarillo.setBackground(Color.WHITE);
                break;
        }
        jRadioAmarillo.setSelected(false);
    }//GEN-LAST:event_jRadioAmarilloActionPerformed

    private void jRadiorojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiorojoActionPerformed
        contadorRojo++;
        switch (contadorRojo) {
            case 1:
                jRadiorojo.setBackground(Color.BLUE);
                break;
            case 2:
                jRadiorojo.setBackground(Color.RED);
                break;
            case 3:
                jRadiorojo.setBackground(Color.YELLOW);
                break;
            case 4:
                jRadiorojo.setBackground(Color.GREEN);
                break;
            case 5:
                jRadiorojo.setBackground(Color.PINK);
                break;
            default:
                contadorRojo = 0;
                jRadiorojo.setBackground(Color.WHITE);

                break;
        }

        jRadiorojo.setSelected(false);
    }//GEN-LAST:event_jRadiorojoActionPerformed

    private void jRadioVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioVerdeActionPerformed

        contadorVerde++;
        switch (contadorVerde) {
            case 1:
                jRadioVerde.setBackground(Color.BLUE);
                break;
            case 2:
                jRadioVerde.setBackground(Color.RED);
                break;
            case 3:
                jRadioVerde.setBackground(Color.YELLOW);
                break;
            case 4:
                jRadioVerde.setBackground(Color.GREEN);
                break;
                
            case 5:
                jRadioVerde.setBackground(Color.PINK);
                break;
            default:
                contadorVerde = 0;
                jRadioVerde.setBackground(Color.WHITE);
                break;
        }

        jRadioVerde.setSelected(false);
    }//GEN-LAST:event_jRadioVerdeActionPerformed

    private void jRadioAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAzulActionPerformed
        contadorAzul++;
        switch (contadorAzul) {
            case 1:
                jRadioAzul.setBackground(Color.BLUE);
                break;
            case 2:
                jRadioAzul.setBackground(Color.RED);
                break;
            case 3:
                jRadioAzul.setBackground(Color.YELLOW);
                break;
            case 4:
                jRadioAzul.setBackground(Color.GREEN);
                break;
                
            case 5:
                jRadioAzul.setBackground(Color.PINK);
                break;
            default:
                contadorAzul = 0;
                jRadioAzul.setBackground(Color.WHITE);
                break;
        }

        jRadioAzul.setSelected(false);
    }//GEN-LAST:event_jRadioAzulActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        intentos++;


        int inten = 0;
        if (jRadiosolucion1.getBackground() == jRadioAzul.getBackground()
                && jRadiosolucion2.getBackground() == jRadioVerde.getBackground()
                && jRadiosolucion3.getBackground() == jRadiorojo.getBackground()
                && jRadiosolucion4.getBackground() == jRadioAmarillo.getBackground()) {
            inten = JOptionPane.showConfirmDialog(null, "Desea jugar denuevo?", "Has ganado", YES_NO_OPTION);
            setearcolores();
            ponerPistasEnblanco();
            intentos = 0;
        }

        if (inten == 1) {
            JOptionPane.showMessageDialog(this, "Se va a cerrar la aplicacion");
            System.exit(0);
        }


        pasaracolores();
        ponerPista();
        
        int perder=0;
        if (intentos == 10) {
            perder=JOptionPane.showConfirmDialog(null, "Desea jugar de nuevo?", "Has Perdido", YES_NO_OPTION);
            ponerPistasEnblanco();
            setearcolores();
            intentos = 0;
        }
        
                if (perder == 1) {
            JOptionPane.showMessageDialog(this, "Se va a cerrar la aplicacion");
            System.exit(0);
        }

        

    }//GEN-LAST:event_jButton1ActionPerformed

    public void ponerPista() {

        switch (intentos) {
            case 1:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaAzul.setBackground(Color.WHITE);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaVerde.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaRojo.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo.setBackground(Color.white);

                    }
                }
                break;

            case 2:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaAzul1.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde1.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {
                        jRdbPistaVerde1.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo1.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaRojo1.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo1.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo1.setBackground(Color.white);

                    }
                }
                break;

            case 3:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul2.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {
                        jRdbPistaAzul2.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde2.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaVerde2.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo2.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {
                        jRdbPistaRojo2.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo2.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo2.setBackground(Color.white);

                    }
                }
                break;

            case 4:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul3.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaAzul3.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde3.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaVerde3.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo3.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaRojo3.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo3.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo3.setBackground(Color.white);

                    }
                }
                break;

            case 5:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul4.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaAzul4.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde4.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaVerde4.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo4.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaRojo4.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo4.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo4.setBackground(Color.white);

                    }
                }
                break;

            case 6:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul5.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaAzul5.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde5.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {
                        
                        jRdbPistaVerde5.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo5.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaRojo5.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo5.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo5.setBackground(Color.white);

                    }
                }
                break;

            case 7:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul6.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaAzul6.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde6.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaVerde6.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo6.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaRojo6.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo6.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo6.setBackground(Color.white);

                    }
                }
                break;

            case 8:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul7.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {
                        jRdbPistaAzul7.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde7.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {
                        jRdbPistaVerde7.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo7.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {
                        jRdbPistaRojo7.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo7.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo7.setBackground(Color.white);

                    }
                }
                break;

            case 9:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul8.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {
                        jRdbPistaAzul8.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde8.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaVerde8.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo8.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaRojo8.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo8.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaAmarillo8.setBackground(Color.white);

                    }
                }
                break;

            case 10:
                if (jRadioAzul.getBackground() == jRadiosolucion1.getBackground()) {
                    jRdbPistaAzul9.setBackground(Color.red);
                } else {
                    if (jRadioAzul.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAzul.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaAzul9.setBackground(Color.white);

                    }
                }

                if (jRadioVerde.getBackground() == jRadiosolucion2.getBackground()) {
                    jRdbPistaVerde9.setBackground(Color.red);
                } else {
                    if (jRadioVerde.getBackground() == jRadiosolucion1.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioVerde.getBackground() == jRadiosolucion4.getBackground()) {

                        jRdbPistaVerde9.setBackground(Color.white);

                    }
                }

                if (jRadiorojo.getBackground() == jRadiosolucion3.getBackground()) {
                    jRdbPistaRojo9.setBackground(Color.red);
                } else {
                    if (jRadiorojo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion1.getBackground()
                            || jRadiorojo.getBackground() == jRadiosolucion4.getBackground()) {
                        
                        jRdbPistaRojo9.setBackground(Color.white);

                    }
                }

                if (jRadioAmarillo.getBackground() == jRadiosolucion4.getBackground()) {
                    jRdbPistaAmarillo9.setBackground(Color.red);
                } else {
                    if (jRadioAmarillo.getBackground() == jRadiosolucion2.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion3.getBackground()
                            || jRadioAmarillo.getBackground() == jRadiosolucion1.getBackground()) {

                        jRdbPistaRojo9.setBackground(Color.white);

                    }
                }
                break;

            default:
                break;
        }

    }

    public void ponerPistasEnblanco(){
        
        jRdbPistaAzul.setBackground(Color.BLUE);
        jRdbPistaVerde.setBackground(Color.BLUE);
        jRdbPistaRojo.setBackground(Color.BLUE);
        jRdbPistaAmarillo.setBackground(Color.BLUE);   
                
        jRdbPistaAzul1.setBackground(Color.BLUE);
        jRdbPistaVerde1.setBackground(Color.BLUE);
        jRdbPistaRojo1.setBackground(Color.BLUE);
        jRdbPistaAmarillo1.setBackground(Color.BLUE);
                
        jRdbPistaAzul2.setBackground(Color.BLUE);
        jRdbPistaVerde2.setBackground(Color.BLUE);
        jRdbPistaRojo2.setBackground(Color.BLUE);
        jRdbPistaAmarillo2.setBackground(Color.BLUE);
                
                
        jRdbPistaAzul3.setBackground(Color.BLUE);
        jRdbPistaVerde3.setBackground(Color.BLUE);
        jRdbPistaRojo3.setBackground(Color.BLUE);
        jRdbPistaAmarillo3.setBackground(Color.BLUE);
                
                
        jRdbPistaAzul4.setBackground(Color.BLUE);
        jRdbPistaVerde4.setBackground(Color.BLUE);
        jRdbPistaRojo4.setBackground(Color.BLUE);
        jRdbPistaAmarillo4.setBackground(Color.BLUE);
                
        jRdbPistaAzul5.setBackground(Color.BLUE);
        jRdbPistaVerde5.setBackground(Color.BLUE);
        jRdbPistaRojo5.setBackground(Color.BLUE);
        jRdbPistaAmarillo5.setBackground(Color.BLUE);
                
        jRdbPistaAzul6.setBackground(Color.BLUE);
        jRdbPistaVerde6.setBackground(Color.BLUE);
        jRdbPistaRojo6.setBackground(Color.BLUE);
        jRdbPistaAmarillo6.setBackground(Color.BLUE);
                
        jRdbPistaAzul7.setBackground(Color.BLUE);
        jRdbPistaVerde7.setBackground(Color.BLUE);
        jRdbPistaRojo7.setBackground(Color.BLUE);
        jRdbPistaAmarillo7.setBackground(Color.BLUE);
                
        jRdbPistaAzul8.setBackground(Color.BLUE);
        jRdbPistaVerde8.setBackground(Color.BLUE);
        jRdbPistaRojo8.setBackground(Color.BLUE);
        jRdbPistaAmarillo8.setBackground(Color.BLUE);
                
        jRdbPistaAzul9.setBackground(Color.BLUE);
        jRdbPistaVerde9.setBackground(Color.BLUE);
        jRdbPistaRojo9.setBackground(Color.BLUE);
        jRdbPistaAmarillo9.setBackground(Color.BLUE);
        
    }
    
    public void pasaracolores() {
        switch (intentos) {
            case 1:
                jRadioAzul1.setBackground(jRadioAzul.getBackground());
                jRadioVerde1.setBackground(jRadioVerde.getBackground());
                jRadiorojo1.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo1.setBackground(jRadioAmarillo.getBackground());
                break;

            case 2:
                jRadioAzul2.setBackground(jRadioAzul.getBackground());
                jRadioVerde2.setBackground(jRadioVerde.getBackground());
                jRadiorojo2.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo2.setBackground(jRadioAmarillo.getBackground());
                break;

            case 3:
                jRadioAzul3.setBackground(jRadioAzul.getBackground());
                jRadioVerde3.setBackground(jRadioVerde.getBackground());
                jRadiorojo3.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo3.setBackground(jRadioAmarillo.getBackground());
                break;

            case 4:
                jRadioAzul4.setBackground(jRadioAzul.getBackground());
                jRadioVerde4.setBackground(jRadioVerde.getBackground());
                jRadiorojo4.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo4.setBackground(jRadioAmarillo.getBackground());
                break;

            case 5:
                jRadioAzul5.setBackground(jRadioAzul.getBackground());
                jRadioVerde5.setBackground(jRadioVerde.getBackground());
                jRadiorojo5.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo5.setBackground(jRadioAmarillo.getBackground());
                break;

            case 6:
                jRadioAzul6.setBackground(jRadioAzul.getBackground());
                jRadioVerde6.setBackground(jRadioVerde.getBackground());
                jRadiorojo6.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo6.setBackground(jRadioAmarillo.getBackground());
                break;

            case 7:
                jRadioAzul7.setBackground(jRadioAzul.getBackground());
                jRadioVerde7.setBackground(jRadioVerde.getBackground());
                jRadiorojo7.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo7.setBackground(jRadioAmarillo.getBackground());
                break;

            case 8:
                jRadioAzul8.setBackground(jRadioAzul.getBackground());
                jRadioVerde8.setBackground(jRadioVerde.getBackground());
                jRadiorojo8.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo8.setBackground(jRadioAmarillo.getBackground());
                break;

            case 9:
                jRadioAzul9.setBackground(jRadioAzul.getBackground());
                jRadioVerde9.setBackground(jRadioVerde.getBackground());
                jRadiorojo9.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo9.setBackground(jRadioAmarillo.getBackground());
                break;

            default:
                jRadioAzul10.setBackground(jRadioAzul.getBackground());
                jRadioVerde10.setBackground(jRadioVerde.getBackground());
                jRadiorojo10.setBackground(jRadiorojo.getBackground());
                jRadioAmarillo10.setBackground(jRadioAmarillo.getBackground());
                break;

        }
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        GenerarColores();
        inhabilitar();
    }//GEN-LAST:event_formWindowActivated

    private void jRadioAmarillo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAmarillo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioAmarillo10ActionPerformed

    public void setearcolores() {
        jRadioAzul.setBackground(Color.WHITE);
        jRadioVerde.setBackground(Color.WHITE);
        jRadiorojo.setBackground(Color.WHITE);
        jRadioAmarillo.setBackground(Color.WHITE);

        jRadioAzul1.setBackground(Color.WHITE);
        jRadioVerde1.setBackground(Color.WHITE);
        jRadiorojo1.setBackground(Color.WHITE);
        jRadioAmarillo1.setBackground(Color.WHITE);

        jRadioAzul2.setBackground(Color.WHITE);
        jRadioVerde2.setBackground(Color.WHITE);
        jRadiorojo2.setBackground(Color.WHITE);
        jRadioAmarillo2.setBackground(Color.WHITE);

        jRadioAzul3.setBackground(Color.WHITE);
        jRadioVerde3.setBackground(Color.WHITE);
        jRadiorojo3.setBackground(Color.WHITE);
        jRadioAmarillo3.setBackground(Color.WHITE);

        jRadioAzul4.setBackground(Color.WHITE);
        jRadioVerde4.setBackground(Color.WHITE);
        jRadiorojo4.setBackground(Color.WHITE);
        jRadioAmarillo4.setBackground(Color.WHITE);

        jRadioAzul5.setBackground(Color.WHITE);
        jRadioVerde5.setBackground(Color.WHITE);
        jRadiorojo5.setBackground(Color.WHITE);
        jRadioAmarillo5.setBackground(Color.WHITE);

        jRadioAzul6.setBackground(Color.WHITE);
        jRadioVerde6.setBackground(Color.WHITE);
        jRadiorojo6.setBackground(Color.WHITE);
        jRadioAmarillo6.setBackground(Color.WHITE);

        jRadioAzul7.setBackground(Color.WHITE);
        jRadioVerde7.setBackground(Color.WHITE);
        jRadiorojo7.setBackground(Color.WHITE);
        jRadioAmarillo7.setBackground(Color.WHITE);

        jRadioAzul8.setBackground(Color.WHITE);
        jRadioVerde8.setBackground(Color.WHITE);
        jRadiorojo8.setBackground(Color.WHITE);
        jRadioAmarillo8.setBackground(Color.WHITE);

        jRadioAzul10.setBackground(Color.WHITE);
        jRadioVerde10.setBackground(Color.WHITE);
        jRadiorojo10.setBackground(Color.WHITE);
        jRadioAmarillo10.setBackground(Color.WHITE);

        jRadioAzul9.setBackground(Color.WHITE);
        jRadioVerde9.setBackground(Color.WHITE);
        jRadiorojo9.setBackground(Color.WHITE);
        jRadioAmarillo9.setBackground(Color.WHITE);

    }

    public void inhabilitar() {
        jRadioAzul1.setEnabled(false);
        jRadioVerde1.setEnabled(false);
        jRadiorojo1.setEnabled(false);
        jRadioAmarillo1.setEnabled(false);

        jRadioAzul2.setEnabled(false);
        jRadioVerde2.setEnabled(false);
        jRadiorojo2.setEnabled(false);
        jRadioAmarillo2.setEnabled(false);

        jRadioAzul3.setEnabled(false);
        jRadioVerde3.setEnabled(false);
        jRadiorojo3.setEnabled(false);
        jRadioAmarillo3.setEnabled(false);

        jRadioAzul4.setEnabled(false);
        jRadioVerde4.setEnabled(false);
        jRadiorojo4.setEnabled(false);
        jRadioAmarillo4.setEnabled(false);

        jRadioAzul5.setEnabled(false);
        jRadioVerde5.setEnabled(false);
        jRadiorojo5.setEnabled(false);
        jRadioAmarillo5.setEnabled(false);

        jRadioAzul6.setEnabled(false);
        jRadioVerde6.setEnabled(false);
        jRadiorojo6.setEnabled(false);
        jRadioAmarillo6.setEnabled(false);

        jRadioAzul7.setEnabled(false);
        jRadioVerde7.setEnabled(false);
        jRadiorojo7.setEnabled(false);
        jRadioAmarillo7.setEnabled(false);

        jRadioAzul8.setEnabled(false);
        jRadioVerde8.setEnabled(false);
        jRadiorojo8.setEnabled(false);
        jRadioAmarillo8.setEnabled(false);

        jRadioAzul10.setEnabled(false);
        jRadioVerde10.setEnabled(false);
        jRadiorojo10.setEnabled(false);
        jRadioAmarillo10.setEnabled(false);

        jRadioAzul9.setEnabled(false);
        jRadioVerde9.setEnabled(false);
        jRadiorojo9.setEnabled(false);
        jRadioAmarillo9.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioAmarillo;
    private javax.swing.JRadioButton jRadioAmarillo1;
    private javax.swing.JRadioButton jRadioAmarillo10;
    private javax.swing.JRadioButton jRadioAmarillo2;
    private javax.swing.JRadioButton jRadioAmarillo3;
    private javax.swing.JRadioButton jRadioAmarillo4;
    private javax.swing.JRadioButton jRadioAmarillo5;
    private javax.swing.JRadioButton jRadioAmarillo6;
    private javax.swing.JRadioButton jRadioAmarillo7;
    private javax.swing.JRadioButton jRadioAmarillo8;
    private javax.swing.JRadioButton jRadioAmarillo9;
    private javax.swing.JRadioButton jRadioAzul;
    private javax.swing.JRadioButton jRadioAzul1;
    private javax.swing.JRadioButton jRadioAzul10;
    private javax.swing.JRadioButton jRadioAzul2;
    private javax.swing.JRadioButton jRadioAzul3;
    private javax.swing.JRadioButton jRadioAzul4;
    private javax.swing.JRadioButton jRadioAzul5;
    private javax.swing.JRadioButton jRadioAzul6;
    private javax.swing.JRadioButton jRadioAzul7;
    private javax.swing.JRadioButton jRadioAzul8;
    private javax.swing.JRadioButton jRadioAzul9;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioVerde;
    private javax.swing.JRadioButton jRadioVerde1;
    private javax.swing.JRadioButton jRadioVerde10;
    private javax.swing.JRadioButton jRadioVerde2;
    private javax.swing.JRadioButton jRadioVerde3;
    private javax.swing.JRadioButton jRadioVerde4;
    private javax.swing.JRadioButton jRadioVerde5;
    private javax.swing.JRadioButton jRadioVerde6;
    private javax.swing.JRadioButton jRadioVerde7;
    private javax.swing.JRadioButton jRadioVerde8;
    private javax.swing.JRadioButton jRadioVerde9;
    private javax.swing.JRadioButton jRadiorojo;
    private javax.swing.JRadioButton jRadiorojo1;
    private javax.swing.JRadioButton jRadiorojo10;
    private javax.swing.JRadioButton jRadiorojo2;
    private javax.swing.JRadioButton jRadiorojo3;
    private javax.swing.JRadioButton jRadiorojo4;
    private javax.swing.JRadioButton jRadiorojo5;
    private javax.swing.JRadioButton jRadiorojo6;
    private javax.swing.JRadioButton jRadiorojo7;
    private javax.swing.JRadioButton jRadiorojo8;
    private javax.swing.JRadioButton jRadiorojo9;
    private javax.swing.JRadioButton jRadiosolucion1;
    private javax.swing.JRadioButton jRadiosolucion2;
    private javax.swing.JRadioButton jRadiosolucion3;
    private javax.swing.JRadioButton jRadiosolucion4;
    private javax.swing.JRadioButton jRdbPistaAmarillo;
    private javax.swing.JRadioButton jRdbPistaAmarillo1;
    private javax.swing.JRadioButton jRdbPistaAmarillo2;
    private javax.swing.JRadioButton jRdbPistaAmarillo3;
    private javax.swing.JRadioButton jRdbPistaAmarillo4;
    private javax.swing.JRadioButton jRdbPistaAmarillo5;
    private javax.swing.JRadioButton jRdbPistaAmarillo6;
    private javax.swing.JRadioButton jRdbPistaAmarillo7;
    private javax.swing.JRadioButton jRdbPistaAmarillo8;
    private javax.swing.JRadioButton jRdbPistaAmarillo9;
    private javax.swing.JRadioButton jRdbPistaAzul;
    private javax.swing.JRadioButton jRdbPistaAzul1;
    private javax.swing.JRadioButton jRdbPistaAzul2;
    private javax.swing.JRadioButton jRdbPistaAzul3;
    private javax.swing.JRadioButton jRdbPistaAzul4;
    private javax.swing.JRadioButton jRdbPistaAzul5;
    private javax.swing.JRadioButton jRdbPistaAzul6;
    private javax.swing.JRadioButton jRdbPistaAzul7;
    private javax.swing.JRadioButton jRdbPistaAzul8;
    private javax.swing.JRadioButton jRdbPistaAzul9;
    private javax.swing.JRadioButton jRdbPistaRojo;
    private javax.swing.JRadioButton jRdbPistaRojo1;
    private javax.swing.JRadioButton jRdbPistaRojo2;
    private javax.swing.JRadioButton jRdbPistaRojo3;
    private javax.swing.JRadioButton jRdbPistaRojo4;
    private javax.swing.JRadioButton jRdbPistaRojo5;
    private javax.swing.JRadioButton jRdbPistaRojo6;
    private javax.swing.JRadioButton jRdbPistaRojo7;
    private javax.swing.JRadioButton jRdbPistaRojo8;
    private javax.swing.JRadioButton jRdbPistaRojo9;
    private javax.swing.JRadioButton jRdbPistaVerde;
    private javax.swing.JRadioButton jRdbPistaVerde1;
    private javax.swing.JRadioButton jRdbPistaVerde2;
    private javax.swing.JRadioButton jRdbPistaVerde3;
    private javax.swing.JRadioButton jRdbPistaVerde4;
    private javax.swing.JRadioButton jRdbPistaVerde5;
    private javax.swing.JRadioButton jRdbPistaVerde6;
    private javax.swing.JRadioButton jRdbPistaVerde7;
    private javax.swing.JRadioButton jRdbPistaVerde8;
    private javax.swing.JRadioButton jRdbPistaVerde9;
    // End of variables declaration//GEN-END:variables
}
