/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentdesign;
import AuthorizationModule.AuthorizeCheck;
import PrintModule.PrintCashTrans;

/**
 *
 * @author MBR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Payment P = new Payment( (float) 14.5 ,new AuthorizeCheck(), new PrintCashTrans());
        P.getIathorizeBehavior().authorized();
        P.getIprintBehavior().PrintReceipt();
        
    }
    
}
