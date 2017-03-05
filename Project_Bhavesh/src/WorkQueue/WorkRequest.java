/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkQueue;

import Employee.RepairStaff;
import UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Bhavesh Patel
 */
public abstract class WorkRequest
{
  private String message;
  private UserAccount sender;
  private RepairStaff receiver;
  private String status;
  private Date requestDate;
  private Date resolveDate;
  
  public WorkRequest()
  {
    this.requestDate = new Date();
  }
  
  public String getMessage()
  {
    return this.message;
  }
  
  public void setMessage(String message)
  {
    this.message = message;
  }
  
  public UserAccount getSender()
  {
    return this.sender;
  }
  
  public void setSender(UserAccount sender)
  {
    this.sender = sender;
  }
  
  public RepairStaff getReceiver()
  {
    return this.receiver;
  }
  
  public void setReceiver(RepairStaff receiver)
  {
    this.receiver = receiver;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public Date getRequestDate()
  {
    return this.requestDate;
  }
  
  public void setRequestDate(Date requestDate)
  {
    this.requestDate = requestDate;
  }
  
  public Date getResolveDate()
  {
    return this.resolveDate;
  }
  
  public void setResolveDate(Date resolveDate)
  {
    this.resolveDate = resolveDate;
  }

    @Override
    public String toString() {
        return status;
    }
  
}
