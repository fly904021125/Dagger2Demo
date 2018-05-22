package com.fly.dagger2demo;

import com.fly.dagger2demo.binding.Female;
import com.fly.dagger2demo.binding.Male;
import com.fly.dagger2demo.simpleinject.DaggerLoverComponent;
import com.fly.dagger2demo.simpleinject.LoverComponent;
import com.fly.dagger2demo.simpleinject.LoverWorld;
import com.fly.dagger2demo.simplemodule.HoneyWorld;
import com.fly.dagger2demo.simplemodule.Lover;
import com.fly.dagger2demo.simplescope.DaggerSingletonLoverComponent;
import com.fly.dagger2demo.simplescope.LonelyDog;
import com.fly.dagger2demo.simplescope.SingletonLoverComponent;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
        DaggerCoffeeApp_CoffeeShop
                .create()
//                .builder().dripCoffeeModule(new DripCoffeeModule()).build()
                .maker().brew();
    }

    @Test
    public void daggerInjectSimple() {
        LoverComponent loverComponent = DaggerLoverComponent.create();
        loverComponent.createLover();
        loverComponent.getMemberInjector().injectMembers(new LoverWorld());
    }

    @Test
    public void daggerModuleSimple() {
        com.fly.dagger2demo.simplemodule.LoverComponent loverComponent = com.fly.dagger2demo.simplemodule.DaggerLoverComponent.create();
        Lover lover = loverComponent.createLover();
        HoneyWorld honeyWorld=new HoneyWorld();
        loverComponent.fetch(honeyWorld);
        System.out.println("lover = " + lover);
        System.out.println("honeyWorld.getLover() = " + honeyWorld.getLover());
        System.out.println("honeyWorld.getName() = " + honeyWorld.getName());

        loverComponent.fetchHoney(honeyWorld);
        System.out.println("honeyWorld.getLover() = " + honeyWorld.getLover());
        System.out.println("honeyWorld.getName() = " + honeyWorld.getName());
    }

    @Test
    public void daggerScopeSimple() {
        com.fly.dagger2demo.simplescope.LoverComponent loverComponent = com.fly.dagger2demo.simplescope.DaggerLoverComponent.create();
        com.fly.dagger2demo.simplescope.Lover lover = loverComponent.createLover();
        System.out.println("lover1 = " + lover);
        lover = loverComponent.createLover();
        System.out.println("lover2 = " + lover);
        SingletonLoverComponent singletonLoverComponent = DaggerSingletonLoverComponent.create();
        LonelyDog dog = singletonLoverComponent.createDog();
        System.out.println("dog = " + dog);
        dog = singletonLoverComponent.createDog();
        System.out.println("dog = " + dog);
    }


    @Test
    public void daggerBinding() {
        //没有自定义builder时
//        com.fly.dagger2demo.binding.LoverComponent loverComponent = com.fly.dagger2demo.binding.DaggerLoverComponent.create();
        //自定义builder时
        com.fly.dagger2demo.binding.LoverComponent loverComponent = com.fly.dagger2demo.binding.DaggerLoverComponent
                .builder()
                .userName("史密斯")
                .build();
        Optional<Male> male = loverComponent.createMale();
        System.out.println("male = " + male);
        if (male.isPresent()){
            Male maleValue = male.get();
            System.out.println("maleValue = " + maleValue);
        }else {
            System.out.println("empty maleValue");
        }
        Optional<Female> female = loverComponent.createFemale();
        if (female.isPresent()){
            Female femaleValue = female.get();
            System.out.println("femaleValue = " + femaleValue);
        }else {
            System.out.println("empty femaleValue");
        }
        System.out.println("userName = " + loverComponent.getUserName());
    }

}