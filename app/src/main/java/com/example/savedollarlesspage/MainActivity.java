package com.example.savedollarlesspage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent won, loss, home;
        loss = new Intent(MainActivity.this, you_loss.class);
        won = new Intent(MainActivity.this, you_won.class);
        home = new Intent(MainActivity.this, start_page.class);
        Button yes, no;

        TextView question;
        ImageView img_dog;
        ImageButton btn_home;

        btn_home = findViewById(R.id.home);
        question = findViewById(R.id.question);
        img_dog = findViewById(R.id.img_dog);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        btn_home.setOnClickListener(v -> startActivity(home));

        yes.setOnClickListener(v -> {
            if (count == 2) {
                question.setText(R.string.part3);
                img_dog.setImageResource(R.drawable.dog_part3);
                count++;
            } else if (count == 4) {
                question.setText(R.string.part5);
                img_dog.setImageResource(R.drawable.dog_part5);
                count++;
            } else if (count == 5) {
                question.setText(R.string.part6);
                img_dog.setImageResource(R.drawable.dog_part6);
                count++;
            } else if (count == 3) {
                question.setText(R.string.part8);
                question.setTextSize(55);

                no.setVisibility(View.INVISIBLE);
                yes.setVisibility(View.INVISIBLE);
                img_dog.setVisibility(View.INVISIBLE);


                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    question.setText(R.string.part9);
                    img_dog.setVisibility(View.VISIBLE);
                    img_dog.setImageResource(R.drawable.dog_dead);
                    new Handler(Looper.getMainLooper()).postDelayed(() -> startActivity(won), 1500);
                }, 2000);
                count++;

            } else if (count == 6) {
                question.setText(R.string.part8);
                question.setTextSize(55);

                no.setVisibility(View.INVISIBLE);
                yes.setVisibility(View.INVISIBLE);
                img_dog.setVisibility(View.INVISIBLE);


                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    question.setText(R.string.part9);
                    img_dog.setVisibility(View.VISIBLE);
                    img_dog.setImageResource(R.drawable.dog_dead);
                    new Handler(Looper.getMainLooper()).postDelayed(() -> startActivity(won), 1500);
                }, 2000);
                count++;

            } else {
                startActivity(loss);
            }
        });
        no.setOnClickListener(v -> {
            if (count == 1) {
                question.setText(R.string.part2);
                img_dog.setImageResource(R.drawable.dog_part2);
                count++;
            } else if (count == 2) {
                startActivity(loss);
            } else if (count == 3) {
                question.setText(R.string.part4);
                img_dog.setImageResource(R.drawable.dog_part4);
                count++;
            } else if (count == 4) {
                question.setText(R.string.part8);
                question.setTextSize(55);

                no.setVisibility(View.INVISIBLE);
                yes.setVisibility(View.INVISIBLE);
                img_dog.setVisibility(View.INVISIBLE);


                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    question.setText(R.string.part9);
                    img_dog.setVisibility(View.VISIBLE);
                    img_dog.setImageResource(R.drawable.dog_dead);
                    new Handler(Looper.getMainLooper()).postDelayed(() -> startActivity(won), 1500);
                }, 2000);
                count++;

            } else if (count == 6) {
                question.setText(R.string.part7);
                img_dog.setImageResource(R.drawable.dog_part7);
                count++;
            } else if (count == 7) {
                question.setText(R.string.part8);
                question.setTextSize(55);

                no.setVisibility(View.INVISIBLE);
                yes.setVisibility(View.INVISIBLE);
                img_dog.setVisibility(View.INVISIBLE);


                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    question.setText(R.string.part9);
                    img_dog.setVisibility(View.VISIBLE);
                    img_dog.setImageResource(R.drawable.dog_dead);
                    new Handler(Looper.getMainLooper()).postDelayed(() -> startActivity(won), 1500);
                }, 2000);
                count++;
            } else if (count == 5) {
                startActivity(loss);
            } else {
                startActivity(loss);
            }
        });

    }
}