package dev.mahmoud_ashraf.dagger2.di;

import dagger.Component;
import dev.mahmoud_ashraf.dagger2.War;

@Component
public interface BattleComponent {
    War getWar();
}

