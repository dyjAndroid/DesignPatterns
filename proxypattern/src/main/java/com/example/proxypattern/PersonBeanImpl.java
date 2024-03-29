package com.example.proxypattern;

import com.example.proxypattern.intf.PersonBean;

/**
 * created by Sunday
 * on 2019-06-20 14:30
 */
public class PersonBeanImpl implements PersonBean {

    private String mName;
    private String mGender;
    private String mInterests;
    private int mRating;
    private int mRatingCount = 0;

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getGender() {
        return mGender;
    }

    @Override
    public String getInterests() {
        return mInterests;
    }

    @Override
    public int getHotOrNotRating() {
        if (mRatingCount == 0) {
            return 0;
        } else {
            return mRating / mRatingCount;
        }
    }

    @Override
    public void setName(String name) {
        mName = name;
    }

    @Override
    public void setGender(String gender) {
        mGender = gender;
    }

    @Override
    public void setInterests(String interests) {
        mInterests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        mRating += rating;
        mRatingCount++;
    }
}
