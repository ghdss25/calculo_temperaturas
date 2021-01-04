package com.example.conversordetemperaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class C_K extends AppCompatActivity {

    EditText ed;
    TextView animacao2;

    double c;
    double k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__k);

        ed = (EditText) findViewById(R.id.T00);
        animacao2 = (TextView) findViewById(R.id.text9);
    }

    public void C_p_K(View v) {

        k = Integer.parseInt(ed.getText().toString());

        c = k - 273.15;

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animacao_texto2);
        animacao2.startAnimation(animation);

        animacao2.setText("C = " + String.format("%.2f", c));
    }

    @Override
    public void finish() {

        super.finish();

        overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);

    }
}