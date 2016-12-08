package picturedemo.dong.com.daggerdemo.module;

import dagger.Module;
import dagger.Provides;
import picturedemo.dong.com.daggerdemo.bean.Cooker;

/**
 * Created by Dong on 2016/12/7.
 */
@Module
public class SimpleModule {

    @Provides
    Cooker provideCooker(){
        return new Cooker("James","Espresso");
    }
}
