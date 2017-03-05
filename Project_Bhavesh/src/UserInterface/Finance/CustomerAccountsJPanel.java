/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Finance;

import Business.Customer.Customer;
import Business.Customer.WaterUsage;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.SystemAdmin.SystemAdmin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhavesh Patel
 */
public class CustomerAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAccountsJPanel
     */
    private JPanel container;
    private UserAccount userAccount;
    private Network network;
    private CustomerOrganization customerOrganization;
    private EcoSystem system;
    public CustomerAccountsJPanel(JPanel container,UserAccount userAccount,Network network,EcoSystem system,CustomerOrganization customerOrganization) {
        initComponents();
        this.container = container;
        this.userAccount =userAccount;
        this.network = network;
        this.system = system;
        
        this.customerOrganization = customerOrganization;
        
        populateCustomers();
        populateAllCustomers();
        customerTable.setAutoCreateRowSorter(true);
        usageTable.setAutoCreateRowSorter(true);
    }
    
    private void populateAllCustomers(){
        
        DefaultTableModel model = (DefaultTableModel) customerTable1.getModel();
        model.setRowCount(0);
        
        for (Employee employee : customerOrganization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[6];
            Customer cust = (Customer) employee;
            
            row[0] = cust.getId();
            row[1] = cust;
            row[2] = cust.getContactNo();
            row[3] = cust.getEmailId();
            row[4] = cust.getBillingDate() == null? "Not yet available" : cust.getBillingDate();
            row[5] = cust.getTotalBill() + "$";
            model.addRow(row);
        } 
    }
        
    
    private void populateCustomers(){
 
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : customerOrganization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[6];
            Customer cust = (Customer) employee;
            int a = cust.getWaterUsageHistory().size();
            if(a > 0){
                if(cust.getBillingDate()!=null){
            if(cust.getWaterUsageHistory().get(a-1).getDate().compareTo(cust.getBillingDate()) > 0){
            row[0] = cust.getId();
            row[1] = cust;
            row[2] = cust.getContactNo();
            row[3] = cust.getEmailId();
            row[4] = cust.getBillingDate() == null? "Not yet available" : cust.getBillingDate();
            row[5] = cust.getTotalBill() + "$";
            model.addRow(row);
        }
                }else{
                    row[0] = cust.getId();
                    row[1] = cust;
                    row[2] = cust.getContactNo();
                    row[3] = cust.getEmailId();
                    row[4] = cust.getBillingDate() == null? "Not yet available" : cust.getBillingDate();
                    row[5] = cust.getTotalBill() + "$";
                    model.addRow(row);
                }
            }
        }
    }

    private void populateUsageTable(Customer customer){
        DefaultTableModel model = (DefaultTableModel) usageTable.getModel();
        model.setRowCount(0);
        if(customer.getWaterUsageHistory().size() == 0){
            note.setText("*Note: No Water Usage Yet for this customer");
            return;
        }
        for(WaterUsage waterUsage : customer.getWaterUsageHistory()){
            
            Object[] row = new Object[3];
           
            row[0] = waterUsage.getDate();
            row[1] = waterUsage.getTimeOfUsage() + " seconds";
            row[2] = waterUsage.getUsageVolume() + " Gallons";
            
            model.addRow(row);
  
        }
        note.setText("");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        usageTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        note = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Accounts");

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Contact", "Email ID", "Billing Date", "Total Bill"
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

        usageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Usage Time", "Usage Volume"
            }
        ));
        jScrollPane2.setViewportView(usageTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customers whose billing not yet updated");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Usage Details");

        jButton1.setText("Calculate Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("*Select a customer and calculate current Total Bill");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        note.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        customerTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Contact", "Email ID", "Billing Date", "Total Bill"
            }
        ));
        customerTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTable1MouseClicked(evt);
            }
        });
        customerTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerTable1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(customerTable1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("List of all customers along with their billing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)
                            .addComponent(jLabel4)
                            .addComponent(backJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel1)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked

    }//GEN-LAST:event_customerTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int selectedRow = customerTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a customer first");
            return;
        }
        Customer customer = (Customer) customerTable.getValueAt(selectedRow, 1);
        SystemAdmin systemAdmin = (SystemAdmin) system.getEmployeeDirectory().getEmployeeList().get(0);
        double totalBill = 0;
        totalBill = customer.getTotalUsageVolume()*systemAdmin.getWaterPrice().getWaterPricePerGallon();
        customer.setBillingDate((new Date()));
        customer.setTotalBill(totalBill);
        populateCustomers();
        populateAllCustomers();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void customerTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerTableKeyReleased

    }//GEN-LAST:event_customerTableKeyReleased

    private void customerTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTable1MouseClicked
        
        int selectedRow = customerTable1.getSelectedRow();
        Customer customer = (Customer) customerTable1.getValueAt(selectedRow, 1);
        
        populateUsageTable(customer);
        
    }//GEN-LAST:event_customerTable1MouseClicked

    private void customerTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerTable1KeyReleased
        
        int selectedRow = customerTable1.getSelectedRow();
        Customer customer = (Customer) customerTable1.getValueAt(selectedRow, 1);
        
        populateUsageTable(customer); 
        
    }//GEN-LAST:event_customerTable1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable customerTable;
    private javax.swing.JTable customerTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel note;
    private javax.swing.JTable usageTable;
    // End of variables declaration//GEN-END:variables
}
