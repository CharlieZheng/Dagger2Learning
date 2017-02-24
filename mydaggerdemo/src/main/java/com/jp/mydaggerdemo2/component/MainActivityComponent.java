package com.jp.mydaggerdemo2.component;

import com.jp.mydaggerdemo2.activity.MainActivity;
import com.jp.mydaggerdemo2.module.CreatePersonModule;

import dagger.Component;

@Component(modules = {CreatePersonModule.class})
public interface MainActivityComponent {
	void create(MainActivity mainActivity);
}
