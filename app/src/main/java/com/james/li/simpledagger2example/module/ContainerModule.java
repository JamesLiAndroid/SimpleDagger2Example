package com.james.li.simpledagger2example.module;

import com.james.li.simpledagger2example.bean.ShoppingCartModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jyj-lsy on 9/20/16 in zsl-tech.
 */
@Module
public class ContainerModule {
    @Provides
    ShoppingCartModule provideCartModule() {
        return new ShoppingCartModule();
    }
}
