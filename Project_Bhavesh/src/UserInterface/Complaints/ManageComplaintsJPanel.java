/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Complaints;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Organization.ComplaintsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ComplaintRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhavesh Patel
 */
public class ManageComplaintsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageComplaintsJPanel
     */
    private JPanel container;
    private ComplaintsOrganization complaintsOrganization;
    private UserAccount userAccount;
    
    public ManageComplaintsJPanel(JPanel container,UserAccount userAccount, ComplaintsOrganization organization) {
        initComponents();
        
        this.container = container;
        this.userAccount = userAccount;
        this.complaintsOrganization = organization;
        populateTable();
        send.setEnabled(false);
        clear.setEnabled(false);
        workRequestJTable.setAutoCreateRowSorter(true);
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : complaintsOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            ComplaintRequest complaintRequest = (ComplaintRequest) request;
            row[0] = request.getMessage();
            row[1] = request.getSender().getEmployee();
            row[2] = request.getComplaintReceiver()== null ? "Yet to Assign" : request.getComplaintReceiver().getEmployee();
            row[3] = complaintRequest;

            model.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        chatText = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageChat = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        workRequestJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                workRequestJTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Resolve");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Result : ");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Resolve Requests");

        jInternalFrame2.setVisible(true);

        clear.setText("Clear Chat");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel5.setText("Chat with Customer");

        jLabel7.setText("Message");

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        messageChat.setEditable(false);
        messageChat.setColumns(20);
        messageChat.setRows(5);
        jScrollPane2.setViewportView(messageChat);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                    .addComponent(send)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clear))
                                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(chatText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send)
                    .addComponent(clear))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(assignJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(processJButton)))))))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignJButton)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(jLabel2)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backJButton)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            ComplaintRequest request = (ComplaintRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if(request.getStatus().equalsIgnoreCase("assigned")){
                JOptionPane.showMessageDialog(null, "Request already assigned");
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            } else {
                request.setComplaintReceiver(userAccount);
                request.setStatus("Assigned");
                populateTable();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to Assign.");
            return;
        }
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow < 0 ){
            JOptionPane.showMessageDialog(null, "Choose a request to resolve.");
            return;
        }
        ComplaintRequest complaintRequest1 = (ComplaintRequest) workRequestJTable.getValueAt(selectedRow, 3);
        if(complaintRequest1.getComplaintReceiver() == null ){
            JOptionPane.showMessageDialog(null, "Request not yet Assigned");
            return;
        }
         if (complaintRequest1.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            }
         if(resultJTextField.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Enter message for resolution");
            return;
        }
        complaintRequest1.setComplaintResult(resultJTextField.getText());
        complaintRequest1.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Complaint Resolved");
        
        populateTable();
        resultJTextField.setText("");
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        
        Employee employee = (Employee) workRequestJTable.getValueAt(selectedRow, 1);
        Customer customer = (Customer) employee;
        customer.setComplaintChatMessage("");
        messageChat.setText(customer.getComplaintChatMessage()+ "\n");

    }//GEN-LAST:event_clearActionPerformed
    private void events(){
    int selectedRow = workRequestJTable.getSelectedRow();
        
        Employee employee = (Employee) workRequestJTable.getValueAt(selectedRow, 1);
        Customer customer = (Customer) employee;
        if(customer != null){
        if(customer.getComplaintChatMessage()== null){
           messageChat.setText("");
            customer.setComplaintChatMessage(messageChat.getText());}
        else{
            
            messageChat.setText(customer.getComplaintChatMessage()+ "\n");
        }
        }
        send.setEnabled(true);
        clear.setEnabled(true);
    }
    
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow < 0 ){
            JOptionPane.showMessageDialog(null, "Choose a customer to chat.");
            return;
        }
        Employee employee = (Employee) workRequestJTable.getValueAt(selectedRow, 1);
        Customer customer = (Customer) employee;
        if(chatText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Type a message to send");
            return;
        }
        if(customer != null){
            if((customer.getComplaintChatMessage() == null)){
                messageChat.setText((userAccount.getEmployee() + " : " + chatText.getText() + "\n"));
                customer.setComplaintChatMessage(messageChat.getText());

            }else{
                messageChat.setText(customer.getComplaintChatMessage().concat(userAccount.getEmployee() + " : " + chatText.getText() + "\n"));
                customer.setComplaintChatMessage(messageChat.getText());
            }
            chatText.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Select a customer first");
        }

    }//GEN-LAST:event_sendActionPerformed

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
        
        events();
    }//GEN-LAST:event_workRequestJTableMouseClicked

    private void workRequestJTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workRequestJTableKeyReleased
        events();
    }//GEN-LAST:event_workRequestJTableKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField chatText;
    private javax.swing.JButton clear;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messageChat;
    private javax.swing.JButton processJButton;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton send;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}