package com.fly.dagger2demo.simplescope;

/**
 * 没有Inject注解
 * Created by fly on 2018/3/29.
 */

public class Female {
    private int sexy;

    public Female(int sexy) {
        this.sexy = sexy;
    }


    public Female() {
        sexy = 100;
    }

    @Override
    public String toString() {
        return "Female{" +Integer.toHexString(hashCode())+
                " sexy=" + sexy +
                '}';
    }
}
