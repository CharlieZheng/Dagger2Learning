package com.jp.dagger2learning.component;

import com.jp.dagger2learning.activity.MainActivity;
import com.jp.dagger2learning.module.ChildModule;

import dagger.Component;

@Component(modules = ChildModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}