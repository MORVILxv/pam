package com.example.rating;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RatingBar ratingbar = findViewById(R.id.ratingBar);
        Button decrease = findViewById(R.id.decrease);
        Button increase = findViewById(R.id.increase);


        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingbar.getRating();
                ratingbar.setRating(rating - ratingbar.getStepSize());
            }
        });

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingbar.getRating();
                ratingbar.setRating(rating + ratingbar.getStepSize());
            }
        });
    }
}