package com.example.springbootpractice.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.springbootpractice.domain.Student;
import com.example.springbootpractice.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentService {

	private final StudentRepository studentRepository;

	public void printStudent(String name) {
		Student student = studentRepository.getStudent(name);
		System.out.println("μ°Ύλ νμ: " + student);
	}

	@PostConstruct
	public void init() {
		studentRepository.enroll("jack", 15, Student.Grade.B);
	}
}
