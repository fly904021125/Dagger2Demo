package com.fly.dagger2demo.simplescope;

import javax.inject.Inject;

/**
 * Created by fly on 2018/3/29.
 */

public class SuperMale extends Male {
    @Inject
    public SuperMale() {
        super();
        sexy=1000;
    }
}
