package io.zipcoder.designpatterns.factory;


public class SodaMachine extends DrinkDispenser{
    private static volatile SodaMachine instance;
    private SodaMachine(){}

    public static SodaMachine getInstance(){
        if (instance == null) {
            synchronized (SodaMachine.class){
                if (instance == null){
                    instance = new SodaMachine();}
            }
        }
        return instance;
    }

    public Soda dispense(){
        return new Soda();
    }
}