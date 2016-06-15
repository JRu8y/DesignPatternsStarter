package io.zipcoder.designpatterns.factory;

/**
 * Created by dimitrivaughn on 6/13/16.
 */
public class BeerMachine extends DrinkDispenser {

    private static volatile BeerMachine instance;
    private BeerMachine(){}

    public static BeerMachine getInstance(){
        if (instance == null) {
            synchronized (BeerMachine.class){
                if (instance == null){
                    instance = new BeerMachine();}
            }
        }
        return instance;
    }

    public Beer dispense(){ return new Beer();}
}
