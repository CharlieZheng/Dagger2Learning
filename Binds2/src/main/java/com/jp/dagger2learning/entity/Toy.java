package com.jp.dagger2learning.entity;

import javax.inject.Inject;


public class Toy {
    @Inject
    public Toy() {
    }

    String play() {
        return "爆炸";
    }
}
