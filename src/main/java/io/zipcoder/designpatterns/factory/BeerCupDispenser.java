package io.zipcoder.designpatterns.factory;

/**
 * Created by dimitrivaughn on 6/13/16.
 */
public class BeerCupDispenser extends CupDispenser{
    public BeerCup dispense(){return new BeerCup();}
}
