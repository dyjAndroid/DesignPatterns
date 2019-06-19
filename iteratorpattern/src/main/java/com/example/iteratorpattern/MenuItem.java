package com.example.iteratorpattern;

/**
 * created by Sunday
 * on 2019-06-19 13:44
 */
public class MenuItem {

    private String mName;
    private String mDescription;
    private boolean mVegetarian;
    private double mPrice;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        mName = name;
        mDescription = description;
        mVegetarian = isVegetarian;
        mPrice = price;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public boolean getVegetarian() {
        return mVegetarian;
    }

    public double getPrice() {
        return mPrice;
    }
}
