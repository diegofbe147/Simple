/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.EquipmentControl;
import Logic.User;
import static javax.management.Query.gt;
import static javax.management.Query.lt;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class RegisterEquipment extends javax.swing.JPanel {
    
    EquipmentControl equipmentControl;
    User sessionUser;
    /**
     * Creates new form RegisterEquipment2
     */
    public RegisterEquipment(User sessionUser) {
       initComponents();
       equipmentControl = new EquipmentControl();
       this.sessionUser=sessionUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerLabel = new javax.swing.JLabel();
        serieTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        serielNumber = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        registerButtom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        backButtom = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        registerLabel.setBackground(new java.awt.Color(153, 153, 153));
        registerLabel.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(235, 30, 0));
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/RegistrarEquiposTitle.png"))); // NOI18N
        registerLabel.setAlignmentY(0.0F);
        registerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        serieTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(235, 30, 0));
        nameLabel.setText("Articulo");

        serielNumber.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        serielNumber.setForeground(new java.awt.Color(235, 30, 0));
        serielNumber.setText("Numero de serie");

        descriptionLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(235, 30, 0));
        descriptionLabel.setText("Descripcion");

        nameTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        registerButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/RegistrarButtom.png"))); // NOI18N
        registerButtom.setBorderPainted(false);
        registerButtom.setContentAreaFilled(false);
        registerButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtomActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        descriptionTextArea.setRows(5);
        descriptionTextArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionTextArea);

        backButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CancelarButton.png"))); // NOI18N
        backButtom.setBorderPainted(false);
        backButtom.setContentAreaFilled(false);
        backButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(backButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(registerButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serielNumber)
                    .addComponent(nameLabel)
                    .addComponent(descriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(serieTextField)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(registerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serielNumber)
                    .addComponent(serieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerButtom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButtom, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtomActionPerformed
        // TODO add your handling code here:

        String nameEquipment;
        String serieEquipment;
        String descriptionEquipment;

        if(nameTextField.getText().length()>0 && serieTextField.getText().length()>0 && descriptionTextArea.getText().length()>0){

            nameEquipment=nameTextField.getText();
            serieEquipment=serieTextField.getText();
            descriptionEquipment=descriptionTextArea.getText();

            int numFilas = equipmentControl.insertEquipment(nameEquipment, serieEquipment, descriptionEquipment);

            System.out.println ("Filas "+ numFilas);
            if (numFilas == 1){

                JOptionPane.showMessageDialog(null, "Equipo guardado exitosamente");
                limpiar_texto();
            }
            else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Equipo");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor completa todos los campos");
        }
    }//GEN-LAST:event_registerButtomActionPerformed

    private void backButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtomActionPerformed
        // TODO add your handling code here:
        MenuEquipment menuEquipment = new MenuEquipment(sessionUser);
        menuEquipment.setSize(639,483);
        menuEquipment.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(menuEquipment);
    }//GEN-LAST:event_backButtomActionPerformed

    public void limpiar_texto(){  
        nameTextField.setText("");
        serieTextField.setText("");
        descriptionTextArea.setText("");      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtom;
    private javax.swing.JLabel descriptionLabel;
    public static javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton registerButtom;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JTextField serieTextField;
    private javax.swing.JLabel serielNumber;
    // End of variables declaration//GEN-END:variables
}
