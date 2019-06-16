package com.example.decoratepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.decoratepattern.abs.Beverage;

/**
 * 装饰者模式：动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的解决方案。
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Sunday";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        Log.d(TAG, beverage.getDescription() + " $" + beverage.cost());
    }
}
