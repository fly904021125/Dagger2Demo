package com.fly.dagger2demo.simplescope;

/**
 * 没有Inject注解
 * Created by fly on 2018/3/29.
 */

public class Lover {
    private Male male;
    private Female female;


    public Lover(Male male, Female female) {
        this.male = male;
        this.female = female;
    }

    @Override
    public String toString() {
        return "Lover{"
                + male + female +
                '}';
    }
}
