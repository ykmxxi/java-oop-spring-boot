package com.example.springbootpractice.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "of")
@Data
public class Student implements Serializable {

	private String name;
	private Integer age;
	private Grade grade;

	public enum Grade {
		A, B, C, D, F
	}
}
