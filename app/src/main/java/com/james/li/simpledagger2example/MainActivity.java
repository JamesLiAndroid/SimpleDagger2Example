package com.james.li.simpledagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.james.li.simpledagger2example.bean.UserModule;
import com.james.li.simpledagger2example.component.ActivityComponent;
import com.james.li.simpledagger2example.component.DaggerActivityComponent;
import com.james.li.simpledagger2example.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    ActivityComponent component;

    @Inject
    UserModule userModule;

    TextView tvContent;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 注入信息
        component = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        component.inject(this);

        initViews();
    }

    private void initViews() {
        tvContent = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userModule.setUsername("小李");
                userModule.setHome("济南");
                userModule.setRole("程序猿");

                // 显示数据
                tvContent.setText(userModule.toString());
            }
        });
    }
}
