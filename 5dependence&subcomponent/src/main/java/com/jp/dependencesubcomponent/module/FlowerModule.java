package com.jp.dependencesubcomponent.module;

import com.jp.dependencesubcomponent.entity.Flower;
import com.jp.dependencesubcomponent.entity.Lily;
import com.jp.dependencesubcomponent.entity.LilyFlower;
import com.jp.dependencesubcomponent.entity.Rose;
import com.jp.dependencesubcomponent.entity.RoseFlower;

import dagger.Module;
import dagger.Provides;

@Module
public class FlowerModule {

	@Provides
	@RoseFlower
	Flower provideRose() {
		return new Rose();
	}

	@Provides
	@LilyFlower
	Flower provideLily() {
		return new Lily();
	}
}