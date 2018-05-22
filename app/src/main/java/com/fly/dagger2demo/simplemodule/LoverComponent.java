package com.fly.dagger2demo.simplemodule;

import dagger.Component;

/**
 * Created by fly on 2018/3/29.
 */
@Component(modules = {LoverModule.class})
public interface LoverComponent {
    //根据Module 获取Lover实例
    Lover createLover();

    //将lover内带有@Inject标注的变量，根据Module 获取对应对象的实例
    void fetch(LoverWorld lover);

    //将lover内带有@Inject标注的变量，根据Module 获取对应对象的实例
    void fetchHoney(HoneyWorld lover);
}
