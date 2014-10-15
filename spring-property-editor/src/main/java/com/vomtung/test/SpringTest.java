package com.vomtung.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vomtung.bean.Person;
import com.vomtung.bean.PersonType;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.getType().getTypeName()+" "+person.getBirthday());
	}
}   