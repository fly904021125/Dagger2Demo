package com.fly.dagger2demo.simpleinject;

import dagger.Component;
import dagger.MembersInjector;

/**
 * Created by fly on 2018/3/29.
 */
@Component
public interface LoverComponent {
    //1.根据Inject获取Lover实例
    Lover createLover();

    //2.将lover内带有@Inject标注的变量，根据Inject获取对应对象的实例
    void fetch(LoverWorld lover);

    //3.不能同时有不同类型的返回值和参数，无法注入
//    Lover selectLover(LoverWorld loverWorld);
    //4.可同时有相同的类型的返回值和单参数，并返回注入的类型实例
    LoverWorld selectLover(LoverWorld loverWorld);

    //5.获取注入器
    MembersInjector<LoverWorld> getMemberInjector();

}
