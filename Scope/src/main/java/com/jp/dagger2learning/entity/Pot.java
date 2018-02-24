package com.jp.dagger2learning.entity;


import com.jp.dagger2learning.scope.MyScope;

import javax.inject.Inject;

// 以下多个Scope包括Singleton和MyScope，N选一
//@Singleton
@MyScope
//@Reusable
public class Pot {
    private Rose rose;

    @Inject
    public Pot(Rose rose) {
        this.rose = rose;
    }

    public String show() {
        return rose.whisper();
    }
}
