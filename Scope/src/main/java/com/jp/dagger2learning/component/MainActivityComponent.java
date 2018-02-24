package com.jp.dagger2learning.component;

import com.jp.dagger2learning.activity.MainActivity;
import com.jp.dagger2learning.scope.MyScope;

import dagger.Component;

// Singleton和MyScope，二选一
//@Singleton
@MyScope
// Reusable注解不用于Component
@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}