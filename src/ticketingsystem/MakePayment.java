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
public class MakePayment {

    float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }
    int TransactionID;
    int UserID;

    public void ConfirmTransaction(){           //leih mane3mlhash boolean
        
    }
    public void ReturnMoneyOnCancellation(){
        
    }
    
}
