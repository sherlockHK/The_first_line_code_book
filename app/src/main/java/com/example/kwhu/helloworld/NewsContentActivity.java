package com.example.kwhu.helloworld;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import fragment.NewsContentFragment;

/**
 * Created by kwhu on 10/5/15.
 */
public class NewsContentActivity extends Activity {

    public static void actionStart(Context context,String title,String content){
        Intent intent = new Intent(context,NewsContentActivity.class);
        intent.putExtra("title",title);
        intent.putExtra("content",content);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_content);

        String title = getIntent().getStringExtra("title");
        String content = getIntent().getStringExtra("content");

        NewsContentFragment newsContentFragment = (NewsContentFragment) getFragmentManager().findFragmentById(R.id.news_content_fragment);
        newsContentFragment.refresh(title,content);
    }
}
