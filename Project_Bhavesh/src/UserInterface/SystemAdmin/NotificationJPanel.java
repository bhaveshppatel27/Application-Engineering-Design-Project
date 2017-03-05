/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.WaterEnterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.TextChatCreator;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bhavesh Patel
 */
public class NotificationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NotificationJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private String name;
    public NotificationJPanel(JPanel userProcessContainer,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        
        populateNetwork();
        populateCustomers();
        name = ecoSystem.getEmployeeDirectory().getEmployeeList().get(0).getName();
    }
    
    private void populateNetwork(){
        combo.removeAllItems();
        for(Network network : ecoSystem.getNetworkList()){
            combo.addItem(network);
        }
    }
    
    private void populateCustomers(){
        custCombo.removeAllItems();
        for(Network network : ecoSystem.getNetworkList()){
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WaterEnterprise){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof CustomerOrganization){
                            for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
                                Customer customer = (Customer) employee;
                                custCombo.addItem(customer);
                            }
                        }
                    }
                }
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

        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        chatText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        custCombo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageChat = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1300, 900));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Notification Panel");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        jLabel3.setText("Broadcast Messages");

        jLabel1.setText("Select Network");

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        jButton4.setText("Clear All Broadcasts");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jInternalFrame2.setVisible(true);

        jLabel4.setText("Select Customer");

        jButton3.setText("Clear Chat");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Chat with Customer");

        jLabel7.setText("Message");

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        custCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        custCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custComboActionPerformed(evt);
            }
        });

        messageChat.setEditable(false);
        messageChat.setColumns(20);
        messageChat.setRows(5);
        jScrollPane2.setViewportView(messageChat);

        jButton5.setText("Save Chat");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))
                                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(chatText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addComponent(custCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jButton5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(custCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel2)))
                .addContainerGap(659, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
       
        
    }//GEN-LAST:event_comboActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Network network = (Network) combo.getSelectedItem();
         if(network == null){
            JOptionPane.showMessageDialog(null, "Select a network first");
            return;
         }
         
         for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WaterEnterprise){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof CustomerOrganization){
                            if(organization.getUserAccountDirectory().getUserAccountList().size() == 0){
                                JOptionPane.showMessageDialog(null, "No Customers in this network yet");
                                return;
                            }
                        }
                    }
                }
            }
         
        if(message.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Type a message to send");
            return;
        }
       
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WaterEnterprise){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof CustomerOrganization){
                            for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
                                Customer customer = (Customer) employee;
                                if(customer.getNotification() != null)
                                customer.setNotification((customer.getNotification()).concat("\n" + message.getText() + "\n"));
                                else{
                                    customer.setNotification("");
                                }
                                
                            }
                        }
                    }
                }
            }
        
        message.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Customer customer = (Customer) custCombo.getSelectedItem();
        if(chatText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Type a message to send");
            return;
        }
        if(customer != null){
            if((customer.getChatMessage() == null)){
           messageChat.setText((name + " : " + chatText.getText() + "\n"));
           customer.setChatMessage(messageChat.getText());

        }else{
            messageChat.setText(customer.getChatMessage().concat(name + " : " + chatText.getText() + "\n"));
           customer.setChatMessage(messageChat.getText());
        }
        chatText.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Select a customer first");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void custComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custComboActionPerformed
        Customer customer = (Customer) custCombo.getSelectedItem();
        if(customer != null){
        if(customer.getChatMessage() == null){
           messageChat.setText("");
            customer.setChatMessage(messageChat.getText());}
        else{
            
            messageChat.setText(customer.getChatMessage() + "\n");
        }
        }
    }//GEN-LAST:event_custComboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Customer customer = (Customer) custCombo.getSelectedItem();
        if(customer == null){
            JOptionPane.showMessageDialog(null, "Select a customer first");
            return;
        }
        customer.setChatMessage("");
        messageChat.setText(customer.getChatMessage() + "\n");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Network network = (Network) combo.getSelectedItem();
        
        if(network!=null){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WaterEnterprise){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof CustomerOrganization){
                            for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
                                Customer customer = (Customer) employee;
                                customer.setNotification("");
                            }
                        }
                    }
                }
            }
        }
        message.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Customer customer = (Customer) custCombo.getSelectedItem();
        if(customer == null){
            JOptionPane.showMessageDialog(null, "Select a customer first");
            return;
        }
        TextChatCreator.create(customer, "Admin_"+customer.getName()+".txt");
        
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField chatText;
    private javax.swing.JComboBox combo;
    private javax.swing.JComboBox custCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea message;
    private javax.swing.JTextArea messageChat;
    // End of variables declaration//GEN-END:variables
}
