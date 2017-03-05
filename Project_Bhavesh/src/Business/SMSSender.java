/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import com.textmagic.sms.TextMagicMessageService;
import com.textmagic.sms.exception.ServiceBackendException;
import com.textmagic.sms.exception.ServiceException;
import com.textmagic.sms.exception.ServiceTechnicalException;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author Bhavesh Patel
 */
public class SMSSender {
    
    public static void send(String s, String message){
        BasicConfigurator.configure();
        
          TextMagicMessageService service = 
             new TextMagicMessageService ("bhaveshpatel2","Dollar!2727");
          try {
               service.send(message, s);
          } catch(ServiceException ex) {
               System.out.println(" Service exception");
          }
          
          
          
    }
}
