package com.james.li.simpledagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.james.li.simpledagger2example.bean.ShoppingCartModule;
import com.james.li.simpledagger2example.bean.UserModule;
import com.james.li.simpledagger2example.component.ActivityComponentCompat;
import com.james.li.simpledagger2example.component.ContainerComponent;
import com.james.li.simpledagger2example.component.DaggerActivityComponentCompat;
import com.james.li.simpledagger2example.component.DaggerContainerComponent;
import com.james.li.simpledagger2example.module.ActivityModule;
import com.james.li.simpledagger2example.module.ContainerModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //ActivityComponent component;
    ActivityComponentCompat componentCompat;

    @Inject
    UserModule userModule;

    @Inject
    ShoppingCartModule cartModule;

    TextView tvContent;
    Button button;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 注入信息
        //component = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        //component.inject(this);

        componentCompat = DaggerActivityComponentCompat.builder().activityModule(new ActivityModule()).build();
        ContainerComponent containerComponent = DaggerContainerComponent.builder()
                .activityComponentCompat(componentCompat).containerModule(new ContainerModule()).build();
        containerComponent.inject(this);

        initViews();
    }

    private void initViews() {
        tvContent = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        btn = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 注意，赋值的时候只能通过set方法进行！
                userModule.setUsername("小李");
                userModule.setHome("济南");
                userModule.setRole("程序猿");

                // 显示数据
                tvContent.setText(userModule.toString());
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartModule.setCardNum("111111");
                cartModule.setOwner("小李");

                tvContent.setText(cartModule.toString()+"::"+userModule.getHome());
            }
        });
    }
}
