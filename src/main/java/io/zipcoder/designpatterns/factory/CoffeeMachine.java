package io.zipcoder.designpatterns.factory;

public class CoffeeMachine extends DrinkDispenser{

    private static volatile CoffeeMachine instance;
    private CoffeeMachine(){}

    public static CoffeeMachine getInstance(){
        if (instance == null) {
            synchronized (CoffeeMachine.class){
                if (instance == null){
                    instance = new CoffeeMachine();}
            }
        }
        return instance;
    }
    public Coffee dispense(){
        return new Coffee();
    }
}
