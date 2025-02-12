package com.ecom.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public Optional<Product> findById(Long id);

	public List<Product> findByIsActiveTrue();

	public List<Product> findByCategory(String category);

	List<Product> findByTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(String ch, String ch2);

	public Page<Product> findByIsActiveTrue(Pageable pageable);

	public Page<Product> findByCategory(Pageable pageable,String category);

	Page<Product> findByTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(String ch, String ch2, Pageable pageable);

	Page<Product> findByisActiveTrueAndTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(String ch, String ch2,
			Pageable pageable);

	

}
