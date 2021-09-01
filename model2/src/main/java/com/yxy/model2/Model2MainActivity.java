package com.yxy.model2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.yxy.common.BaseActivity;

public class Model2MainActivity extends BaseActivity {


    public static void jump(Context context){
        Intent intent=new Intent(context,Model2MainActivity.class);
        context.startActivity(intent);

    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_model2);
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = Services.sModule1Service.callMethodSyncOfModule1();
                Toast.makeText(Model2MainActivity.this, "" + a, Toast.LENGTH_SHORT).show();

            }
        });
        findViewById(R.id.text2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Services.sModule1Service.startActivityOfModule1(Model2MainActivity.this);
            }
        });
        findViewById(R.id.text3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Model2MainActivity.this.getSupportFragmentManager().beginTransaction().
                        replace(R.id.framelayout, Services.sModule1Service.obtainFragmentOfModule1())
                        .commitAllowingStateLoss();

            }
        });

    }
}
