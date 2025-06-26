package com.example.recipe;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.widget.ImageView; // Added import for ImageView

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize and set click listener for FAB
        FloatingActionButton fabAdd = findViewById(R.id.fabAdd);
        fabAdd.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NewRecipeActivity.class);
            startActivity(intent);
        });

        // Initialize and set click listener for Recipe 1
        ImageView recipeImage1 = findViewById(R.id.recipeImage1);
        recipeImage1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RecipeDetail.class);
            startActivity(intent);
        });

        // Initialize and set click listener for Recipe 2
        ImageView recipeImage2 = findViewById(R.id.recipeImage2);
        recipeImage2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RecipeDetail.class);
            startActivity(intent);
        });

        // Initialize and set click listener for Recipe 3
        ImageView recipeImage3 = findViewById(R.id.recipeImage3);
        recipeImage3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RecipeDetail.class);
            startActivity(intent);
        });
    }
}