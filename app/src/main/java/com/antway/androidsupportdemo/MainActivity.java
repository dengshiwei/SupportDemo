package com.antway.androidsupportdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.antway.androidsupportdemo.tablayout.TabLayoutActivity;
import com.antway.androidsupportdemo.tablayout.TabLayoutViewPagerActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tabLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, TabLayoutActivity.class));
            }
        });
        findViewById(R.id.tabLayoutViewPager).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, TabLayoutViewPagerActivity.class));
            }
        });

        findViewById(R.id.switchButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}