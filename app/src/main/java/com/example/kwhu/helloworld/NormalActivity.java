package com.example.kwhu.helloworld;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by kwhu on 8/26/15.
 */
public class NormalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.normal_layout);
    }
}
