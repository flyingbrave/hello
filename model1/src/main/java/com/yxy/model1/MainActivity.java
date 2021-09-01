package com.yxy.model1;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.yxy.common.BaseActivity;


public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Services.sModule2Service.jump2Mode2MainActivity(MainActivity.this);
            }
        });
    }
}
