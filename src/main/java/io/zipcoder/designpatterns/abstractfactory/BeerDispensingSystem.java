package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.*;

/**
 * Created by dimitrivaughn on 6/13/16.
 */
class BeerDispensingSystem extends DispensingSystem {
    public DrinkDispenser drinkDispenser(){return new BeerMachine();}

    public CupDispenser cupDispenser(){return new BeerCupDispenser();}
}
