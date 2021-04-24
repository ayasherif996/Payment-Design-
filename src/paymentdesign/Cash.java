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
 class Cash  extends Payment{
    private float CashTendered ;

    public void setCashTendered(float CashTendered) {
        this.CashTendered = CashTendered;
    }

    public float getCashTendered() {
        return CashTendered;
    }
    
}
