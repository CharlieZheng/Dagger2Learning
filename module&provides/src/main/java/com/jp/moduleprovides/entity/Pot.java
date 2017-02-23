package com.jp.moduleprovides.entity;

import javax.inject.Inject;

public class Pot {

	private Flower flower;

	@Inject
	public Pot(Flower flower) {
		this.flower = flower;
	}

	public String show() {
		return flower.whisper();
	}
}