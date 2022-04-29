/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snexperiment;

/**
 *
 * @author Dmitry
 */
public class Scenario {
    
    private Ratio ratiohandler;
    private UserTypeChooser userChooser;
    public SocialNet SN;
    
    public Scenario() {
        ratiohandler = new Ratio();
        userChooser = new UserTypeChooser();
        userChooser.tune(ratiohandler.get_instance());
    }

    public void setSN(SocialNet SN) {
        this.SN = SN;
    }
    
    public void populate(){
        
        for (int i = 0; i < ratiohandler.START_POPULATION; i++) {
            registrate();
        }
        
    }
            
    public void registrate(){
        
        UserFabric fabric = new UserFabric();
        User newUser = fabric.create(userChooser.choose_nature(), userChooser.choose_motive());
        SN.registrate(newUser);
    }

    public static class Ratio {
        
        static int START_POPULATION = 2000;
        
        static int PERSON_WEIGHT = 75;
        static int ORGANIZATION_WEIGHT = 25;
        
        static int P_CONSUMER_WEIGHT = 33;
        static int P_PROMOTER_WEIGHT = 33;        
        static int P_INFLUENCER_WEIGHT = 33;  
        
        static int O_PROMOTER_WEIGHT = 50;        
        static int O_INFLUENCER_WEIGHT = 50; 
        
        static public Ratio instance;
               
        
        public Ratio() {
            
        }
        
        public Ratio get_instance(){
            if(instance == null){
                instance = new Ratio();
                return instance;
            }else{
                return instance;
            }
        }
        
        public static void setSTART_POPULATION(int START_POPULATION) {
            Ratio.START_POPULATION = START_POPULATION;
        }

        public static int getSTART_POPULATION() {
            return START_POPULATION;
        }
        
    }
    
}
