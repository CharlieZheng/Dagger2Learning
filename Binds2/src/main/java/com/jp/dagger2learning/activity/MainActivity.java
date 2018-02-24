package com.jp.dagger2learning.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jp.dagger2learning.component.DaggerMainActivityComponent;
import com.jp.dagger2learning.entity.Child;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Child child;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerMainActivityComponent.create().inject(this);
        String show = child.msg();
        Toast.makeText(MainActivity.this, show, Toast.LENGTH_SHORT).show();
    }
}