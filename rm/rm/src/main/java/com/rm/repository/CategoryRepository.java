package com.rm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rm.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
