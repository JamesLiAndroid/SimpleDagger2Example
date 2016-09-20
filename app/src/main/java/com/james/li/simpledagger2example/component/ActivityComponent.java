package com.james.li.simpledagger2example.component;

import com.james.li.simpledagger2example.MainActivity;

/**
 * Created by jyj-lsy on 9/20/16 in zsl-tech.
 */
//@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
