package com.jp.dependencesubcomponent.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jp.dependencesubcomponent.component.DaggerFlowerComponent;
import com.jp.dependencesubcomponent.component.DaggerMainActivityComponent;
import com.jp.dependencesubcomponent.component.DaggerPotComponent;
import com.jp.dependencesubcomponent.entity.Pot;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject
	Pot pot;

	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		DaggerMainActivityComponent.builder()
				.potComponent(DaggerPotComponent.builder()
						.flowerComponent(DaggerFlowerComponent.create())
						.build())
				.build().inject(this);

		String show = pot.show();
		Toast.makeText(MainActivity.this, show, Toast.LENGTH_SHORT).show();
	}
}
