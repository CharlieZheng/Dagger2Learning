package com.jp.customannotations.entity;

import javax.inject.Inject;
import javax.inject.Named;

public class Pot {

	private Flower flower;

	@Inject
	public Pot(@RoseFlower Flower flower) {
		this.flower = flower;
	}

	public String show() {
		return flower.whisper();
	}
}