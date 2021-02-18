package com.sam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
