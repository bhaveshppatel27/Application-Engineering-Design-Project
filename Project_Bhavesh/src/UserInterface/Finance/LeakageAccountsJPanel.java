/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Finance;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.Organization.AccountsOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.RepairManagerOrganization;
import Business.SystemAdmin.SystemAdmin;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RepairRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhavesh Patel
 */
public class LeakageAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LeakageAccountsJPanel
     */
    private JPanel container;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private CustomerOrganization customerOrganization;
    private RepairManagerOrganization repairManagerOrganization;
    private AccountsOrganization organization;
    
    public LeakageAccountsJPanel(JPanel container,UserAccount userAccount,Network network,EcoSystem system,CustomerOrganization customerOrganization,AccountsOrganization organization) {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.network = network;
        this.system = system;
        this.customerOrganization = customerOrganization;
        this.organization = organization;
        
//        for(Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()){
//            if(enterprise1 instanceof RepairEnterprise){
//                for(Organization organization1 : enterprise1.getOrganizationDirectory().getOrganizationList()){
//                    if(organization1 instanceof RepairManagerOrganization){
//                        repairManagerOrganization = (RepairManagerOrganization) organization1;
//                    }
//                }
//            }
//        }
        
        populateCustomers();
        customerTable.setAutoCreateRowSorter(true);
        leakageTable.setAutoCreateRowSorter(true);
    }

    
    private void populateCustomers(){
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : customerOrganization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[4];
            Customer cust = (Customer) employee;
            row[0] = cust.getId();
            row[1] = cust;
            row[2] = cust.getContactNo();
            row[3] = cust.getEmailId();
                        
            model.addRow(row);

        }
    }
    
    
    private void populateLeakageTable(Customer customer){
        
         DefaultTableModel model = (DefaultTableModel) leakageTable.getModel();
        model.setRowCount(0);
        
            for(WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()){
                RepairRequest repairRequest = (RepairRequest) workRequest;
                if(repairRequest.getCustomer().equals(customer) && repairRequest.getStatus().equalsIgnoreCase("Complete") && repairRequest.getLeakageCost() == 0){
                    
                    Object[] row = new Object[6];
           
            row[0] = repairRequest.getRepairRequestNo();
            row[1] = repairRequest;
            row[2] = repairRequest.getTimeForRepair() + " seconds";
            row[3] = repairRequest.getLeakageVolume() + " Gallons";
            row[4] = repairRequest.getLeakageCost() == 0? "Yet to calculate" : repairRequest.getLeakageCost() + "$";
            row[5] = repairRequest.getRepairCost() + "$";
            model.addRow(row);
                }
             }
    }
    private void populateLeakageCalculatedTable(Customer customer){
        
         DefaultTableModel model = (DefaultTableModel) calculatedTable.getModel();
        model.setRowCount(0);
        
            for(WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()){
                RepairRequest repairRequest = (RepairRequest) workRequest;
                if(repairRequest.getCustomer().equals(customer) && repairRequest.getLeakageCost() != 0){
                    
                    Object[] row = new Object[6];
           
            row[0] = repairRequest.getRepairRequestNo();
            row[1] = repairRequest;
            row[2] = repairRequest.getTimeForRepair() + " seconds";
            row[3] = repairRequest.getLeakageVolume() + " Gallons";
            row[4] = repairRequest.getLeakageCost() == 0? "Yet to calculate" : repairRequest.getLeakageCost() + "$";
            row[5] = repairRequest.getRepairCost() + "$";
            model.addRow(row);
                }
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
        customerTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        leakageTable = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        calculatedTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Leakage Accounts");

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Contact No.", "Email ID"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        customerTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Select a customer to see leakage in that line");

        leakageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request No.", "Request Status", "Leakage Time", "Leakage Volume", "Leakage Cost", "Repair Cost"
            }
        ));
        leakageTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leakageTableMouseClicked(evt);
            }
        });
        leakageTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leakageTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(leakageTable);

        jToggleButton1.setText("Calculate");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("*Select Request to calculate leakage cost");

        calculatedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request No.", "Request Status", "Leakage Time", "Leakage Volume", "Leakage Cost", "Repair Cost"
            }
        ));
        calculatedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculatedTableMouseClicked(evt);
            }
        });
        calculatedTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calculatedTableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(calculatedTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Leakage Cost to be calculated");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Leakage Cost Calculated Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(250, 250, 250))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jToggleButton1))
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(backJButton)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void leakageTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leakageTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_leakageTableMouseClicked

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        
        int selectedRow = customerTable.getSelectedRow();
        Customer customer = (Customer) customerTable.getValueAt(selectedRow, 1);
       
        populateLeakageTable(customer);
        populateLeakageCalculatedTable(customer);
        
    }//GEN-LAST:event_customerTableMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        int selectedRow = leakageTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a request to calculate leakage cost");
            return;
        }
        
        SystemAdmin systemAdmin = (SystemAdmin) system.getEmployeeDirectory().getEmployeeList().get(0);
        RepairRequest repairRequest = (RepairRequest) leakageTable.getValueAt(selectedRow, 1);
        if(repairRequest.getLeakageCost() != 0){
            JOptionPane.showMessageDialog(null, "Already Calculated");
            return;
        }
        repairRequest.setLeakageCost(repairRequest.getLeakageVolume()*systemAdmin.getWaterPrice().getWaterPricePerGallon());
        populateLeakageTable(repairRequest.getCustomer());
        populateLeakageCalculatedTable(repairRequest.getCustomer());
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void customerTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerTableKeyReleased
        
         int selectedRow = customerTable.getSelectedRow();
        Customer customer = (Customer) customerTable.getValueAt(selectedRow, 1);
       
        populateLeakageTable(customer);
        populateLeakageCalculatedTable(customer);
        
    }//GEN-LAST:event_customerTableKeyReleased

    private void leakageTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leakageTableKeyReleased
        int selectedRow = customerTable.getSelectedRow();
        Customer customer = (Customer) customerTable.getValueAt(selectedRow, 1);
       
        populateLeakageTable(customer);
        populateLeakageCalculatedTable(customer);
    }//GEN-LAST:event_leakageTableKeyReleased

    private void calculatedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculatedTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_calculatedTableMouseClicked

    private void calculatedTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calculatedTableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_calculatedTableKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable calculatedTable;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable leakageTable;
    // End of variables declaration//GEN-END:variables
}
