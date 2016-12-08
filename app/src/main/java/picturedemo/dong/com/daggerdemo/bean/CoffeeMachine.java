package picturedemo.dong.com.daggerdemo.bean;

import javax.inject.Inject;

/**
 * Created by Dong on 2016/12/7.
 */

public class CoffeeMachine {

        private CoffeeMaker maker;

        @Inject
        public CoffeeMachine(SimpleMaker maker){
            this.maker=maker;
        }

        public String makeCoffee(){
            return maker.makeCoffee();
        }

}
