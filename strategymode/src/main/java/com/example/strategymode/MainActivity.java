package com.example.strategymode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 策略模式：定义了算法族，分别封装起来，让它们之间可以互相转换，
 * 此模式让算法的变化，独立于使用算法的客户。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
