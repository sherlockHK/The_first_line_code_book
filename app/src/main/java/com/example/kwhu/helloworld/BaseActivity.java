package com.example.kwhu.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by kwhu on 8/31/15.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());
    }
}
