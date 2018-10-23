/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Dr.Bony George
 */
public class Rating implements CRUD {

    public BufferedString getDescription() {
        return description;
    }

    public void setDescription(BufferedString description) {
        this.description = description;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public int getNofRstedTickets() {
        return NofRstedTickets;
    }

    public void setNofRstedTickets(int NofRstedTickets) {
        this.NofRstedTickets = NofRstedTickets;
    }
    
    BufferedString description;
    int Rating;
    int NofRstedTickets;
    
}
