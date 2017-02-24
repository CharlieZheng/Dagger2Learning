package com.jp.mydaggerdemo2.module;

import com.jp.mydaggerdemo2.entity.Person;

import dagger.Module;
import dagger.Provides;

@Module
public class CreatePersonModule {

	public CreatePersonModule(){ }

	@Provides
	Person create(String name , int age){
		return new Person(name, age);
	}
}