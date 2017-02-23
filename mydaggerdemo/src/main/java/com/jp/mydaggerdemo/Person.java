package com.jp.mydaggerdemo;


import javax.inject.Inject;

public class Person {
	public String name;
	public int age;
	public Person(String name , int age) {
	}
@Inject
	public Person() {
		this.name = "郑汉荣";
		this.age = 17;
	}

}
