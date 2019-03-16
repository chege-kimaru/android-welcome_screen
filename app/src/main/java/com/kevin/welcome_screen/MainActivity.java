package com.kevin.welcome_screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout1, layout2;
    Button btnSub;

    Animation uptodown;
    Animation downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = (LinearLayout) findViewById(R.id.layout1);
        layout2 = (LinearLayout) findViewById(R.id.layout2);
        btnSub = (Button) findViewById(R.id.btnSub);

        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        layout1.setAnimation(uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        layout2.setAnimation(downtoup);
    }
}
