package com.example.springbootpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.springbootpractice.logic.Sort;

@Service
public class SortService {
	// DI 적용: JavaSort, BubbleSort 가 SortService 와 강하게 결합되는 것을 방지.
	// 생성자 주입
	private final Sort<String> sort;

	public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
		this.sort = sort;
		System.out.println("구현체: " + sort.getClass().getName());
	}

	public List<String> doSort(List<String> input) {
		return sort.sort(input);
	}
}
