package com.yxy.common;


import android.widget.Toast;

import androidx.annotation.StringRes;

public class T {

  public static void s(String msg) {
    Toast.makeText(AppBase.INSTANCE, msg, Toast.LENGTH_SHORT).show();
  }

  public static void s(@StringRes int resourceId) {
    Toast.makeText(AppBase.INSTANCE, resourceId, Toast.LENGTH_SHORT).show();
  }
}
