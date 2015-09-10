package com.example.kwhu.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by kwhu on 8/26/15.
 */
public class MainActivity extends BaseActivity {

    public static final String TAG = "MainActivity";
    private Button button;
    private EditText editText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            String key = savedInstanceState.getString("key");
            Log.d("MainActivity", key);
        }

        setContentView(R.layout.activity_main);
    }


}
