package com.jp.moduleprovides.module;

import com.jp.moduleprovides.entity.Flower;
import com.jp.moduleprovides.entity.Rose;

import dagger.Module;
import dagger.Provides;

@Module
public class FlowerModule {
	@Provides
	Flower provideFlower() {
		return new Rose();
	}
}