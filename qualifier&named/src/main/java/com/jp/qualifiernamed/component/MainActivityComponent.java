package com.jp.qualifiernamed.component;



import com.jp.qualifiernamed.activity.MainActivity;
import com.jp.qualifiernamed.module.FlowerModule;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface MainActivityComponent {
	void inject(MainActivity activity);
}