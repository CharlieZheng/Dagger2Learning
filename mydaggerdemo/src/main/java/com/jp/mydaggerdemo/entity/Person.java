package com.jp.mydaggerdemo.entity;


import javax.inject.Inject;

public class Person {
	public String name;
	public int age;
@Inject
	public Person() {
	this .name= "郑汉荣";
	this.age = 17;
	}

}
