package com.example.kwhu.helloworld;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by kwhu on 8/26/15.
 */
public class MainActivity extends BaseActivity implements View.OnClickListener{

    public static final String TAG = "MainActivity";
    private Button button;
    private EditText editText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null){
            String key = savedInstanceState.getString("key");
            Log.d("MainActivity",key);
        }

        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        editText = (EditText) findViewById(R.id.edit_text);

        imageView = (ImageView) findViewById(R.id.image_view);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("this is a dialog");
                dialog.setMessage("something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                dialog.show();
                break;
            default:
                break;
        }
    }
}
