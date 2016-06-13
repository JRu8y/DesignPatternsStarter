package io.zipcoder.designpatterns.factory;

/**
 * Created by dimitrivaughn on 6/13/16.
 */
public class BeerMachine extends DrinkDispenser {
    public Beer dispense(){ return new Beer();}
}
