package com.jp.mydaggerdemo2.entity;


import javax.inject.Inject;

public class Person {
	public String name;
	public int age;
@Inject
	public Person(String name, int age) {
	this .name= name;
	this.age = age;
	}

}
