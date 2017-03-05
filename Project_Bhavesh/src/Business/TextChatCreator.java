/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhavesh Patel
 */
public class TextChatCreator {
    
    public static void create(Customer customer,String s){
        File file = new File(s);
        FileOutputStream f = null;
        try {
            f = new FileOutputStream(file);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");
            return;
        }
        try {
            f.write(customer.getChatMessage().getBytes());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IOException");
            return;
        }
        
        try {
            Desktop.getDesktop().open(new File(s));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to open");
        }
    }
    
}
