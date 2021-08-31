package com.yxy.hello;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

import com.yxy.common.BaseActivity;
import com.yxy.model1.Model1MainActivity;
import com.yxy.model2.Model2MainActivity;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                Intent intent=new Intent(MainActivity.this, Model2MainActivity.class);
//                MainActivity.this.startActivity(intent);
                Model1MainActivity.jump(MainActivity.this);
            }
        },3000);
    }
}
