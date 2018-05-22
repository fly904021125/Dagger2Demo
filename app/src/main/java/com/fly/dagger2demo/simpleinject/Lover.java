package com.fly.dagger2demo.simpleinject;

import javax.inject.Inject;

/**
 * Created by fly on 2018/3/29.
 */

public class Lover {
    private Male male;
    private Female female;

    @Inject
    public Lover(Male male, Female female) {
        this.male = male;
        this.female = female;
    }
}
