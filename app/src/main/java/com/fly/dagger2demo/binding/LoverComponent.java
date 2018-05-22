package com.fly.dagger2demo.binding;

import java.util.Optional;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by fly on 2018/3/29.
 */
@Component(modules = {LoverModule.class})
public interface LoverComponent {

    /**
     * 注入被标记 @BindsOptionalOf 的Module方法，返回Optional对象
     *
     * @return
     */
    Optional<Male> createMale();

    Optional<Female> createFemale();

    /**
     * 通过@BindsInstance 注入
     * @return
     */
    @Named(value = "user")
    String getUserName();
    @Component.Builder
    interface LoverBuilder {
        LoverComponent build();

        @BindsInstance
        LoverBuilder userName(@Named(value = "user") String userName);

        /**
         * 设置Component依赖的module实例，如果module有无参构造器，省略这个方法
         *
         * @param module
         * @return
         */
//        LoverBuilder buildLoverModule(LoverModule module);
    }
}
