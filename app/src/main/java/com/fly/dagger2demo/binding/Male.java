package com.fly.dagger2demo.binding;

/**
 * 没有Inject注解
 * Created by fly on 2018/3/29.
 */

public class Male {
    protected int sexy;

    public Male(int sexy) {
        this.sexy = sexy;
    }

    public Male() {
        sexy = 200;
    }

    @Override
    public String toString() {
        return "Male{" +
                "sexy=" + sexy +
                '}';
    }
}
