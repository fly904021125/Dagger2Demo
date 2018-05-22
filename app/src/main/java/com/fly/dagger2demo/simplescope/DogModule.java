package com.fly.dagger2demo.simplescope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fly on 2018/3/30.
 */
@Module
public class DogModule {
    @Singleton
    @Provides
    public LonelyDog provideDog() {
        return new LonelyDog();
    }
}
