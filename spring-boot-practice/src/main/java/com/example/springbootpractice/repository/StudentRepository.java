package com.example.springbootpractice.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.springbootpractice.domain.Student;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Repository
public class StudentRepository {

	private final Map<String, Student> storage;

	public Student getStudent(String name) {

		System.out.println("[repository] 통행료 발생");

		return storage.get(name);
	}

	public Student enroll(String name, Integer age, Student.Grade grade) {
		return storage.put(name, Student.of(name, age, grade));
	}
}
