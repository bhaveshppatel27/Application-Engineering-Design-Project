/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.IOException;

/**
 *
 * @author Bhavesh Patel
 */
public class TestTcpSms {
    
    public static void sendSms() {
                try {
                        String host = "localhost";
                        int port = 9500;
                        String username = "admin";
                        String password = "admin";

                        MyOzSmsClient osc = new MyOzSmsClient(host, port);
                        osc.login(username, password);

                        
                        String line = "Hello World";

                        System.out.println("SMS message:");

                        if(osc.isLoggedIn()) {
                                osc.sendMessage("+0016178708311", line);
                                System.out.println("done");
                                osc.logout();
                        }


                } catch (IOException e) {
                        System.out.println(e.toString());
                        e.printStackTrace();
                } catch (InterruptedException e) {
                        System.out.println(e.toString());
                        e.printStackTrace();
                }
        }
    
}
