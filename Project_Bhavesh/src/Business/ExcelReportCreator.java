/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.WaterEnterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Bhavesh Patel
 */
public class ExcelReportCreator {
    
    public static int create(EcoSystem system){
        
//          Steps:-
//          Create a Workbook.
//          Create a Sheet.
//          Repeat the following steps until all data is processed:
//          Create a Row.
//          Create Cells in a Row. Apply formatting using CellStyle.
//          Write to an OutputStream.
//          Close the output stream.
        
        
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Customer Details");

        //Custom font style for header
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        Font font = sheet.getWorkbook().createFont();
        font.setBold(true);
        cellStyle.setFont(font);
        
        int rowCount = 0;
        int columnCount1 = 0;
        
        //Creating header row
        
        String s[] = {"CUSTOMER ID","CUSTOMER NAME","CONTACT NO.","EMAIL ID","USAGE(Gallons)","BILLING DATE","TOTAL BILL($)"};
         Row row1 = sheet.createRow(++rowCount);
         for(String s1 : s){
             Cell header = row1.createCell(++columnCount1);
             header.setCellValue(s1);
             header.setCellStyle(cellStyle);
         }
         
         
         
        for(Network network : system.getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WaterEnterprise){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof CustomerOrganization){
                            for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
                                Customer customer = (Customer) employee;
                                Row row = sheet.createRow(++rowCount);
                                int columnCount = 0;
                                for(int i = 0 ; i<7 ; i++ ){
                                    Cell cell = row.createCell(++columnCount);
                                    if(i==0){
                                        cell.setCellValue(customer.getId());
                                    }
                                    else if(i == 1){
                                        cell.setCellValue(customer.getName());
                                    }
                                    else if(i == 2){
                                        cell.setCellValue(customer.getContactNo());
                                    }
                                    else if(i == 3){
                                        cell.setCellValue(customer.getEmailId());
                                    }
                                    else if(i == 4){
                                        cell.setCellValue(customer.getTotalUsageVolume());
                                    }
                                    else if(i == 5){
                                        if(customer.getBillingDate() != null)
                                        cell.setCellValue(String.valueOf(customer.getBillingDate()));
                                        else
                                            cell.setCellValue("Bill Not yet available");
                                    }
                                    else if(i == 6){
                                        if(customer.getTotalBill() != 0)
                                        cell.setCellValue(customer.getTotalBill());
                                        else
                                            cell.setCellValue("Bill Not yet available");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
   
         
        try (FileOutputStream outputStream = new FileOutputStream("Customer_details.xlsx")) {
            workbook.write(outputStream);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");
            return 0;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IOException");
            return 0;
        }
        return 1;
    }
}
