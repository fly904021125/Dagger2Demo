package com.fly.dagger2demo.simplemodule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by fly on 2018/4/2.
 */

public class HoneyWorld extends LoverWorld {
    @Named(value = "name")
    @Inject
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
