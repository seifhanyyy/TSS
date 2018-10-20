/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eslam
 */
public class Ticket {
  
    private String Description;
   private String []Priority;
   private Date TicketDate;
   private int TicketID;
   private Date DueDate;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String[] getPriority() {
        return Priority;
    }

    public void setPriority(String[] Priority) {
        this.Priority = Priority;
    }

    public Date getTicketDate() {
        return TicketDate;
    }

    public void setTicketDate(Date TicketDate) {
        this.TicketDate = TicketDate;
    }

    public int getTicketID() {
        return TicketID;
    }

    public void setTicketID(int TicketID) {
        this.TicketID = TicketID;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
    }
    
}
