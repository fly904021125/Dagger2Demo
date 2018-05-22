package com.fly.dagger2demo.simplescope;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/**
 * 两种provider方法具有相同的效果
 * Created by fly on 2018/3/29.
 */
@Module
public class LoverModule {
    //根据provider方法获得Female实例,并且是可重用的，即在同一个Component里每次获取同一个实例
    @Provides
    @Reusable
    public Female providerFemale() {
        return new Female(300);
    }

    //根据SuperMale里被Inject的构造器，获得Male实例
    @Provides
    public Male providerMale(SuperMale male) {
        return male;
    }

    //根据上面的两个provider方法 获取参数实例，并返回Lover实例对象
    @Provides
    public Lover providerLover(Female female, Male male) {
        return new Lover(male, female);
    }

}
