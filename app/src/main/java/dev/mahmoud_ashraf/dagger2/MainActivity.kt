package dev.mahmoud_ashraf.dagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dev.mahmoud_ashraf.dagger2.di.BraavosModule
import dev.mahmoud_ashraf.dagger2.di.DaggerBattleComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
//
//        War war = new War(starks,boltons);
//        war.prepare();
//        war.report();

        val cash = Cash()
        val soldiers = Soldiers()

        val component = DaggerBattleComponent.builder().braavosModule(BraavosModule(cash,soldiers)).build()
        val war = component.getWar()
        war.prepare()
        war.report()

        //
        component.getCash();
        component.getSoldiers();
    }
}
