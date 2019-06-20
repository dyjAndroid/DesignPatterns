package com.example.proxypattern.intf;

/**
 * created by Sunday
 * on 2019-06-20 14:26
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
