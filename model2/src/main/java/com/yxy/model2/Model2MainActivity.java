package com.yxy.model2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.yxy.common.BaseActivity;

public class Model2MainActivity extends BaseActivity {

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_model2);
    }
}
