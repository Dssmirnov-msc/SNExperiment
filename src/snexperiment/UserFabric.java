/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snexperiment;

/**
 *
 * @author test2020
 */
public class UserFabric {
    
    public User create(int nature, int motiv){
        UserFabricInterface fabric = null;
        if(nature == UserTypeChooser.N_PERSON){
            fabric = new PersonFabric();
        }
        if(nature == UserTypeChooser.N_ORG){
            fabric = new OrganizationFabric();
        }
        User user = fabric.create(motiv);
        return user;
    }
    
}
