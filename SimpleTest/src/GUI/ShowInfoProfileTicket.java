/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.TicketControl;
import Logic.Ticket;
import Logic.User;
import java.text.Format;
import java.text.SimpleDateFormat;

/**
 *
 * @author Diego
 */
public class ShowInfoProfileTicket extends javax.swing.JPanel {
    User sessionUser;
    TicketControl ticketControl;
    /**
     * Creates new form ShowInfoProfileTicket
     */
    public ShowInfoProfileTicket(User sessionUser) {
        initComponents();
        this.sessionUser=sessionUser;
        ticketControl = new TicketControl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codeTitle = new javax.swing.JLabel();
        userNameText = new javax.swing.JLabel();
        stateText = new javax.swing.JLabel();
        codeTitle7 = new javax.swing.JLabel();
        codeText = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        codeTitle6 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        userIDText = new javax.swing.JLabel();
        costoText = new javax.swing.JLabel();
        codeTitle3 = new javax.swing.JLabel();
        backButtom = new javax.swing.JButton();
        equipmentNameText = new javax.swing.JLabel();
        codeTitle4 = new javax.swing.JLabel();
        equipmentIDText = new javax.swing.JLabel();
        codeTitle5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        codeTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        codeTitle.setForeground(new java.awt.Color(235, 30, 0));
        codeTitle.setText("Codigo Multa:");

        userNameText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        stateText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        codeTitle7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        codeTitle7.setForeground(new java.awt.Color(235, 30, 0));
        codeTitle7.setText("Fecha de Creación:");

        codeText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        userIDLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(235, 30, 0));
        userIDLabel.setText("Usuario ID:");

        codeTitle6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        codeTitle6.setForeground(new java.awt.Color(235, 30, 0));
        codeTitle6.setText("Costo:");

        dateText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(235, 30, 0));
        nameLabel.setText("Nombre Usuario:");

        userIDText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        costoText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        codeTitle3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        codeTitle3.setForeground(new java.awt.Color(235, 30, 0));
        codeTitle3.setText("Articulo:");

        backButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/VolverButtom.png"))); // NOI18N
        backButtom.setBorderPainted(false);
        backButtom.setContentAreaFilled(false);
        backButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButtom.setPreferredSize(new java.awt.Dimension(45, 45));
        backButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtomActionPerformed(evt);
            }
        });

        equipmentNameText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        codeTitle4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        codeTitle4.setForeground(new java.awt.Color(235, 30, 0));
        codeTitle4.setText("Numero Serie:");

        equipmentIDText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        codeTitle5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        codeTitle5.setForeground(new java.awt.Color(235, 30, 0));
        codeTitle5.setText("Estado:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/InfoMultasTitle.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codeTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codeTitle3)
                            .addComponent(userIDLabel)
                            .addComponent(nameLabel)
                            .addComponent(codeTitle7)
                            .addComponent(codeTitle6)
                            .addComponent(codeTitle5)
                            .addComponent(codeTitle4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipmentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costoText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equipmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTitle3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equipmentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTitle4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTitle5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(costoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTitle6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTitle7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(backButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtomActionPerformed
        // TODO add your handling code here:
        ListProfileTicket listProfileTicket = new ListProfileTicket(sessionUser);
        listProfileTicket.setSize(639,483);
        listProfileTicket.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listProfileTicket);
    }//GEN-LAST:event_backButtomActionPerformed

        public void setValues(String code, String nameUser, String nameEquipment){
        Ticket ticket = new Ticket();
        
        String date;
        
        ticket = ticketControl.getInfoTicket(code);
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        
        date = formatter.format(ticket.getTicketDate());

        String costoMulta=Integer.toString(ticket.getCostoMulta());
        
        codeText.setText(ticket.getCode());
        userNameText.setText(nameUser);
        userIDText.setText(ticket.getUserCode());
        equipmentNameText.setText(nameEquipment);
        equipmentIDText.setText(ticket.getSerialNumber());
        stateText.setText(ticket.getState());
        costoText.setText(costoMulta);
        dateText.setText(date);
        
        userNameText.setVisible(false);
        userIDText.setVisible(false);
        nameLabel.setVisible(false);
        userIDLabel.setVisible(false);
        
                
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtom;
    private javax.swing.JLabel codeText;
    private javax.swing.JLabel codeTitle;
    private javax.swing.JLabel codeTitle3;
    private javax.swing.JLabel codeTitle4;
    private javax.swing.JLabel codeTitle5;
    private javax.swing.JLabel codeTitle6;
    private javax.swing.JLabel codeTitle7;
    private javax.swing.JLabel costoText;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel equipmentIDText;
    private javax.swing.JLabel equipmentNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel stateText;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JLabel userIDText;
    private javax.swing.JLabel userNameText;
    // End of variables declaration//GEN-END:variables
}