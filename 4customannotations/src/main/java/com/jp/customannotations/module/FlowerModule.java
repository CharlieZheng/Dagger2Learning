package com.jp.customannotations.module;


import com.jp.customannotations.entity.Flower;
import com.jp.customannotations.entity.Lily;
import com.jp.customannotations.entity.LilyFlower;
import com.jp.customannotations.entity.Rose;
import com.jp.customannotations.entity.RoseFlower;

import javax.inject.Named;

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