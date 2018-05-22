package com.fly.dagger2demo.simpleinject;

import javax.inject.Inject;

/**
 * Created by fly on 2018/3/29.
 */

public class Male {
    private int sexy;

    @Inject
    public Male() {
        sexy = 200;
    }
}
