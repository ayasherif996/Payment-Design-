/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentdesign;

/**
 *
 * @author MBR
 */
 class Check extends Payment{
    private  String name ;
    private  String bankID ;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public String getBankID() {
        return bankID;
    }
    
}