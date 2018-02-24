package com.jp.dagger2learning.component;

import com.jp.dagger2learning.activity.MainActivity;

import dagger.Component;

@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}