package com.departmentalstore.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.departmentalstore.store.bean.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
