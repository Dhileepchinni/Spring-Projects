package com.example.project.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
//pojo : plan old java object
		private int id;
		private String name;
		private int age;
		private String role;
		public Employee(int id, String name, int age, String role) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.role = role;
		}
		
		
		
}
