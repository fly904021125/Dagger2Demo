package com.fly.dagger2demo.simplescope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fly on 2018/3/29.
 */
@Singleton
@Component(modules = {DogModule.class} )
public interface SingletonLoverComponent {
    LonelyDog createDog();

}
