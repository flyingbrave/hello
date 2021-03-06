package com.yxy.hello;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;

import com.yxy.common.BaseActivity;
import com.yxy.model1.Model1MainActivity;
import com.yxy.model2.Model2MainActivity;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Model2MainActivity.jump(MainActivity.this);
            }
        });
    }
}
