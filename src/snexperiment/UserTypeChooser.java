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
public class UserTypeChooser {
    public static final int N_PERSON = 0;
    public static final int N_ORG = 1;
    
    public static final int M_CONS = 0;
    public static final int M_PROM = 1;
    public static final int M_INF = 2;
    
    public int choose_nature(){
        return N_PERSON;
    }
    
    public int choose_motive(){
        return M_CONS;
    }

    void tune(Scenario.Ratio _instance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
