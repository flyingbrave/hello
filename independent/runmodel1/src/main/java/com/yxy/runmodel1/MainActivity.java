package com.yxy.runmodel1;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.yxy.common.BaseActivity;
import com.yxy.model1.Model1MainActivity;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.mytv1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Model1MainActivity.jump(MainActivity.this);
            }
        });
    }
}
