package com.jp.dagger2learning.module;

import com.jp.dagger2learning.entity.Child;
import com.jp.dagger2learning.entity.Parent;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ChildModule {
    @Binds
    public abstract Parent provideChild(Child child);
}