/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.ProjectControl;
import Logic.Project;
import Logic.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class ListProject extends javax.swing.JPanel {
    ProjectControl projectControl;
    User sessionUser;
    /**
     * Creates new form ListProject
     */
    public ListProject(User sessionUser) {
        initComponents();
        projectControl = new ProjectControl();
        this.sessionUser=sessionUser;
        loadProject();
        
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
        typeSearchCombo = new javax.swing.JComboBox<>();
        nameTextField = new javax.swing.JTextField();
        searchButtom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectTable = new javax.swing.JTable();
        backButtom = new javax.swing.JButton();
        showInfo = new javax.swing.JButton();
        showMemberProject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        registerLabel.setBackground(new java.awt.Color(153, 153, 153));
        registerLabel.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(235, 30, 0));
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ListarProyectosTitle.png"))); // NOI18N
        registerLabel.setAlignmentY(0.0F);
        registerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        typeSearchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificacion", "Nombre", "Lider", "Estado"}));
        typeSearchCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nameTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        searchButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SearchButtom.png"))); // NOI18N
        searchButtom.setBorderPainted(false);
        searchButtom.setContentAreaFilled(false);
        searchButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtomActionPerformed(evt);
            }
        });

        projectTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Identificacion", "Nombre", "Descripcion", "Lider", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        projectTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        projectTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(projectTable);

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

        showInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/VerInfoButtom.png"))); // NOI18N
        showInfo.setBorderPainted(false);
        showInfo.setContentAreaFilled(false);
        showInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInfoActionPerformed(evt);
            }
        });

        showMemberProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/verUserButtom.png"))); // NOI18N
        showMemberProject.setBorderPainted(false);
        showMemberProject.setContentAreaFilled(false);
        showMemberProject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showMemberProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMemberProjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(typeSearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(showInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showMemberProject, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(registerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeSearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showInfo)
                            .addComponent(showMemberProject, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtomActionPerformed
        // TODO add your handling code here:
        Project project;
        String inputValue;
        String typeSearch;

        if(nameTextField.getText().length()>0){

            inputValue=nameTextField.getText();
            typeSearch=(String)typeSearchCombo.getSelectedItem();
            typeSearch = traduction(typeSearch);

            project = projectControl.searchProject(inputValue, typeSearch);

            if(project.getProjectCode()!= null){

                JOptionPane.showMessageDialog(null,"Bùsqueda Exitosa");
                listSearchProject(inputValue,typeSearch);
          }
            else{
                JOptionPane.showMessageDialog(null,"No se encontrò ningun Proyecto que coincida con la bùsqueda");
            }
        }
            else{
            JOptionPane.showMessageDialog(null, "Por favor completa todos los campos");
        }
    }//GEN-LAST:event_searchButtomActionPerformed

    private void backButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtomActionPerformed
        // TODO add your handling code here:
        MenuProject menuProject = new MenuProject(sessionUser);
        menuProject.setSize(639,483);
        menuProject.setLocation(0,0);

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(menuProject);
 
    }//GEN-LAST:event_backButtomActionPerformed

    private void showInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInfoActionPerformed
        // TODO add your handling code here:

        int row = projectTable.getSelectedRow();
        if(row!=-1){
            ShowInfoProject showInfoProject = new ShowInfoProject(sessionUser);
            showInfoProject.setSize(639,494);
            showInfoProject.setLocation(0,0);

            this.removeAll();
            this.revalidate();
            this.repaint();
            this.add(showInfoProject);

            String code=projectTable.getValueAt(row, 0).toString();
            String identification=projectTable.getValueAt(row, 1).toString();
            String name=projectTable.getValueAt(row, 2).toString();
            String description=projectTable.getValueAt(row, 3).toString();
            String manager=projectTable.getValueAt(row, 4).toString();
            String state=projectTable.getValueAt(row, 5).toString();

            showInfoProject.setValues(identification, name, description, manager, state);
        }
        else{ JOptionPane.showMessageDialog(null, "Por favor Seleccione una Fila");
        }

    }//GEN-LAST:event_showInfoActionPerformed

    private void showMemberProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMemberProjectActionPerformed
        // TODO add your handling code here:
        int row = projectTable.getSelectedRow();
        if(row!=-1){

            String identification=projectTable.getValueAt(row, 1).toString();
            
            ListProjectMember listProjectMember = new ListProjectMember(sessionUser,identification);
            listProjectMember.setSize(639,494);
            listProjectMember.setLocation(0,0);

            this.removeAll();
            this.revalidate();
            this.repaint();
            this.add(listProjectMember);

            listProjectMember.loadProjectUser(identification);
        }
        else{ JOptionPane.showMessageDialog(null, "Por favor Seleccione una Fila");
        }
        
    }//GEN-LAST:event_showMemberProjectActionPerformed

    public void loadProject(){
        
    ArrayList <Object[]> projects = new ArrayList <>();
    projects = projectControl.listProject();
            
    DefaultTableModel modelo = (DefaultTableModel) projectTable.getModel();
    modelo.setRowCount(0);  

    for(int i=0; i<projects.size(); i++ ){
    modelo.addRow(projects.get(i));
    projectTable.setModel(modelo);
            }     
    }
    
    public String traduction(String word){
            
        switch (word) {
           case "Identificacion":
             word = "projectID";
             break;
             case "Nombre":
             word = "name";
             break;
             case "Lider":
             word = "namemanager";
             break;
             case "Estado":
             word = "state";
             break;
             default:
             System.out.println("error");
             break;} 
             
             return  word;
        }
    
    public void listSearchProject(String inputValue, String typeSearch){
            
        ArrayList <Object[]> projects = new ArrayList <>();
        projects = projectControl.listSearchProject(inputValue, typeSearch);
            
        DefaultTableModel modelo = (DefaultTableModel) projectTable.getModel();
        modelo.setRowCount(0);  

        for(int i=0; i<projects.size(); i++ ){
        modelo.addRow(projects.get(i));
        projectTable.setModel(modelo);
            }     
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable projectTable;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JButton searchButtom;
    private javax.swing.JButton showInfo;
    private javax.swing.JButton showMemberProject;
    private javax.swing.JComboBox<String> typeSearchCombo;
    // End of variables declaration//GEN-END:variables
}