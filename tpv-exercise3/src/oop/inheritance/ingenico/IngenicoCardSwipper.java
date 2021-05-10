package oop.inheritance.ingenico;

import oop.inheritance.data.*;

public class IngenicoCardSwipper {

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
