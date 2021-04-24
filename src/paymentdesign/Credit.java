/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentdesign;
import java.util.*;
/**
 *
 * @author MBR
 */
 class Credit extends Payment {

    private String name;
    private String type;
    private Date expDate;


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getExpDate() {
        return expDate;
    }

}
