package dev.mahmoud_ashraf.dagger2.di;

import dagger.Module;
import dagger.Provides;
import dev.mahmoud_ashraf.dagger2.Cash;
import dev.mahmoud_ashraf.dagger2.Soldiers;

@Module
public class BraavosModule {

    Cash cash;
    Soldiers soldiers;

    // i don't use inject here .. so i will add by myself
    public BraavosModule(Cash cash, Soldiers soldiers){
        this.cash=cash;
        this.soldiers=soldiers;
    }

    @Provides
    Cash provideCash(){
        return cash;
    }

    @Provides
    Soldiers provideSoldiers(){
        return soldiers;
    }

}