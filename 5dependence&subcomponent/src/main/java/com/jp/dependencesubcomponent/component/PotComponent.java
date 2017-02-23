package com.jp.dependencesubcomponent.component;

import com.jp.dependencesubcomponent.entity.Pot;
import com.jp.dependencesubcomponent.module.PotModule;

import dagger.Component;

@Component(modules = PotModule.class,dependencies = FlowerComponent.class)
public interface PotComponent {
	Pot getPot();
}