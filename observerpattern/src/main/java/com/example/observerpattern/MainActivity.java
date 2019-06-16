package com.example.observerpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 观察者模式：定义了对象之间的一对多的依赖，这样一来，当一个对象改变状态时，
 * 它的所有依赖者都会收到通知并自动更新。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
