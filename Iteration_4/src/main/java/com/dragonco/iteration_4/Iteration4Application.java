package com.dragonco.iteration_4;

import com.dragonco.iteration_4.beans.Course;
import com.dragonco.iteration_4.beans.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableCaching
public class Iteration4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Iteration4Application.class, args);
		Course course = context.getBean("course", Course.class);
		Course course2 = context.getBean("course", Course.class);
		if (course == course2) System.out.println("Course is Singleton");
		User user = context.getBean("user", User.class);
		User user2 = context.getBean("user", User.class);
		if (user != user2) {
			System.out.println("User is prototype\nUser1 id = " + user.getId() + "\n" + "User2 id = " + user2.getId());
		}
	}

}
