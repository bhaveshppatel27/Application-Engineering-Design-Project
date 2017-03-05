/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author Bhavesh Patel
 */
public class DB4OUtil1 {
    
    private static final String FILENAME = "DataBank.db4o";
    private static DB4OUtil1 dB4OUtil;
    
    public synchronized static DB4OUtil1 getInstance(){
        if(dB4OUtil == null){
            dB4OUtil = new DB4OUtil1();
        }
        return dB4OUtil;
    }
     protected synchronized static void shutdown(ObjectContainer conn){
         if(conn != null){
             conn.close();
         }
     }
     
     private ObjectContainer createConnection(){
         try{
             EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
             config.common().add(new TransparentPersistenceSupport());
             //Controls the number of objects in memory
             config.common().activationDepth(Integer.MAX_VALUE);
             //Controls the depth/level of updation ob object
             config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);
             
             ObjectContainer db  = Db4oEmbedded.openFile(config , FILENAME);
             return db;
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
         return null;
     }
           public synchronized void storeSystem(EcoSystem system){
               ObjectContainer conn = createConnection();
               conn.store(system);
               conn.commit();
               conn.close();
           }
           
           public EcoSystem retrieveSystem(){
               ObjectContainer conn = createConnection();
               //change to objcet you want to save
               ObjectSet<EcoSystem> systems =conn.query(EcoSystem.class);
               EcoSystem system  = null;
               
               if(systems.size() == 0){
                   system = ConfigureASystem.configure();
               }else{
                   system = systems.get(systems.size() -1);
               }
               conn.close();
               return system;
           }
}
