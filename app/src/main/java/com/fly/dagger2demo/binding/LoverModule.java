package com.fly.dagger2demo.binding;

import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;

/**
 * 两种provider方法具有相同的效果
 * Created by fly on 2018/3/29.
 */
@Module
public abstract class LoverModule {

    /**
     * 返回一个Optional对象，如果Male可注入，则对象带有Male实例，否则为空
     * @return
     */
    @BindsOptionalOf
    abstract Male providerMale();
    @BindsOptionalOf
    abstract Female providerOptionalFemale();
    @Provides
    public static Female providerFemale(){
        return new Female();
    }
}
