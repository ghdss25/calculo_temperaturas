package com.example.conversordetemperaturas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, C_F.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(Menu.this, intent, activityOptionsCompat.toBundle());
            }
        });

        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, F_C.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(Menu.this, intent, activityOptionsCompat.toBundle());
            }
        });

        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, C_K.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(Menu.this, intent, activityOptionsCompat.toBundle());
            }
        });

        findViewById(R.id.button_4).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, K_C.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(Menu.this, intent, activityOptionsCompat.toBundle());
            }
        });

        findViewById(R.id.button_5).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, K_F.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(Menu.this, intent, activityOptionsCompat.toBundle());
            }
        });
    }
}