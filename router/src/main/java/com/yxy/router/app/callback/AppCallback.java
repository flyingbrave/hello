package com.yxy.router.app.callback;

public interface AppCallback<T> {
    void onResult(T data);
}
