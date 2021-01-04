package com.example.conversordetemperaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class C_F extends AppCompatActivity {

    EditText ed;
    TextView animacao2;

    float f;
    double c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__f);

        ed = (EditText) findViewById(R.id.T00);
        animacao2 = (TextView) findViewById(R.id.text9);
    }

    public void C_p_F(View v) {

        f = Integer.parseInt(ed.getText().toString());

        c = f - (32 / 1.8);

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