/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintModule;

import PrintModule.IprintBehavior;

/**
 *
 * @author MBR
 */
public class PrintCashTrans implements IprintBehavior {

    @Override
    public void PrintReceipt() {
       System.out.println("Here is your Receipt");
    }

   
}
