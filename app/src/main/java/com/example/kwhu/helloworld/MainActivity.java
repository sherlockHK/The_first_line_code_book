package com.example.kwhu.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by kwhu on 8/26/15.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.button:
//                AnotherRightFragment anotherRightFragment =new AnotherRightFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.right_layout,anotherRightFragment);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
//
//
//                break;
//            default:break;
//        }
    }
}



