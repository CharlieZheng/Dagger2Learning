package com.jp.dagger2learning.module;

import com.jp.dagger2learning.entity.Toy;

import dagger.Module;
import dagger.Provides;

@Module
public class ChildModule {
    @Provides
    public Toy provideToy() {
        return new Toy();
    }
}