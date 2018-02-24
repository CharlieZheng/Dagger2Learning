package com.jp.dagger2learning.entity;


import com.jp.dagger2learning.scope.MyScope;

import javax.inject.Inject;

// 以下多个Scope包括Singleton和MyScope，N选一
//@Singleton
@MyScope
//@Reusable
public class Rose {
    @Inject
    public Rose() {
    }

    public String whisper() {
        return "热恋";
    }
}
