package com.jp.dagger2learning.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jp.dagger2learning.component.DaggerMainActivityComponent;
import com.jp.dagger2learning.entity.Pot;

import javax.inject.Inject;
import javax.inject.Provider;

public class MainActivity extends AppCompatActivity {

    @Inject
    Provider<Pot> pot;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerMainActivityComponent.create().inject(this);
        StringBuffer show = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            show.append(pot.get().show());
        }
        Toast.makeText(MainActivity.this, show, Toast.LENGTH_SHORT).show();
    }
}