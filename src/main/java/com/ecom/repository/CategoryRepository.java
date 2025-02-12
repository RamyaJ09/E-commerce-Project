package com.ecom.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;  

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public Boolean existsByName(String name);

	public Optional<Category> findById(Long id);

	public List<Category> findByIsActiveTrue();



	

	


}
