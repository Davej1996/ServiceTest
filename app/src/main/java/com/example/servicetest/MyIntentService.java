package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService"); //调用父类的无参构造器
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.d("MyIntentService", "Thread id is : " + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntentService", "onDestroy: ");
    }
}
