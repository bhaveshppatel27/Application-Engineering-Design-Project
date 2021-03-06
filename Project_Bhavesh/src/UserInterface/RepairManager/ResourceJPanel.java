/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RepairManager;

import Business.EmailSender;
import Business.Employee.Employee;
import Business.RepairStaff.RepairStaff;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RepairStaffOrganization;
import Business.SMSSender;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RepairRequest;
import Business.WorkQueue.WorkRequest;
import com.textmagic.sms.TextMagicMessageService;
import com.textmagic.sms.dto.ReceivedMessage;
import com.textmagic.sms.exception.ServiceBackendException;
import com.textmagic.sms.exception.ServiceTechnicalException;
import java.awt.CardLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author Bhavesh Patel
 */
public class ResourceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResourceJPanel
     */
    private Enterprise enterprise;
    private JPanel container;
    private UserAccount userAccount;
    private Organization organization;
    private RepairRequest request;
    public ResourceJPanel(JPanel container,UserAccount userAccount,Enterprise enterprise,WorkRequest workRequest) throws ServiceBackendException, ServiceTechnicalException {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.request = (RepairRequest) workRequest;
        call.setEnabled(false);
        
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof RepairStaffOrganization){
                this.organization = organization;
                break;
            }
        }
        
        populateAllStaff();
        populateReceived();
        tableall.setAutoCreateRowSorter(true);
        availStaffTable.setAutoCreateRowSorter(true);
        receivedTable.setAutoCreateRowSorter(true);
    }
    
    private void populateReceived() throws ServiceBackendException, ServiceTechnicalException{
        BasicConfigurator.configure();
        TextMagicMessageService service = 
             new TextMagicMessageService ("bhaveshpatel2","Dollar!2727");
        List<ReceivedMessage> messages = service.receive();
        
        DefaultTableModel model = (DefaultTableModel) receivedTable.getModel();
        model.setRowCount(0);
        
        for(ReceivedMessage receivedMessage : messages){
            Object[] row = new Object[3];
            row[0] = receivedMessage.getText();
            row[1] = receivedMessage.getSenderPhone();
            row[2] = receivedMessage.getReceivedDate();
            
            model.addRow(row);
        }
        
        
    }
    
    private void populateAllStaff(){
        
        DefaultTableModel model = (DefaultTableModel) tableall.getModel();
        model.setRowCount(0);
        for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            RepairStaff repairStaff = (RepairStaff) employee;
            Object[] row = new Object[4];
            row[0] = repairStaff.getId();
            row[1] = repairStaff;
            row[2] = repairStaff.getEfficiency();
            row[3] = repairStaff.getAvailability();
            
            model.addRow(row);
        
          
        }
        
    }
    
    private void populateAvailableStaff(){
        
        DefaultTableModel model = (DefaultTableModel) availStaffTable.getModel();
        model.setRowCount(0);
        for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            RepairStaff repairStaff = (RepairStaff) employee;
            if(repairStaff.getAvailability().equalsIgnoreCase("YES")){
            Object[] row = new Object[3];
            row[0] = repairStaff.getId();
            row[1] = repairStaff;
            row[2] = repairStaff.getEfficiency();
            
            
            model.addRow(row);
        
            }
        }
        if(availStaffTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No Resource available today");
            call.setEnabled(true);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableall = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        availStaffTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        call = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        receivedTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tableall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Staff ID", "Staff Name", "Contact No.", "Available Today"
            }
        ));
        jScrollPane1.setViewportView(tableall);

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("List of Repair Staffs");

        jButton1.setText("Show Available Resources");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        availStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Staff ID", "Staff Name", "Contact No."
            }
        ));
        jScrollPane2.setViewportView(availStaffTable);
        if (availStaffTable.getColumnModel().getColumnCount() > 0) {
            availStaffTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton3.setText("Assign");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        call.setText("Email For Emergency");
        call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("List of Available Staffs Today");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Resource Assignment");

        receivedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Sender No.", "Time of message"
            }
        ));
        jScrollPane3.setViewportView(receivedTable);

        jLabel5.setText("(send sms and email)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Received messages via Sms");

        jButton4.setText("Refresh Received messages");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(call)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton4))))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(call)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel5))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addContainerGap(71, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
        int index = container.getComponentCount() - 1;
        ManageRequestsJPanel panel = (ManageRequestsJPanel) container.getComponent(index);
        panel.populateRequestTable();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        populateAvailableStaff();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int selectedRow = availStaffTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a staff first");
                return;
            }
            
            
            
            RepairStaff repairStaff = (RepairStaff) availStaffTable.getValueAt(selectedRow, 1);
            String s = JOptionPane.showInputDialog(null, "Enter password for Email:" + userAccount.getEmployee().getEmailId());
            SMSSender.send("1".concat(String.valueOf(repairStaff.getContactNo())), "You have a New Repair Request assigned.Start Immediately");
            EmailSender.sendEmail(userAccount.getEmployee().getEmailId(),s, repairStaff.getEmailId(),userAccount.getEmployee().getName(),repairStaff.getName(),"You have a new Repair Request");
            
            UserAccount ua = repairStaff.getUserAccount();
            request.setReceiver(repairStaff);
            request.setStatus("Assigned");
            ua.getWorkQueue().getWorkRequestList().add(request);
            
            JOptionPane.showMessageDialog(null, "Request Assigned");
            
            container.remove(this);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.previous(container);
        
            int index = container.getComponentCount() - 1;
            ManageRequestsJPanel panel = (ManageRequestsJPanel) container.getComponent(index);
            panel.populateRequestTable();
            
            
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callActionPerformed
        
        int selectedRow = tableall.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a staff to call for Emergency");
                return;
            }
        
            RepairStaff repairStaff = (RepairStaff) tableall.getValueAt(selectedRow, 1);
            String s = JOptionPane.showInputDialog(null, "Enter password for Email:" + userAccount.getEmployee().getEmailId());
            int a = EmailSender.sendEmail(userAccount.getEmployee().getEmailId(), s, repairStaff.getEmailId(),userAccount.getEmployee().getName(),repairStaff.getName(),"Call for emergency.");
                    
            if(a == 1){
                try {
                     Thread.sleep(1000);                 //1000 milliseconds is one second.
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
            repairStaff.setAvailability("Yes");
            populateAvailableStaff();
            populateAllStaff();
            }
            
            
            
    }//GEN-LAST:event_callActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            populateReceived();
        } catch (ServiceBackendException ex) {
            Logger.getLogger(ResourceJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ServiceTechnicalException ex) {
            Logger.getLogger(ResourceJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availStaffTable;
    private javax.swing.JButton call;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable receivedTable;
    private javax.swing.JTable tableall;
    // End of variables declaration//GEN-END:variables
}
