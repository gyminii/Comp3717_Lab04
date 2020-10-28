package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProductTypeActivity extends ListActivity {

    private int foodIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodIndex = (Integer) getIntent().getExtras().get("food");

        Food[] foodArr;

        if (foodIndex == 0) {
            foodArr = Food.fruits;
        } else if (foodIndex == 1) {
            foodArr = Food.vegetables;
        } else {
            foodArr = Food.bakery;
        }

        ArrayAdapter<Food> arrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, foodArr
        );

        ListView listFoods = getListView();
        listFoods.setAdapter(arrayAdapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent i = new Intent(this, ProductDetailActivity.class);
        i.putExtra("food", foodIndex);
        i.putExtra("index", (int) id);
        startActivity(i);
    }
}