/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snexperiment;

import java.util.ArrayList;

/**
 *
 * @author Dmitry
 */
public class SocialNet {
    
    ArrayList<User> AllUsers;
    
    public void registrate(User user){
        AllUsers.add(user);
    }
}
