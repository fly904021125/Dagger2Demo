package com.fly.dagger2demo;

import dagger.Component;

import javax.inject.Singleton;

public class CoffeeApp {
  @Singleton
  @Component(modules = { DripCoffeeModule.class })
  public interface CoffeeShop {
    CoffeeMaker maker();
  }

}
