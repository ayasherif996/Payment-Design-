/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AuthorizationModule;


public class AuthorizeCredit2  implements IauthorizeBehavior{

    @Override
    public void authorized() {
        System.out.println("AuthorizeCredit2");
    }
    
}
