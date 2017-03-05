/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RepairManager;

import Business.Enterprise.Enterprise;
import Business.Organization.RepairManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RepairRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhavesh Patel
 */
public class ResolvedRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResolvedRequestsJPanel
     */
    private Enterprise enterprise;
    private JPanel container;
    private UserAccount userAccount;
    private RepairManagerOrganization organization;
    public ResolvedRequestsJPanel(JPanel container,UserAccount userAccount,Enterprise enterprise,RepairManagerOrganization organization) {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        populateRequestTable();
        workRequestJTable.setAutoCreateRowSorter(true);
    }

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[9];
            RepairRequest request1 = (RepairRequest) request;
            if(request1.getStatus().equalsIgnoreCase("Complete")){

            row[0] = request1.getCustomer();
            row[1] = request.getReceiver() == null? "Yet to assign" :request.getReceiver();
            row[2] = request1;
            row[3] = request1.getRepairResult() == null ? "Waiting" : request1.getRepairResult();
            row[4] = request.getRequestDate();
            row[5] = request.getResolveDate() == null? "Not yet resolved":request.getResolveDate() ;
            row[6] = request1.getTimeForRepair() == 0.0? "Not Yet Repaired" : request1.getTimeForRepair() + " Seconds";
            row[7] = request1.getLeakageVolume() == 0.0? "Not Yet Repaired" : request1.getLeakageVolume() + " Gallons";
            row[8] = request1.getRepairCost()== 0? "Yet to calculate" : request1.getRepairCost() + "$";
            
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

        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer", "Assigned To", "Status", "Result", "Date Requested", "Date Resolved", "Repair Time", "Leakage Volume", "Repair Cost"
            }
        ));
        jScrollPane2.setViewportView(workRequestJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Resolved Requests");

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}