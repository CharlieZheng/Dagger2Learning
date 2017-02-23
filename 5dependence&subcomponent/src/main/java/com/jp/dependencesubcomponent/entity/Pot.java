package com.jp.dependencesubcomponent.entity;

public class Pot {

	private Flower flower;

	public Pot(Flower flower) {
		this.flower = flower;
	}

	public String show() {
		return flower.whisper();
	}
}
