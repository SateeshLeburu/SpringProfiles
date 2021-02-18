package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.entity.Category;
import com.sam.service.CategoryService;

@RestController
public class CateroryController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping(value = "${mapping.addcategory}")
	public void saveCaterory(@RequestBody Category category) {
		categoryService.saveCategory(category);
	}
	
	@GetMapping(value = "${mapping.gettingcategories}")
	public List<Category> getAllCaterory(){
		return categoryService.getAllCategories();
	}
}
