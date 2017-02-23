package com.jp.qualifiernamed.module;

import com.jp.qualifiernamed.entity.Flower;
import com.jp.qualifiernamed.entity.Lily;
import com.jp.qualifiernamed.entity.Rose;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FlowerModule {

	@Provides
	@Named("Rose")
	Flower provideRose() {
		return new Rose();
	}

	@Provides
	@Named("Lily")
	Flower provideLily() {
		return new Lily();
	}
}