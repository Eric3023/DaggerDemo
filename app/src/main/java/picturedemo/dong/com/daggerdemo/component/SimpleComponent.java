package picturedemo.dong.com.daggerdemo.component;

import dagger.Component;
import picturedemo.dong.com.daggerdemo.MainActivity;
import picturedemo.dong.com.daggerdemo.module.SimpleModule;

/**
 * Created by Dong on 2016/12/7.
 */

@Component(modules = SimpleModule.class)
public interface SimpleComponent {

    void inject(MainActivity mainActivity);
}
