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
public class Assets {
    int AssetsID;
    int SerialNumber;
    String Model;
    Date DateOfPurchase;
    int NumberOfAssetsInStore;

    public int getAssetsID() {
        return AssetsID;
    }

    public void setAssetsID(int AssetsID) {
        this.AssetsID = AssetsID;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public Date getDateOfPurchase() {
        return DateOfPurchase;
    }

    public void setDateOfPurchase(Date DateOfPurchase) {
        this.DateOfPurchase = DateOfPurchase;
    }

    public int getNumberOfAssetsInStore() {
        return NumberOfAssetsInStore;
    }

    public void setNumberOfAssetsInStore(int NumberOfAssetsInStore) {
        this.NumberOfAssetsInStore = NumberOfAssetsInStore;
    }
    
}
