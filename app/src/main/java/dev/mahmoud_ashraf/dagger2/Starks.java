package dev.mahmoud_ashraf.dagger2;

import javax.inject.Inject;

public class Starks implements House {

    @Inject
    public Starks(){

    }

    @Override
    public void prepareForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}