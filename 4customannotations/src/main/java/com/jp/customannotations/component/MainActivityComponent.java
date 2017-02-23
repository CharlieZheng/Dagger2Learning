package com.jp.customannotations.component;




import com.jp.customannotations.activity.MainActivity;
import com.jp.customannotations.module.FlowerModule;
import com.jp.customannotations.module.PotModule;

import dagger.Component;

@Component(modules = {FlowerModule.class, PotModule.class})
public interface MainActivityComponent {
	void inject(MainActivity activity);
}