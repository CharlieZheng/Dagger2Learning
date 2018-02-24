package com.jp.dagger2learning.entity;

import javax.inject.Inject;


public class Child implements Parent {
    private Toy toy;

    @Inject
    public Child(Toy toy) {
        this.toy = toy;
    }


    @Override
    public String msg() {
        return this.toy.play();
    }
}