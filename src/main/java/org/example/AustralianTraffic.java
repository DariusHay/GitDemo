package org.example;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic{
    @Override
    public void greenGo() {
        System.out.println("Green Go implementation");
    }

    @Override
    public void redStop() {
        System.out.println("Red Stop implementation");
    }

    @Override
    public void flashYellow() {
        System.out.println("Yellow Caution implementation");
    }

    public void walking(){
        System.out.println("Walking");
    }

    @Override
    public void trainSymbol() {
        System.out.println("Watch for the train!!");
    }
}
