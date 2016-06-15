package io.zipcoder.designpatterns.factory;

/**
 * Created by dimitrivaughn on 6/13/16.
 */
public class SodaCupDispenser extends CupDispenser {

    private static volatile SodaCupDispenser instance;
    private SodaCupDispenser(){}

    public static SodaCupDispenser getInstance(){
        if (instance == null) {
            synchronized (SodaCupDispenser.class){
                if (instance == null){
                    instance = new SodaCupDispenser();}
            }
        }
        return instance;
    }
    public SodaCup dispense() {
        return new SodaCup();
    }
}
