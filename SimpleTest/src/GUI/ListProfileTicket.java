/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.TicketControl;
import Logic.Ticket;
import Logic.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class ListProfileTicket extends javax.swing.JPanel {
        TicketControl ticketControl;
        User sessionUser;
    /**
     * Creates new form ListTicket
     */
    public ListProfileTicket(User sessionUser) {
        initComponents();
        ticketControl = new TicketControl();
        this.sessionUser=sessionUser;
        loadProfileTickets();
    }

    public void loadProfileTickets(){
        
        ArrayList <Object[]> myTickets = new ArrayList <>();
        myTickets = ticketControl.listProfileTickets(sessionUser.getIdentification());

        DefaultTableModel modelo = (DefaultTableModel) ticketTable.getModel();
        modelo.setRowCount(0);  

        for(int i=0; i<myTickets.size(); i++ ){
            modelo.addRow(myTickets.get(i));
            ticketTable.setModel(modelo);
        }     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketTable = new javax.swing.JTable();
        showInfoProfileTicket = new javax.swing.JButton();
        searchButtom = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        typeSearchCombo = new javax.swing.JComboBox<>();
        backButtom = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MisMultasTitle.png"))); // NOI18N

        ticketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Articulo", "Estado", "Tipo de Multa", "Costo", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ticketTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        ticketTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ticketTable);

        showInfoProfileTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/VerInfoButtom.png"))); // NOI18N
        showInfoProfileTicket.setBorderPainted(false);
        showInfoProfileTicket.setContentAreaFilled(false);
        showInfoProfileTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showInfoProfileTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInfoProfileTicketActionPerformed(evt);
            }
        });

        searchButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SearchButtom.png"))); // NOI18N
        searchButtom.setBorderPainted(false);
        searchButtom.setContentAreaFilled(false);
        searchButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtomActionPerformed(evt);
            }
        });

        nameTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        typeSearchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Articulo", "Estado", "Tipo Multa"}));
        typeSearchCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(typeSearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showInfoProfileTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButtom)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeSearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(showInfoProfileTicket)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtomActionPerformed
        // TODO add your handling code here:
        MenuLoan menuLoan = new MenuLoan(sessionUser);
        menuLoan.setSize(639,483);
        menuLoan.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(menuLoan);
    }//GEN-LAST:event_backButtomActionPerformed

    private void searchButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtomActionPerformed
        // TODO add your handling code here:
        Ticket ticket;
        String inputValue;
        String typeSearch;

        if(nameTextField.getText().length()>0){

            inputValue=nameTextField.getText();
            typeSearch=(String)typeSearchCombo.getSelectedItem();
            typeSearch = traduction(typeSearch);

            ticket = ticketControl.searchProfileTicket(inputValue, typeSearch, sessionUser.getIdentification());
            if(ticket.getCode()!= null){
                JOptionPane.showMessageDialog(null,"Bùsqueda Exitosa");
                listSearchProfileTicket(inputValue,typeSearch,sessionUser.getIdentification());
            }
            else{
                JOptionPane.showMessageDialog(null,"No se encontrò ninguna Multa que coincida con la bùsqueda");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor completa todos los campos");
        }
        
    }//GEN-LAST:event_searchButtomActionPerformed

    private void showInfoProfileTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInfoProfileTicketActionPerformed
        // TODO add your handling code here:
        
        int row = ticketTable.getSelectedRow();
        if(row!=-1){
        ShowInfoProfileTicket  showInfoProfileTicket= new ShowInfoProfileTicket(sessionUser);
        showInfoProfileTicket.setSize(639,494);
        showInfoProfileTicket.setLocation(0,0);
        
        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(showInfoProfileTicket);
        
        String firstName=ticketTable.getValueAt(row, 1).toString();
        String lastName=ticketTable.getValueAt(row, 2).toString();
        
        
        String code=ticketTable.getValueAt(row, 0).toString();
        String nameUser=firstName+" "+lastName;
        String nameEquipment=ticketTable.getValueAt(row, 3).toString();
        
        showInfoProfileTicket.setValues(code, nameUser, nameEquipment);
        }
        else{ JOptionPane.showMessageDialog(null, "Por favor Seleccione una Fila");
       }
        
    }//GEN-LAST:event_showInfoProfileTicketActionPerformed

    public String traduction(String word){
            
        switch (word) {
            case "Codigo":
             word = "code";
             break;
             case "Articulo":
             word = "name";
             break;
             case "Estado":
             word = "state";
             break;
             case "Tipo Multa":
             word = "tipoMulta";
             break;
             default:
             System.out.println("error");
             break;} 
             
             return  word;
        }
    
    public void listSearchProfileTicket(String inputValue, String typeSearch, String userIdentification){
            
        ArrayList <Object[]> tickets = new ArrayList <>();
        tickets = ticketControl.listSearchProfileTicket(inputValue, typeSearch, userIdentification);

        DefaultTableModel modelo = (DefaultTableModel) ticketTable.getModel();
        modelo.setRowCount(0);  

        for(int i=0; i<tickets.size(); i++ ){
        modelo.addRow(tickets.get(i));
        ticketTable.setModel(modelo);
            }     
        }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton searchButtom;
    private javax.swing.JButton showInfoProfileTicket;
    private javax.swing.JTable ticketTable;
    private javax.swing.JComboBox<String> typeSearchCombo;
    // End of variables declaration//GEN-END:variables
}
