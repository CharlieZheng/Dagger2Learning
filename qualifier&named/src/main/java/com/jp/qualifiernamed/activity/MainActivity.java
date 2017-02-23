package com.jp.qualifiernamed.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


import com.jp.qualifiernamed.component.DaggerMainActivityComponent;
import com.jp.qualifiernamed.entity.Pot;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject
	Pot pot;

	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 这个类是重新编译后Dagger2自动生成的，所以写这行代码之前要先编译一次
		// Build --> Rebuild Project
		DaggerMainActivityComponent.create().inject(this);
		String show = pot.show();
		Toast.makeText(MainActivity.this, show, Toast.LENGTH_SHORT).show();
	}
}