package com.jp.customannotations.module;

import com.jp.customannotations.entity.Flower;
import com.jp.customannotations.entity.Pot;
import com.jp.customannotations.entity.RoseFlower;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule {

	@Provides
	Pot providePot(@RoseFlower Flower flower) {
		return new Pot(flower);
	}
}