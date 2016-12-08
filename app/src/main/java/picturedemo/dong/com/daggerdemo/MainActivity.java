package picturedemo.dong.com.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import picturedemo.dong.com.daggerdemo.bean.CoffeeMachine;
import picturedemo.dong.com.daggerdemo.bean.Cooker;
import picturedemo.dong.com.daggerdemo.component.DaggerSimpleComponent;
import picturedemo.dong.com.daggerdemo.component.SimpleComponent;
import picturedemo.dong.com.daggerdemo.module.SimpleModule;

/**
 * DaggerDemo
 * @author Dong
 * @time 2016/12/07
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.btnMakeCoffee)
    Button btnMakeCoffee;
    @BindView(R.id.tvCoffee)
    TextView tvCoffee;
    @Inject
    CoffeeMachine coffeeMachine;

    private SimpleComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        /*
         * 给CoffeeMachine注入内容，也就是CoffeeMachine的初始化
         */
        component = DaggerSimpleComponent.builder().simpleModule(new SimpleModule()).build();
        component.inject(this);

        initView();
    }

    private void initView(){
        btnMakeCoffee.setOnClickListener(this);
    }

    private String makeCoffee(){
        return coffeeMachine.makeCoffee();
    }


    @Override
    public void onClick(View v) {
        if(R.id.btnMakeCoffee == v.getId()){
            tvCoffee.setText(makeCoffee());
        }
    }
}
