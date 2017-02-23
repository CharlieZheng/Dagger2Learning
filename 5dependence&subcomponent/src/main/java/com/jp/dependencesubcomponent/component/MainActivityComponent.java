package com.jp.dependencesubcomponent.component;

import com.jp.dependencesubcomponent.activity.MainActivity;

import dagger.Component;

@Component(dependencies = PotComponent.class)
public interface MainActivityComponent {
	void inject(MainActivity activity);
}