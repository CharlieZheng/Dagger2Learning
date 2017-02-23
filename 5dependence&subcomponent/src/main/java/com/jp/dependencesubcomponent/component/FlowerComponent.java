package com.jp.dependencesubcomponent.component;

import com.jp.dependencesubcomponent.entity.Flower;
import com.jp.dependencesubcomponent.entity.LilyFlower;
import com.jp.dependencesubcomponent.entity.RoseFlower;
import com.jp.dependencesubcomponent.module.FlowerModule;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface FlowerComponent {
	@RoseFlower
	Flower getRoseFlower();

	@LilyFlower
	Flower getLilyFlower();
}