/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.User;

/**
 *
 * @author Diego
 */
public class MenuProject extends javax.swing.JPanel {
    User sessionUser;
    /**
     * Creates new form MenuProject
     */
    public MenuProject(User sessionUser) {
        initComponents();
        this.sessionUser=sessionUser;
        displayMenu(sessionUser.getCharge());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listProjectButtom = new javax.swing.JButton();
        registerProjectButtom = new javax.swing.JButton();
        editProjectButtom = new javax.swing.JButton();
        editLabel = new javax.swing.JLabel();
        listLabel = new javax.swing.JLabel();
        registerLabel = new javax.swing.JLabel();
        myProjectButtom = new javax.swing.JButton();
        myProjectLabel = new javax.swing.JLabel();
        linkUserButtom = new javax.swing.JButton();
        linkUserLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        listProjectButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ListarProyectos.png"))); // NOI18N
        listProjectButtom.setBorderPainted(false);
        listProjectButtom.setContentAreaFilled(false);
        listProjectButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listProjectButtom.setPreferredSize(new java.awt.Dimension(130, 130));
        listProjectButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProjectButtomActionPerformed(evt);
            }
        });

        registerProjectButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/RegistrarProyecto.png"))); // NOI18N
        registerProjectButtom.setBorderPainted(false);
        registerProjectButtom.setContentAreaFilled(false);
        registerProjectButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerProjectButtom.setPreferredSize(new java.awt.Dimension(130, 130));
        registerProjectButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerProjectButtomActionPerformed(evt);
            }
        });

        editProjectButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/EditarProyectos.png"))); // NOI18N
        editProjectButtom.setBorderPainted(false);
        editProjectButtom.setContentAreaFilled(false);
        editProjectButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProjectButtom.setPreferredSize(new java.awt.Dimension(130, 130));
        editProjectButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProjectButtomActionPerformed(evt);
            }
        });

        editLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        editLabel.setForeground(new java.awt.Color(235, 30, 0));
        editLabel.setText("Editar Proyectos");

        listLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        listLabel.setForeground(new java.awt.Color(235, 30, 0));
        listLabel.setText("Listar Proyectos");

        registerLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(235, 30, 0));
        registerLabel.setText("Registrar Proyectos");

        myProjectButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Mis proyectosButtom.png"))); // NOI18N
        myProjectButtom.setBorderPainted(false);
        myProjectButtom.setContentAreaFilled(false);
        myProjectButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myProjectButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProjectButtomActionPerformed(evt);
            }
        });

        myProjectLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        myProjectLabel.setForeground(new java.awt.Color(235, 30, 0));
        myProjectLabel.setText("Mis Proyectos");

        linkUserButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AsociarUser.png"))); // NOI18N
        linkUserButtom.setBorderPainted(false);
        linkUserButtom.setContentAreaFilled(false);
        linkUserButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkUserButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkUserButtomActionPerformed(evt);
            }
        });

        linkUserLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        linkUserLabel.setForeground(new java.awt.Color(235, 30, 0));
        linkUserLabel.setText("Vincular Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(myProjectButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(myProjectLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(linkUserLabel)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(linkUserButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(registerProjectButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listLabel)
                    .addComponent(listProjectButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editProjectButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(editLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linkUserButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myProjectButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myProjectLabel)
                    .addComponent(linkUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listProjectButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerProjectButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listLabel)
                            .addComponent(registerLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editProjectButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

        public void displayMenu(String userCharge){
        switch (userCharge) {
        case "Administrador":
        listProjectButtom.setVisible(true);
        editProjectButtom.setVisible(true);
        registerProjectButtom.setVisible(true);
        myProjectButtom.setVisible(true);
        linkUserButtom.setVisible(true);
        break;
        case "Miembro":
        listProjectButtom.setVisible(true);
        editProjectButtom.setVisible(false);
        editLabel.setVisible(false);
        registerProjectButtom.setVisible(false);
        registerLabel.setVisible(false);
        myProjectButtom.setVisible(true);
        linkUserButtom.setVisible(false);  
        linkUserLabel.setVisible(false);
        break;
        case "Coordinador de Equipos":
        listProjectButtom.setVisible(true);
        editProjectButtom.setVisible(false);
        editLabel.setVisible(false);
        registerProjectButtom.setVisible(false);
        registerLabel.setVisible(false);
        myProjectButtom.setVisible(true);
        linkUserButtom.setVisible(false);
        linkUserLabel.setVisible(false);
        break;
        case "Lider de Proyecto":
        listProjectButtom.setVisible(true);
        editProjectButtom.setVisible(true);
        registerProjectButtom.setVisible(true);
        myProjectButtom.setVisible(true);
        linkUserButtom.setVisible(true);
        break;
        case "Director de Laboratorio":
        listProjectButtom.setVisible(true);
        editProjectButtom.setVisible(true);
        registerProjectButtom.setVisible(true);
        myProjectButtom.setVisible(true);
        linkUserButtom.setVisible(true);
        break;
        default:
        System.out.println("error" );
        break;}      
}
    
    private void listProjectButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProjectButtomActionPerformed
        // TODO add your handling code here:

        ListProject listProject = new ListProject(sessionUser);
        listProject.setSize(639,483);
        listProject.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listProject);
    }//GEN-LAST:event_listProjectButtomActionPerformed

    private void registerProjectButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerProjectButtomActionPerformed
        // TODO add your handling code here:
        RegisterProject registerProject = new RegisterProject(sessionUser);
        registerProject.setSize(639,483);
        registerProject.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(registerProject);
        
    }//GEN-LAST:event_registerProjectButtomActionPerformed

    private void editProjectButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProjectButtomActionPerformed
        // TODO add your handling code here:
        EditProject editProject = new EditProject(sessionUser);
        editProject.setSize(639,483);
        editProject.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(editProject);
    }//GEN-LAST:event_editProjectButtomActionPerformed

    private void myProjectButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProjectButtomActionPerformed
        // TODO add your handling code here:
        ListProfileProject listProjectProfile = new ListProfileProject(sessionUser);
        listProjectProfile.setSize(639,483);
        listProjectProfile.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listProjectProfile);
    }//GEN-LAST:event_myProjectButtomActionPerformed

    private void linkUserButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkUserButtomActionPerformed
        // TODO add your handling code here:
        LinkUser linkUser = new LinkUser(sessionUser);
        linkUser.setSize(639,483);
        linkUser.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(linkUser);
        
    }//GEN-LAST:event_linkUserButtomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel editLabel;
    private javax.swing.JButton editProjectButtom;
    private javax.swing.JButton linkUserButtom;
    private javax.swing.JLabel linkUserLabel;
    private javax.swing.JLabel listLabel;
    private javax.swing.JButton listProjectButtom;
    private javax.swing.JButton myProjectButtom;
    private javax.swing.JLabel myProjectLabel;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JButton registerProjectButtom;
    // End of variables declaration//GEN-END:variables
}