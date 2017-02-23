package com.jp.qualifiernamed.entity;

import javax.inject.Inject;
import javax.inject.Named;

public class Pot {

	private Flower flower;

	@Inject
	public Pot(@Named("Rose") Flower flower) {
		this.flower = flower;
	}

	public String show() {
		return flower.whisper();
	}
}