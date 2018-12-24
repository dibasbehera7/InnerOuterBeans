package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dibas.food.Fruit;
import com.dibas.food.Meal;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

		// Meal mySpringMeal = (Meal) appContext.getBean("meal");
		// System.out.println(mySpringMeal.whatsInTodaysMeal());

		/*
		 * Meal myInnerBeanAppleMeal = appContext.getBean("mealOuterBean",Meal.class);
		 * System.out.println("Inner Bean\n"+myInnerBeanAppleMeal.whatsInTodaysMeal());
		 */

		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		System.out.println(myFruit.talkAboutYou());

		
		
		((FileSystemXmlApplicationContext) appContext).close();

	}

}
