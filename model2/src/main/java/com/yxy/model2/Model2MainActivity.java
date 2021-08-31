package com.yxy.model2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.yxy.common.BaseActivity;

public class Model2MainActivity extends BaseActivity {

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_model2);
      final String a= Services.sModule1Service.callMethodSyncOfModule1();
       new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
           @Override
           public void run() {
               Toast.makeText(Model2MainActivity.this, ""+a, Toast.LENGTH_SHORT).show();
           }
       },3000);
    }
}
