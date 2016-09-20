package com.james.li.simpledagger2example.component;

import com.james.li.simpledagger2example.bean.UserModule;
import com.james.li.simpledagger2example.module.ActivityModule;

import dagger.Component;

/**
 * Created by jyj-lsy on 9/20/16 in zsl-tech.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponentCompat {
    UserModule getUserModel();
}
