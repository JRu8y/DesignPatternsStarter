package io.zipcoder.designpatterns.factory;

/**
 * Created by dimitrivaughn on 6/13/16.
 */
public class BeerCupDispenser extends CupDispenser{

    private static volatile BeerCupDispenser instance;
    private BeerCupDispenser(){}

    public static BeerCupDispenser getInstance(){
        if (instance == null) {
            synchronized (BeerCupDispenser.class){
                if (instance == null){
                    instance = new BeerCupDispenser();}
                }
            }
            return instance;
        }

    public BeerCup dispense(){return new BeerCup();}
}
