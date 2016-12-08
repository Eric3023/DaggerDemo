package picturedemo.dong.com.daggerdemo.module;

import dagger.Module;
import dagger.Provides;
import picturedemo.dong.com.daggerdemo.bean.Cooker;
import picturedemo.dong.com.daggerdemo.qulifier.A;
import picturedemo.dong.com.daggerdemo.qulifier.B;

/**
 * Created by Dong on 2016/12/7.
 */
@Module
public class SimpleModule {

    @Provides
    @A
    Cooker provideCookerA(){
        return new Cooker("James","Espresso");
    }

    @Provides
    @B
    Cooker provideCookerB(){
        return  new Cooker("Smith","Machiato");
    }
}
