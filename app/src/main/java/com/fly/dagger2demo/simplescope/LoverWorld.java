package com.fly.dagger2demo.simplescope;

import javax.inject.Inject;

/**
 * Created by fly on 2018/3/29.
 */

public class LoverWorld {
    @Inject
    Lover lover;

    public Lover getLover() {
        return lover;
    }

    public void setLover(Lover lover) {
        this.lover = lover;
    }
}
