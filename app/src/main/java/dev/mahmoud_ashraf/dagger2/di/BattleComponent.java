package dev.mahmoud_ashraf.dagger2.di;

import dagger.Component;
import dev.mahmoud_ashraf.dagger2.Cash;
import dev.mahmoud_ashraf.dagger2.Soldiers;
import dev.mahmoud_ashraf.dagger2.War;

@Component(modules = BraavosModule.class)
public interface BattleComponent {
    War getWar();
    Cash getCash();
    Soldiers getSoldiers();
}

