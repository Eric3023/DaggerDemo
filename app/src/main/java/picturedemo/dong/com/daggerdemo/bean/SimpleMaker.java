package picturedemo.dong.com.daggerdemo.bean;

import javax.inject.Inject;

import picturedemo.dong.com.daggerdemo.interfaces.A;
import picturedemo.dong.com.daggerdemo.interfaces.B;

/**
 * Created by Dong on 2016/12/7.
 */

public class SimpleMaker implements CoffeeMaker{

    private Cooker cookerA;
    private Cooker cookerB;

    @Inject
    SimpleMaker(@A Cooker cookerA, @B Cooker cookerB){
        this.cookerA = cookerA;
        this.cookerB=cookerB;
    }

    @Override
    public String makeCoffee() {
        return cookerA.make()+"\n\n"+cookerB.make();
    }
}
