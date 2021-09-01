package com.yxy.model1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.yxy.common.BaseActivity;

public class Model1MainActivity extends BaseActivity {

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_model1);
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String aaa= Services.sAppService.callMethodSyncOfApp();
                Toast.makeText(Model1MainActivity.this, ""+aaa, Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.text2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String aaa= Services.sModule2Service.callMethodSyncOfModule2();
                Toast.makeText(Model1MainActivity.this, ""+aaa, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public static void jump(Context context){
        Intent intent=new Intent(context,Model1MainActivity.class);
        context.startActivity(intent);
    }
}
