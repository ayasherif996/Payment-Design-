/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentdesign;
//import AuthorizationModule.AuthorizeCheck;
//import AuthorizationModule.AuthorizeCredit1;
//import AuthorizationModule.AuthorizeCredit2;
//import AuthorizationModule.AuthorizeNon;
import AuthorizationModule.AuthorizeCheck;
import AuthorizationModule.IauthorizeBehavior;
import PrintModule.IprintBehavior;
import PrintModule.PrintCashTrans;
import java.util.*;
/**
 *
 * @D:\NetBeansProjects
 */
public class Payment {
    private float amount;
    private IauthorizeBehavior authorizeBehavior ;
    private IprintBehavior    printBehavior      ;

    public Payment() {}
    
    public Payment(float amount, IauthorizeBehavior IathorizeBehavior, IprintBehavior IprintBehavior) {
        this.amount = amount;
        this.authorizeBehavior = IathorizeBehavior;
        this.printBehavior = IprintBehavior;
    }

    
    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setIathorizeBehavior(IauthorizeBehavior IathorizeBehavior) {
        this.authorizeBehavior = IathorizeBehavior;
    }

    public IauthorizeBehavior getIathorizeBehavior() {
        return authorizeBehavior;
    }

    public void setIprintBehavior(IprintBehavior IprintBehavior) {
        this.printBehavior = IprintBehavior;
    }

    public IprintBehavior getIprintBehavior() {
        return printBehavior;
    }
    
    
}


