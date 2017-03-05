/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Water;

import Business.EcoSystem;
import Employee.Customer;
import Employee.SensorValue;
import UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhavesh Patel
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    
    
    private JPanel container;
    private UserAccount userAccount;
    private Customer customer;
    private SensorValue sensorValue;
    public CustomerWorkAreaJPanel(JPanel container,UserAccount userAccount) {
        initComponents();
        this.container = container;
        customer = (Customer) userAccount.getEmployee();
        
        name.setText(customer.getName());
        sensorName.setText(customer.getTargetSensor().getSensorName());
        volume.setText(String.valueOf(customer.getVolumeAvailable()));
        
        populateTable();
        
        int a = customer.getTargetSensor().getSensorValueList().size();
        if(a>0){
        sensorValue = customer.getTargetSensor().getSensorValueList().get(a -1);
        }
        volume.setEnabled(false);
    }
    
    private void populateTable(){
        
         DefaultTableModel model = (DefaultTableModel) table.getModel();
        //WaterSupplyAdmin waterSupplyAdmin = (WaterSupplyAdmin) userAccount.getEmployee();
        
        model.setRowCount(0);
        
        for(SensorValue sensorValue : customer.getTargetSensor().getSensorValueList()){
            
         
            Object[] row = new Object[3];
            row[0] = sensorValue.getFlowrate();
            row[1] = sensorValue.getPressure();
            row[2] = sensorValue.getDate();
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

        jLabel1 = new javax.swing.JLabel();
        sensorName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        flow = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pressure = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        volume = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customer");

        sensorName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setText("Supply Volume Available (Gallons)");

        jLabel4.setText("Flow Rate(Gallons/hr)");

        jLabel5.setText("Pressure");

        button.setText("Change");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Sensor Name");

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Flow Rate", "Pressure", "Time"
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("Use Water");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sensorName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(70, 70, 70))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(button))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pressure, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                        .addGap(453, 453, 453))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(flow, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(sensorName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(button)
                .addGap(136, 136, 136))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        float b =0;
        float c = 0;
        try{
           b= Float.parseFloat(flow.getText());
           c= Float.parseFloat(pressure.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Input Float Values only");
            return;
        }
        if(b<0 || c<0){
            JOptionPane.showMessageDialog(null, "Flow rate or pressure cannot be negative");
            return;
        }
        else if(b > customer.getSourceSensor().getSensorValue().getFlowrate()){
            JOptionPane.showMessageDialog(null, "Target Flow rate cannot be greater than source flow rate");
            return;
        }
        SensorValue sensorValue = new SensorValue();
        sensorValue.setFlowrate(b);
        sensorValue.setPressure(c);
        sensorValue.setDate(new Date());
        customer.getTargetSensor().getSensorValueList().add(sensorValue);
        populateTable();
        flow.setText("");
        pressure.setText("");
        this.sensorValue = customer.getTargetSensor().getSensorValueList().get(customer.getTargetSensor().getSensorValueList().size() -1);
    }//GEN-LAST:event_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            WaterUsageJPanel panel = new WaterUsageJPanel(container,customer,sensorValue);
            container.add("WaterUsageJPanel", panel);
            CardLayout layout = (CardLayout)container.getLayout();
            layout.next(container);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField flow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField pressure;
    private javax.swing.JLabel sensorName;
    private javax.swing.JTable table;
    private javax.swing.JTextField volume;
    // End of variables declaration//GEN-END:variables
}
