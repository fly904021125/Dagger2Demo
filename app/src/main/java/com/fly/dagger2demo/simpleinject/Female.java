package com.fly.dagger2demo.simpleinject;

import javax.inject.Inject;

/**
 * Created by fly on 2018/3/29.
 */

public class Female {
    private int sexy;

    @Inject
    public Female() {
        sexy=100;
    }
}
