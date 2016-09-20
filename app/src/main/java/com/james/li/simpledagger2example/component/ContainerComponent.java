package com.james.li.simpledagger2example.component;

import com.james.li.simpledagger2example.MainActivity;
import com.james.li.simpledagger2example.module.ContainerModule;

import dagger.Component;

/**
 * Created by jyj-lsy on 9/20/16 in zsl-tech.
 */
@Component(dependencies = ActivityComponentCompat.class, modules = ContainerModule.class)
public interface ContainerComponent {
    void inject(MainActivity activity);
}
