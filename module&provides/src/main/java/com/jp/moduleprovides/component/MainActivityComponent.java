package com.jp.moduleprovides.component;


import com.jp.moduleprovides.activity.MainActivity;
import com.jp.moduleprovides.module.FlowerModule;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface MainActivityComponent {
	void inject(MainActivity activity);
}