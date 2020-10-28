package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetailActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_product_detail);
//
//        int foodIndex = (Integer) getIntent().getExtras().get("food");
//        int selectedIndex = (Integer) getIntent().getExtras().get("index");
//
//        Food food;
//
//        if (foodIndex == 0) {
//            food = Food.fruits[selectedIndex];
//        } else if (foodIndex == 1) {
//            food = Food.vegetables[selectedIndex];
//        } else {
//            food = Food.bakery[selectedIndex];
//        }
//
//        ImageView foodImage = findViewById(R.id.product_image);
//        foodImage.setImageResource(food.getImageResourceId());
//
//        TextView productName = findViewById(R.id.product_name);
//        productName.setText(food.getName());
//
//        TextView productDetail = findViewById(R.id.product_detail);
//        productDetail.setText(
//                "Category: " + food.getCategory()
//                        + "\nCountry of origin: " + food.getCountryOfOrigin()
//                        + "\nUnit: " + food.getUnit()
//                        + "\nPrice: " + String.format("%.2f", food.getPrice())
//        );
//    }
}