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
public class MenuLoan extends javax.swing.JPanel {
    User sessionUser;
    /**
     * Creates new form MenuLoan
     */
    public MenuLoan(User sessionUser) {
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

        myTicketButtom = new javax.swing.JButton();
        myLoanButtom = new javax.swing.JButton();
        loanButtom = new javax.swing.JButton();
        TicketButtom = new javax.swing.JButton();
        myReservationButtom = new javax.swing.JButton();
        ReservationButtom = new javax.swing.JButton();
        myLoanLabel = new javax.swing.JLabel();
        loanLabel = new javax.swing.JLabel();
        myTicketLabel = new javax.swing.JLabel();
        reserveLabel = new javax.swing.JLabel();
        myReserveLabel = new javax.swing.JLabel();
        ticketLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        myTicketButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MisMultasButtom.png"))); // NOI18N
        myTicketButtom.setBorderPainted(false);
        myTicketButtom.setContentAreaFilled(false);
        myTicketButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myTicketButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myTicketButtomActionPerformed(evt);
            }
        });

        myLoanButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MisPrestamsButtom.png"))); // NOI18N
        myLoanButtom.setBorderPainted(false);
        myLoanButtom.setContentAreaFilled(false);
        myLoanButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myLoanButtom.setPreferredSize(new java.awt.Dimension(163, 120));
        myLoanButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myLoanButtomActionPerformed(evt);
            }
        });

        loanButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PrestamosButtom.png"))); // NOI18N
        loanButtom.setBorderPainted(false);
        loanButtom.setContentAreaFilled(false);
        loanButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanButtomActionPerformed(evt);
            }
        });

        TicketButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MultasButtom.png"))); // NOI18N
        TicketButtom.setBorderPainted(false);
        TicketButtom.setContentAreaFilled(false);
        TicketButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TicketButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketButtomActionPerformed(evt);
            }
        });

        myReservationButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MisReservasButtom.png"))); // NOI18N
        myReservationButtom.setBorderPainted(false);
        myReservationButtom.setContentAreaFilled(false);
        myReservationButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myReservationButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myReservationButtomActionPerformed(evt);
            }
        });

        ReservationButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ReservasButtom.png"))); // NOI18N
        ReservationButtom.setBorderPainted(false);
        ReservationButtom.setContentAreaFilled(false);
        ReservationButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReservationButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationButtomActionPerformed(evt);
            }
        });

        myLoanLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        myLoanLabel.setForeground(new java.awt.Color(235, 30, 0));
        myLoanLabel.setText("Mis Prestamos");

        loanLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        loanLabel.setForeground(new java.awt.Color(235, 30, 0));
        loanLabel.setText("Prestamos");

        myTicketLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        myTicketLabel.setForeground(new java.awt.Color(235, 30, 0));
        myTicketLabel.setText("Mis Multas");

        reserveLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        reserveLabel.setForeground(new java.awt.Color(235, 30, 0));
        reserveLabel.setText("Reservas");

        myReserveLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        myReserveLabel.setForeground(new java.awt.Color(235, 30, 0));
        myReserveLabel.setText("Mis Reservas");

        ticketLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ticketLabel.setForeground(new java.awt.Color(235, 30, 0));
        ticketLabel.setText("Multas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(myLoanLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(myLoanButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(loanLabel))
                            .addComponent(loanButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myTicketButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myTicketLabel)
                            .addComponent(TicketButtom)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(ticketLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(myReservationButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ReservationButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(myReserveLabel))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reserveLabel)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myReservationButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(myTicketButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(myLoanButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myTicketLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(myLoanLabel)
                        .addComponent(myReserveLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loanButtom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loanLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ReservationButtom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reserveLabel)
                                .addGap(76, 76, 76))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(TicketButtom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ticketLabel)
                        .addContainerGap(77, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

        public void displayMenu(String userCharge){
        switch (userCharge) {
        case "Administrador":
        myLoanButtom.setVisible(true);
        myTicketButtom.setVisible(true);
        myReservationButtom.setVisible(true);
        loanButtom.setVisible(true);
        TicketButtom.setVisible(true);
        ReservationButtom.setVisible(true);
        break;
        case "Miembro":
        myLoanButtom.setVisible(true);
        myTicketButtom.setVisible(true);
        myReservationButtom.setVisible(true);
        loanButtom.setVisible(false);
        loanLabel.setVisible(false);
        TicketButtom.setVisible(false);
        ticketLabel.setVisible(false);
        ReservationButtom.setVisible(false);  
        reserveLabel.setVisible(false);
        
        break;
        case "Coordinador de Equipos":
        myLoanButtom.setVisible(true);
        myTicketButtom.setVisible(true);
        myReservationButtom.setVisible(true);
        loanButtom.setVisible(true);
        TicketButtom.setVisible(true);
        ReservationButtom.setVisible(true);
        break;
        case "Lider de Proyecto":
        myLoanButtom.setVisible(true);
        myTicketButtom.setVisible(true);
        myReservationButtom.setVisible(true);
        loanButtom.setVisible(false);
        loanLabel.setVisible(false);
        TicketButtom.setVisible(false);
        ticketLabel.setVisible(false);
        ReservationButtom.setVisible(false);  
        reserveLabel.setVisible(false);
        break;
        case "Director de Laboratorio":
        myLoanButtom.setVisible(true);
        myTicketButtom.setVisible(true);
        myReservationButtom.setVisible(true);
        loanButtom.setVisible(true);
        TicketButtom.setVisible(true);
        ReservationButtom.setVisible(true);
        break;
        default:
        System.out.println("error" );
        break;}      
}
    
    private void myLoanButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myLoanButtomActionPerformed
        // TODO add your handling code here:
        ListProfileLoan listLoan = new ListProfileLoan(sessionUser);
        listLoan.setSize(639,483);
        listLoan.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listLoan);
    }//GEN-LAST:event_myLoanButtomActionPerformed

    private void myTicketButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTicketButtomActionPerformed
        // TODO add your handling code here:
        ListProfileTicket listLoan = new ListProfileTicket(sessionUser);
        listLoan.setSize(639,483);
        listLoan.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listLoan);
    }//GEN-LAST:event_myTicketButtomActionPerformed

    private void loanButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanButtomActionPerformed
        // TODO add your handling code here:
        ListLoan listAllLoan = new ListLoan(sessionUser);
        listAllLoan.setSize(639,483);
        listAllLoan.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listAllLoan);
    }//GEN-LAST:event_loanButtomActionPerformed

    private void TicketButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketButtomActionPerformed
        // TODO add your handling code here:
        ListTicket listAllTicket = new ListTicket(sessionUser);
        listAllTicket.setSize(639,483);
        listAllTicket.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listAllTicket);
    }//GEN-LAST:event_TicketButtomActionPerformed

    private void myReservationButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myReservationButtomActionPerformed
        // TODO add your handling code here:
        ListProfileReservation listReservation = new ListProfileReservation(sessionUser);
        listReservation.setSize(639,483);
        listReservation.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listReservation);
    }//GEN-LAST:event_myReservationButtomActionPerformed

    private void ReservationButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationButtomActionPerformed
        // TODO add your handling code here:
        ListReservation listAllReservation = new ListReservation(sessionUser);
        listAllReservation.setSize(639,483);
        listAllReservation.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(listAllReservation);
    }//GEN-LAST:event_ReservationButtomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReservationButtom;
    private javax.swing.JButton TicketButtom;
    private javax.swing.JButton loanButtom;
    private javax.swing.JLabel loanLabel;
    private javax.swing.JButton myLoanButtom;
    private javax.swing.JLabel myLoanLabel;
    private javax.swing.JButton myReservationButtom;
    private javax.swing.JLabel myReserveLabel;
    private javax.swing.JButton myTicketButtom;
    private javax.swing.JLabel myTicketLabel;
    private javax.swing.JLabel reserveLabel;
    private javax.swing.JLabel ticketLabel;
    // End of variables declaration//GEN-END:variables
}
