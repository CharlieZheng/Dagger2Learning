package com.jp.dependencesubcomponent.module;

import com.jp.dependencesubcomponent.entity.Flower;
import com.jp.dependencesubcomponent.entity.Pot;
import com.jp.dependencesubcomponent.entity.RoseFlower;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule {

	@Provides
	Pot providePot(@RoseFlower Flower flower) {
		return new Pot(flower);
	}
}