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
public class OrganizationFabric implements UserFabricInterface{

    @Override
    public User create(int motiv) {
        
        User user;
        switch(motiv){
            case (UserTypeChooser.M_PROM): {
                user = new OPromouter();
                break;
            }
            case (UserTypeChooser.M_INF) : {
                user = new OInfluencer();
                break;
            }
            default: Error err = new Error("Unknown or invalid motivation code for organization");throw err;
        }
        return user;
    }
    
}
