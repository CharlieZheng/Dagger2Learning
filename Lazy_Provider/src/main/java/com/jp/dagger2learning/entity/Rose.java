package com.jp.dagger2learning.entity;


import javax.inject.Inject;

public class Rose {
    @Inject
    public Rose() {
    }

    public String whisper() {
        return "热恋";
    }
}
