package picturedemo.dong.com.daggerdemo.bean;

import javax.inject.Inject;

/**
 * Created by Dong on 2016/12/7.
 */

public class SimpleMaker implements CoffeeMaker{

    Cooker cooker;  //现在需要咖啡师来制作咖啡了

    @Inject
    public SimpleMaker(Cooker cooker){
        this.cooker = cooker;
    }

    @Override
    public String makeCoffee() {
        return cooker.make();
    }
}
