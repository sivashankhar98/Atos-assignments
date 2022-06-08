package com.rm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.model.Category;
import com.rm.repository.CategoryRepository;

@Service
public class CategoryService {
@Autowired
CategoryRepository categoryRepository;
public List<Category>getAllCategory(){
	return categoryRepository.findAll();
}
public void addCategory(Category category) {
	categoryRepository.save(category);
}
}
