package com.jp.mydaggerdemo.component;

import com.jp.mydaggerdemo.activity.MainActivity;

import dagger.Component;

@Component
public interface MainActivityComponent {
	void create(MainActivity mainActivity);
}
