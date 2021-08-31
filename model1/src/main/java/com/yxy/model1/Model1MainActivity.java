package com.yxy.model1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.yxy.common.BaseActivity;

public class Model1MainActivity extends BaseActivity {

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_model1);
    }

    public static void jump(Context context){
        Intent intent=new Intent(context,Model1MainActivity.class);
        context.startActivity(intent);
    }
}
