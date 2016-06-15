package io.zipcoder.designpatterns.factory;

/**
 * Created by dimitrivaughn on 6/13/16.
 */
public class CoffeeCupDispenser extends CupDispenser {

    private static volatile CoffeeCupDispenser instance;
    private CoffeeCupDispenser(){}

    public static CoffeeCupDispenser getInstance(){
        if (instance == null) {
            synchronized (CoffeeCupDispenser.class){
                if (instance == null){
                    instance = new CoffeeCupDispenser();}
            }
        }
        return instance;
    }

    public CoffeeCup dispense(){return new CoffeeCup();}
}
