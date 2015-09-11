package com.example.kwhu.helloworld;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.FruitAdapter;
import model.Fruit;

/**
 * Created by kwhu on 8/26/15.
 */
public class MainActivity extends BaseActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();

        FruitAdapter fruitAdapter = new FruitAdapter(this,R.layout.fruit_item,fruitList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(fruitAdapter);
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.google_icon); fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.icon); fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.google_icon); fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.drawable.google_icon); fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.google_icon); fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.drawable.google_icon); fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.icon); fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.icon); fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.icon); fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.icon); fruitList.add(mango);
    }



}
